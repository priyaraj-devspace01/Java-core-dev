package com.core.backToBasicOOPS.part1.abstractionClass;

abstract class BaseCar
{

    public void start()
    {
        System.out.println(" Car Started  ");
    }

    abstract void accelerate();
    abstract void brake();
}


class FuelCar extends BaseCar
{

    // enforcing to implement the abstract methods
    @Override
     public void accelerate()
     {
         System.out.println("fuel car accelerating");
     }
     @Override
     public void brake()
     {
         System.out.println("fuel car braking");
     }
}


abstract class ECar extends FuelCar
{
     public void accelerate()
     {
         System.out.println("e-car accelerating");
     }
     public void brake()
     {
         System.out.println("e-car braking");
     }
}



public class AbstractionClass {
    public static void main(String[] args) {

        // In java , if any class contains abstract methods the class should be declared as abstract.
        // An abstract class can't be instantiated directly, can only be objected will be created by the implementing class
        // An abstract can contain both abstract and non-abstract methods.
//        but the classes which extending the abstract class will enforce to give the implementation for the abstract methods


        BaseCar car = new FuelCar(); // it depends on the run time which type car need to run
        car.accelerate();
        car.brake();
    }
}
