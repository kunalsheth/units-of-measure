# units-of-measure
Type-safe dimensional analysis in Kotlin.

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

### Usage
Before getting started, I recommend browsing the Wikipedia articles listed [below](#sources).

First, we must tell units-of-measure what we want. This can be done using the `@Schema` annotation.

`@Schema` takes up to four parameters:
1) `generateCommonUnits` — Sometimes, you just want to go fast. By setting this flag to true, you can quickly acquire almost all the units and quantities contained within [Squants](http://www.squants.com).
2) `relationships` — Here you can describe dimensional analyses you would like to use. You cannot divide `ElectricPotential` with `ElectricalResistance` unless you tell units-of-measure first.
3) `quantities` — Here you can name your quantities. This allows you to call it `ElectricalResistance` instead of the the cryptic `L²⋅M⋅T⁻³⋅I⁻²`.
4) `unitsOfMeasure` — Here you can define your units. This allows you to say `length = number.Feet` or `number = length.Feet`. (Of course, everything is converted to SI internally.)

Please look at this [sample code](http://kunalsheth.info/units-of-measure/blob/master/sample/src/main/kotlin/info/kunalsheth/unitsofmeasure/sample/Sample.kt).

### Todo List
- [x] Make it work.
- [x] Generate implicit relationships as well. (e.g. if `v=ir` then `v/i=r`, `v/r=i`, etc.) (`@Relate`) 
- [x] Make annotations easier to write and manage. (`@Schema`)
- [x] Add support for unit conversions. (`@UnitOfMeasure`)
- [ ] Add docs and comments.
- [ ] Optimize for faster compilation.
- [ ] Add metric prefixes.
- [ ] Benchmark performance in contrast to primitives.
- [ ] Write unit tests.

### <a name="sources">Sources</a>
- https://en.wikipedia.org/wiki/SI_base_unit
- https://en.wikipedia.org/wiki/SI_derived_unit
- https://en.wikipedia.org/wiki/List_of_physical_quantities
- http://www.squants.com