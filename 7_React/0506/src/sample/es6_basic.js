//1. ---------- var, let ----------
function foo() {
  var a = 'hello';
  if (true) {
    var a = 'bye';
    console.log(a); // bye
  }
  console.log(a); // bye
}

//2. ---------- template literals ----------
// You can use string interpolation using template literals
let fName = "Derek";
let lName = "Banas";
console.log(`${fName} ${lName}`);

// Calculation in output using template literals
let num1 = 10
let num2 = 5
console.log(`10 * 5 = ${num1 * num2}`);

// You can use tagged template literals to modify output using a function
function doMath(strings, ...values) {
  if (strings[0] == 'Add') {
    console.log(`${values[0]} + ${values[1]} = ${values[0] + values[1]}`);
  } else if (strings[0] == 'Sub'){
    console.log(`${values[0]} - ${values[1]} = ${values[0] - values[1]}`);
  }
}
 
doMath`Add${10} ${20}`;
doMath`Sub${10} ${20}`;

//3. ----------  for-of, ---------- 
// Iterate over characters
for(let c of fName){
  console.log(`${c}`);
}

//4. ----------  String util function ---------- 
// Repeat a string
console.log("Hello ".repeat(3));

// Does a string start with a value
console.log(fName.startsWith("De"));

// Does it end with
console.log(fName.endsWith("ek"));
 
// Does it include
console.log(fName.includes("ere"));

//5. ----------  Default Parameter Values ---------- 
// Default values are defined next to parameters
function getSum(num1 = 1, num2 = 2){
  console.log(`${num1} + ${num2} = ${num1+num2}`);
 
  // arguments[] only receives the value passed
  console.log(`${arguments[0]} + ${arguments[1]}`)
}
getSum(3);

//6. ---------- OBJECTS ----------
// You create object literals like this
function createAnimal(name, owner){
  return {
    // Properties
    name,
    owner,
    // Create a method
    getInfo(){
      return `${this.name} is owned by ${this.owner}`
    },
    // Objects can contain other objects
    address: {
     street: '123 Main St',
     city: 'Pittsburgh'
    }
  };
}
 
var spot = createAnimal("Spot", "Doug");
 
// Execute method
console.log(`${spot.getInfo()}`);
 
// Access object in the object
console.log(`${spot.name} is at ${spot.address.street}`);
 
// Get properties and methods of object
console.log(`${Object.getOwnPropertyNames(spot).join(" ")}`);
 
// You can store values from Objects with destructoring
let { name, owner } = spot;
console.log(`Name : ${name}, Owner : ${owner}`);
 
// Get the inner class value
let { address } = spot
console.log(`Address : ${address.street}`);

//7. ---------- Destructuring Assignment ----------
// You can destructor arrays as well
let favNums = [2.718, .5772, 4.6692];
let [,,chaos] = favNums;
console.log(`Chaos : ${chaos}`);

// You can use rest items to grab part of an array
let [, ...last2] = favNums;
console.log(last2);
console.log(`2nd Num : ${last2[0]} ${last2[1]}`);

// This can be used to switch values
let val1 = 1, val2 = 2;
[val1,val2] = [val2,val1];

console.log(`Val2 : ${val2}`);

//8. ---------- CLASSES ----------
// Classes now work much like they do in other languages
class Mammal{
  constructor(name){
    this._name = name;
  }
 
  // Getter
  get name() {
    return this._name;
  }
 
  // Setter
  set name(name){
    this._name = name;
  }
 
  // Static Mammal creator
  static makeMammal(name){
    return new Mammal(name);
  }
 
  getInfo(){
    return `${this.name} is a mammal`;
  }
 
}
 
// Create an object
let monkey = new Mammal("Fred");
console.log(monkey.getInfo());

// Change name
monkey.name = "Mark";
 
// Call getter
console.log(`Mammal : ${monkey.name}`);
 
