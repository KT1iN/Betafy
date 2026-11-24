plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.betafy.feature.match.presentation"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(project(":feature:match:domain"))
}
