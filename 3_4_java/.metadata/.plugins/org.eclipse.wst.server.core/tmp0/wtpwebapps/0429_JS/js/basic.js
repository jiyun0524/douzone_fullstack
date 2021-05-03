// basic.js

export  function getType(data) {
	return Object.prototype.toString.call(data).slice(8, -1)
}

export default  function random() {
	return  Math.floor(Math.random() * 10)
}