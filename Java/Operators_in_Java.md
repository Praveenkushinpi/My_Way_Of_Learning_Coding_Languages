
Operators in Java are special symbols that perform operations on variables and values. Java has several types of operators categorized as follows:

## 1. Arithmetic Operators

Used for basic mathematical operations.

|Operator|Description|Example|
|---|---|---|
|`+`|Addition|`a + b`|
|`-`|Subtraction|`a - b`|
|`*`|Multiplication|`a * b`|
|`/`|Division|`a / b`|
|`%`|Modulus (Remainder)|`a % b`|

## 2. Relational (Comparison) Operators

Used to compare two values.

|Operator|Description|Example|
|---|---|---|
|`==`|Equal to|`a == b`|
|`!=`|Not equal to|`a != b`|
|`>`|Greater than|`a > b`|
|`<`|Less than|`a < b`|
|`>=`|Greater than or equal to|`a >= b`|
|`<=`|Less than or equal to|`a <= b`|

## 3. Logical Operators

Used to perform logical operations.

|Operator|Description|Example|
|---|---|---|
|`&&`|Logical AND|`a && b`|
|`||`|
|`!`|Logical NOT|`!a`|

## 4. Bitwise Operators

Used to perform operations at the bit level.

| Operator | Description        | Example  |
| -------- | ------------------ | -------- |
| `&`      | Bitwise AND        | `a & b`  |
| `\|`     | `Bitwise OR`       | a \| b   |
| `^`      | Bitwise XOR        | `a ^ b`  |
| `~`      | Bitwise Complement | `~a`     |
| `<<`     | Left Shift         | `a << 2` |
| `>>`     | Right Shift        | `a >> 2` |

## 5. Assignment Operators

Used to assign values to variables.

|Operator|Description|Example|
|---|---|---|
|`=`|Assigns value|`a = b`|
|`+=`|Adds and assigns|`a += b` (equivalent to `a = a + b`)|
|`-=`|Subtracts and assigns|`a -= b` (equivalent to `a = a - b`)|
|`*=`|Multiplies and assigns|`a *= b`|
|`/=`|Divides and assigns|`a /= b`|
|`%=`|Modulus and assigns|`a %= b`|

## 6. Unary Operators

Used with a single operand.

|Operator|Description|Example|
|---|---|---|
|`+`|Unary plus|`+a`|
|`-`|Unary minus|`-a`|
|`++`|Increment|`a++` (post-increment), `++a` (pre-increment)|
|`--`|Decrement|`a--` (post-decrement), `--a` (pre-decrement)|

## 7. Ternary Operator

A shorthand for `if-else` statements.

|Operator|Description|Example|
|---|---|---|
|`?:`|Ternary (conditional) operator|`result = (a > b) ? a : b;`|

## Example Program

```java
public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not Equal to: " + (a != b));
        
        System.out.println("Logical AND: " + (a > 0 && b > 0));
        System.out.println("Logical OR: " + (a > 0 || b < 0));
        
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        
        int c = (a > b) ? a : b;
        System.out.println("Ternary Operator Result: " + c);
    }
}
```

This program demonstrates various Java operators with examples.

### **Operator Precedence in Java**

Operator precedence determines **which operation is performed first** when multiple operators appear in an expression. Java follows **BODMAS (Brackets, Orders, Division/Multiplication, Addition/Subtraction)** but also includes logical and bitwise operators.

---

### **Operator Precedence Table (Highest to Lowest Priority)**

|**Precedence**|**Operators**|**Description**|**Associativity**|
|---|---|---|---|
|**1 (Highest)**|`()`, `[]`, `.`|Parentheses, Array Access, Member Access|Left to Right|
|**2**|`++`, `--`, `+` (Unary), `-` (Unary), `~`, `!`|Increment, Decrement, Unary Plus/Minus, Bitwise NOT, Logical NOT|Right to Left|
|**3**|`*`, `/`, `%`|Multiplication, Division, Modulus|Left to Right|
|**4**|`+`, `-`|Addition, Subtraction|Left to Right|
|**5**|`<<`, `>>`, `>>>`|Bitwise Shift Operators|Left to Right|
|**6**|`<`, `<=`, `>`, `>=`|Relational Operators|Left to Right|
|**7**|`==`, `!=`|Equality Operators|Left to Right|
|**8**|`&`|Bitwise AND|Left to Right|
|**9**|`^`|Bitwise XOR|Left to Right|
|**10**|`|`|Bitwise OR|
|**11**|`&&`|Logical AND|Left to Right|
|**12**|`||`|
|**13**|`?:`|Ternary Operator|Right to Left|
|**14**|`=`, `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `|=`,` ^=`,` <<=`,` >>=`,` >>>=`|Assignment Operators|
|**15 (Lowest)**|`,`|Comma Operator|Left to Right|

---

### **Example: Understanding Precedence**

java

CopyEdit

`public class PrecedenceExample {     public static void main(String[] args) {         int result = 10 + 5 * 2;  // Multiplication (*) happens first         System.out.println(result); // Output: 20                  int result2 = (10 + 5) * 2;  // Parentheses () change the order         System.out.println(result2); // Output: 30     } }`

📌 **Multiplication (`*`) has higher precedence than Addition (`+`)** → `5 * 2` is evaluated first.

---

### **Operator Associativity**

- **Left to Right:** Most operators (`+`, `-`, `*`, `/`, `&&`, `||`, etc.).
- **Right to Left:** Assignment (`=`) and Ternary (`?:`) operators.

🔹 **Example of Associativity**

java

CopyEdit

`int x = 5, y = 10, z = 15; int result = x = y = z;  // Right to Left: y = z first, then x = y System.out.println(result); // Output: 15`

---

### **Key Takeaways**

✔ **Operators with higher precedence are evaluated first.**  
✔ **Use parentheses `()` to control execution order explicitly.**  
✔ **Assignment (`=`) and Ternary (`?:`) are evaluated Right to Left.**
