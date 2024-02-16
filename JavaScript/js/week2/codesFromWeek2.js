//passing a function as an argument
//1/2
function executeActionTwice(someFunction){
    someFunction();
    someFunction(); //if we know that 'someFunction' is indeed a function, then we can call it using '()'
}

function action(){
    console.log("Hello!");
}

executeActionTwice(action);

//2/2
function executeConsumerTwice(someFunction, someArgument){
    someFunction(someArgument);
    someFunction(someArgument); //if we know that 'someFunction' has a single parameter, then we can pass an argument
}

function consumer(message){
    console.log(message);
}

executeConsumerTwice(consumer, "Hello!"); //use no brackets

executeConsumerTwice(console.log, "Logging!"); //we can pass any function, even one we didn't write ourselves

//for-each
const myDoubles = [1.2, 56.0, 3, 8.99, 9.0, 4.7];
console.log("Decimals:");
myDoubles.forEach(n => {
    if(n !== Math.floor(n)) { //for-each is a method of Array. it takes a single function, and calls for each element in the array
        console.log(n); //our lambda should have one parameter of the element's type --typically void
    }
});

//filter
const myNumbers = [456, 98, 731,845, 566, 333];
const evenNumbers = myNumbers.filter(i => i % 2 === 0); //filter is another method of Array. it returns a new array with filtering applied using your function argument
console.log("Even numbers:");
console.log(evenNumbers);
console.log(myNumbers.filter((value, index) => { //filter takes a function with one, two, three parameters
    return index % 2 === 0;
}));

//map
const myStrings = ["Lars", "Jan", "Ann", "Piet", "Tony", "Tom", "Wim", "Dieter", "Antoon", "Charmaine"];
const onlyFirstLetters = myStrings.map(str => str.charAt(0)); //the map method returns a new array. you're supposed to pass a non-valid function to "transform" each element into another one --possibly even a different type
console.log("First letters:");
console.log(onlyFirstLetters);

//reduce
const prices = [5.99, 6.99, 5.50, 12.00, 8.90];
const total = prices.reduce((theTotalSoFar, currentPrice) => {
    return theTotalSoFar + currentPrice; //the reduce method can return an array into a single variable --typically, a string or a number
});
console.log("Total: " + total);

function reduce(array, combine, start) {
    let current = start;
    for (let element of array) {
        current = combine(current, element);
    }
    return current;
}
console.log(reduce([1, 2, 3, 4], (a, b) => a + b, 0));//10
console.log([1, 2, 3, 4].reduce((a, b) => a + b)); //10

function characterCount(script) {
    return script.ranges.reduce((count, [from, to]) => {
        return count + (to - from);
    }, 0);
}
console.log(SCRIPTS.reduce((a, b) => {
    return characterCount(a) < characterCount(b) ? b : a;
}));// → {name: "Han", …}

//composability
const people = ["Lars", "Jan", "Ann", "Piet", "Tony", "Tom", "Wim", "Dieter", "Antoon", "Charmaine"];
const result = people .filter(name => name.length === 3)
                      .map(name => name.toUpperCase())
                      .reduce((accum, current) => accum + "-" + current); //chaining method calls
console.log("Result: " + result);

//map to names --exercise
let john = { name: "John", age: 25 };
let pete = { name: "Pete", age: 30 };
let mary = { name: "Mary", age: 28 };
let users = [ john, pete, mary ];
let names = users.map(item => item.name);
console.log(names); // John, Pete, Mary

//outer variables
let objects = "beans";
function showMessage(number) {
    console.log(number + " " + objects);
}
showMessage(5); //5 beans

//returning a function from a function
function getLoggingFunction(type){
    switch(type){
        case "log":
            return console.log; //no brackets!1!
        case "info":
            return console.info;
        case "debug":
            return console.debug;
        case "error":
            return console.error;
        default: throw new Error(`I don't support"${type}`); //left quotes
    }
}
const theFunctionThatINeed = getLoggingFunction("debug"); //we can create a variable to refer to the returned function
theFunctionThatINeed("Functions, functions, functions!");

//try...catch
try { //firstly executed
    /* code...*/
} catch (err) { //if there are no errors -> ignored
    /* error handling*/
} //if there are any errors -> try is stopped and catch(err) starts executing
//(err) variable will contain an error object with details about what happened

try {
    alert('Start of try runs');  // (1) <--
    /* ...no errors here*/
    alert('End of try runs');   // (2) <--
} catch (err) {
    alert('Catch is ignored, because there are no errors'); // (3)
}

try {
    alert('Start of try runs');  // (1) <--
    lalala; // error, variable is not defined!
    alert('End of try (never reached)');  // (2)
} catch (err) {
    alert(`Error has occurred!`); // (3) <--
}
/*only works for runnable codes
if it happens in "scheduled code" --like setTimeout-- the try..catch won't catch it
 */
