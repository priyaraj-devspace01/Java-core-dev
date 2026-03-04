package com.org.java8features;

interface MyInterface
{
//    public void print();
    default int add(int a, int b)
    {
        return a+b;
    }
     default void sayHello()
     {
         System.out.println("Hello");
     }

     default double findLogic(double a, double b)
     {
         return a-b*b+a/b;
     }
}

public class DefaultMethodExtraaClass {
    public static void main(String[] args) {
        // if there is more than one default method inside the interface, we don't need to create a subclass always
        // if in any case we don't have any public abstract method inside the interface we can use the anonymous inner class once, if don't want to override
        // to call any of the default method as they have their own body at the time of declaration.

        MyInterface my = new MyInterface() {};
        System.out.println(my.add(10, 20));
        my.sayHello();
        System.out.println(my.findLogic(22.22, 22.21));


    }
}
