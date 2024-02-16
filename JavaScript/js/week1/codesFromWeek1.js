console.log("2" == 2) //true --convert and compare
console.log("2" === 2) //false --compare without convert

//functions
function square(x){
    return x * x;
} //no need to define a function in a class
console.log(square(5)); //25

const cube = function(x){
    return x*x*x;
} //you can assign a function to a variable
console.log(cube(5)); //125

const power = (base, exp) => { //lambada: fat arrow => notation
    let result = 1;
    for(let i = 0; count < exp; i++){
        result *= base;
    }
    return result;
}
console.log(power(5,4)); //625

//replace function expressions with arrow functions in the code below:
function ask(question, yes, no) {
    if (confirm(question)) yes();
    else no();
}

ask(
    "Do you agree?",
    function() { alert("You agreed."); },
    function() { alert("You canceled the execution."); }
);
//solution
ask(
    "Do you agree?",
    () => alert("You agreed."),
    () => alert("You canceled the execution.")
);

//arrays
const sequence = [1, 2, 3];
sequence.push(5); //dynamic size
console.log(sequence); //[1, 2, 3, 5]
console.log(sequence.pop()); //5
console.log(sequence); //[1, 2, 3]
/*length
shift/unshift: add/remove elements --at head
indexOf/lastIndexOf: index of first/last appearance
slice: returns part of an array
reverse
concat
remove etc...*/

let fruits = ["Apples", "Pear", "Orange"];
// push a new value into the "copy"
let shoppingCart = fruits;
shoppingCart.push("Banana");
// what's in fruits?
alert( fruits.length ); // 4

//the function camelize(str) that changes dash-separated words like “my-short-string” into camel-cased “myShortString”
camelize("background-color") == 'backgroundColor';
camelize("list-style-image") == 'listStyleImage';
camelize("-webkit-transition") == 'WebkitTransition';
//remove all dashes, each word after dash becomes uppercase
function camelize(str) {
    return str
        .split('-') // splits 'my-long-word' into array ['my', 'long', 'word']
        .map(
            // capitalizes first letters of all array items except the first one
            // converts ['my', 'long', 'word'] into ['my', 'Long', 'Word']
            (word, index) => index == 0 ? word : word[0].toUpperCase() + word.slice(1)
        )
        .join(''); // joins ['my', 'Long', 'Word'] into 'myLongWord'
}

//filter range "in place"
function filterRangeInPlace(arr, a, b) {
    for (let i = 0; i < arr.length; i++) {
        let val = arr[i];
        // remove if outside of the interval
        if (val < a || val > b) {
            arr.splice(i, 1);
            i--;
        }
    }
}
let arr = [5, 3, 8, 1];
filterRangeInPlace(arr, 1, 4); // removed the numbers except from 1 to 4
alert( arr ); // [3, 1]

//sort in decreasing order
let arr = [5, 2, 1, -10, 8];
arr.sort((a, b) => b - a);
alert( arr );

//copy and sort arrays
function copySorted(arr) {
    return arr.slice().sort();
}
let arr = ["HTML", "JavaScript", "CSS"];
let sorted = copySorted(arr);
alert( sorted );
alert( arr );

//objects
let day1 = {
    squirrel: false, //attributeName: attributeValue
    events: ["work", "touched tree", "pizza", "running"]
};
console.log(day1.squirrel); //false
console.log(day1.wolf); //undefined
day1.wolf = true; //dynamic attributes
console.log(day1.wolf); //true
console.log(Object.keys(day1)); // ['squirrel', 'events', 'wolf']
console.log(day1["wolf"]); //true
//objects are like arrays with a text index (associative arrays)
day1.wolf = {
    color:"grey",
    were: true
};
console.log(day1);
/*{
squirrel: false,
events: ["work", "touched tree", "pizza", "running"],
wolf: {
    color:'grey',
    were: true
    } -> objects within objects
}
 */
console.log(day1.events.includes("pizza")); //true


//...rest...spread operators
function max(...numbers){
    //if the last element of a function is an ...array, all remaining (rest) arguments are assigned into the array
    let result = -Infinity;
    for(let number of numbers){
        if(number > result) result = number;
    }
    return result;
}
console.log(max(4, 1, 9, -2)); //9

let actions = ["pizza", "running"];
let wolf = {
    color:"grey",
    were: true
};
let day1 = {
    squirrel: false,
    events: ["work", "touched tree", ...actions], //if an ...array is assigned, its elements are spread out
    ...wolf //if an ...object is assigned, its elements are spread out
};
console.log(day1)

//destructing
let fingers = ["one", "two", "three", "four", "five"];
let [pinky,,middleFinger] = fingers; //assign array elements to multiple variables
console.log(pinky, middleFinger); //one three

let wolf = {
    color:"grey",
    were: false,
    wicked: "true"
};
let{color,wicked} =wolf //assign object attributes to multiple variables
console.log(color,wicked) //grey, true

/*notation to write JS objects to files (as text)
{
    "squirrel": false,
    "events": ["work", "touched tree", "pizza", "running"]
} //attribute names as Strings (double quoted!1!)
object => JSON: JSON.stringify()
JSON => object: JSON.parse
*/