plugins {
    application
    id("java")
}


application {
    mainClass = "hexlet.code.App"
}


group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}

tasks.test {
    useJUnitPlatform()
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
