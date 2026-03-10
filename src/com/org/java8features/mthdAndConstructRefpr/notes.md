```
# Method Reference and Constructor Reference in Java

## 1. What is a Method Reference?

A **method reference** is a shorthand syntax for a lambda expression that **directly calls an existing method**.

Instead of writing a lambda that calls a method, we can **reference the method directly using `::`**.

General syntax:

```
ClassName::methodName
```

Example (Lambda):

```java
Consumer<String> printer = s -> System.out.println(s);
```

Using Method Reference:

```java
Consumer<String> printer = System.out::println;
```

Both perform the **same operation**, but method references make the code **cleaner and more readable**.

---

# 2. Why Method References?

Method references help to:

* Reduce boilerplate lambda code
* Improve readability
* Reuse existing methods

Example:

Lambda version:

```java
list.forEach(s -> System.out.println(s));
```

Method reference version:

```java
list.forEach(System.out::println);
```

---

# 3. Types of Method References

Java supports **four types** of method references.

---

## 3.1 Static Method Reference

Used when referencing a **static method of a class**.

Syntax:

```
ClassName::staticMethod
```

Example:

```java
class MathUtils {
    static int square(int x) {
        return x * x;
    }
}

Function<Integer, Integer> f = MathUtils::square;

System.out.println(f.apply(5));
```

Output:

```
25
```

Equivalent Lambda:

```java
Function<Integer, Integer> f = x -> MathUtils.square(x);
```

---

## 3.2 Instance Method Reference of a Particular Object

Used when referencing a **method of an existing object**.

Syntax:

```
objectReference::instanceMethod
```

Example:

```java
String str = "hello";

Supplier<String> s = str::toUpperCase;

System.out.println(s.get());
```

Output:

```
HELLO
```

Equivalent Lambda:

```java
Supplier<String> s = () -> str.toUpperCase();
```

---

## 3.3 Instance Method Reference of an Arbitrary Object of a Class

Used when the method belongs to an **instance of a class**, but the object is supplied later.

Syntax:

```
ClassName::instanceMethod
```

Example:

```java
Function<String, Integer> lengthFinder = String::length;

System.out.println(lengthFinder.apply("Java"));
```

Output:

```
4
```

Equivalent Lambda:

```java
Function<String, Integer> lengthFinder = s -> s.length();
```

Another common example:

```java
List<String> list = List.of("A", "B", "C");

list.forEach(System.out::println);
```

Equivalent Lambda:

```java
list.forEach(s -> System.out.println(s));
```

---

# 4. Constructor Reference

A **constructor reference** is used to create objects using a functional interface.

Syntax:

```
ClassName::new
```

Example class:

```java
class Student {

    int age;

    Student(int age) {
        this.age = age;
    }
}
```

Lambda version:

```java
Function<Integer, Student> creator = age -> new Student(age);
```

Constructor reference version:

```java
Function<Integer, Student> creator = Student::new;
```

Usage:

```java
Student s = creator.apply(21);
```

---

# 5. Method Reference with Streams

Method references are commonly used with **Streams API**.

Example:

```java
List<String> names = List.of("ram", "shyam", "hari");

names.stream()
     .map(String::toUpperCase)
     .forEach(System.out::println);
```

Equivalent Lambda version:

```java
names.stream()
     .map(s -> s.toUpperCase())
     .forEach(s -> System.out.println(s));
```

---

# 6. Key Rule for Method References

A method reference can only be used when a lambda expression **directly calls an existing method**.

Example:

Lambda:

```
x -> Math.abs(x)
```

Method Reference:

```
Math::abs
```

---

# 7. Quick Comparison Table

| Lambda Expression            | Method Reference      |
| ---------------------------- | --------------------- |
| `x -> Math.sqrt(x)`          | `Math::sqrt`          |
| `s -> s.length()`            | `String::length`      |
| `s -> System.out.println(s)` | `System.out::println` |
| `x -> new Student(x)`        | `Student::new`        |

---

# 8. Summary

Method references provide a **compact way to write lambda expressions** when the lambda only calls an existing method.

Java provides four types:

1. Static method reference → `ClassName::staticMethod`
2. Instance method reference of object → `object::method`
3. Instance method reference of class → `ClassName::instanceMethod`
4. Constructor reference → `ClassName::new`

They are heavily used with **Streams API, functional interfaces, and collection operations** to write cleaner functional-style Java code.

```