package com.org.java8features;


interface Demo
{
       default void add(int a , int b  )
       {
           System.out.println(a+b);
       }
}

class Implementing implements  Demo
{
    public void add(int a , int b )
    {
        System.out.println(a+b );
    }
}
public class DefaultMethodColliisionHandlingClass {
    public static void main(String[] args) {

    }

    public void callParent ()
    {
    }
}
