const buttons = document.querySelectorAll(".edit-button");

buttons.forEach((button) => {
  button.addEventListener("click", (e) => {
    document.location.href = `/update/${e.target.getAttribute("data-id")}`;
  });
});
