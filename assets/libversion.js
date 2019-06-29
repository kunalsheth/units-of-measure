const pattern = /version\s+"(\d*\.\d*\.\d*)"/g;

fetch('https://raw.githubusercontent.com/kunalsheth/units-of-measure/master/plugin/build.gradle')
    .then((response) => response.text())
    .then((text) => text.match(pattern)[0])
    .then((text) => text.replace(pattern, "$1"))
    .then((version) =>
        Array.from(document.querySelectorAll('.libversion')).forEach(e =>
            e.textContent = version
        )
    );