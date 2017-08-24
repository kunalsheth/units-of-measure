# units-of-measure
Type-safe dimensional analysis in Kotlin

## Gradle Installation
```
apply plugin: 'kotlin-kapt'

repositories {
    maven { url 'https://jitpack.io' }
}

def unitsOfMeasureVersion = '1b9d6adbdd'

dependencies {
    compileOnly group: 'com.github.kunalsheth.units-of-measure', name: 'annotations', version: unitsOfMeasureVersion
    kapt group: 'com.github.kunalsheth.units-of-measure', name: 'processor', version: unitsOfMeasureVersion
}

sourceSets.main.kotlin.srcDir "${buildDir.absolutePath}/generated/source/kaptKotlin/main"
```
