plugins {
    java
    id("org.springframework.boot") version "3.2.2"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "org.springframework.samples"
version = "2.6.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

val webjarsFontawesomeVersion = "4.7.0"
val webjarsBootstrapVersion = "5.1.3"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-cache")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("jakarta.xml.bind:jakarta.xml.bind-api")
    implementation("javax.cache:cache-api")
    runtimeOnly("org.springframework.boot:spring-boot-starter-actuator")
    runtimeOnly("org.webjars:webjars-locator-core")
    runtimeOnly("org.webjars.npm:bootstrap:$webjarsBootstrapVersion")
    runtimeOnly("org.webjars.npm:font-awesome:$webjarsFontawesomeVersion")
    runtimeOnly("org.ehcache:ehcache")
    runtimeOnly("com.h2database:h2")
    runtimeOnly("com.mysql:mysql-connector-j")
    runtimeOnly("org.postgresql:postgresql")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.named("compileJava") {
    inputs.files(tasks.named("processResources"))
}
