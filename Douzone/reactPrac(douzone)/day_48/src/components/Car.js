
function Car1(brand, name, color) {
    this.brand = brand;
    this.name = name;
    this.color= color;
    this.tank = 0;
    this.aaa = function(){
        return console.log("Car1.aaa start.");
    }
}
Car1.prototype.refuel = function (liter) {
    tank= liter;
    console.log('tank: '+tank);
}
Car1.prototype.drive = function () {
    console.log(this.name+ ' drive gogo');
}


class Car2{
    constructor(brand, name, color){
        //인스턴스가 만들어질 때 실행되는 코드
        this.brand=  brand;
        this.name= name;
        this.color=color;
        this.tank=0;
    }
    refuel(liter){
        tank=liter;
        console.log('tank: '+tank);
    }
    drive(){
        console.log(this.name+ ' drive gogo');
    }
}

let creator=  new Car1('a','b','c');
let parkinglot = new Array(creator,creator,creator);
parkinglot[2].drive();

let avante = new Car1('bmw', 'mini', 'white');
let sm3 = new Car2('leno','sm2','black');
avante.refuel(3);
sm3.refuel(4);
sm3.drive();
avante.drive();
avante.aaa();