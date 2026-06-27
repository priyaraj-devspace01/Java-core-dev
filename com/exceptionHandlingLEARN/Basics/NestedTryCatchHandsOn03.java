package com.exceptionHandlingLEARN.Basics;

public class NestedTryCatchHandsOn03 {
    public static void main(String[] args) {
//        try
//        {
//            System.out.println("outer try starts : ");
//             try
//             {
//                 System.out.println("Inner try starts : ");
//                 System.out.println(44/0);  //-> exception
//                 System.out.println("inner try ends ");
//             }catch (ArithmeticException e)
//             {
//                 System.out.println("can't divide by zero : inner");
//             }
//
//
//            System.out.println("Outer try ends");
//        }catch (ArithmeticException e)
//        {
//            System.out.println("divide by zero not allowed : outer ");
//        }
//    }



        // outer try handle the inner exception

        try
        {
            System.out.println("outer try starts : ");
             try
             {
                 System.out.println("Inner try starts : ");
                 System.out.println(44/0);  //-> exception
                 System.out.println("inner try ends ");
             }catch (NullPointerException e) /// as it is not handle by it, now it go for the parent try whether it's handling this /zero exception or not
             {
                 System.out.println("can't divide by zero : inner");
             }


            System.out.println("Outer try ends");
        }catch (ArithmeticException e)
        {
            System.out.println("divide by zero not allowed : outer ");
        }



        /// we can also add the try-catch block inside the catch block as well
        try
        {
            System.out.println(1/0);
        }catch(ArithmeticException e)
        {
            try
            {
                System.out.println(22/0);
                System.out.println("inner try ends");

            }catch (ArithmeticException f)
            {
                System.out.println("divide by zero not allowed : inn-inner ");
            }
        }
    }

    /// avoid to use the nested-try-catch which leads to complexity of understand the control handling of exception
}
