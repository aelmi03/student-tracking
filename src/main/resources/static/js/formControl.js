const inputForGPA = document.querySelector("#GPA");
const inputForHeight = document.querySelector("#height");
const inputForWeight = document.querySelector("#weight");

const validateGPAInput = (e) => {
  console.log("hello");
  let val = e.target.value;
  console.log("string number value", val);
  if (val.length > 4) {
    val = val.slice(0, -1);
    e.target.value = val;
  }
  let numberValue = parseFloat(e.target.value);
  console.log("number-value", numberValue);
  if (numberValue > 4.3) {
    numberValue = 4.3;
    e.target.value = numberValue;
  }
};

const validateLength = (e) => {
  if (e.target.value.length > 10) {
    e.target.value = e.target.value.slice(0, -1);
  }
};
inputForHeight.addEventListener("input", validateLength);
inputForWeight.addEventListener("input", validateLength);
inputForGPA.addEventListener("input", validateGPAInput);
