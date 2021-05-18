// main.js

// 콜백(Callback)함수 : 함수의 인수로 사용되는 함수
//setTimeout(함수, 시간)
function timeout(x){
	setTimeout(() => {
		console.log('Yuna!!!')
		x()
	}, 3000)
}

timeout(() => {
	console.log('Done~~~')
})


/*
function timeout(){
	setTimeout(() => {
		console.log('Yuna!!!')
	}, 3000)
}

timeout()  // 원하는 형태로 출력 안됨!! --> 해결
console.log('Done~~~')


// 타이머 함수
//setTimeout(함수, 시간) :  일정 시간 후 함수 실행
//setInterval(함수, 시간) :  시간 간격 마다 함수 실행
//clearTimeout() :  설정된 Timeout 함수를 종료
//clearInterval() :   설정된 Interval 함수를 종료

//setTimeout(function(){
//	console.log('Yuna!!!')
//} , 3000)

const timer = setTimeout(() => {
	console.log('Yuna!!!')
} , 3000)

const h1El = document.querySelector('h1')

h1El.addEventListener('click', () => {
	clearTimeout(timer)
})






// 호이스팅(Hoisting) : 함수 선언부가 유효범위 최상단으로 끌어올려지는 현상
const a = 7
double()

function double() {
	console.log(a * 2)
}

//const double = function() {
//	console.log(a * 2)
//}



// 즉시실행함수
const a = 7
function double() {
	console.log(a * 2)
}
double();

// function () {
//	 console.log(a * 2)
// }

(function () {
	console.log(a * 2)
})();       //  (f)();

(function () {
	console.log(a * 3)
}() );    // (f());





// 화살표 함수
// ( ) => { }  vs   function() { }
const double = function (x, y) {
	return x * y
}
console.log('double : ' , double(7, 3))

const doubleArrow = (x, y) =>  x * y
console.log('doubleArrow : ' , doubleArrow(7, 13))

const doubleArrow2 = x => 300
console.log('doubleArrow2 : ' , doubleArrow2(5))

const doubleArrow3 = x => [1, 2, 3]
console.log('doubleArrow3 : ' , doubleArrow3(5))

const doubleArrow4 = x => ( { name: 'DoYeon'} )
console.log('doubleArrow4 : ' , doubleArrow4(5))



const double = function (x) {
	return x * 2
}
console.log('double : ' , double(7))

const doubleArrow = (x) => {
	return x * 2
}
console.log('doubleArrow : ' , doubleArrow(5))

const doubleArrow2 = (x) => x * 2
console.log('doubleArrow : ' , doubleArrow2(3))

const doubleArrow3 = x =>  x * 3
console.log('doubleArrow3 : ' , doubleArrow3(5))


// 함수 정리
function sum() {
	console.log(arguments)
	return arguments[0]
}

console.log(sum(7, 3))


function sum(x, y) {
	if( x < 2 ) {
		return
	}
	return x + y
}

console.log(sum(1, 3))
console.log(sum(7, 3))


const sum = function (x, y) {
	
	return x + y
	//console.log(x)
}

const a = sum(3, 5)
console.log(a)



function sum(x, y) {
	//console.log(x + y)
	return x + y
}

const a = sum(1, 3)
const b = sum(15, 33)

console.log(sum(1, 3))
console.log(sum(15, 33))
console.log(sum(1, 3) + sum(12, 30))

// 형변환
// false, '', null, undefined, 0, -0, NaN 제외한 모든것은 '참'이다
const a = 1
const b = "1"

console.log(a === b)

if( 'false' ) {
	console.log(1004)
}


// 변수 유효범위 ,  var - 함수레벨      let/const  - 블럭레벨
function scope() {
	
	//console.log(a)
	
	if(true) {
		var a = 123
	} // if end
	console.log(a)
	
} // func end

scope()
*/