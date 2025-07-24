plugins {
    // Apply the shared build logic from a convention plugin.
    // The shared code is located in `buildSrc/src/main/kotlin/kotlin-jvm.gradle.kts`.
    id("buildsrc.convention.kotlin-jvm")

    id("com.google.devtools.ksp") version "2.2.0-2.0.2"
    kotlin("plugin.serialization") version "2.2.0"

    // Apply the Application plugin to add support for building an executable JVM application.
    application
}

dependencies {
    implementation("com.google.auto.service:auto-service-annotations:1.1.1")
    ksp("com.google.auto.service:auto-service-ksp:1.1.1")

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")

    // Project "app" depends on project "utils". (Project paths are separated with ":", so ":utils" refers to the top-level "utils" project.)
    implementation(project(":utils"))
}

application {
    // Define the Fully Qualified Name for the application main class
    // (Note that Kotlin compiles `App.kt` to a class with FQN `com.example.app.AppKt`.)
    mainClass = "org.example.app.AppKt"
}
