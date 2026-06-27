package com.exceptionHandlingLEARN.Basics;

public class Basic02ExceptionHandling {
    public static void main(String[] args) {
        try
        {
            System.out.println(3/0);        ///// risky operation
        }catch (ArithmeticException e)
        {
            System.out.println(e.getCause());  /// preventive measures to handle the exception
        }
    }
}
