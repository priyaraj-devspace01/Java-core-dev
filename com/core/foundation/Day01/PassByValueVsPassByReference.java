package com.core.foundation.Day01;

public class PassByValueVsPassByReference {
    public static void main(String[] args) {
        int a  = 22;
        int b = 34;
        System.out.println("before swapping : ");
        System.out.println("a : "+a);
        System.out.println("b "+ b );

        swap(a,b);

        System.out.println();

        System.out.println("Even after the swapping the original value for a, and b is below remain unchanged . ");
        System.out.println("after swapping : ");
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);



    }

    public static void swap(int a , int b){
        System.out.println();
        System.out.println();
        System.out.println("initially inside method .  ");
        System.out.println("a : "+a);
        System.out.println("b : "+ b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("inside the method after swapping : ");
        System.out.println("the value of a is : "+a);
        System.out.println("the value of b is : "+b);
    }
}
