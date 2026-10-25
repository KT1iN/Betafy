package com.betafy.feature.auth.presentation;

import com.betafy.feature.auth.domain.SignInUseCase;
import com.betafy.feature.auth.domain.SignUpUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class AuthViewModel_Factory implements Factory<AuthViewModel> {
  private final Provider<SignInUseCase> signInUseCaseProvider;

  private final Provider<SignUpUseCase> signUpUseCaseProvider;

  private AuthViewModel_Factory(Provider<SignInUseCase> signInUseCaseProvider,
      Provider<SignUpUseCase> signUpUseCaseProvider) {
    this.signInUseCaseProvider = signInUseCaseProvider;
    this.signUpUseCaseProvider = signUpUseCaseProvider;
  }

  @Override
  public AuthViewModel get() {
    return newInstance(signInUseCaseProvider.get(), signUpUseCaseProvider.get());
  }

  public static AuthViewModel_Factory create(Provider<SignInUseCase> signInUseCaseProvider,
      Provider<SignUpUseCase> signUpUseCaseProvider) {
    return new AuthViewModel_Factory(signInUseCaseProvider, signUpUseCaseProvider);
  }

  public static AuthViewModel newInstance(SignInUseCase signInUseCase,
      SignUpUseCase signUpUseCase) {
    return new AuthViewModel(signInUseCase, signUpUseCase);
  }
}
