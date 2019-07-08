const ul = document.getElementById("toc-headers");
const details = document.getElementById("toc-details");
const h4css = document.getElementById("toc-h4").style;

function detailsOnClick() {
    if (details.open) h4css.setProperty("display", "inline-block");
    else h4css.setProperty("display", "inline");
}

document.addEventListener("DOMContentLoaded", () => {
    Array.from(document.querySelectorAll("h1[id]"))
        .map((e) => {
            const li = document.createElement("li");
            const a = document.createElement("a");
            li.appendChild(a);
            a.href = '#' + e.id;
            a.textContent = e.textContent;

            return li;
        })
        .forEach(li => ul.appendChild(li));

    detailsOnClick();
});