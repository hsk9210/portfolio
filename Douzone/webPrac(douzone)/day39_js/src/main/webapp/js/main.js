// main.js

/*
// .find()   .findIndex()
const numbers = [1, 2, 3, 4, 5]
const fruits = ['Apple', 'Banana', 'Cherry']

const result = fruits.find( fruit => /^A/.test(fruit) )
console.log(result)

const result2 = fruits.findIndex( fruit => /^C/.test(fruit) )
console.log(result2)
//*/


/*
// .find()   .findIndex()
const numbers = [1, 2, 3, 4, 5]
const fruits = ['Apple', 'Banana', 'Cherry']

const result = fruits.find( fruit => {
	return /^C/.test(fruit)
} )

console.log(result)

const result2 = fruits.findIndex( fruit => {
	return /^B/.test(fruit)
} )

console.log(result2)
//*/

/*
// .includes()
const numbers = [1, 2, 3, 4, 5]
const fruits = ['Apple', 'Banana', 'Cherry']

const result = numbers.includes(3)
console.log(result)

const result2 = fruits.includes('doyeon')
console.log(result2)
//*/

/*/
// .push()   .unshift()  
// 원본 수정됨에 주의한다. 
const numbers = [1, 2, 3, 4, 5]
const fruits = ['Apple', 'Banana', 'Cherry']

numbers.push(7)
console.log(numbers)

numbers.unshift(0)
console.log(numbers)

//*/

//*/
// .reverse()   .splice()
// 원본 수정됨에 주의한다. 
const numbers = [1, 2, 3, 4, 5]
const fruits = ['Apple', 'Banana', 'Cherry']

numbers.reverse()
fruits.reverse()

console.log(numbers)
console.log(fruits)

//numbers.splice(2, 1)  // index 위치 데이터 요소를 갯수만큼 제거
//numbers.splice(2, 2)
//numbers.splice(2, 0)
//numbers.splice(2, 0, 999)
numbers.splice(2, 1, 88)
console.log(numbers)

fruits.splice(2, 0, 'Orange')
console.log(fruits)


//*/





