// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        jcenter()
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://maven.fabric.io/public")
//        maven {
//            setUrl(("https://plugins.gradle.org/m2/"))
//        }
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.0.4")
        classpath("com.google.gms:google-services:4.3.10")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.38.1")
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.7.1")
//        classpath("gradle.plugin.com.gaelmarhic:quadrant:$version")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        jcenter()
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://maven.google.com/")
    }
}
