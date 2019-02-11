plugins {
    base
    id("org.gretty") version "2.3.1" apply false
    id("org.springframework.boot") version "2.1.2.RELEASE" apply false
}

subprojects {
    apply(plugin = "java")

    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_1_8
    }

    repositories {
        jcenter()
    }

    dependencies {
        "implementation"(platform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES))
    }
}
