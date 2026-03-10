package com.org.java8features.consumerpr;

import java.util.function.Consumer;

public class ConsumerClass {
    public static void main(String[] args) {
//        Consumer = takes data → does something with it → returns nothing
        // method - default - accept()
        Consumer<Integer> consume = s -> {
            System.out.println(s);
        };
//        consume.accept(11);

       Consumer<Integer> returnGreatThan10 = s-> System.out.println(s+10);
       Consumer<Integer> finalToDo = consume.andThen(returnGreatThan10);
       finalToDo.accept(44);

    }


    /*/*
Difference between Consumer and Function.identity()

1. Consumer
-----------
- Consumer is a functional interface from java.util.function package.
- It accepts a single input and performs an operation on it.
- It does NOT return any value.

Method:
void accept(T t)

Example Use Cases:
- Printing values
- Logging
- Modifying objects
- Used in forEach()

Example:
Consumer<String> c = x -> System.out.println(x);
c.accept("Java");


2. Function.identity()
----------------------
- identity() is a static method of the Function interface.
- It returns a function that simply returns the same input value.
- It does not modify the input.

Equivalent lambda:
x -> x

Method:
T apply(T t)

Common Use Cases:
- Streams API
- Collectors.toMap()
- When key and value are same

Example:
Function<String,String> f = Function.identity();
System.out.println(f.apply("Java")); // returns "Java"


Key Difference
--------------
Consumer
Input -> performs action -> no return

Function.identity()
Input -> returns same input
*/

}
