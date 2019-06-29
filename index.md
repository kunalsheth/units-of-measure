---
layout: home
---
# Type-safe dimensional analysis and unit conversion

<br>
![units-of-measure]({% link assets/example1.png %})

<link rel="stylesheet" href="{% link assets/button.css %}">
<center><h2>
<a href="{% link setup/installation.md %}" class="cta-btn" role="button">Try with Gradle!</a>
</h2></center>

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
<script async defer src="https://buttons.github.io/buttons.js"></script>