plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.betafy.feature.chats.data"
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
    implementation("com.google.firebase:firebase-firestore")
    implementation(platform("com.google.firebase:firebase-bom:35.0.0"))
    implementation(project(":feature:chats:domain"))
}
