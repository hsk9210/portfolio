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

  function getIndex(arr, num) {
    // TODO: 여기에 코드를 작성합니다.
    //1. 꿀벌. 복사해서.
    let arr1 = Array.from(arr);
    //2. 넣을게
    arr1.push(num);
    //2.1 일단 답을 넣을 빈 배열이 이번에도 필요한가.
    let answer = [];
    //3. 정렬(?)
    //???
    //3.1 일단 반복문을 써본다.
    arr1.forEach(function(element){
      if(element > ){
  
      }
    }); //망.
    //3.2 가장 큰 수를 하나씩만 뽑아서 넣는 방식으로도 정렬은 된다?
    //Math.max.apply();
    //var test = [0, 77, 33, 11, 99, 88, 55];
    //Math.max.apply(null, test); //결과값은 99
    arr1.forEach(function(element){
      let a = Math.max.apply(null, arr); //이러면 그래도 하나씩만 들어가버린다...
      if(forEach문 돌리면서 비교할 수단?)
  
    })
  
    //4. num의 인덱스 리턴.
    const isTheNum = (element) => element === num; //num과 일치하는 요소를 배열에서 찾고,
    let a = arr1.findindex(isTheNum); //배열에서 일치하는 요소에 대한 인덱스를 반환해서,
    return arr1[a]; //그걸 반환한다.
    
  }
  /*
  arr1.forEach(function(element, index, array){
      console.log(`${array}의 ${index}번째 요소 : ${element}`);
  });
  */