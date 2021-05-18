// objectJS.js

//import _ from './lodash.js'
//import * as _ from "lodash";

/*
// 데이터 - Object

const userAge = {
	// key : value
	name: 'Yuna',
	age: 26
}
const userEmail = {
	name: 'Yuna',
	email: 'kingsmile@gmail.com'
}

//const target = Object.assign(userAge, userEmail)
//const target = Object.assign({}, userAge)
const target = Object.assign({}, userAge, userEmail)
console.log(target)
console.log(userAge)
console.log(target === userAge)

const a = { k: 123 }
const b = { k: 123 }
console.log(a === b)

//*/

/*
// 데이터 - Object
const user = {
	name: 'Yuna',
	age: 26,
	email: 'kingsmile@gmail.com'
}

const keys = Object.keys(user)
console.log(keys)  // ["name", "age", "email"]
console.log(user['email'])

const values = keys.map( key => user[key] )
console.log(values)
//*/

/*
// 구조분해할당
const user = {
	name: 'Yuna',
	age: 26,
	email: 'kingsmile@gmail.com'
}
const { name, age, email, address } = user

//console.log(`사용자의 이름은 ${user['name']} 입니다`)
console.log(`사용자의 이름은 ${name} 입니다`)
console.log(`사용자의 나이는 ${age} 입니다`)
console.log(`사용자의 이메일은 ${email} 입니다`)
console.log(address)

const fruits = ['Apple', 'Banana', 'Cherry']
const [ a, b, c, d ] = fruits
console.log(a, b, c, d)
//*/

/*
// 구조분해할당
const user = {
	name: 'Yuna',
	age: 26,
	email: 'kingsmile@gmail.com',
	address: 'Busan'
}
const { name='doyeon', age, address = 'Korea' } = user

//console.log(`사용자의 이름은 ${user['name']} 입니다`)
console.log(`사용자의 이름은 ${name} 입니다`)
console.log(`사용자의 나이는 ${age} 입니다`)
console.log(`사용자의 이메일은 ${user.email} 입니다`)
console.log(address)

const fruits = ['Apple', 'Banana', 'Cherry']
//const [ a, b, c, d = 'Orange' ] = fruits
const [ , b ] = fruits
//console.log(a, b)
console.log(b)

const [ , ,c ] = fruits
console.log(c)
//*/

/*
// 전개 연산자
const fruits = ['Apple', 'Banana', 'Cherry']
console.log(fruits)
console.log(...fruits)

function toObject(a, b, c) {
	return {
		a: a,
		b: b,
		c: c
	}
}

console.log(toObject(...fruits))
//*/

/*
// 전개 연산자
const fruits = ['Apple', 'Banana', 'Cherry', 'Orange']
console.log(fruits)
console.log(...fruits)

//function toObject(a, b, ...c) {  // rest parameter
//	return {
//		a: a,
//		b: b,
//		c: c
//	}
//}

const toObject = (a, b, ...c) =>  ({	a: a,	b: b,	c: c })
console.log(toObject(...fruits))
//*/

/*
// 얕은/깊은 복사
// 데이터 불변성
// 원시 데이터 : String, Number, Boolean, undefined, null,...
// 참조형 데이터 : Object, Array, Function
let a = 1
let b = 4
console.log(a, b , a === b)
b = a
console.log(a, b , a === b)
a = 5
console.log(a, b , a === b)
let c = 1
console.log(b, c , c === b)

//*/

/*
// 얕은/깊은 복사
// 데이터 불변성
// 원시 데이터 : String, Number, Boolean, undefined, null,...
// 참조형 데이터 : Object, Array, Function
let a = { k: 1 }
let b = { k: 1 }
console.log(a, b , a === b)
a.k = 7
b = a
console.log(a, b , a === b)
a.k = 2
console.log(a, b , a === b)
let c = b
console.log(b, c , c === b)

//*/

/*
// 얕은/깊은 복사
// 데이터 불변성
// 원시 데이터 : String, Number, Boolean, undefined, null,...
// 참조형 데이터 : Object, Array, Function
const user = {
	name: 'Yuna',
	age: 26,
	emails: ['kingsmile@gmail.com']
}
const copyUser = user
console.log( copyUser === user )

user.age = 88
console.log('user', user)
console.log('copyUser', copyUser)
//*/

/*
// 얕은/깊은 복사
// 데이터 불변성
// 원시 데이터 : String, Number, Boolean, undefined, null,...
// 참조형 데이터 : Object, Array, Function
const user = {
	name: 'Yuna',
	age: 26,
	emails: ['kingsmile@gmail.com']
}
//const copyUser = user
const copyUser = Object.assign({}, user)
console.log( copyUser === user )

user.age = 88
console.log('user', user)
console.log('copyUser', copyUser)
//*/

/*
// 얕은/깊은 복사
// 데이터 불변성
// 원시 데이터 : String, Number, Boolean, undefined, null,...
// 참조형 데이터 : Object, Array, Function
const user = {
	name: 'Yuna',
	age: 26,
	emails: ['kingsmile@gmail.com']
}
const copyUser = {...user}
console.log( copyUser === user )

user.age = 77
console.log('user', user)
console.log('copyUser', copyUser)

user.emails.push('happydoyeon88@gmail.com')
console.log(user.emails === copyUser.emails)
console.log('user', user)
console.log('copyUser', copyUser)
//*/

//*
// 얕은/깊은 복사
// 데이터 불변성
// 원시 데이터 : String, Number, Boolean, undefined, null,...
// 참조형 데이터 : Object, Array, Function



const user = {
	name: 'Yuna',
	age: 26,
	emails: ['kingsmile@gmail.com']
}
const copyUser = _.cloneDeep(user);
console.log( copyUser === user )

user.age = 77
console.log('user', user)
console.log('copyUser', copyUser)

user.emails.push('happydoyeon88@gmail.com')
console.log(user.emails === copyUser.emails)
console.log('user', user)
console.log('copyUser', copyUser)
//*/






