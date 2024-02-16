function isEven(n){
    if (n === 0) return true; //0 is an even number
    else if (n === 1) return false; //1 is an odd number
    else if (n < 0) return isEven(-n); //check for an negative number
    else return isEven(n - 2); //recursive call
}
console.log(isEven(50));
console.log(isEven(75));
console.log(isEven(-1));