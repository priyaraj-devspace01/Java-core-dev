package com.core.foundation;

public class Functions {
    public static void main(String[] args) {
        printName("raju ");

    }
    //1) no i/p and no o/p
    public void greet()
    {
        System.out.println("hello");
    }

    //2) i/o and no o/p
    public  static void printName(String name)
    {
        System.out.printf( "the name of yours is  %s", name);
    }

    //3) no i/p but give o/p
    public double randomName()
    {
        return Math.random()*10;
    }

    // i/p with o/p

    public int add(int a, int b)
    {
        return a+b;
    }
}
