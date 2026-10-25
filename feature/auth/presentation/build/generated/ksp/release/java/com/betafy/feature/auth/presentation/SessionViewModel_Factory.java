package com.betafy.feature.auth.presentation;

import com.betafy.feature.auth.domain.AuthRepository;
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
public final class SessionViewModel_Factory implements Factory<SessionViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  private SessionViewModel_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SessionViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static SessionViewModel_Factory create(Provider<AuthRepository> repositoryProvider) {
    return new SessionViewModel_Factory(repositoryProvider);
  }

  public static SessionViewModel newInstance(AuthRepository repository) {
    return new SessionViewModel(repository);
  }
}
