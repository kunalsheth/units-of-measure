---
layout: home
---
<script type="application/ld+json">
        {
            "@context": "http://schema.org",
            "@type": "SoftwareApplication",
            "name": "units-of-measure",
            "url": "https://github.com/kunalsheth/units-of-measure",
            "downloadUrl": "http://units.kunalsheth.info/setup/installation.html",
            "screenshot": "http://units.kunalsheth.info/assets/param-align.png",
            "review": [
                {
                    "@type": "Review",
                    "reviewBody": "Variables and functions will self-document their units. IDE autocomplete will become more accurate."
                },
                {
                    "@type": "Review",
                    "reviewBody": "Units will be converted automatically. No magic conversion factors. No massive variable names."
                },
                {
                    "@type": "Review",
                    "reviewBody": "Ships with a type-safe math library and support for defining complex generic bounds."
                },
                {
                    "@type": "Review",
                    "reviewBody": "Generate only what you need. Optimized to deliver real-time performance with a low memory footprint."
                },
                {
                    "@type": "Review",
                    "reviewBody": "Built for any application.</STRONG> Adding support for a new unit or quantity is as simple as adding a line to your build file."
                },
                {
                    "@type": "Review",
                    "reviewBody": "Generates converters to handle quantity metadata without reflection for configuration and logging."
                }
            ]
        }
</script>
    
<h1>Type-safe dimensional analysis and unit conversion</h1>

<br>
![units-of-measure]({% link assets/param-align.png %})

<link rel="stylesheet" href="{% link assets/button.css %}">
<center><h2>
<a href="{% link setup/installation.md %}" class="cta-btn" role="button">Try with Gradle!</a>
</h2></center>

<center>
<a class="github-button" href="https://github.com/kunalsheth/units-of-measure" data-size="large" aria-label="View units-of-measure on GitHub">View on GitHub</a>
<a class="github-button" href="https://github.com/kunalsheth/units-of-measure" data-icon="octicon-star" data-size="large" data-show-count="true" aria-label="Star kunalsheth/units-of-measure on GitHub">Star</a>
</center>

<br>

<table>
  <thead>
    <tr>
      {% for benefit in site.data.benefits.general %}
        <th><a href="{{benefit.link}}">{{benefit.html}}</a></th>
      {% endfor %}
    </tr>
  </thead>
  <tbody>
    <tr>
      {% for benefit in site.data.benefits.general %}
        <td>{{benefit.desc}}</td>
      {% endfor %}
    </tr>
  </tbody>
  <thead>
    <tr>
      {% for benefit in site.data.benefits.specific %}
        <th><a href="{{benefit.link}}">{{benefit.html}}</a></th>
      {% endfor %}
    </tr>
  </thead>
  <tbody>
    <tr>
      {% for benefit in site.data.benefits.specific %}
        <td>{{benefit.desc}}</td>
      {% endfor %}
    </tr>
  </tbody>
</table>

<!-- Place this tag in your head or just before your close body tag. -->
<script async defer src="{% link assets/gh-buttons.js %}"></script>