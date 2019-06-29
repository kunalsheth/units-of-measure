---
layout:     progression_page
catagories: setup

previous:
    text: "Configuration"
    url:  /setup/configuration

next:
    text: "Advanced Usage"
    url:  advanced
---
# Basic Usage

{% for u in site.data.usage.basic %}
{{u.text}}
{% include kotlin.html src=u.code %}
{% endfor %}