---
title:      Install
layout:     progression_page
catagories: setup
author:     Kunal Sheth

previous:
    text: "Benefit: Safe Flexibility"
    url:  /benefits/safe-flexibility

next:
    text: Configure
    url:  configure
---
# Gradle Plugin Installation

{{site.lib}} is distributed as a Gradle plugin.  

Latest version: <code class="libversion"></code>
<script src="{% link assets/libversion.js %}"></script>

{% for f in site.data.install.plugin %}
<details open>
<summary><code>{{ f.file }}</code></summary>
{% include gradle.html src=f.content %}
<a href="{{ site.data.install.github_root | append: f.file }}">see full example on GitHub</a>
<p><!-- br doesn't work for some reason --></p>
</details>
{% endfor %}

# Generated Code Module
Creating a separate Gradle module for {{site.lib}}'s generated code is <em>highly</em> recommended.
{% for f in site.data.install.module %}
<details open>
<summary><code>{{ f.file }}</code></summary>
{% include gradle.html src=f.content %}
<a href="{{ site.data.install.github_root | append: f.file }}">see full example on GitHub</a>
<p><!-- br doesn't work for some reason --></p>
</details>
{% endfor %}

# User Application Dependency
{% for f in site.data.install.app %}
<details open>
<summary><code>{{ f.file }}</code></summary>
{% include gradle.html src=f.content %}
<a href="{{ site.data.install.github_root | append: f.file }}">see full example on GitHub</a>
<p><!-- br doesn't work for some reason --></p>
</details>
{% endfor %}

Because {{site.lib}} generates a DSL for you, it does not magically work out of the box.  
You need to tell it _what_ you want it to generate. This is done in the `uoms/units-of-measure.gradle` [configuration](configure) file.