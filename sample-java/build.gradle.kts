plugins {
    war
    id("org.gretty")
}

dependencies {
    implementation("org.springframework:spring-webmvc")

    providedCompile("javax.servlet:javax.servlet-api")
}
