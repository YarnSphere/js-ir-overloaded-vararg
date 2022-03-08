plugins {
    kotlin("js") version "1.6.20-RC"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    js(IR) {
        nodejs()
    }
}
