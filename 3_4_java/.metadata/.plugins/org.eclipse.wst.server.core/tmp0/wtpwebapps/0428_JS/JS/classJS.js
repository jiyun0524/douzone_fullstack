// class.js

/*
//function Person(first, last) {
//	this.first = first;
//	this.last = last;	
//}

class Person {
	constructor(first, last) {  // 생성자함수
		this.first = first;
		this.last = last;
	}
	getFullName() {
	return `${this.first} ${this.last}`
	}	
}

//Person.prototype.getFullName = function() {
//	return `${this.first} ${this.last}`
//}

const park = new Person('Amy', 'Park')  // 생성자함수
const neo = new Person('Neo', 'Smith') 
const yuna = new Person('Yuna', 'Kim') 
console.log(park.getFullName())
console.log(neo.getFullName())
console.log(yuna.getFullName())
console.log(yuna);
*/


//----------------------------------------------//

//클래스
/*
const yoon = {
	firstName:'kwon',
	lastName:'yoon',
	getFullName: function () {
		return `${this.lastName} ${this.firstName}`
	}
}
console.log(yoon.getFullName())
*/

//----------------------------------------------//


const amy = {
	firstName: 'Amy',
	lastName: 'joey',
	getFullName: function() {
		return `${this.lastName} ${this.firstName}`
	}
}
console.log(amy)


//----------------------------------------------//


new Swiper('.box .red', {
	name:'aa',
	age:33,
	address:'seoul'
})
