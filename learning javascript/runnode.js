const testFunction = function(arg){
    console.log("Arg is : ", arg);
}
testFunction(20);

const add = function(x,y){
    return x + y;
}
const add2  =(x,y) => {
    return x+y;
}
const add3 = (x,y) =>(x+y);
const add4 = (x,y) =>{x+y}; //최신버전에서는 error 대신 undefined로 퉁치는듯.
console.log(add3(3,2));

const adder = function(x){
    return function(y){
        return x+y;
    }
}
const adder2 = (x) =>{
    return (y) =>{
        return x+y;
    }
}
//return 생략시에는 중괄호를 사용하지 않는다!!!(오히려 중괄호를 사용하니 undefined.)
//추가적으로, 파라미터가 단 한개라면, 소괄호를 생략도 가능.
const adder3 = x =>{
    return y  => x+y; 
}
console.log(adder3(3)(4));
const adder4 = x =>y => x+y;
console.log(adder4(3)(5));

let counter1 = {
    value:0,
    increase: function(){
        this.value++ //메소드 호출을 할 경우, this는 counter1을 가리킨다.
    },
    decrease: function(){
        this.value-- //메소드 호출을 할 경우, this는 counter1을 가리킨다.
    },
    getValue: function(){
        return this.value //메소드 호출을 할 경우, this는 counter1을 가리킨다.
    },
}
counter1.increase(); //function이니까 () 써줘야됨 없다해도.
console.log(counter1[`value`]);

function foo(){
    return 'bar';
}
foo();