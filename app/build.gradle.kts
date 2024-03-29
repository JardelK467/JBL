plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("org.jlleitschuh.gradle.ktlint")
}

android {
    namespace = "com.example.jbl"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.jbl"
        minSdk = 29
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
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
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
        debug.set(true)
        android.set(true)
        ignoreFailures.set(true)
        outputToConsole.set(true)
        outputColorName.set("RED")
        kotlinScriptAdditionalPaths {
            include(fileTree("scripts/"))
        }
        filter {
            exclude("**/generated/**")
            include("**/kotlin/**")
        }
    }

    dependencies {

        implementation("com.google.devtools.ksp:symbol-processing-api:1.9.0-1.0.13")
        implementation("androidx.core:core-ktx:1.12.0")
        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
        implementation("androidx.activity:activity-compose:1.8.2")
        implementation(platform("androidx.compose:compose-bom:2023.03.00"))
        implementation("androidx.compose.ui:ui")
        implementation("androidx.compose.ui:ui-graphics")
        implementation("androidx.compose.ui:ui-tooling-preview")
        implementation("androidx.compose.material3:material3")
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
        androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
        androidTestImplementation("androidx.compose.ui:ui-test-junit4")
        debugImplementation("androidx.compose.ui:ui-tooling")
        debugImplementation("androidx.compose.ui:ui-test-manifest")

        // KSP symbol processing
        implementation("com.google.devtools.ksp:symbol-processing-api:1.9.0-1.0.13")

        val roomVersion = "2.6.1"
        val koinVersion = "3.5.1"

        // ROOM
        ksp("androidx.room:room-compiler:$roomVersion")
        // Kotlin Extensions and Coroutines support for Room
        implementation("androidx.room:room-ktx:$roomVersion")
        implementation("androidx.room:room-rxjava3:$roomVersion")
        implementation("androidx.room:room-runtime:$roomVersion")
        annotationProcessor("androidx.room:room-compiler:$roomVersion")

        // Retrofit with GSON converter
        implementation("com.squareup.retrofit2:retrofit:2.9.0")
        implementation("com.squareup.retrofit2:converter-gson:2.9.0")

        // Koin
        implementation(platform("io.insert-koin:koin-bom:$koinVersion")) // automatically updates all koin libraries
        implementation("io.insert-koin:koin-android")
        implementation("io.insert-koin:koin-androidx-compose")
        implementation("io.insert-koin:koin-core")

        // Test helpers
        testImplementation("androidx.room:room-testing:$roomVersion")
        // Paging 3 Integration
        implementation("androidx.room:room-paging:$roomVersion")
    }
}
