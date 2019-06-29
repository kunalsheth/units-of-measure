---
layout:     progression_page
catagories: benefits

previous:
    text: "Benefit: Faster Development"
    url:  faster-development

next:
    text: "Benefit: Safe Flexibility"
    url:  safe-flexibility

skip:
    text: "Gradle Installation"
    url:  /setup/installation
---
# Cleaner Code  

## Automatic Unit Conversion
Lets do a practice problem:
> How many days does it take for a 3.7V 500mAh battery to discharge when a 10kΩ resistor is placed across its terminals?

If we were to solve this using numeric datatypes, all unit conversions must be taken care of by hand.
This becomes tedious, error prone, and difficult to read:
{% include kotlin.html src=site.data.examples.auto_convert.numeric %}

But, with {{site.lib}}, all unit conversions happen automatically.  
No magic constants. No massive variable names.
{% include kotlin.html src=site.data.examples.auto_convert.uom %}