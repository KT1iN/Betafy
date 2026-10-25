package com.betafy.feature.auth.di;

import com.betafy.feature.auth.domain.AuthRepository;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AuthModule_ProvideAuthRepositoryFactory implements Factory<AuthRepository> {
  private final Provider<FirebaseAuth> authProvider;

  private final Provider<FirebaseDatabase> databaseProvider;

  private AuthModule_ProvideAuthRepositoryFactory(Provider<FirebaseAuth> authProvider,
      Provider<FirebaseDatabase> databaseProvider) {
    this.authProvider = authProvider;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public AuthRepository get() {
    return provideAuthRepository(authProvider.get(), databaseProvider.get());
  }

  public static AuthModule_ProvideAuthRepositoryFactory create(Provider<FirebaseAuth> authProvider,
      Provider<FirebaseDatabase> databaseProvider) {
    return new AuthModule_ProvideAuthRepositoryFactory(authProvider, databaseProvider);
  }

  public static AuthRepository provideAuthRepository(FirebaseAuth auth, FirebaseDatabase database) {
    return Preconditions.checkNotNullFromProvides(AuthModule.INSTANCE.provideAuthRepository(auth, database));
  }
}
