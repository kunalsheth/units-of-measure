plugins {
    kotlin("multiplatform") version "1.4.21"
    id("info.kunalsheth.units") version "6.1.0"
}

group = "info.kunalsheth.units"
version = "0.0.1"

repositories {
    mavenCentral()
}

kotlin {
    val hostOs = System.getProperty("os.name")
    val isMingwX64 = hostOs.startsWith("Windows")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    nativeTarget.apply { }

    jvm {
        compilations.all { kotlinOptions.jvmTarget = "13" }
        testRuns["test"].executionTask.configure { useJUnitPlatform() }
        withJava()
    }

    js(IR) { nodejs() }

    sourceSets {
        val uoms by creating {
            tasks { generateUnitsOfMeasure { kotlin.srcDir(generatedSrcDir) } }
        }
        val commonMain by getting {
            dependsOn(uoms)
        }
        val nativeTest by getting
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit5"))
                implementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
                runtimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

apply(from = "units-of-measure.gradle")
tasks {
    val uom = generateUnitsOfMeasure.get()
    filter { it != uom }.forEach { it.dependsOn(uom) }
}