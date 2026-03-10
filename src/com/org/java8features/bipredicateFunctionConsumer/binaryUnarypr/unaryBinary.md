```
In Java functional interfaces, UnaryOperator and BinaryOperator are special cases of Function.

1️⃣ UnaryOperator

A UnaryOperator takes one input and returns the same type as the input.

Meaning:
Input type = Output type

Example:

UnaryOperator<Integer> square = x -> x * x;

System.out.println(square.apply(5)); // 25

Structure:

T -> T

Example meaning:

Integer -> Integer
String -> String
Double -> Double

So yes — input and output types are the same.

2️⃣ BinaryOperator

A BinaryOperator takes two inputs of the same type and returns the same type.

Structure:

(T, T) -> T

Example:

BinaryOperator<Integer> add = (a, b) -> a + b;

System.out.println(add.apply(5, 3)); // 8

Here:

Integer, Integer -> Integer



```