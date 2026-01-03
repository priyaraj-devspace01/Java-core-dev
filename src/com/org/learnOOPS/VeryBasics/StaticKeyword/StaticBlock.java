package com.org.learnOOPS.VeryBasics.StaticKeyword;

public class StaticBlock {
    static
    {
        System.out.println("I am inside the static block"); // 1st will print it


    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.org.learnOOPS.VeryBasics.StaticKeyword.StaticBlock");
        // even the line below is inside the main method where the every program start their execution,
//          the  static block is going to execute first because,Static blocks execute when the class is loaded into JVM memory.
//
//Here:
        System.out.println("I am inside the main block"); // 2nd
    }
}

/* Interview points...
Class.forName() vs ClassLoader.loadClass()

Class.forName("Target");  --------------------->        // loads + initializes (static block runs)
ClassLoader.loadClass("Target");--------------->         // loads ONLY (static block may NOT run)
 */
