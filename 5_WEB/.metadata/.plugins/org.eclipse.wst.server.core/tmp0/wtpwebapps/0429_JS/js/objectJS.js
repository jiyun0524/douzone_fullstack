// objectJS.js

// 데이터 - Object
/*
console.log('123')

const userAge  = {
	// key : value
	name : 'yoon',
	age : 26
}

const userEmail = {
	name : 'yoon',
	email: 'jiyun9705@naver.com'
}

const target = Object.assign(userAge, userEmail)
console.log(target)
console.log(userEmail)
console.log(target === userAge)

const a = { k: 123 }
const b = { k: 123 }
console.log(a === b)

const user = {
	name: 'Yoon',
	age:25,
	email: 'jiyun9705@naver.com'
}

// 요소에 해당되는 값만 갖고오기
const keys = Object.keys(user)
console.log(keys)
console.log(user['email'])

const values = keys.map(key => user[key])
console.log(values)
*/

//----------------------------------------------//

// 구조분해할당
// 키 값을 따로 뽑아서 배열같은거 안에 넣어 놓는 것
/*
const user = {
	name: 'Yoon',
	age:25,
	email: 'jiyun9705@naver.com'
}

// address라는 없는 애가 요청됐을 때 어떻게 나올지 보자
const {name, age, email, address} = user
console.log(`사용자의 이름은 ${name} 입니다`)
console.log(`사용자의 나이는 ${age} 입니다`)
console.log(`사용자의 메일은 ${email} 입니다`)
console.log(`사용자의 주소는 ${address} 입니다`)

// 이렇게 쓸 수도 있어욤 !!
console.log(`사용자의 이름은 ${user.name} 입니다`)
console.log(`사용자의 나이는 ${user.age} 입니다`)
console.log(`사용자의 메일은 ${user.email} 입니다`)
console.log(`사용자의 주소는 ${user.address} 입니다`)

const fruits = ['Apple', 'Banana', 'Cherry']
const [a,b,c,d] = fruits
console.log(a,b,c,d)

// => undefined 라고 나온다

const [,x] = fruits
console.log(x)
*/

//----------------------------------------------//

// 전개 연산자
/*
const fruits = ['Apple', 'Banana', 'Cherry', 'Orange']
console.log(fruits)
console.log(...fruits)

// rest parameter
function toObject(a,b,...c) {
	return {
		a:a,
		b:b,
		c:c
	}
}

// 같은 내용을 화살표로 고치기
//const toObject = (a, b, ...c) =>  ({	a: a,	b: b,	c: c })
//console.log(toObject(...fruits))
*/

//----------------------------------------------//

// 얕은/깊은 복사
// 데이터 불변성
// 원시 데이터 : String, Number, Boolean, undefined, null,...
// 참조형 데이터 : Object, Array, Function
/*
let a = {k:1}
let b = {k:1}
console.log(a, b, a === b)
a.k=7
b=a

console.log(a, b, a === b)
a.k=2
*/
/*
const user = {
	name: 'Yoon',
	age:25,
	email: 'jiyun9705@naver.com',
}

const copyUser = user
console.log(copyUser === user)

user.age = 88
console.log('user', user)
console.log('copyUser', copyUser)

// => 25세라고 했는데도 대입했으므로 88이 나옴

const copyUser2 = Object.assign({}, user)
console.log(copyUser2 === user)

user.age = 88
console.log('user', user)
console.log('copyUser2', copyUser2)

// => 같은 결과의 다른방법
*/

/*
const user = {
	name: 'KWON',
	age: 26,
	emails: ['jiyun9705@naver.com']
}

const copyUser = {...user}
console.log( copyUser === user )

user.age = 77
console.log('user', user)
console.log('copyUser', copyUser)

user.emails.push('jiyun9705@naver.com')
console.log(user.emails === copyUser.emails)
console.log('user', user)
console.log('copyUser', copyUser)
*/

//import _ from 'lodash.js'
//import * as _ from "lodash";
/*
const user = {
	name: 'KWON',
	age: 26,
	emails: ['jiyun9705@naver.com']
}

const copyUser = _.cloneDeep(user);
console.log(copyUser === user)

user.age = 100
console.log('user', user)
console.log('copyUser', copyUser)

user.emails.push('jiyun9705@naver.com')
console.log(user.emails === copyUser.emails)
console.log('user', user)  
console.log('copyUser', copyUser)
*/

// 얕은/깊은 복사
// 데이터 불변성
// 원시 데이터 : String, Number, Boolean, undefined, null,...
// 참조형 데이터 : Object, Array, Function
/*
let a = 1
let b = 4
console.log(a, b , a === b)
b = a
console.log(a, b , a === b)
a = 5
console.log(a, b , a === b)
let c = 1
console.log(b, c , c === b)
*/

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
