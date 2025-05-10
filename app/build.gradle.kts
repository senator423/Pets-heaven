plugins {
    alias(libs.plugins.androidApplication)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.werescue"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.werescue"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.auth)
    implementation(libs.firebase.storage)
    implementation(libs.credentials)
    implementation(libs.credentials.play.services.auth)
    implementation(libs.googleid)
    implementation(libs.firebase.firestore)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation(platform("com.google.firebase:firebase-bom:32.8.0"))
    implementation(libs.google.firebase.auth)
    implementation("com.google.android.gms:play-services-auth:21.0.0")
    implementation("de.hdodenhof:circleimageview:3.1.0")

    // Add this line to include Firebase Database
    implementation(libs.google.firebase.database)

    implementation (libs.firebase.database.v1970)

    // Add these lines to include Glide
    implementation("com.github.bumptech.glide:glide:4.12.0")
    
    implementation (libs.com.github.bumptech.glide.glide)
    annotationProcessor (libs.compiler)
}


