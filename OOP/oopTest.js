
/////////절차지향.
let baseSalary = 30000;
let overtime = 10;
let rate = 20;

function getWage(baseSalary, overtime, rate) {
  return baseSalary + (overtime * rate);
}
//////////////////////


///////////////////객체지향.
let employee = {
  baseSalary: 30000,
  overtime: 10,
  rate: 20,
  getWage: function () {
    return this.baseSalary + (this.overtime * this.rate);
  }
};
console.log(employee.getWage());
//////////////////

var obj1 = { x: 10 };
var obj2 = Object.create(obj1);

var obj3 = Object.create(obj2);

obj2.x = 20;

var result = obj3.x + 10;
console.log(obj3.x);


function outerFn() {
  let outerVar = 'outer';
  console.log(outerVar);
  function innerFn() {
    let innerVar = 'inner';
    console.log(innerVar);
  }
  return innerFn;
}

outerFn();