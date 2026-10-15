package com.betafy.feature.auth.di;

import com.betafy.feature.auth.domain.AuthRepository;
import com.betafy.feature.auth.domain.SignUpUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AuthUseCaseModule_ProvideSignUpUseCaseFactory implements Factory<SignUpUseCase> {
  private final Provider<AuthRepository> repositoryProvider;

  private AuthUseCaseModule_ProvideSignUpUseCaseFactory(
      Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SignUpUseCase get() {
    return provideSignUpUseCase(repositoryProvider.get());
  }

  public static AuthUseCaseModule_ProvideSignUpUseCaseFactory create(
      Provider<AuthRepository> repositoryProvider) {
    return new AuthUseCaseModule_ProvideSignUpUseCaseFactory(repositoryProvider);
  }

  public static SignUpUseCase provideSignUpUseCase(AuthRepository repository) {
    return Preconditions.checkNotNullFromProvides(AuthUseCaseModule.INSTANCE.provideSignUpUseCase(repository));
  }
}
