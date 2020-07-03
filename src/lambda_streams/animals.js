//Bonus:  refactor Animals.java into javascript
const strArr = [
  'peacoCK',
  'rabbit',
  'chiwawa',
  'OranguTAN',
  'vipeR',
  'cobra',
  'paNDa',
  'bUffalo',
  'DeeR',
  'maLLard',
];
let str = [],
  arr = [];
// Convert first letter to caps:

function capsFirst() {
  strArr.forEach((e) => {
    strArr.splice(e.indexOf(), e.indexOf(), e);
    str.push(e[0].toUpperCase() + e.slice(1).toLowerCase());
  });
}
capsFirst();
//console.log(strArr);

console.log('First letter caps : ');
console.log(str);

//Append strings to String array

console.log('Appended string');
function addAnimal(a) {
  str.push(a[0].toUpperCase() + a.slice(1).toLowerCase());
}

addAnimal('rEIndeeR');
addAnimal('Platypus');
addAnimal('frOg');
addAnimal('lEOpArD');
console.log(str);

function lowerFirst() {
  str.forEach((e) => {
    arr.push(e[0].toLowerCase() + e.slice(1).toUpperCase());
  });
}
console.log('Lower first: ');
lowerFirst();
console.log(arr);

console.log('Reverse Array: ');
console.log(str.reverse());

console.log('Sorted Array: ');
console.log(str.sort());
