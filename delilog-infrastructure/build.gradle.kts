plugins {
    kotlin("plugin.jpa")
}

dependencies {
    implementation(project(":delilog-domain"))

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("com.h2database:h2")
}
