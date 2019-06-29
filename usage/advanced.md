---
layout:     progression_page
catagories: setup

previous:
    text: "Basic Usage"
    url:  basic

next:
    text: "Back to Home"
    url:  /
---
# Advanced Usage

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