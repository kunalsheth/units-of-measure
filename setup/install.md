---
title:      Install
layout:     progression_page
catagories: setup
author:     Kunal Sheth

previous:
    text: "Benefit: Safe Flexibility"
    url:  /benefits/safe-flexibility

next:
    text: Advanced Configuration
    url:  configure

skip:
    text: Basic Usage
    url:  /usage/basic
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

{{site.lib}} comes ready to use with common SI units and quantities.

For the following customizations, please edit the `uoms/units-of-measure.gradle` [configuration](configure):
1. using imperial or non-SI units (e.g. Mile, Degree, Gallon, etc.)
2. using uncommon quantities (e.g. Absement, VoltageSlewRate, etc.)
3. shrinking size of compiled binary by fine-tuning which definitions are generated