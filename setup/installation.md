---
layout:     progression_page
catagories: setup

previous:
    text: "Benefit: Safe Flexibility"
    url:  /benefits/safe-flexibility

next:
    text: "Configuration"
    url:  configuration
---
# Gradle Installation

{{site.lib}} is distributed as a Gradle plugin.  
Creating a separate Gradle module for {{site.lib}} is <em>highly</em> recommended.

Current version: <code class="libversion"></code>
<script src="{% link assets/libversion.js %}"></script>

{% for f in site.data.install.files %}
<details open>
<summary><code>{{ f.file }}</code></summary>
{% include gradle.html src=f.content %}
<a href="{{ site.data.install.github_root | append: f.file }}">see full example on GitHub</a>
<p><!-- br doesn't work for some reason --></p>
</details>
{% endfor %}

Because {{site.lib}} generates a DSL for you, it does not magically work out of the box.  
You need to tell it _what_ you want it to generate. This is done in the `uoms/units-of-measure.gradle` [configuration](configuration) file.