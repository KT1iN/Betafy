package com.betafy.feature.auth.di

import com.betafy.feature.auth.data.FirebaseAuthRepository
import com.betafy.feature.auth.domain.AuthRepository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

private const val DATABASE_URL = "https://betafy-48c29-default-rtdb.europe-west1.firebasedatabase.app"

@Module
@InstallIn(SingletonComponent::class)
object AuthModule {

    @Provides
    @Singleton
    fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()

    @Provides
    @Singleton
    fun provideFirebaseDatabase(): FirebaseDatabase = FirebaseDatabase.getInstance(DATABASE_URL)

    @Provides
    @Singleton
    fun provideAuthRepository(
        auth: FirebaseAuth,
        database: FirebaseDatabase
    ): AuthRepository = FirebaseAuthRepository(auth, database)
}
