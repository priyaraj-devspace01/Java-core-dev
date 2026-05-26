package com.core.backToBasicOOPS.part1.inheritanceConcepts;

class Parent {

    int x = 10;

    void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {

    int x = 20;

    void show() {

        // accessing parent class variable
        System.out.println("Parent x : " + super.x);

        // accessing child class variable
        System.out.println("Child x : " + this.x);

        // calling parent class method
        super.display();
    }
}

public class SuperKeyWord {

    public static void main(String[] args) {

        Child c = new Child();
        c.show();
    }
}