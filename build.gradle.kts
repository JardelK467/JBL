// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    kotlin("jvm") version "1.9.0" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
    id("org.jlleitschuh.gradle.ktlint") version "12.1.0"
}

buildscript {
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.9.0"))
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.48")
    }
}
