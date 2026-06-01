package com.core.interfaceCore;
interface Car
     // only have the abstract method
{
    void drive();
}

abstract class Thar implements  Car{
//    @Override
//    void drive()
//    {
//
//    }

    // we can't do that with more restrictive access specifier(as here default) than parent class

//    @Override
//    public void drive()
//    {
//        System.out.println("driving. ");
//    }

    // or

    abstract public void drive();
}


class BlackCar extends Thar{
    @Override
    public void drive() {
        System.out.println("Finally car is driven ");
    }
}
public class Day05Demo {
    public static void main(String[] args) {
        /// it defines the contract for the classes which are going to implement the behavior of the interface

    }
}
