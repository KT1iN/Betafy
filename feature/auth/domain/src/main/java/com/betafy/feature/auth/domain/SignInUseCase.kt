package com.betafy.feature.auth.domain

class SignInUseCase(private val repository: AuthRepository) {
    suspend operator fun invoke(email: String, password: String): Result<String> {
        if (email.isBlank() || password.isBlank()) {
            return Result.failure(IllegalArgumentException("Заполните почту и пароль"))
        }
        return repository.signIn(email.trim(), password)
    }
}
