// main.js

// 콜백(Callback) 함수
// setTimeout(함수, 시간)

function timeout(x) {
	setTimeout(() => {
		console.log("kwon~~")
		x()
	}, 300)
}

timeout(() => {
	console.log("Done~")
})


//----------------------------------------------//

// 타이머함수
/*
setTimeout(() => {}, milliseconds);
		  (함수, 시간) : 일정 시간 후 함수 실행 !
setInterval(() => {}, milliseconds);
		  (함수, 시간) : 시간 간격마다 함수 실행 !
clearTimeout() : 설정된 Timeout 함수를 종료
clearInterval() : 설정된 Interval 함수를 종료
*/
/*
setTimeout(function() {
	console.log("yeah~~^^")
}, 300)

const timer = setTimeout(() => {
	console.log("KOREA")
}, 5000);

const h1El = document.querySelector('h1')
h1El.addEventListener('click', ()=> {
	clearTimeout()
})
*/

//----------------------------------------------//

// 호이스팅(Hoisting) : 함수 선언부가 
//           유효범위 최상단으로 끌어올려지는 현상
/*
const a=7
double()

function double() {
	console.log(a * 2)
}

//const double = function() {
//	console.log(a * 2)
//}
*/

//----------------------------------------------//

// 즉시실행함수
/*
const a = 7
function double() {
	console.log(a*2)
}
double();

// ( f() {} ) ();
(
	function () {
		console.log(a * 2)
	}
)();

// ( f() {} () );
( 
	function () {
		console.log(a*3)
	}()
);
*/

//----------------------------------------------//

// 화살표 함수
// () => {} vs function() {}
/*
const double = function (x) {
	return x*2
}
console.log('double : ', double(7))

const doubleArrow = (x) => {
	return x*2
}
console.log('doubleArrow : ', doubleArrow(5))

// 이렇게 축약해서 적으면 편함 ! 연습하기
const doubleArrow2 = (x) => x*2
console.log('doubleArrow2 : ', doubleArrow2(3))

const doubleArrow3 = x => {
	return x*3
}
console.log('doubleArrow3 : ', doubleArrow3(5))

const doubleArrow4 = x => 300
console.log('doubleArrow4 : ' , doubleArrow4(5))

const doubleArrow5 = x => [1, 2, 3]
console.log('doubleArrow5 : ' , doubleArrow5(5))

const doubleArrow6 = x => ({ name: 'yoon'})
console.log('doubleArrow6 : ' , doubleArrow6(5))

// 2개짜리
const duoArrow = (x,y) => x*y
console.log('duoArrow : ', duoArrow(2,5))
*/

//----------------------------------------------//

/*
// 함수 정리
function sum() {
	console.log(arguments)
	return arguments
}
console.log(sum(7,5))

function sum(x,y) {
	if(x>y) {
		return "x>y!"
	}
	else
		console.log(x+y)
}
sum(2,5)

function sum(x,y) {
//	console.log(x+y)
	return x+y
}

const a = sum(1,3)
const b = sum(12,30)

console.log(a)
console.log(b)
*/

//----------------------------------------------//


// 형변환
// false, '', null, undefined,
// 0, -0, NaN을 제외한 모든것은 '참'이다
/*
const a = 1
const b ="1"
	
console.log(a===b)
*/

//----------------------------------------------//

// 변수 유효범위 ,  var/let/const  - 블럭레벨
/*
function scope() {
	// console.log(a)
	if (true) {
		var a = 123
	} // if end
	console.log(a)
} // func end

scope()
*/