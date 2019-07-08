---
title:      Basic Usage
layout:     progression_page
catagories: setup
author:     Kunal Sheth

previous:
    text: Configure
    url:  /setup/configure

next:
    text: Advanced Usage
    url:  advanced
---
{% for u in site.data.usage.basic %}
{{u.text}}
{% include kotlin.html src=u.code %}
{% endfor %}