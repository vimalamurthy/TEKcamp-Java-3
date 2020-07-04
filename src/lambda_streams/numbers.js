//Bonus: refactor Numbers.java into javascript

const nums = [
  10,
  100,
  1000,
  5,
  50,
  500,
  3,
  30,
  300,
  7,
  70,
  700,
  1,
  10,
  100,
  25,
  250,
  2500,
];
console.log(nums);

const isOdd = (i) => {
  if (nums[i] % 2 != 0) return true;
  else return false;
};
console.log(isOdd(2));

const isEven = (i) => {
  if (nums[i] % 2 == 0) return true;
  else return false;
};
console.log(isEven(2));

const isPrime = (i) => {
  if (nums[i] % i == 0) {
    return false;
  }
  return true;
};
console.log(isPrime(3));

const added = nums.reduce((a, b) => {
  return a + b;
}, 0);

console.log(added);

const subtract = nums.reduce((a, b) => {
  return a - b;
}, 0);
console.log(subtract);

let mul = 1;
mul = nums.reduce((a, b) => a * b, 1);
console.log(mul);

const div = nums.reduce((a, b) => {
  return a / b;
}, 1);
console.log(div * nums[0]);

const findMax = (nums) => Math.max(...nums);
console.log(findMax(nums));

const findMin = (nums) => Math.min(...nums);
console.log(findMin(nums));

const compareVal = (i, j) => {
  if (nums[i] > nums[j]) return 1;
  else return -1;
};
console.log(compareVal(1, 2));

addElement = (i) => nums.push(i);
addElement(28);
console.log(nums[nums.length - 1]);
