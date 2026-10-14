plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.betafy.feature.profile.data"
    compileSdk = 35

    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(project(":feature:profile:domain"))
}
