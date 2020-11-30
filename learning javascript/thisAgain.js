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


//답은 역시... arrow function 인가.
//다시금 재재복습을 해보니 필요성이 드디어 체감이 된다.
//고유의 this가 없는 arrow function이니.
/**
 * 일반적인 언어의 개념으로 생각해버리면
 * this는 항상 메서드가 정의된 객체를 참조하는 것으로 생각을 하는게 기본 관념이니.
 * bound this.
 * 
 * 하지만 자바스크립트에서 this는 런타임에 결정되니
 * 참조연산자 점 . 앞의 객체가 무엇인지에 따라 결정 우선순위가 정해짐.
 */

 //그러니 일반적인 외부 함수에서 this값을 가져오는 화살표 함수를 쓰자.
 let user2 = {
  firstName: "violet",
  sayHi() {
    let arrow = () => {return alert('hello, '+ this.firstName)};
    arrow();
  },
  whatIsThis(){ //객체 프로퍼티에 저장된 함수는 메서드니까.
    console.log(this);
  }
 };
 if(user2.whatIsThis === user2){
  user2.sayHi();
 };
 
 //user2.whatIsThis(); //user2 /Object
 /**
  * 이로서 볼수 있는 점은,
  * 그 함수가 호출되기 전까진 this에 값이 할당되지 않았다.
  * 함수를 복사해서 객체 간 전달도 가능하고.
  * 함수를 객체 프로퍼티(값)으로 저장해서 obj.method() 방식으로
  * 호출하면 this는 object를 참조한다.
  * 
  * 결론: 내부에서 진행하려면 그냥 옛날식으로 this.
  * 하지만 외부에서 this값을 가져오려면 ES6 화살표함수.
  * 
  */
