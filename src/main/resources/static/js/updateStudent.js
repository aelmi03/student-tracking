const form = document.querySelector("form");
form.setAttribute("action", `/updated/${form.getAttribute("data-id")}`);
