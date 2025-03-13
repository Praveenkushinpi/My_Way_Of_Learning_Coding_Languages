class JavaTutorials {
    public static void main(String[] args) {


        //Variables in Java 
int myNum = 1;               // Integer (whole number) 
double myDoubleNum = 1.99;    // Floating point number 
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String



// Datatypes

//Primitive Data Types
byte myNumByte = 100;               // 1 byte
short myNumShort = 5000;             // 2 bytes
int myNumInt = 100000;               // 4 bytes
long myNumLong = 15000000000L;       // 8 bytes

//Floating Point Types
float myNumFloat = 5.75f;           // 4 bytes
double myNumDouble = 19.99d;        // 8 bytes

//Character Types
char myLetterChar = 'D';               // 2 bytes

//Boolean Type
boolean myBoolBoolean = true;         // 1 bit



//Operators

int x = 5;
int y = 3;

//Arithmetic Operators


//Addition
System.out.println(x + y); // Outputs 8

//Subtraction
System.out.println(x - y); // Outputs 2

//Multiplication
System.out.println(x * y); // Outputs 15

//Division
System.out.println(x / y); // Outputs 1

//Relational(Comparison) Operators
System.out.println(x == y); // Outputs false
System.out.println(x != y); // Outputs true
System.out.println(x > y); // Outputs true
System.out.println(x < y); // Outputs false
System.out.println(x >= y); // Outputs true
System.out.println(x <= y); // Outputs false
 
//Logical Operators
System.out.println(x < 5 &&  x < 10); // Returns true because 5 is less than 10
System.out.println(x < 5 || x < 4); // Returns false because neither of the conditions are true


//Bitwise Operators
System.out.println(x & y); // 1
System.out.println(x | y); // 7
System.out.println(x ^ y); // 6
System.out.println(~x); // -6
System.out.println(x << 1); // 10
System.out.println(x >> 1); // 2

//Assignment Operators


x += 3; // x = x + 3
System.out.println(x); // Outputs 8
x -= 3; // x = x - 3
System.out.println(x); // Outputs 5
x *= 3; // x = x * 3
System.out.println(x); // Outputs 15
x /= 3; // x = x / 3
System.out.println(x); // Outputs 5
x %= 3; // x = x % 3
System.out.println(x); // Outputs 2

//Unary Operators
System.out.println(x); // Outputs 2
System.out.println(++x); // Outputs 3
System.out.println(x); // Outputs 3
System.out.println(x++); // Outputs 3
System.out.println(x); // Outputs 4
System.out.println(--x); // Outputs 3
System.out.println(x); // Outputs 3


//Ternary Operator
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";

        System.out.println(result);
        System.out.println("Unary Operators :" + x + ++x + x++ + --x + x);
        System.out.println("Assignment Operators :" + (x += 3) + (x -= 3) + (x *= 3) + (x /= 3) + (x %= 3));
        System.out.println("Bitwise Operators :" + (x & y) + (x | y) + (x ^ y) + (~x) + (x << 1) + (x >> 1));
        System.out.println("Relational(Coparison)Oerators :" + (x == y) + (x != y) + (x > y) + (x < y) + (x >= y) + (x <= y));
        System.out.println("Logical Operators :" + (x < 5 &&  x < 10) + (x < 5 || x < 4) + !(x < 5 && x < 10)); 
        System.out.println("Variable :" + myNum+myDoubleNum+myLetter+myBool+myText);
        System.out.println("Data Types :" + myNumByte+myNumShort+myNumInt+myNumLong+myNumFloat+myNumDouble+myLetterChar+myBoolBoolean); 
        System.out.println("Airthmetic Operators :" + (x + y) + (x - y) + (x * y) + (x / y) + (x % y));
    }
}
