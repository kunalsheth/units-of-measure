---
title:      Safe Flexibility
layout:     progression_page
catagories: benefits
author:     Kunal Sheth

previous:
    text: "Benefit: Cleaner Code"
    url:  cleaner-code

next:
    text: Install
    url:  /setup/install
---
# 100% Customizable
{{site.lib}} takes a novel, metaprogramming approach to the problem of type-safe dimensional analysis. Because the DSL is auto-generated, {{site.lib}} works great for all engineering and scientific applications.

With just the **[tweak of a config file]({% link setup/configure.md %})**, {{site.lib}} can represent any unit or quantity.


# Type-safe Math Library
For even greater safety and ease of use, {{site.lib}} ships with a type-safe superset of the `kotlin.math` library.  
This means, for example, that {{site.lib}} can track units & dimensions even across complex trigonometric expressions.

Lets write a function that uses the law of cosines to solve for **_m∠C_**.
{% include kotlin.html src=site.data.examples.math.trig.function %}


# Strong Support for Generic Programming
{{site.lib}} allows you to define relationships between quantities at the type level. All you have to do is pass a "proof" (`::p`).

> Technical Note:
"Proof passing" is a technique invented by Kunal Sheth.
It allows dimensional relationships to be used as bounds for UOM type parameters by exploiting Kotlin's type inference and method overloading capabilities.

This means, for example, that we can write generic integration, differentiation, & stdev utilities.

{% for e in site.data.examples.generics %}
### Generic {{e.text}}
{% include kotlin.html src=e.function %}
{% include kotlin.html src=e.call %}
<a href="{{e.link}}">view complete implementation</a>
{% endfor %}