// Create Mammal using static function
let chipmunk = Mammal.makeMammal("Chipper");
console.log(`Mammal 2 : ${chipmunk.name}`);

// You can inherit properties and methods with extends
class Marsupial extends Mammal{
  constructor(name, hasPouch){
    // Call the super class constructor
    super(name);
    this._hasPouch = hasPouch;
  }
 
  get hasPouch() {
    return this._hasPouch;
  }
 
  set hasPouch(hasPouch){
    this._hasPouch = hasPouch;
  }
 
  // You can override methods
  getInfo(){
    return `${this.name} is a marsupial`;
  }
 
}
 
let kangaroo = new Marsupial("Paul", true);
console.log(`It is ${kangaroo.hasPouch} that ${kangaroo.name} has a pouch`);


// Test overridden method
console.log(`${chipmunk.getInfo()}`);
console.log(`${kangaroo.getInfo()}`);

// You can dynamically inherit from Classes
function getClass(classType){
  if (classType == 1) {
    return Mammal;
  } else {
    return Marsupial;
  }
}
 
class Koala extends getClass(2){
  constructor(name){
    super(name);
  }
}
 
let carl = new Koala("Carl");
console.log(`${carl.getInfo()}`);


//9. ---------- ARRAYS ----------
// Array.of() is used to create arrays instead of the array
// constructor
let array1 = Array.of(1,2,3);
 
// Create an object into an array
let array2 = Array.from("word");
 
// You can use Array.from to manipulate values
let array3 = Array.from(array1, (value) => value * 2);
 
// Iterate over values
for (let val of array3) console.log(`Array Val : ${val}`);

//10. ---------- SETS ----------
// A Set is a list of values with no duplicates
var randSet = new Set();
randSet.add(10);
randSet.add("Hello");
randSet.add("Word");
 
// Check to see if set contains a value
console.log(`Has 10 : ${randSet.has(10)}`);
 
// Get size of Set
console.log(`Set Size : ${randSet.size}`);
 
// Delete item from list
randSet.delete(10);
 
// Iterate a Set
for (let val of randSet) console.log(`Set Val : ${val}`);

//11. ---------- MAPS ----------
// A Map is a collection of key/value pairs
var randMap = new Map();
randMap.set("key1", "Random String");
randMap.set("key2", 10);
 
// Get values
console.log(`key1 : ${randMap.get("key1")}`);
console.log(`key2 : ${randMap.get("key2")}`);
 
// Get size
console.log(`Map Size : ${randMap.size}`);
 
// Iterate Map
randMap.forEach(function(value, key){
  console.log(`${key} : ${value}`);
});

//12. ---------- PROMISES ----------
// Promises define code that is to be executed later
// Promises either succeed or fail once
// They either are fulfilled, rejected, pending, or settled
 
// A Promise that is handled immediately
var p1 = Promise.resolve('Resolve Me');
 
// then takes 2 optional arguments being first a callback
// for a success and another for failure
p1.then((res) => console.log(`${res}`));
 
// Create a promise that executes after 2 seconds
var p2 = new Promise(function(resolve, reject){
  setTimeout(() => resolve('2Seconds Resolve Me'), 2000);
});
 
p2.then((res) => console.log(`${res}`));
 
// Here I demonstrate how then is used if a promise is
// fulfilled or rejected
let randVal = 6;
 
var p3 = new Promise(function(resolve, reject){
  if (randVal == 18){
    resolve("Good Value");
  } else {
    reject("Bad Value");
  }
});
 
p3.then((val) => console.log(`${val}`),
        (err) => console.log(`${err}`));

// You should add catch to a chain to handle errors
 
var p4 = new Promise((resolve, reject) => {
  if (randVal <= 17){
    throw new Error("Can't Vote"); // Same as a Reject
  } else {
    resolve("Can Vote");
  }
});
 
p4.then((val) => console.log(`${val}`))
  .catch((err) => console.log(`${err.message}`));