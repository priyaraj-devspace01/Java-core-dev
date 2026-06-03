package com.core.day06.generics;


public class GenericMethods {
    public static void main(String[] args) {
         String x = getResult("Hello");
        System.out.println(x);
    }

    public  static <T> T getResult(T t)
    {
        return t;
    }

    // two parameters
    public static <T,V> void  printPair(T first, V second)
    {
        System.out.println("first  " + first + "second " + second);
    }

}


/// Generic Methods
// <T> return Type methodName (T parameter) { }