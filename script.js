let currentValue = '';
let currentOperator = '';
let result = '';

function appendValue(value) {
  currentValue += value;
  document.getElementById('display').value = currentValue;
}

function clearDisplay() {
  currentValue = '';
  currentOperator = '';
  document.getElementById('display').value = '';
}

function calculate() {
  if (currentValue === '') return;

  try {
    result = eval(currentValue);
    document.getElementById('display').value = result;
    currentValue = result;
  } catch (error) {
    document.getElementById('display').value = 'Error';
  }
}
