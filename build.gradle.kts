plugins {
    base
    id("org.gretty") version "2.3.1" apply false
}

subprojects {
    apply(plugin = "war")
    apply(plugin = "org.gretty")

    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_1_8
    }

    repositories {
        jcenter()
    }

    dependencies {
        "implementation"("org.springframework:spring-webmvc:5.1.4.RELEASE")
        "providedCompile"("javax.servlet:javax.servlet-api:3.1.0")
    }
}
