#  JavaScript Data Types

JavaScript has different types of data you can work with. These are split into **primitive types** and **non-primitive types**.

---

##  Primitive Types

| Type        | Example                  | Description                        |
|-------------|--------------------------|------------------------------------|
| `Number`    | `42`, `3.14`, `-1`       | Any numeric value                  |
| `String`    | `"hello"`, `'world'`     | Text inside quotes                 |
| `Boolean`   | `true`, `false`          | Logical true or false              |
| `Null`      | `null`                   | Empty value (manually set)         |
| `Undefined` | `undefined`              | Declared but not assigned          |
| `Symbol`    | `Symbol('id')`           | Unique value, mostly for objects   |
| `BigInt`    | `12345678901234567890n`  | Large integers beyond `Number`     |

---

##  Non-Primitive Types (Objects)

| Type        | Example                          | Description                         |
|-------------|----------------------------------|-------------------------------------|
| `Object`    | `{ name: "John", age: 30 }`       | Key-value pairs                     |
| `Array`     | `[1, 2, 3]`                       | Ordered collection (list)          |
| `Function`  | `function greet() {}`             | Reusable block of code             |
| `Date`      | `new Date()`                      | Date/time representation            |
| `RegExp`    | `/ab+c/`                          | Regular expression for pattern matching |

---

##  `typeof` Operator

You can check a variable's type using `typeof`:

```js
typeof 42             // "number"
typeof "hello"        // "string"
typeof true           // "boolean"
typeof null           // "object" ← (weird JS quirk!)
typeof undefined      // "undefined"
typeof {}             // "object"
typeof []             // "object"
typeof function(){}   // "function"

```

[Next Page](https://github.com/Praveenkushinpi/My_Way_Of_Learning_Coding_Languages/tree/main/JavaScript)
