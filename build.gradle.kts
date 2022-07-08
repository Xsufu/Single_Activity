// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("com.android.application") version "7.2.1" apply false
    id ("com.android.library") version "7.2.1" apply false
    id ("org.jetbrains.kotlin.android") version "1.7.10" apply false
}

buildscript {
    dependencies {
        classpath ("com.android.tools.build:gradle:7.2.1")
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.0")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}