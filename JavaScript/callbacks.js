// What is a callback?
// A function that you pass as a parameter to another function

// EX #1 (synchronous) ------------------------------------------------
// setTimeout(() => {
//   console.log("Hello");
// }, 100);
// // also can be written as:
// const logHello = () => {
//   console.log("Hello");
// };
// setTimeout(logHello, 100);

// * logs 1,3,2 no matter the timer, wether it be 0 or 100
// console.log("1");
// setTimeout(() => {
//   console.log("2");
// }, 0);
// console.log("3");

//EX #2 (synchronous) --------------------------------------------------
// const arrayOfNames = ["bob", "fred", "billy", "tod", "Sarah"];

// const myForEach = (arr, cb) => {
//   for (let i = 0; i < arr.length; i++) {
//     const element = arr[i];
//     cb(element);
//   }
// };

// myForEach(arrayOfNames, (name) => {
//   console.log(name);
// });

// EX #3 (asynchronous) ----------------------------------------------------
const loadPokemon = (id, cb) => {
  fetch(`https://pokeapi.co/api/v2/pokemon/${id}`)
    .then((res) => res.json())
    .then((data) => {
      cb(data);
    });
};

loadPokemon(67, (pokemon) => {
  console.log(pokemon);
});
