# units-of-measure
A DSL for type-safe dimensional analysis and unit conversion in Kotlin.

### Usage
Take a look at the project website for installation and usage: http://units.kunalsheth.info
- [Gradle Install](http://units.kunalsheth.info/setup/install)
- [Configuration](http://units.kunalsheth.info/setup/configure)
- [Basic Usage](http://units.kunalsheth.info/usage/basic)

You can also take a look at this [sample project](https://github.com/kunalsheth/uom-example-project) for a complete gradle setup and to learn about some of the more advanced features.

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
- [x] Add docs. (http://units.kunalsheth.info)
- [x] Add metric prefixes.
- [x] Multiplatform.
- [x] Stronger support for generic use (`Quantity<This, IntegralOfThis, DerivativeOfThis>`)
- [ ] `*` and `/` singleton types for even safer proof-passing.
- [ ] Optimize for faster compilation and runtime.
- [ ] Benchmark performance hit in contrast to primitives. (Can someone help me with this?)
