package com.org.java8features;

interface Face1
{
    default void add(int a, int b )
    {
        System.out.println("one");
        System.out.println(a+b);
    }
}

interface Face2
{
    default void add(int a, int b)
    {
        System.out.println("two");
        System.out.println(a+b);
    }
}

class ImplementTo implements Face1, Face2
{
    public void add(int a , int b )
    {
        Face1.super.add(a,b);
        Face2.super.add(a, b);
        System.out.println("completed both ");
    }
}

public class DefaultCollisionsWithINterfaceClass {
    public static void main(String[] args) {
        ImplementTo implement = new ImplementTo();
        implement.add(22,22);

    }


}
