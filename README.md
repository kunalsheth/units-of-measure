# units-of-measure
Type-safe dimensional analysis in Kotlin.

### Background
Type-safe dimensional analysis and unit conversion can be extremely beneficial to a team. From personal experience, using type-safe calculations result in:
- Faster Development — IDE autocomplete provides meaningful predictions, rather than just listing every number in scope.
- Cleaner Code — Variable names will be of a reasonable length now unit information is documented by the type.
- Higher Confidence — All unit/dimension related bugs will show up at compile time. Debugging is less difficult and time-consuming.

units-of-measure is not the first library to implement type-safe dimensional analysis in some form.
On the JVM, there is already:
- [JSR 275](https://jcp.org/en/jsr/detail?id=275) (Java)
- [JSR 363](https://jcp.org/en/jsr/detail?id=363) (Java)
- [Squants](http://www.squants.com) (Scala)

However, units-of-measure takes a new approach: metaprogramming. I see numerous benefits to this:
1) _Incredibly_ Extendable — Adding new functionality is as simple as adding a line to your build file. No tedious "hand-coding" is required.
2) Small — You only generate what you need. You are not forced to bundle every conceivable unit, quantity, and dimension with your app. 
3) Bug Resistant — Programming by hand is error prone and time-consuming. Code generation can ensure correctness.

### Gradle Installation
In `./build.gradle`:
```groovy
buildscript {
    repositories {
        maven { url 'http://repo.kunalsheth.info/' }
    }
    dependencies {
        classpath 'info.kunalsheth.units:plugin:3.1.0'
    }
}
apply plugin: 'info.kunalsheth.units.gradle'

apply from: 'units-of-measure.gradle'
```

In `./units-of-measure.gradle`:
```groovy
generateUnitsOfMeasure {
    // do all configuration here
}
sourceSets.main.kotlin.srcDir generateUnitsOfMeasure.generatedSrcDir
compileKotlin.dependsOn(generateUnitsOfMeasure) // may vary
```

### Usage
Please read the [wiki](http://kunalsheth.info/units-of-measure/wiki) and look at this [sample code](http://kunalsheth.info/units-of-measure/tree/master/samples).

### Todo List
- [x] Make it work.
- [x] Generate implicit relationships as well. (e.g. if `v=ir` then `v/i=r`, `v/r=i`, etc.) (`@Relate`) 
- [x] Make annotations easier to write and manage. (`@Schema`)
- [x] Add support for unit conversions. (`@UnitOfMeasure`)
- [x] Add docs. ([wiki](http://kunalsheth.info/units-of-measure/wiki))
- [x] Add metric prefixes.
- [x] Benchmark performance in contrast to primitives.
- [x] Multiplatform
- [x] Stronger support for generic use (`Derivative<Q>`)
- [ ] Optimize for faster compilation.
