class Car {
    constructor(brand, name, color, currentFuel, maxSpeed) {
        //클래스 빵틀로 찍어낸, 인스턴스가 만들어질 때 실행되는 코드.
        //function Car(aaa,bbb,ccc){ 여기서 실행되는 것과 동일.}
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.currentFuel = currentFuel;
        this.maxSpeed = maxSpeed;
        this.userGears = ['P', 'N', 'R', 'D'];
        this.userGear = this.userGears[0];
    }
    refuel() {

    }
    setSpeed() {

    }
    drive() {

    }
    shift(gear) {
        if (this.userGears.indexOf(gear) < 0) {
            throw new Error(`Invalid gear: ${gear}`);
            this.userGear = gear;
        }
    }
}
let avanteType = new Car('hyundai', 'avante', 'black', '10', '30');
avanteType.brand;
avanteType.name;
Car.prototype.refuel = function () {
    console.log(this.name + ' ');
}
let car2 = new Car();
console.log(avanteType instanceof Car);
console.log(car2 instanceof Car);