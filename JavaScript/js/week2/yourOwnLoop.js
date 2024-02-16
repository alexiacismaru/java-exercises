function loop(start, test, update, body) { //loop takes a value, a test function, and a body function
    for (let value = start; test(value); value = update(value)) { //for each iteration, it first runs the test function on the current loop value and stops it it returns 'false'
        body(value); //calls the body function, giving it the current value
    } //lastly, it calls the update function to create a new value
}
loop(3, n => n > 0, n => n - 1, console.log);