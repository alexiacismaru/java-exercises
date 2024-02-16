let arrays = [[1,2,3], [4,5], [6]];
//combine all 3 arrays together
const array = arrays.reduce((a, b) => a.concat(b),[]);
console.log(array);