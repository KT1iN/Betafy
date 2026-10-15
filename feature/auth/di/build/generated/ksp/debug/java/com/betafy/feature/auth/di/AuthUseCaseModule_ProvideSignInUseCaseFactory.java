package com.betafy.feature.auth.di;

import com.betafy.feature.auth.domain.AuthRepository;
import com.betafy.feature.auth.domain.SignInUseCase;
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
public final class AuthUseCaseModule_ProvideSignInUseCaseFactory implements Factory<SignInUseCase> {
  private final Provider<AuthRepository> repositoryProvider;

  private AuthUseCaseModule_ProvideSignInUseCaseFactory(
      Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SignInUseCase get() {
    return provideSignInUseCase(repositoryProvider.get());
  }

  public static AuthUseCaseModule_ProvideSignInUseCaseFactory create(
      Provider<AuthRepository> repositoryProvider) {
    return new AuthUseCaseModule_ProvideSignInUseCaseFactory(repositoryProvider);
  }

  public static SignInUseCase provideSignInUseCase(AuthRepository repository) {
    return Preconditions.checkNotNullFromProvides(AuthUseCaseModule.INSTANCE.provideSignInUseCase(repository));
  }
}
