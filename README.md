# units-of-measure
Type-safe dimensional analysis in Kotlin

### Gradle Installation
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

### Usage
Representing Velocity:
```kotlin
@Differentiate(
        x = UomData(metre = 1),
        withRespectTo = UomData(second = 1)
)
fun main(args: Array<String>) {
    val distance = metre(10.0)
    val time = second(3.14)
    val speed: `m⋅s⁻¹` = distance / time
}
```
Ohm's Law:
```kotlin
// these annotations can be placed anywhere in the project
@Integrate(
        x = UomData(ampere = 1), // I
        withRespectTo = UomData(metre = 2, kilogram = 1, second = -3, ampere = -2) // R
)
@Differentiate(
        x = UomData(metre = 2, kilogram = 1, second = -3, ampere = -1), // V
        withRespectTo = UomData(metre = 2, kilogram = 1, second = -3, ampere = -2) // R
)

fun foo(): volt {
    val i = ampere(133.0)
    val r = ohm(0.0902)
    return i * r
    // `r * i` compiles
}

fun bar(): ampere {
    val v = volt(12.0)
    val r = ohm(5.0)
    return v / r
    // `r / v` doesn't compile
}
```

### Todo List
- [x] Make it work.
- [ ] Make annotations easier to write and manage
- [ ] Generate implicit relationships (e.g. ``v=ir`` therefore ``v/i=r`` and ``v/r=i``)
- [ ] Publish to Maven Central