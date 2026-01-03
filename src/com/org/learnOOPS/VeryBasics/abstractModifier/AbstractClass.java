package com.learnBasicsToStartOOPS.abstractModifier;

public class AbstractClass {

    // Points to know:
    /*
    In Java, if any class has at least one abstract method is there, then the class must be declared as an abstract class.
    But an abstract class can have both abstract and non-abstract class,
    An abstract class can't be instantiated.
    An abstract method has only declaration, no implementation.
    The class which extends the abstract class is going to provide implementation of abstract method inside the abstract class


     */

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("the car has "+ c.getNoOfGears() + " gears");
        c.accelerate();
        System.out.println("Now starting to accelerating the car .");
    }
}


abstract class Vehicle
{
    public void accelerate()
    {
        System.out.println("Accelerating ....");
        // Anyway, it is also incomplete
    }

    public abstract int getNoOfGears();
}


// so the class like, Car is going to give the full detail
//so
class Car extends Vehicle
{
    // needs to give body of all abstract class of "Vehicle"
    public int getNoOfGears()
    {
       return 5;
    }


}



