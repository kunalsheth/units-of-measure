---
layout:    progression_page
title:     About
permalink: /about/

previous:
    text: "Back to Home"
    url:  /

next:
    text: "View on GitHub"
    url:  https://github.com/kunalsheth/units-of-measure
---
# About

I started {{site.lib}} in early 2017 for use on my high school's [_FIRST_](https://www.firstinspires.org/robotics/frc) Robotics Competition team, [_The Funky Monkeys_](https://lynbrookrobotics.com).

> With many programmers and a 17,000 line, student-managed code base, unit-related bugs are inevitable. One option may be to document the units of every single variable while enforcing even stricter code-review, but this is not always possible, especially in the heat of competition.  

{{site.lib}} prevents incorrect code from ever deploying to our robot in the first place. 

When developing control system software, real-time performance is a priority. This is why I've decided to use inline classes before they are fully matured.

{{site.lib}} was originally distributed as an annotation processor, but was later repackaged as a gradle plugin to support multiplatform builds.