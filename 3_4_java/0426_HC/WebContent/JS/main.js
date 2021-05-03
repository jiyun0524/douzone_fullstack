// Number(숫자데이터) : 정수, 부동소수점 숫자
let num = 123;
let opacity = 1.57;

console.log(num);
console.log(opacity);

// String(문자 데이터) : ''. ""
let name = "jiyoon";
let email = "jiyoon9705@naver.com";
let hello = `Hello $(name) ??!!`;

str = 'Hello' + name + "!!@@!!@@"

console.log(name);
console.log(email);
console.log(hello);
console.log(str);

// Boolean(불린 데이터) : true, false 논리데이터
let checked = true;
let isShow = false;

console.log(checked);
console.log(isShow);

// Undefined : 값이 할당되지 않은 상태를 나타냄
let undef;
let obj = {kbs : 7};

console.log(undef); // undefined
console.log(obj.kbs);
console.log(obj.xyz); // undefined

// Null : 어떤 값이 의도적으로 비어있음을 의미
let empty = null;

console.log(empty); // null

// Object(객체데이터) : 여러 데이터를 key:value 형태로 저장
let user = {
		// key : value,
		name : 'Park',
		age : 85,
		isValid : true
};

console.log(user.name);
console.log(user.age);
console.log(user.isValid);
console.log("\n\n");

// Array(배열데이터) : 여러 데이터를 순차적으로 저장 ->  [ ]
let fruits = ["Apple", "Banana", "Cherry"];

console.log(fruits[name]);
console.log(fruits[user.name]);
console.log(fruits[user.age]);
console.log(fruits[user.isValid]);

console.log(fruits[0]);
console.log(fruits[1]);
console.log(fruits[2]);
console.log("\n");

// 예약어 : 특별한 의미를 가지고 있어, 
//          변수나 함수명 등등으로 사용할 수 없는 단어

/*
let this = "hello";
let if = 100;
let break = true;
 */

// 함수 : 특정 동작(기능)을 수행하는 일부 코드의 집합(부분), function
function returnFunction() {
	// return "hello th1 class"
}

let msg = returnFunction();

console.log(msg);
console.log("\n");

function helloFunction() {
	// 실행 코드
	console.log("helloFunction() 호출 " + 1004);
}

helloFunction();

function plus(x,y) {
// x, y는 매개변수(parameter)
	return x+y;
}

let a = plus(2,3);
let b = plus(10,20);
let c = plus(3,5);

console.log(a)
console.log(b)
console.log(c)

// 익명함수
let world = function() {
	console.log("익명함수 : hello javascript !");
}

// 기명함수
function hello2() {
	console.log("기명함수 : hello javascript !");
}

hello2();
world();

// 객체 데이터
const info = {
	name : 'yoon',
	age : 25,
	// 메소드
	getName: function() {
		return this.name;
	}
}

const infoName = info.getName();
console.log(infoName);

console.log(info.getName());


/*let fruits = ['Apple', 'Banana', 'Cherry'];

console.log(fruits[0]);
console.log(fruits[1]);
console.log(fruits[2]);

console.log(new Date('2021-04-26').getDay()); // 1, 월요일
console.log(new Date('2021-04-25').getDay()); // 0, 일요일
console.log(new Date('2021-04-24').getDay()); // 6, 토요일
*/

/*let x=3;
var y=30;
t=900;
z=888;

if(x==3) console.log(x);

console.log(x);
console.log(y);
console.log(t);*/