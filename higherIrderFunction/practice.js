/**
 * 자바스크립트에 퍼스트 클래스가 있다는 사실?
 * 속칭 일급 객체(first-class citizen)처럼 표현되는 함수같은 것.
 * 여기서는 function을 변수에 할당도 가능하고 매개인자로 전달될 수도 있고
 * 다른 함수의 결과로서 리턴될 수도 있다.
 * 이런건 함수를 데이터 입력 가공 출력하듯이 다룰 수 있다는 뜻.
 * 변수에 저장할 수 있으니 배열의 요소, 객체의 속성값이 되는 것도 가능.
 * 
 */

 //1. 변수에 함수 할당
//아니 호이스팅 개념도 헷갈려할 기초시점에서 호이스팅이 적용되지 않는다고 하면 이미 진도가 뒤죽박죽 아니냐 코드스테이츠..?
//일단 함수 표현식이 할당 전 사용불가인건 여기도 마찬가지이긴 하다.

const square  =function(num){
    return num*num;
};
//이런 모양이면 사실상 square === square(num) 이다.
// 즉, const function square(num) 에 가깝다는 점!(물론 이런 자바식 문법은 js 에서 안먹힌다.)
let output1 = square(7);
console.log(output1); //49
/////////////////////////////
function double2(num){
    return num*2;  
}
function doubleNum(func, num){
    let doubledArr = [];
    return func(num);
}
let output2 = doubleNum(double2, 4);
console.log(output2);
///////////////////////
function adder(added){
    return function(num){
        return num + added;
    };
}
//함수 adder는 다른 함수를 리턴하는 고차 함수
//adder는 인자 한 개를 입력받아서 익명함수 리턴.
//리턴되는 익명 함수는 인자 한 개를 받아서 added와 더한 값을 리턴한다.
let output3 = adder(5)(3);
debugger;
console.log(output3);
/////
function removeElement(arr, discarder) {
    // TODO: 
    return function(arr, discarder){
      arr.forEach(function(word) {
        if(arr === discarder){
          words.shift();
        }
      })
    }
  }

  let output = removeElement([1, 2, 3, 2, 1], 2);
  console.log(output);

/////////////
let s = 'hello';
s.toUpperCase();
console.log(s);
console.log(s.toUpperCase());
//이것은 js가 일시적인 String객체를 만든 것.
//이 임시 객체에 toUpperCase함수가 들어있다.
s.rating = 3;
console.log(s.rating);

//자칭... 극히 간단한 이메일 정규표현식
const email = /\b[a-z0-9._-]+@[a-z_-]+(?:\.[a-z]+)+\b/;
/**
 * 문자열을 숫자로 바꿔야 할 경우가 있습니다.
 * html 환경상 받은 입력은 보통 문자열이고,
 * js에서는 문자열을 숫자로 바꾸는 방법이 몇 가지 있습니다.
 * 첫번째, Number 객체 생성자 사용. 
 */
let numStr = "33.3";
let num = Number(numStr); //이 행은 숫자 값 을 만드는 것이다.
//Number 객체의 인스턴스가 아님!
console.log(numStr);
console.log(num);
//숫자로 바꿀 수 없는 문자열에서는 NaN이 반환된다.


/**
 * 두번째 방법.
 * 내장 함수인 parseInt나 parseFloat 함수를 사용하는 방법.
 * 이들은 Number 생성자와 비슷하게 동작하지만 몇가지 다른점이 보이는게,
 * parseInt를 사용할 때는 기수(radix도 넘길 수 있다?)
 */

 //주의 : 여기부터는 원격 데스크톱으로 윈도우즈 -> 맥미니로 연결해서 코딩중.

let a = parseInt('16 volts', 10);
let b = Number("3a");
let c  =parseFloat("15.5inch");
console.log(a);
console.log(b);
console.log(c);
//Date 객체를 숫자로 바꿀 때는 valueOf() 메소드 사용
//이거는 일반적으로 UTC 1970년 1월 1일 자정으로부터 몇 밀리초가 지났는지 나타내는 숫자.
let d = new Date(); //현재 날짜
let ts = d.valueOf();
console.log(d);
console.log(ts);
//boolean 1(true) or 0(false)로 바꿀 때는 조건연산자를 사용.
let e = true;
let n = e? 1 : 0;
console.log(n);
//문자열로 변환
/**
 * js의 모든 객체에는 문자열 표현을 반환하는 toString() 메소드가 있기는 있다.
 * 하지만 그렇게 사용할 일이 생각보다 많지는 않다는게 함정.
 * 일반적으로 데이터를 병합할때 숫자열도 문자열로 변환되는, 문자열 우선순위를 가지니까.
 * Date 객체의 toString()메소드는 길어도 데이터는 재대로 나온다.
 * Array의 toString() 메소드도 마찬가지고.
 * Array.prototype.toString()은
 * 각 요소를 문자열로 바꾼 다음 쉼표로 연결한 문자열을 반환한다.
 * 
 */
let f = a.toString();
console.log(f);
console.log(typeof(f));
let arr = [1,true, 'hello'];
let g = arr.toString();
console.log(g);
let o = {
  a:1
};
let p = o;
o.a = 2;
console.log(p);
o = { //객체를 가리키는 변수는 그 객체를 가리키고 있을 뿐, 객체 자체는 아니다.
  a:1 //이래도 p가 덩달아서 수정되지는 않음!
};
console.log(p); //보다시피 그대로 a:2
console.log(o); //여기는 직접 할당이니 a:1

// 변수와 객체는 일치하는것이 아님에 유의.(말 그대로 가리키는 것이다.)
let q = {a:1};
console.log(q === {a:1}); //분명 같은 객체처럼 보이나, false다.
//참조를 전달하니 함수 내부에서 객체를 변경하면, 함수 외부에서도 바뀐다.

function change_o(o){
  o.a = 999;

}
change_o(o);
console.log(o);