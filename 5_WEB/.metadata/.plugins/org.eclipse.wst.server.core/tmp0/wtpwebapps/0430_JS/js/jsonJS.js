// jsonJS.js
// JSON (JavaScript Object Notation)
// 자바스크립트의 객체 표기법

const user = {
	name: 'Kwon',
	age: 75,
	emailes: [
		'jiyun9705@gmail.com',
		'jiyun9705@naver.com'
	]
}

localStorage.setItem('user', JSON.stringify(user));
const str = localStorage.getItem('user')
const obj = JSON.parse(str)
obj.age = 26
console.log(obj)

/*
//localStorage.setItem('user', user)

// 스토리지에 저장 => set
localStorage.setItem('user', JSON.stringify(user))

// console에 띄우기 => get
console.log(JSON.parse(localStorage.getItem('user')))

// 삭제하기
localStorage.removeItem('user')
//localStorage.clear()
*/
/*
console.log('user', user)

const str = JSON.stringify(user)
console.log(str)
console.log(typeof str)

const obj = JSON.parse(str)
console.log('obj', obj)
*/
