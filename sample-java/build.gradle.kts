plugins {
    war
    id("org.gretty")
}

dependencies {
    implementation("org.springframework:spring-webmvc")

    providedCompile(platform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES))
    providedCompile("javax.servlet:javax.servlet-api")
}
