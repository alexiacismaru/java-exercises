//reverse arrays without using the traditional reverse
function reverseArray(array) {
    let output = [];
    for (let i = array.length - 1; i >= 0; i--) { //iterating over an array backwards
        output.push(array[i]);
    }
    return output;
}//takes an array as an argument and produces a new array that has the same elements in the inverse order
console.log(reverseArray(["A", "B", "C"]));

function reverseArrayInPlace(array) {
    for (let i = 0; i < Math.floor(array.length / 2); i++) { //swap the first and last elements, then the second and second-to-last, and so on
        let old = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = old;
    } // looping over half the length of the array and swapping the element at position i with the one at position array.length / 2
    return array;
}//modifies the array given as an argument by reversing its elements
let arrayValue = [1, 2, 3, 4, 5];
reverseArrayInPlace(arrayValue);
console.log(arrayValue);