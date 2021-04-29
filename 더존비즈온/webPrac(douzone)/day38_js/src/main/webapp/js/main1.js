console.log("출력되는지 테스트 in index.jsp");

let greeting = 'hello';
function greetSomeone() {
    let firstName = 'josh';
    return greeting+ ' '+ firstName;
}
console.log(greetSomeone());
console.log(123);

function myConcat(separator) {
    let args = Array.prototype.slice.call(arguments,1);
    return args.join(separator);
}
console.log(myConcat(", ", "red", "orange", "blue"));

const doubleArrow4 = (x) => {
    return {name:'doyeon'};
}

console.log(doubleArrow4());



