for(let i = 1; i <= 100; i++){
    let output = "";
    if(i % 3 === 0) output += "Fizz"; //prints fizz for numbers divisible by 3
    if(i % 5 === 0) output += "Buzz"; //prints fizz for numbers divisible by 5
        console.log(output || i); //prints either the number OR id=f the number is divisible by 3, 5 or both
}