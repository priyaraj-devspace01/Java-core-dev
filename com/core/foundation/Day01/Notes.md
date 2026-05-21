# Java Basics Interview Notes

# 1. Why Java Came?

Before Java, languages like C and C++ were platform dependent.

After compilation, source code directly converted into machine-specific executable files (`.exe`). These executable files were OS dependent, meaning code compiled for one operating system could not run easily on another operating system.

Java solved this problem using:
- Bytecode
- JVM (Java Virtual Machine)

Instead of converting directly into machine code, Java converts source code into an intermediate format called **bytecode** (`.class` file).

The JVM present on different operating systems converts this bytecode into machine-level instructions at runtime.

This introduced the concept:

> Write Once, Run Anywhere (WORA)

---

# 2. Java Execution Flow

```text
.java file
   ↓
javac compiler
   ↓
.class file (Bytecode)
   ↓
JVM
   ↓
Machine-level instructions
   ↓
CPU Execution
```

---

# 3. JDK, JRE, JVM

## JDK (Java Development Kit)

JDK is used for developing Java applications.

It contains:
- javac compiler
- debugger
- documentation tools
- JRE

### Purpose
Development of Java applications.

---

## JRE (Java Runtime Environment)

JRE provides the environment required to run Java applications.

It contains:
- JVM
- required libraries
- runtime files

### Purpose
Running Java applications.

---

## JVM (Java Virtual Machine)

JVM is responsible for executing Java bytecode.

It:
- loads bytecode
- verifies bytecode
- converts bytecode into machine-level instructions
- executes program

### Important Point

- JVM is platform dependent
- Java bytecode is platform independent

---

# Hierarchy

```text
JDK
 └── JRE
      └── JVM
```

---

# 4. Features of Java

## 1. Platform Independent

Java uses bytecode and JVM, allowing the same code to run on multiple operating systems.

---

## 2. Secure

Java avoids direct pointer manipulation like C++, reducing risks such as:
- memory corruption
- unauthorized memory access

Java programs also run inside JVM sandbox environment.

---

## 3. Automatic Garbage Collection

Java automatically removes unused or unreferenced objects from memory.

Benefits:
- reduces manual memory management
- prevents memory leaks
- improves stability

---

## 4. Robust

Java is robust because of:
- exception handling
- strong type checking
- automatic memory management

---

## 5. Multithreaded

Java supports multithreading, allowing multiple tasks to execute simultaneously.

Benefits:
- better performance
- responsiveness

---

## 6. Object-Oriented

Java follows OOP principles:
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

Benefits:
- modularity
- reusability
- maintainability

---

# 5. Variables

## Declaration

Creating variable with datatype and name.

```java
int a;
```

---

## Initialization

Assigning value to variable.

```java
a = 10;
```

---

## Definition

Declaration + memory allocation together.

```java
int a = 10;
```

---

# 6. Primitive vs Non-Primitive Data Types

## Primitive Data Types

Store actual values directly.

Examples:
```java
int
char
boolean
double
```

---

## Non-Primitive / Reference Data Types

Store references to objects.

Examples:
```java
String
Array
Objects
```

---

# 7. Memory Allocation

## Stack Memory

Stores:
- local variables
- method calls
- references

---

## Heap Memory

Stores:
- objects
- instance variables

---

# Example

```java
String s = new String("Java");
```

## Stack
```text
s → reference
```

## Heap
```text
"Java" object
```

---

# 8. Methods

## Definition

A method is a reusable block of code that performs a specific task.

Benefits:
- reusability
- readability
- maintainability
- modularity

---

# Method Declaration

```java
void display();
```

---

# Method Definition

```java
void display() {
    System.out.println("Hello");
}
```

---

# Method Invocation

```java
display();
```

---

# 9. Method Overloading

Method overloading means:
- same method name
- different parameters

Can differ by:
- number of parameters
- datatype of parameters
- order of parameters

---

## Important Point

Method overloading CANNOT happen only by changing return type.

Invalid Example:

```java
int add()
double add()
```

---

# 10. Pass By Value vs Pass By Reference

## Java is ALWAYS Pass By Value

---

## Primitive Types

Actual value gets copied.

```java
int a = 10;
```

---

## Objects

