---
layout: home
---
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