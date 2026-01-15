plugins {
    id("java")
}

group = "com.immutex"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(files("libs/HytaleServer.jar"))
}