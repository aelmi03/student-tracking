const inputForGPA = document.querySelector("#GPA");

const validateGPAInput = (e) => {
  console.log("hello");
  let val = e.target.value;
  console.log(val);
  if (val.length > 4) {
    val = val.slice(0, -1);
    e.target.value = val;
  }
  let numberValue = parseFloat(e.target.value);
  if (numberValue > 4.3) {
    numberValue = 4.3;
    e.target.value = numberValue;
  }
};

inputForGPA.addEventListener("input", validateGPAInput);
