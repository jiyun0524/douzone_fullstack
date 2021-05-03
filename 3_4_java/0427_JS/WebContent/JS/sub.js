// sub.js
import getType from './basic.js'

console.log(typeof 'Hello JS')
console.log(typeof 123)
console.log(typeof 12.34)
console.log(typeof true)
console.log(typeof undefined)
console.log(typeof null)
console.log(typeof {})
console.log(typeof [])


console.log(getType(123))
console.log(getType(false))

console.log(getType(undefined))
console.log(getType( null))
console.log(getType( {}))
console.log(getType( []))