try {
    setTimeout(function() {
        noSuchVariable; // script will die here
    }, 1000);
} catch (err) {
    alert( "won't work" );
}
//VS
setTimeout(function() {
    try {
        noSuchVariable; // try...catch handles the error!
    } catch {
        alert( "error is caught here!" );
    }
}, 1000);

try {
    // ...
} catch (err) {}//when an error occurs, JS generates an object containing the details about it. the object is then passed as an argument to catch

//closures
objects = "crows";
function makeCounter(){
    let count = 2;

    return function(){
        return count++;
    };
}
let counter = makeCounter();
showMessage(counter()); //2 crows
showMessage(counter()) //3 crows
showMessage(counter()) //4 crows
//even after the makeCounter has finished, counter() has access to the count variable in the context in which it was created

//are counters independent -> yes
function makeCounter1() {
    let count = 0;

    return function() {
        return count++;
    };
}
let counter1 = makeCounter();
let counter2 = makeCounter();
console.log( counter1() ); // 0
console.log( counter1() ); // 1
console.log( counter2() ); // 0
console.log( counter2() ); // 1

//sum with counters
function sum(a) {
    return function(b) {
        return a + b; // takes "a" from the outer lexical environment
    };
}
console.log( sum(1)(2) ); // 3
console.log( sum(5)(-1) ); // 4

//army of function --exercise
function makeArmy() {
    let shooters = []; //create empty array
    let i = 0;
    while (i < 10) {
        let shooter = function() { // create a shooter function,
            alert( i ); // that should show its number
        }; //fill it with functions using shooters.push(function)
        shooters.push(shooter); // and add it to the array
        i++;
    }
    // ...and return the array of shooters
    return shooters;
}
let army = makeArmy();
// all shooters show 10 instead of their numbers 0, 1, 2, 3...
army[0](); // 10 from the shooter number 0
army[1](); // 10 from the shooter number 1
army[2](); // 10 ...and so on.

//class syntax
class Address{
    constructor(street, houseNumber, postalCode, city, country) { //write constructor not the class' name
        this._street = street;
        this._houseNumber = houseNumber;
        this._postalCode = postalCode;
        this._city = city;
        this._country = country;
    }
    get street(){ //the street property is backed by a getter function
        return this._street;
    }
    set street(street){ //the street property is backed by a setter function
        this._street = street; //_street = the underscore is by convention --like a backing property
    } //this is mandatory when referring to a property

    get houseNumber(){
        return this._houseNumber;
    }
    set houseNumber(houseNumber) {
        this._houseNumber = houseNumber;
    }

    get postalCode(){
        return this._postalCode;
    }
    set postalCode(postalCode) {
        this._postalCode = postalCode;
    }

    get city(){
        return this._city;
    }
    set city(city) {
        this._city = city;
    }

    get country(){
        return this._country;
    }
    set country(country) {
        this._country = country;
    }

    print(){ //no function keyword for methods
        console.log();
    }
}

const campusGroenplaats = new Address ('Nationalstraat', 5, 2000, 'Antwerp', 'Belgium'); //construction using new
campusGroenplaats.print(); //calling an instance method
campusGroenplaats.houseNumber = 1; //calling a setter
if(campusGroenplaats.city === 'Antwerp'){ //calling a getter
    campusGroenplaats.country = 'Atlantis'; //cslling a setter
}
campusGroenplaats.print();

//inheritance
class Address {
    constructor(recipient, postalCode, city, country) {
        this._recipient = recipient;
        this._postalCode = postalCode;
        this._city = city;
        this._country = country;
    }

    get recipient() {
        return this._recipient;
    }

    print() {
        console.log(`${this._postalCode} ${this._city}`);
        console.log(this._country.toUpperCase());
    }
}

class HomeAddress extends Address {
    constructor(recipient, street, houseNr, postalCode, city, country) {
        super(recipient, postalCode, city, country);
        this._street = street;
        this._houseNr = houseNr;
    }

    print() {
        console.log(this.recipient);
        console.log(`${this._street} ${this._houseNr}`);
        super.print();
    }
}

class POBox extends Address { //extends just like Java
    static PO_BOX_PREFIX = 'PO Box'; //static (class) fields are supported as well
    constructor(recipient, poBoxNr, postalCode, city, country) {
        super(recipient, postalCode, city, country); //super explicitly calls a superclass' method --optional-- or a constructor --mandatory
        this._poBoxNr = poBoxNr;
    }
    print(){
        console.log(this.recipient);
        console.log(`${POBox.PO_BOX_PREFIX} ${this._poBoxNr}`); //left quotes
        super.print(); //super explicitly calls a superclass' method --optional-- or a constructor --mandatory
    }
}

const home = new HomeAddress('Karel de Grote University of Applied Sciences and Arts', 'Nationalestraat', 5, 2000, 'Antwerpen', 'Belgium');
const poBox = new POBox('KdG', 9001, 2000, 'Antwerp', 'Belgium');

home.print();
console.log();
poBox.print();
console.log();

