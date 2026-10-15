package com.betafy.feature.auth.data

import com.betafy.feature.auth.domain.AuthRepository
import com.betafy.feature.auth.domain.UserRole
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class FirebaseAuthRepository(
    private val auth: FirebaseAuth,
    private val firestore: FirebaseFirestore
) : AuthRepository {

    override val currentUserId: String?
        get() = auth.currentUser?.uid

    override suspend fun signUp(
        email: String,
        password: String,
        username: String,
        role: UserRole
    ): Result<String> = runCatching {
        val uid = auth.createUserWithEmailAndPassword(email, password).await().user?.uid
            ?: error("User id is missing")

        val user = hashMapOf(
            "email" to email,
            "username" to username,
            "avatar_url" to null,
            "created_at" to FieldValue.serverTimestamp()
        )

        val profile = when (role) {
            UserRole.WRITER -> hashMapOf(
                "bio" to "",
                "experience_level" to "",
                "preferred_language" to ""
            )
            UserRole.BETA_READER -> hashMapOf(
                "bio" to "",
                "experience_level" to "",
                "preferred_language" to "",
                "max_word_count" to 0,
                "is_available" to false,
                "cooperation_type" to "",
                "price" to 0.0
            )
        }

        val profileCollection = if (role == UserRole.WRITER) "writer_profiles" else "beta_reader_profiles"

        firestore.batch().apply {
            set(firestore.collection("users").document(uid), user)
            set(firestore.collection(profileCollection).document(uid), profile)
        }.commit().await()

        uid
    }

    override suspend fun signIn(email: String, password: String): Result<String> = runCatching {
        auth.signInWithEmailAndPassword(email, password).await().user?.uid
            ?: error("User id is missing")
    }

    override fun signOut() = auth.signOut()
}
