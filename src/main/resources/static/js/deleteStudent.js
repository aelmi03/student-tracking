document.querySelectorAll("i").forEach((i) => {
  i.addEventListener("click", (e) => {
    document.location.href = `/delete/${e.target.getAttribute("data-id")}`;
  });
});
