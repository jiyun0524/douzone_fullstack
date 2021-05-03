// main.js

const str = `
010-9999-3333
jiyun9705@naver.com
https://namu.wiki/w/%EA%B0%90%EC%9E%90
the Wiki 1234 dog.
abbcccdddd
ttps 123
dd
대한민국 백두산이 마르고 닳도록잉ㅇ~!!
`
console.log(str.match(/dog/gi))	
console.log(str.match(/\./gi))
console.log(str.match(/\.$/gim))
console.log(str.match(/d$/gim))
console.log(str.match(/[^t]/gim))
console.log(str.match(/dog|paran/))
console.log(str.match(/dog|paran/g))
console.log(str.match(/https/g))
console.log(str.match(/h?ttps/g))
console.log(str.match(/d{3}/g))
console.log(str.match(/d{2,3}/g))
console.log(str.match(/[0-9]/g))
console.log(str.match(/[0-9]{1,}/g))
console.log(str.match(/[가-핳]{1,}/g))	
		

//const regexp = new RegExp('wiki', 'gi')
//const regexp = /dog/gi
//console.log(regexp.test(str))
//console.log(str.match(regexp))
//console.log(str.replace(regexp, 'KKK'))
//console.log(str)









