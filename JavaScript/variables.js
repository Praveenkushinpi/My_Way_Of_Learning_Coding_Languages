// 1. Re-declaration
var x = 1;
var x = 2; // ✅ Works - re-declared
console.log("var x:", x);

let y = 1;
// let y = 2; // ❌ Error - can't re-declare
y = 2; // ✅ You can reassign
console.log("let y:", y);

const z = 3;
// const z = 4; // ❌ Error - can't re-declare
// z = 4;       // ❌ Error - can't reassign
console.log("const z:", z);


// 2. Scope
function testScope() {
  if (true) {
    var a = "var scoped";
    let b = "let scoped";
    const c = "const scoped";
    console.log("Inside block:", a, b, c);
  }
  console.log("Outside block:", a);     // ✅ works
  // console.log(b); // ❌ Error
  // console.log(c); // ❌ Error
}
testScope();


// 3. Hoisting
console.log("hoistedVar:", hoistedVar); // ✅ undefined
var hoistedVar = "I'm hoisted";

// console.log(hoistedLet); // ❌ Error: Cannot access before initialization
let hoistedLet = "I am not hoisted safely";

// console.log(hoistedConst); // ❌ Error: Cannot access before initialization
const hoistedConst = "Neither is const";
