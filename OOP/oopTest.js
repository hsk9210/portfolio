
/////////절차지향.
let baseSalary = 30000;
let overtime = 10;
let rate = 20;

function getWage(baseSalary, overtime, rate) {
  return baseSalary + (overtime * rate);
}
//////////////////////


///////////////////객체지향. 구식.
function Car(brand, name, color) {
  //인스턴스가 만들어질 때 실행되는 코드
  this.brand = brand;
  this.name = name;
  this.color = color;
}
Car.prototype.refuel = function () {
  //연료 공급
  console.log('refueled');
}
Car.prototype.drive = function () {
  //운전을 구현하는 코드
  console.log('drived');
}

let avante = new Car('hyundai', 'avante', 'black');
let mini = new Car('bmw', 'mini', 'white');
avante.refuel();
console.log(avante.brand);

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

