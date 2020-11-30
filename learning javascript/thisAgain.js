import "./styles.css";

//what if...
//let user1 = {name:'john', sayHi1(){alert(this.name);console.log(this);}};

//user1.sayHi1();

//this 값은 런타임에 의해 결정된다. 컨텍스트에 따라 달라진다.
// 동일한 함수라도, 다른 객체에서 호출했다면 'this'가 참조하는 값이 달라진다.

let user = {name:'john'};
let admin = {name:'admin'};
function sayHi1(string1){
  alert('hello, '+this.name +'   '+string1);
}
//별개의 객체에서 동일한 함수를 사용하면?
user.f = sayHi1;
admin.f = sayHi1;

//this =  '???'.method , so ???===this
//user.f(); //john
//admin.f(); //admin
//console.log(user.f('a'));   
admin['f']('edward?');
 
/*
let user = {
  name:"john",
  age:30,
  sayHi(){
    //this ...is now Object 'user'
    alert('hello, '+this.name); //cannot read property 'name' of null.
  }
}
let admin1 = Object.assign({},user);//JSON.parse(JSON.stringify(user));
user = null; //user <- null;
admin1.sayHi();
*/

document.getElementById("app").innerHTML = `
<h1>Hello Vanilla!</h1>
<div>
  We use the same configuration as Parcel to bundle this sandbox, you can find more
  info about Parcel 
  <a href="https://parceljs.org" target="_blank" rel="noopener noreferrer">here</a>.
</div>
`;
