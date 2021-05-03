// inheritanceJS.js

class Vehicle {
	constructor(name, wheel) {
		this.name = name
		this.wheel = wheel
	}
}

const myVehicle = new Vehicle('운송수단', 2)
console.log(myVehicle)

class Bicycle extends Vehicle {
	constructor(name, wheel) {
		super(name, wheel)
	}
}
const myBicycle = new Bicycle('자전거', 2)
const sunBicycle = new Bicycle('세발', 3)
console.log(myBicycle)
console.log(sunBicycle)


class Car extends Vehicle {
	constructor(name, wheel, license) {
		super(name, wheel)
		this.license = license
	}
}

const myCar = new Car('세단', 4, true)
const daughterCar = new Car('기아', 4, false)
console.log(myCar)
console.log(daughterCar)



