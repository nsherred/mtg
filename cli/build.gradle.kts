@file:Suppress("PropertyName")

val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val graphql_java_version: String by project

plugins {
    application
    kotlin("jvm") version "1.7.10"
    kotlin("plugin.serialization") version "1.7.10"
}

application {
    mainClass.set("io.nicronomicon.cli.MainKt")
}

dependencies {
    implementation(project(":core"))
    implementation(project(":ecs"))
    implementation(project(":mtg"))
    implementation("com.github.haifengl:smile-plot:2.6.0")
    implementation("org.jetbrains.kotlinx:kotlinx-cli-jvm:0.3.5")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:$ktor_version")
    implementation("io.ktor:ktor-client-content-negotiation:$ktor_version")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")
    implementation(kotlin("reflect"))
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation("io.ktor:ktor-client-cio-jvm:2.1.0")
    implementation("io.ktor:ktor-client-serialization-jvm:2.1.0")

    testImplementation("io.mockk:mockk:1.12.5")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}