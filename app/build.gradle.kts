

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
}

//val apikeyPropertiesFile = rootProject.file("apikey.properties")
//val apikeyProperties = Properties()
//apikeyProperties.load(FileInputStream(apikeyPropertiesFile))

android {
    namespace = "id.ac.polbeng.gitafebiola.githubprofile"
    compileSdk = 35

    defaultConfig {
        applicationId = "id.ac.polbeng.gitafebiola.githubprofile"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
//        buildConfigField("String", "ACCESS_TOKEN", "\"${apikeyProperties["ACCESS_TOKEN"]}\"")


        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    //library untuk menampilkan gambar bergerak splashscreen
    implementation (libs.lottie)
    //library untuk menampilkan gambar bulat (circle)
    implementation (libs.circleimageview)
    //library untuk menampilkan gambar melalui url
    kapt(libs.compiler)
    implementation (libs.glide)
    //library untuk request API
    implementation (libs.retrofit)
    implementation (libs.converter.gson)
    //library untuk logging hasil request API
    implementation (libs.logging.interceptor)
}