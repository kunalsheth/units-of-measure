---
layout:     progression_page
catagories: setup

previous:
    text: "Installation"
    url:  installation

next:
    text: "Basic Usage"
    url:  /usage/basic
---
# Configuration

## Terminology
Before we can start configuring {{site.lib}}, lets make sure we're on the same page regarding some terminology:

1. [dimension](https://en.wikipedia.org/wiki/Dimensional_analysis)
   : "Physical quantities that are of the same kind ... (e.g., length or time or mass) have the same dimension and can be directly compared to other physical quantities of the same kind ..., even if they are originally expressed in differing units of measure (such as yards and meters). If physical quantities have different dimensions (such as length vs. mass), they cannot be expressed in terms of similar units and cannot be compared in quantity..." [^1]

2. [quantity](https://en.wikipedia.org/wiki/Physical_quantity)
   : "a property of a material that can be quantified by measurement. A physical quantity can be expressed as the combination of unit by a number. where the number is the magnitude . For example, 1 kg where 1 is magnitude and kg is unit." [^2]

3. [unit of measure](https://en.wikipedia.org/wiki/Units_of_measurement)
   : "a definite magnitude of a quantity ... that is used as a standard for measurement of the same kind of quantity. ... For example, a length is a physical quantity. The metre is a unit of length that represents a definite predetermined length." [^3]

4. [base dimensions (L, M, T, I, Θ, N, J)](https://en.wikipedia.org/wiki/Dimensional_analysis#Definition)
   : | symbol    | SI base unit [^4] | dimension name [^5]       |
     |----------:|:------------------|---------------------------|
     | **L**     | m                 | length                    |
     | **M**     | kg                | mass                      |
     | **T**     | s                 | time                      |
     | **I**     | A                 | electric current          |
     | **Θ**     | K                 | thermodynamic temperature |
     | **N**     | mol               | amount of substance       |
     | **J**     | cd                | luminous intensity        |
     
## Basic Configuration Structure
<details open>
<summary><code>{{site.data.config.file}}</code></summary>
{% include gradle.html src=site.data.config.structure %}
<a href="https://github.com/kunalsheth/uom-example-project/blob/master/uoms/units-of-measure.gradle">view complete configuration example</a>
<p><!-- br doesn't work for some reason --></p>
</details>
<p></p>

## Relationships
{% include gradle.html src=site.data.config.snippets.relationships %}

`relationships` tell {{site.lib}} which operator extension functions to generate.
The `r(...)` function returns a set containing many different permutations of the given dimensions.
{{site.lib}} will then generate the corresponding operator overloads and inline classes.

For example, `relationships += r(d(L: 1), d(T: 1))` will generate the following on build:
+ `Quan<...>` inline classes:
    - `L` (specified by user)
    - `T` (specified by user)
    - `L⋅T⁻¹` (inferred from input)
    - `L⋅T` (inferred from input)
    - `L⁻¹⋅T` (inferred from input)
    - and a few others  (inferred from input)
+ overloads for the `*` and `/` operators:
    - `L` / `L` ↦ `Dimensionless`
    - `L` * `L` ↦ `L²`
    - `L` / `T` ↦ `L⋅T⁻¹`
    - `Dimensionless` * `L` ↦ `L`
    - `Dimensionless` * `Dimensionless` ↦ `Dimensionless`
    - `L²` / `L` ↦ `L`
    - `L²` / `L²` ↦ `Dimensionless`
    - `Dimensionless` / `L⋅T⁻¹` ↦ `L⁻¹⋅T`
    - `Dimensionless` * `L⋅T⁻¹` ↦ `L⋅T⁻¹`
    - `T²` / `L⋅T` ↦ `L⁻¹⋅T`
    - `T²` / `L⁻¹⋅T` ↦ `L⋅T`
    - and many, many more

Using the `r(...)` function sacrifices generated code size for ease of use.  
To reduce the amount of generated code, individual instances of the [`Relation`](https://github.com/kunalsheth/units-of-measure/blob/master/plugin/src/main/kotlin/info/kunalsheth/units/data/Relation.kt) class can also be added to the `relationships` set.

## Quantities
{% include gradle.html src=site.data.config.snippets.quantities %}

{{site.lib}}'s default naming scheme is not easy for humans to work with.  
Use `quantities` to make {{site.lib}} define and use human-friendly typealiases in its generated DSL.
+ `q("velocity", d(L: 1, T: -1))`
  : `L⋅T⁻¹` ⇔ `velocity`
+ `q("acceleration", d(L: 1, T: -2))`
  : `L⋅T⁻²` ⇔ `acceleration`
+ `q("force", d(M: 1, L: 1, T: -2))`
  : `L⋅M⋅T⁻²` ⇔ `force`
+ `q("electrical resistance", d(M: 1, L: 2, T: -3, I: -2))`
  : `L²⋅M⋅T⁻³⋅I⁻²` ⇔ `electrical resistance`
+ `q("thermal conductivity", d(M: 1, L: 1, T: -3, Theta: -1))`
  : `L⋅M⋅T⁻³⋅Θ⁻¹` ⇔ `thermal conductivity`

Its okay to define multiple quantities for the same dimension.  
(e.g. "speed" and "velocity" for `d(L: 1, T: -2)`)

Its not okay to define the same quantity on multiple dimensions.  
(e.g. "rate" in `d(L: 1, T: -1)` and "rate" in `d(L: 1, T: -2)`)

For ease of use, {{site.lib}} comes bundled with all derived SI units & quantities.[^6]  
(area, volume, velocity, volumetric flow, acceleration, and many, many more.)

These pre-defined quantities are all stored in the `quantities` set.
One way to delete them is to write `quantities = ...` instead of `quantities += ...` in your configuration.

## Units of Measure
{% include gradle.html src=site.data.config.snippets.unitsOfMeasure %}

`unitsOfMeasure` defines unit names, conversion factors, and derived dimensions.  
Given `unitsOfMeasure += u("Minute", 60.0, d(T: 1))`, {{site.lib}} will generate:
+ ```inline val Number.Minute: Time get() = ...```
+ ```inline val T.Minute: Double get() = ...```
+ ```object Minute : UomConverter<T>, Quan<T> ...``` (useful for [serialization]({% link usage/advanced.md %}))

To determine the conversion factor, `factorToSI`, when calling `u(...)`, use the following formula
> SI Base Units * `factorToSI` = Custom Unit.

For example:
- 1 second * `60.0` = 1 minute
- 1 metre⁻¹ ⋅ kilogram ⋅ second⁻² * `101325` = 1 atmosphere

Its okay to define multiple units for the same dimension.  
(e.g. "FootPerSecond" and "MilePerHour" for `d(L: 1, T: -1)`)

Its not okay to define the same unit for multiple dimensions.  
(e.g. "MyUnit" of `d(L: 1, T: -1)` and "MyUnit" of `d(L: 1, T: -2)`)

For ease of use, {{site.lib}} comes bundled with all derived SI units & quantities.[^6]  
(hertz, newton, pascal, joule, watt, coulomb, volt, farad, ohm, and many, many more.)

These pre-defined quantities are all stored in the `unitsOfMeasure` set.
One way to delete them is to write `unitsOfMeasure = ...` instead of `unitsOfMeasure += ...` in your configuration.

## Footnotes
[^1]: [https://en.wikipedia.org/wiki/Dimensional_analysis](https://en.wikipedia.org/wiki/Dimensional_analysis)
[^2]: [https://en.wikipedia.org/wiki/Physical_quantity](https://en.wikipedia.org/wiki/Physical_quantity)
[^3]: [https://en.wikipedia.org/wiki/Units_of_measurement](https://en.wikipedia.org/wiki/Units_of_measurement)
[^4]: [https://en.wikipedia.org/wiki/SI_base_unit](https://en.wikipedia.org/wiki/SI_base_unit)
[^5]: [https://en.wikipedia.org/wiki/Dimensional_analysis#Definition](https://en.wikipedia.org/wiki/Dimensional_analysis#Definition)
[^6]: [https://en.wikipedia.org/wiki/SI_derived_unit](https://en.wikipedia.org/wiki/SI_derived_unit)