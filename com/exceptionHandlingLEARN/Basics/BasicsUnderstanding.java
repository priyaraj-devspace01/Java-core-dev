package com.exceptionHandlingLEARN.Basics;

public class BasicsUnderstanding {
    public static void main(String[] args) {
        int a = 22;
        int b = 0;


//        System.out.println(a/b); // / by zero exception -arithmetic- controlled by jvm only - default(not handled the exception)



        // but if we gracefully handle this to not even come - it's the preventive measure but instead of controlling we just skipping it
//        if(b == 0 )
//        {
//            System.out.println("can't be the value of b to be 0 ");
//        }else {
//            System.out.println(a/b);
//        }



        /// instead of all this we need to handle the exceptions before it throws an exception in a uncontrolled manner and disrupts the programs control flow
       //// how java tracks the stack for exception

        methodA(a, b);
    }

    public static void methodA(int a, int b) {
        methodB(a,b);
    }
    public static void methodB(int a, int b) {
        System.out.println(a/b);
    }
}
