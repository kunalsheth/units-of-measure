# units-of-measure
A DSL for type-safe dimensional analysis and unit conversion in Kotlin.

### Usage
Please look at this [sample code](https://github.com/kunalsheth/units-of-measure/blob/master/demo/jvm/src/main/kotlin/info/kunalsheth/units/sample/Sample.kt) for DSL usage.
Configuration documentation can be found on the [wiki](http://kunalsheth.info/units-of-measure/wiki).

Also take a look at this [sample project](https://github.com/kunalsheth/uom-example-project) for more advanced usage and configuration.

### Gradle Installation
In `./build.gradle`:
```groovy
buildscript {
    repositories {
        maven { url 'http://repo.kunalsheth.info/' }
    }
    dependencies {
        classpath 'info.kunalsheth.units:plugin:5.2.4'
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

### Background
Type-safe dimensional analysis and unit conversion can be extremely beneficial to a team. From personal experience, using type-safe calculations result in:
- Faster Development — IDE autocomplete provides meaningful predictions, rather than just listing every number in scope.
- Cleaner Code — Variable names will be of a reasonable length now that unit information is documented by the type.
- Higher Confidence — All unit/dimension related bugs will show up at compile time. Debugging is less difficult and time-consuming.

units-of-measure's novel, metaprogramming approach to the problem makes it:
1) _Incredibly_ Extendable — Adding new functionality is as simple as adding a line to your build file. No tedious "hand-coding" is required.
2) Small — You only generate what you need. You are not forced to bundle every conceivable unit, quantity, and dimension with your app. 
3) Bug Resistant — Programming by hand is error prone and time-consuming. Code generation can ensure correctness.

### Todo List
- [x] Make it work.
- [x] Generate implicit relationships as well.
- [x] Make annotations easier to write and manage.
- [x] Add support for unit conversions.
- [x] Add docs. ([wiki](http://kunalsheth.info/units-of-measure/wiki))
- [x] Add metric prefixes.
- [x] Multiplatform.
- [x] Stronger support for generic use (`Quantity<This, IntegralOfThis, DerivativeOfThis>`)
- [ ] Generic reciprocal functions?
- [ ] Optimize for faster compilation and runtime.
- [ ] Benchmark performance hit in contrast to primitives. (Can someone help me with this?)
