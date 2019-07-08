---
title:      Faster Development
layout:     progression_page
catagories: benefits
author:     Kunal Sheth

previous:
    text: Home
    url:  /

next:
    text: "Benefit: Cleaner Code"
    url:  cleaner-code

skip:
    text: Install
    url:  /setup/install
---
# Self-Documenting Units
When using numeric datatypes, all units have to be spelled out in documentation, variables, and function names. 
Not only is this prone to human error, but it also requires significant boilerplate for what should be simple code.
{% include kotlin.html src=site.data.examples.car_class.numeric %}

But, with {{site.lib}}, variables and functions are all documented by their type.  
No more tedious documentation. No more massive variable names.
{% include kotlin.html src=site.data.examples.car_class.uom %}


# Better IDE Autocomplete
Additionally, {{site.lib}} helps your IDE make more helpful autocomplete predictions.

If we were using only doubles, the IDE would just spit out every number in scope.
{% include kotlin.html src=site.data.examples.autocomplete.numeric %}
![IDE autocomplete suggestions when using doubles]({% link assets/images/double-autocomplete-2.png %})


However, with {{site.lib}}, the IDE only suggests expressions (both generic and concrete) which can satisfy the rules of dimensional analysis.
{% include kotlin.html src=site.data.examples.autocomplete.uom %}
![IDE autocomplete suggestions when using {{site.title}}]({% link assets/images/uom-autocomplete-2.png %})