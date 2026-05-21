package com.core.foundation.Day01;

public class MethodOverloading {
    public static void main(String[] args) {

        int ans = add(223,22.4);
        System.out.println("added result is  : " + ans);
        // basically, the decision to which method to be called was decided on the compile time only,
//        based on the parameter order, type, difference in their counts
        // therefore, it's also known as static polymorphism,
//        - Compile-Time Polymorphism
//                - Static Polymorphism
//                - Early Binding
    }

    public static int  add(int a, int b)
    {
        return a+b;
    }
    // not eligible - by just changing the return type of the method
//     public static double add(int b, int a)
//     {
//         return (double)(b+a);
//     }


    // not eligible - by just changing the order of the parameters
//    public int add(int b, int a)
//    {
//        return b+a;
//    }


    // but
    public static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    // valid

    public static  int add(int a, double b)
    {
        return (int) (a+b);
    }
}
