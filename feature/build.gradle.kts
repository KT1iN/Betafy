plugins {
    alias(libs.plugins.android.library)

}

android {
    namespace = "com.betafy.feature"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        minSdk = 24
    }
}
