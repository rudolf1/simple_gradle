buildscript {
    repositories {
        mavenCentral()
    }
}

plugins {
    kotlin("jvm") version "1.2.61"
}

group = "ua.rudolf.sample"
version = "1.0"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {

    compile(kotlin("stdlib-jdk8"))
    compile(kotlin("reflect"))

    testCompile(kotlin("test"))
    testCompile(kotlin("test-junit"))
}

