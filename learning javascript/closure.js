function makeCounter() {
  let privateCounter = 0;
  return {
    increment: function () {
      privateCounter++;
    },
    decrement: function () {
      privateCounter--;
    },
    getValue: function () {
      return privateCounter;
    }
  }
}
let counter1 = makeCounter();
counter1.increment();
counter1.decrement();
counter1.increment();
console.log(counter1.getValue());

function getAllNum(...nums) {
  console.log(nums);
  return nums;
}
let getted = getAllNum(3, 5, 8, 10);
console.log(getted);

function getMaxNum(...nums) {
  return nums.reduce(function (acc, current) {
    if (acc > current) {
      return acc;
    }
    else {
      return current;
    }
  });
}
console.log(getMaxNum(3, 5, 8, 10));

