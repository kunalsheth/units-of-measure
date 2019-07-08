---
title:      Advanced Usage
layout:     progression_page
catagories: setup
author:     Kunal Sheth

previous:
    text: Basic Usage
    url:  basic

next:
    text: Back to Home
    url:  /
---
Sorry, I'm still writing up formal explanations on the following:
- defining more complicated bounds on generic quantity parameters
- the bundled type-safe math library (a superset of `kotlin.math`)
- {{site.lib}}'s serialization & introspection capabilities
- `∠`, {{site.lib}}'s 8th base dimension

For now, you can take a look at these examples demonstrating said features:
- [Benefits: Safe Flexibility]({% link benefits/safe-flexibility.md %})
    - type-safe math library example
    - complex generic bounds via "proof-passing"
- [Team846 Kapuchin Control System Grapher](https://github.com/Team846/2019-preseason/blob/master/architecture/jvmfrc/src/main/kotlin/com/lynbrookrobotics/kapuchin/logging/actual.kt)
    - serialization & introspection support via `UomConverter<...>`
- [units-of-measure's Bundled SI Quantities & Dimensions](https://github.com/kunalsheth/units-of-measure/blob/57e8512cf849dc9253f0b9151e7a0846180b6a9f/plugin/src/main/kotlin/info/kunalsheth/units/InternationalSystemOfUnits.kt#L56)
    - angle as a base dimension via the `A` dimension parameter