Reference value gets copied.

```java
Student s = new Student();
```

Still technically:
> Pass by value only.

---

# 11. Strings

## String Immutability

Strings are immutable in Java.

Once created, their values cannot be changed.

Any modification creates a new object.

---

# Advantages of Immutability

## Security
Used safely in:
- URLs
- database connections
- file paths

---

## Thread Safety
Immutable objects are safer in multithreading.

---

## Memory Optimization
Supports String Constant Pool reuse.

---

# 12. String Literal vs new String()

## String Literal

```java
String s1 = "Java";
```

Stored in:
- String Constant Pool

Reused if already exists.

---

## new String()

```java
String s2 = new String("Java");
```

Always creates new object in heap memory.

---

# 13. == vs .equals()

## ==

Checks:
- reference comparison
- memory address comparison

---

## .equals()

Checks:
- content/value comparison

---

# Example

```java
String a = "Java";
String b = "Java";

System.out.println(a == b); // true
```

Because both refer to same SCP object.

---

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b); // false
System.out.println(a.equals(b)); // true
```

---

# 14. String Constant Pool (SCP)

SCP is a special memory area inside heap used to store string literals.

Purpose:
- avoid duplicate object creation
- improve memory optimization
- reuse existing string objects

---

# 15. Arrays

## Definition

An array is a collection of similar datatype elements stored in contiguous memory locations.

---

# Why Arrays?

Used to:
- store multiple values using single variable
- improve data management

---

# Example

```java
int arr[] = {1,2,3};
```

---

# Array Access

```java
System.out.println(arr[1]);
```

Output:
```text
2
```

---

# Limitations of Arrays

- fixed size
- same datatype only
- memory wastage possible
- insertion/deletion costly

These limitations led to Collections Framework.

---

# 16. Difference Between length, length(), size()

## Array

```java
arr.length
```

---

## String

```java
str.length()
```

---

## Collection

```java
list.size()
```

---

# Important Interview Points

## Java does NOT normally generate `.exe`

Java creates:
```text
.class (bytecode)
```

JVM executes bytecode dynamically.

---

## JVM internally uses:
- Interpreter
- JIT Compiler

to convert bytecode into machine-level instructions at runtime.

---

# Java Main Method Breakdown

```java
public static void main(String[] args)
```

This is the entry point of a Java application. JVM starts execution from the `main()` method.

---

# 1. public

`public` is an access modifier.

It makes the `main()` method accessible from anywhere.

Why needed?
- JVM should be able to access and execute the method from outside the class.

---

# 2. static

`static` means the method belongs to the class rather than object.

Why needed?
- JVM can call `main()` directly without creating object of class.

Without static:
- object creation would be required first.

---

# 3. void

`void` means the method does not return any value.

Why?
- JVM does not expect any value back from `main()`.

---

# 4. main

`main` is the predefined method name recognized by JVM.

JVM specifically searches for:

```java
main()
```

as the starting point of program execution.

---

# 5. String[] args

Used to accept command-line arguments.

- `String[]` → array of Strings
- `args` → variable name

Example:

```bash
java Test hello world
```

Then:

```java
args[0] = "hello"
args[1] = "world"
```

---

# Example Program

```java
public class Test {

    public static void main(String[] args) {

        System.out.println("Hello Java");

    }

}
```

---

# Execution Flow

```text
JVM
 ↓
Searches main()
 ↓
Calls main()
 ↓
Program execution starts
```

---

# Important Interview Points

## Can we change:
- `args` variable name?
  ✅ Yes

Example:

```java
public static void main(String[] abc)
```

---

## Can we overload main()?
✅ Yes

But JVM only calls:

```java
public static void main(String[] args)
```

---

## Can main() be final?
✅ Yes

---

## Can main() be synchronized?
✅ Yes

---

# Most Important Point

```java
public static void main(String[] args)
```

is the standard method signature used by JVM as the entry point of Java application execution.

# Note for command line argument:
- `System.out.println("hello")` prints a hardcoded String literal directly written inside the code and has no relation to `String[] args`.
- `String[] args` is used to receive dynamic runtime inputs (command-line arguments) passed by user during program execution.
- Clicking Run button normally passes an empty `String[] args`, unless program arguments are configured manually.