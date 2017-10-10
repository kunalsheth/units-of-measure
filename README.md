# units-of-measure
Type-safe dimensional analysis in Kotlin

### Gradle Installation
```groovy
apply plugin: 'kotlin-kapt'

repositories {
    maven { url 'https://jitpack.io' }
}

def unitsOfMeasureVersion = 'c7c0dc1499'

dependencies {
    compileOnly group: 'com.github.kunalsheth.units-of-measure', name: 'annotations', version: unitsOfMeasureVersion
    kapt group: 'com.github.kunalsheth.units-of-measure', name: 'processor', version: unitsOfMeasureVersion
}

sourceSets.main.kotlin.srcDir "${buildDir.absolutePath}/generated/source/kaptKotlin/main"
```

### Usage
Representing Velocity:
```kotlin
// annotations can be placed anywhere in the project
@Relate(
        a = UomData(metre = 1),
        b = UomData(second = 1)
)

fun main(args: Array<String>) {
    val distance = metre(10.0)
    val time = second(3.14)
    val speed: `m⋅s⁻¹` = distance / time
    //                  `distance * time` doesn't compile
    //                  `time / distance` doesn't compile
    //                  `time * distance` doesn't compile
}
```
Ohm's Law:
```kotlin
// annotations can be placed anywhere in the project
@Relate(
        a = UomData(ampere = 1), // I
        b = UomData(metre = 2, kilogram = 1, second = -3, ampere = -2) // R
)

fun foo(): volt {
    val i = ampere(133.0)
    val r = ohm(0.0902)
    return i * r
    //    `r * i` also compiles
}

fun bar(): ampere {
    val v = volt(12.0)
    val r = ohm(5.0)
    return v / r
    //    `v * r` doesn't compile
    //    `r * v` doesn't compile
    //    `r / v` doesn't compile
}
```

### Todo List
- [x] Make it work.
- [ ] Make annotations easier to write and manage.
- [x] Generate implicit relationships as well. (e.g. if ``v=ir`` then ``v/i=r`` and ``v/r=i``)
- [ ] Publish on Maven Central.
