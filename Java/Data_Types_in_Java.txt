
Data types in Java define the type of data that a variable can store. Java has two main categories of data types: **Primitive Data Types** and **Non-Primitive Data Types**.

## 1. Primitive Data Types

Primitive data types are the most basic types of data in Java. They are predefined by the language and store simple values.

### Types of Primitive Data Types:

1. **Integer Types:**
    
    - `byte` (8-bit) - Range: -128 to 127
    - `short` (16-bit) - Range: -32,768 to 32,767
    - `int` (32-bit) - Range: -2,147,483,648 to 2,147,483,647
    - `long` (64-bit) - Range: Very large values
2. **Floating-Point Types:**
    
    - `float` (32-bit) - Stores decimal values with less precision (e.g., `float price = 10.99f;`)
    - `double` (64-bit) - Stores decimal values with higher precision (e.g., `double area = 20.456;`)
3. **Character Type:**
    
    - `char` (16-bit) - Stores a single character (e.g., `char letter = 'A';`)
4. **Boolean Type:**
    
    - `boolean` - Stores only `true` or `false` (e.g., `boolean isJavaFun = true;`)

## 2. Non-Primitive Data Types

Non-primitive data types are more complex and include objects, arrays, and classes.

### Examples:

- `String` - A sequence of characters (e.g., `String name = "Java";`)
- `Array` - A collection of elements of the same type
- `Class` - A blueprint for creating objects
- `Interface` - A contract that classes can implement

## Example Program:

```java
public class DataTypesExample {
    public static void main(String[] args) {
        int age = 25;
        double price = 99.99;
        char grade = 'A';
        boolean isJavaFun = true;
        String message = "Hello, Java!";

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Message: " + message);
    }
}
```


### **Use of Bits in Data Types & Their Effect on Machine Performance**

Bits in data types **directly impact how the computer stores, processes, and retrieves data**. Choosing the right data type affects:  
✅ **Memory usage**  
✅ **Processing speed**  
✅ **Energy consumption**

---

### **1. Memory Usage: Choosing the Right Data Type**

Each variable you declare **reserves memory** in RAM. The **larger the bit size**, the **more memory** it consumes.

🔹 **Example:**

java

CopyEdit

`byte smallNum = 100;   // Uses 8 bits (1 byte) int bigNum = 100;      // Uses 32 bits (4 bytes)`

Even though both store `100`, the `int` takes **4x more space** than `byte`!

🚀 **Impact on Machine:**

- If you use **smaller data types**, the program runs **efficiently** (less RAM usage).
- If you use **larger-than-needed types**, the program **wastes memory** (bad for embedded systems or mobile apps).

---

### **2. Processing Speed: CPU & Cache Optimization**

CPUs process data in **chunks of bits** (typically **32-bit or 64-bit**).

- A **64-bit processor** can handle **64-bit numbers in one go**, but if you use **8-bit numbers**, it still processes them as **64-bit internally** (padding with zeros).

🔹 **Example (Performance Difference in Loops)**



`public class PerformanceTest {     public static void main(String[] args) {         long startTime = System.nanoTime();          int sum = 0;         for (int i = 0; i < 1000000; i++) { // 1 million iterations             sum += i;  // Uses int (32-bit)         }          long endTime = System.nanoTime();         System.out.println("Execution Time: " + (endTime - startTime) + " ns");     } }`

📌 **Using `long` (64-bit) instead of `int` may slow down performance on a 32-bit CPU** because it requires **multiple operations** instead of one.

🚀 **Impact on Machine:**

- **Smaller bit sizes** (e.g., `int` instead of `long`) make loops run **faster**.
- **Larger bit sizes** can cause **slowdown** if the CPU isn't optimized for them.

---

### **3. Energy Consumption: Less Bits = Less Power**

📌 Devices like **smartphones & embedded systems** have limited power.

- **More bits = More power consumption**
- **Smaller data types save battery life**

🔹 **Example (Mobile App Optimization)**  
A game storing **player scores** in `long` (64-bit) instead of `short` (16-bit) **wastes memory & energy**.

🚀 **Impact on Machine:**

- Using **efficient data types** improves **battery life & performance**.
