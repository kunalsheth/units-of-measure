# units-of-measure
Type-safe dimensional analysis in Kotlin

### Gradle Installation
```groovy
apply plugin: 'kotlin-kapt'

repositories {
    maven { url 'http://repo.kunalsheth.info' }
}

dependencies {
    compileOnly group: 'info.kunalsheth.units-of-measure', name: 'annotations', version: '1.1.3'
    kapt group: 'info.kunalsheth.units-of-measure', name: 'processor', version: '1.1.3'
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
- [x] Generate implicit relationships as well. (e.g. if ``v=ir`` then ``v/i=r`` and ``v/r=i``)
- [ ] Make annotations easier to write and manage.
- [ ] Add support for unit conversions.
    - Distinguish between dimension and units.
    - Create @Convert annotation that takes a dimension and multiplier.
    - Generate extension properties to convert SI and custom units.
- [ ] Benchmark performance in contrast to primitives.
- [ ] Write unit tests.

### Sources
- https://en.wikipedia.org/wiki/SI_base_unit
- https://en.wikipedia.org/wiki/SI_derived_unit
- http://www.squants.com
- https://en.wikipedia.org/wiki/List_of_physical_quantities