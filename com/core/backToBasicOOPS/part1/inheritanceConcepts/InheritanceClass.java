package com.core.backToBasicOOPS.part1.inheritanceConcepts;
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class InheritanceClass {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();
        dog.bark();



        /*
 Inheritance in Java

Definition:
Inheritance in Java is an OOP (Object-Oriented Programming) feature where one class acquires the properties and behaviors (variables and methods) of another class using the extends keyword.

It helps in:

Code reusability
Method overriding
Creating an IS-A relationship

/// Types of Inheritance:
1) single inheritance
2) multi-level inheritance -> A<-B<-C
3) Hierarchical inheritance -> A
                              / \
                             B   C


         */
    }
}
