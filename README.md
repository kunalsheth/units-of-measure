# units-of-measure
Type-safe dimensional analysis in Kotlin.

### Background
units-of-measure is not the first library to implement type-safe dimensional analysis in some form.
On the JVM, there is already:
- [JSR 275](https://jcp.org/en/jsr/detail?id=275) (Java)
- [JSR 363](https://jcp.org/en/jsr/detail?id=363) (Java)
- [Squants](http://www.squants.com) (Scala)

<sup>These are all I could find with a Google search. Feel free to contribute to this list.</sup>

However, units-of-measure takes a novel approach, _annotation processing_. I see numerous benefits to this:
1) _Incredibly_ Extendable — Adding functionality is as simple as writing another annotation. No slow, tedious "hand-coding" is required.
2) Small — You only generate what you need. You are not forced to bundle every conceivable unit, quantity, and dimension with your app.
3) Bug Resistant — Programming such functionality by hand is error prone. Code generation can ensure correctness.

### Gradle Installation
```groovy
apply plugin: 'kotlin-kapt'

repositories {
    maven { url 'http://repo.kunalsheth.info' }
}

dependencies {
    compileOnly group: 'info.kunalsheth', name: 'units-of-measure', version: '2.0.0'
    kapt group: 'info.kunalsheth', name: 'units-of-measure', version: '2.0.0'
}

sourceSets.main.kotlin.srcDir "${buildDir.absolutePath}/generated/source/kaptKotlin/main"
```

### Usage
Please read the [wiki](http://kunalsheth.info/units-of-measure/wiki).

Please look at this [sample code](http://kunalsheth.info/units-of-measure/tree/master/samples).

### Todo List
- [x] Make it work.
- [x] Generate implicit relationships as well. (e.g. if `v=ir` then `v/i=r`, `v/r=i`, etc.) (`@Relate`) 
- [x] Make annotations easier to write and manage. (`@Schema`)
- [x] Add support for unit conversions. (`@UnitOfMeasure`)
- [x] Add docs.(wiki)
- [x] Add metric prefixes.
- [ ] Optimize for faster compilation.
- [ ] Benchmark performance in contrast to primitives.
