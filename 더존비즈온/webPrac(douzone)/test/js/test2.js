let value=  true;
console.log(typeof(value));
value = String(value);
console.log(typeof(value));
console.log("6"/"2");
let str1 = "123";
let num1 = Number(str1);
console.log(typeof num1 +" "+ num1);
let mynum1 = [3,5,6,7,8,4,23,5,4];
// mynum1.forEach(element => {
//     console.log(element);
// });
mynum1.push("aaa");
console.log(mynum1[mynum1.length-1]);
mynum1.pop();
console.log(mynum1[mynum1.length-1]);
console.log("cross origin resource sharing");


const fetch = require('node-fetch');
// XMLHttpRequest 다음 세대 API : fetch, axios
fetch('https://www.omdbapi.com/?apikey=a0d63a07&s=Frozen')
  .then(function(response) {
    return response.json();
  })
  .then(function(myJson) {
    console.log(JSON.stringify(myJson));
  });

// fetch('https://www.omdbapi.com/?apikey=a0d63a07&s=Frozen', {
//     method: 'GET', // *GET, POST, PUT, DELETE, etc.
//     mode: 'cors', // no-cors, cors, *same-origin
//     cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
//     credentials: 'same-origin', // include, *same-origin, omit
//     headers: {
//         'Content-Type': 'application/json',
//         // 'Content-Type': 'application/x-www-form-urlencoded',
//     },
//     redirect: 'follow', // manual, *follow, error
//     referrer: 'no-referrer', // no-referrer, *client
//     body: JSON.stringify(data), // body data type must match "Content-Type" header
// })
// .then(response => console.log(response.json())); // parses JSON response into native JavaScript objects

// XMLHttpRequest();



