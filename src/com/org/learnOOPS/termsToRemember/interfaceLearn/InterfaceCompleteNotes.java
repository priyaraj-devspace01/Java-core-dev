package com.org.learnOOPS.termsToRemember.interfaceLearn;

/*
 ================================
  JAVA INTERFACE – COMPLETE NOTES
 ================================

 1. Interface = Contract (what to do, not how)
 2. Supports multiple inheritance
 3. Cannot be instantiated
 4. No constructors
 5. Fields are public static final by default
 6. Methods are public abstract by default (before Java 8)

 ---- MODERN JAVA ----
 Java 8:
  - default methods
  - static methods
  - functional interfaces
  - lambda expressions

 Java 9:
  - private methods in interfaces
*/

// ---------- INTERFACE DEFINITION ----------
@FunctionalInterface // ensures only ONE abstract method
interface MyInterface {

    // 1. ABSTRACT METHOD (public abstract by default)
    void run();

    // 2. DEFAULT METHOD (Java 8)
    default void info() {
        log("Default method executed");
    }

    // 3. STATIC METHOD (Java 8)
    static void help() {
        System.out.println("Static method in interface");
    }

    // 4. PRIVATE METHOD (Java 9)
    // Used only inside interface to avoid code duplication
    private void log(String msg) {
        System.out.println(msg);
    }

    // 5. VARIABLES IN INTERFACE
    // public static final by default
    int MAX = 100;
}

// ---------- CLASS IMPLEMENTING INTERFACE ----------
class MyClass implements MyInterface {

    // Must implement abstract method
    @Override
    public void run() {
        System.out.println("run() implemented in class");
    }
}

// ---------- MULTIPLE INTERFACE INHERITANCE ----------
interface A {
    default void show() {
        System.out.println("A show()");
    }
}

interface B {
    default void show() {
        System.out.println("B show()");
    }
}

// Diamond problem resolved by overriding
class Diamond implements A, B {
    @Override
    public void show() {
        A.super.show(); // explicit choice
    }
}

// ---------- MAIN CLASS ----------
public class InterfaceCompleteNotes {

    public static void main(String[] args) {

        // 6. INTERFACE REFERENCE
        MyInterface obj = new MyClass();
        obj.run();
        obj.info();

        // 7. STATIC METHOD CALL
        MyInterface.help();

        // 8. INTERFACE CONSTANT
        System.out.println(MyInterface.MAX);

        // 9. FUNCTIONAL INTERFACE + LAMBDA
        MyInterface lambdaObj = () -> System.out.println("Running using lambda");
        lambdaObj.run();

        // 10. DIAMOND PROBLEM DEMO
        Diamond d = new Diamond();
        d.show();
    }
}

/*
 ================================
  IMPORTANT INTERVIEW NOTES
 ================================

 ✔ Interface cannot have constructors
 ✔ Interface supports multiple inheritance
 ✔ Class can implement multiple interfaces
 ✔ Interface can extend another interface
 ✔ Default methods can be overridden
 ✔ Static methods cannot be overridden
 ✔ Private methods are helpers only
 ✔ Functional interface → one abstract method
 ✔ Lambda works ONLY with functional interface

 ----------------
 INTERFACE vs ABSTRACT CLASS
 ----------------
 Interface:
  - Multiple inheritance
  - No constructors
  - All fields are constants
  - Focus on WHAT

 Abstract class:
  - Single inheritance
  - Constructors allowed
  - Instance variables allowed
  - Focus on WHAT + HOW
*/
//🧠 ONE-LINE MEMORY RULE
//Interface defines a contract, modern Java allows behavior through default, static, and private methods while keeping multiple inheritance safe.
//

