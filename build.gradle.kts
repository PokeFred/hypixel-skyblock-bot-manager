group = "de.pokefred.hypixel"
version = "1.0-SNAPSHOT"

application {
    mainClass = "de.pokefred.hypixel.App"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

plugins {
    java
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.guava)
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }

    compileTestJava {
        options.encoding = "UTF-8"
    }

    test {
        useJUnitPlatform()
    }
}