console.log('Is \'home\' an instance of Address? ' + (home instanceof Address));
console.log('Is \'home\' an instance of HomeAddress? ' + (home instanceof HomeAddress));
console.log('Is \'home\' an instance of POBox? ' + (home instanceof POBox));


//instanceof, Map and Iterator
const poBox = new POBox('KdG', 9001, 2000, 'Antwerp', 'Belgium');
console.log(poBox instanceof Address); // instanceof works the same as in Java
console.log(poBox instanceof HomeAddress);
console.log(poBox instanceof POBox);

const namesMap = new Map(); //construction of the map
namesMap.set('Ann', 'Gielis');
namesMap.set('Tom', 'De Reys'); //use the get and set methods
console.log('Tom who? ' + namesMap.get('De Reys'));

const firstNameIterator = namesMap.keys();
for(let firstName of firstNameIterator){ //'for...of' iterates over all elements of an Iterable
    console.log(firstName);
}
/*
~bugs and errors
console.log() – For general output of logging information.
console.info() – Informative logging of information.
console.debug() – Outputs a message to the console with the log level debug.
console.warn() – Outputs a warning message.
console.error() – Outputs an error message.
console.assert() - Log a message and stack trace to console if the first argument is false.
console.clear() - Clear the console.log.
console.count() - Log the number of times this line has been called with the given label.
console.dir() - Displays an interactive list of the properties of the specified JS object.
console.group()/console.groupEnd() - Creates a new inline group, indenting all following output by another level. To move back out a level, call groupEnd().
console.memory - Check out the heap size statuses of the specified
console.log(document.body) - HTML elements in the console
console.table() - Displays tabular data as a table.
console.time()/console.timeEnd() - console.time() – Starts a timer with a name specified as an input parameter. Up to 10,000 simultaneous timers can run on a given page.
                                 - console.timeEnd() – Stops the specified timer and logs the elapsed time in seconds since it started.
console.trace() - Outputs a stack trace.
 */
const errorMsg = 'the number is not even';
for (let number = 0; number <= 4; number++) {
    console.log('the number is' + number);
    console.assert(number % 2 === 0, {number, errorMsg});
}

for (let count = 0; count <= 2; count++) {
    console.count();
}

const user = {
    name: 'Marko',
    handle: '@denicmarko'
}
console.dir(user);

function Person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}
const johnny = new Person('Johnny', 'Smith');
const jane = new Person('Jane', 'Doe');
const marko = new Person('Marko', 'Denic');
console.table([johnny, jane, marko]);

console.time('track time');
alert('click to continue');
console.timeLog('track time');
alert('click to continue again');
console.timeEnd('track time');

function initialFunction() {
    function innerFunction() {
        console.trace();
    }
    innerFunction();
}
initialFunction();

//type annotations
/*
Doubles any given number of times.
@param {number} n Just a number. //list each parameter with '@param', followed by its type in between {}, and its name
@return {number} Twice the given number. //use '@return', followed by the return type in between {}
 */
function timeTwo(n) {
    return n*2;
}
/*
The user's age.
@type {number} //type information for non-const variables can prevent undesired side-effects
 */
let age;
age = '20'; //warning!1!

//exceptions
class Student {
    constructor(name) {
        if (!name) {
            throw new ReferenceError('\'name\' is mandatory!'); //the base class to use exceptions is 'Error'. other exceptions extends this class
        } else if (typeof name !== 'string') {
            throw new TypeError('\'name\' should be string!'); //syntax is similar to Java: 'throw new', 'try'/'catch', and 'finally'
        }
        this._name = name;
    }
}
try {
    const s1 = new Student(null, '123');
    console.log('\'s1\' has been created.');
} catch (e) {
    console.log(`\'s1\' has NOT been created. (${e.message})`);
}
try {
    const s2 = new Student(undefined, '123');
    console.log('\'s2\' has been created.');
} catch (e) {
    console.log(`\'s2\' has NOT been created. (${e.message})`);
}
try {
    const s3 = new Student('', '123');
    console.log('\'s3\' has been created.');
} catch (e) {
    console.log(`\'s3\' has NOT been created. (${e.message})`);
}
try {
    const s4 = new Student(7, '123');
    console.log('\'s4\' has been created.');
} catch (e) {
    console.log(`\'s4\' has NOT been created. (${e.message})`);
}
try {
    const s5 = new Student('Mary', '123');
    console.log('\'s5\' has been created.');
} catch (e) {
    console.log(`\'s5\' has NOT been created. (${e.message})`);
}
console.log();

try {
    // In JavaScript, the recommended exception type is 'Error'.
    // https://developer.mozilla.org/en-US/docs/web/javascript/reference/global_objects/error
    // Don't use anything other than Error or its subclasses!
    throw 'apple'; // Don't do this!
} catch (fruit) {
    console.log(`Thanks for the ${fruit}.`);
}

//ECMAScript modules
import {Address} from './Address.js'; //we're importing a specific import from 'Address.js' //starts with './' and ends with '.js'
export class HomeAddress extends Address {/* ... */}
