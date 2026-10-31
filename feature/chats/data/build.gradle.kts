plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.betafy.feature.chats.data"
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
    implementation("com.google.firebase:firebase-database")
    implementation(platform("com.google.firebase:firebase-bom:35.0.0"))
    implementation(project(":feature:chats:domain"))
}
