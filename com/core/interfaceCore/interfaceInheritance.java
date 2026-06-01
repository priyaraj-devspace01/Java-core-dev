package com.core.interfaceCore;


/// After java 8 we can also declare default and static method where we can also give the boddy of the methods
interface Vehicle
{

    static void move()
    {
        System.out.println("moving ");
    }
    default void brake()
    {
        System.out.println("applying default brakes to the car . ");
    }

    private void accelerate()
    {
        System.out.println("applying accelerates to the car . ");
    }
    // only a static method can a private method if it's either static else we need a reference of the interface to call it

    static void drive(Vehicle vh)
    {
        System.out.println("vehicle is driving . ");
        vh.accelerate();


    }

    // we can also declare the private methods inside an interface as well

}

interface Animal
{
    void eat();
}

interface Dog extends Animal
{
    void bark();
}

class BlackDog  implements Dog
{
    @Override
    public void eat() {
        System.out.println("Black Dog eat");
    }
    @Override
    public void bark() {
        System.out.println("Black Dog bark");
    }
}
public class interfaceInheritance {
    public static void main(String[] args) {
        // Multiple inheritance
        Animal animal = new BlackDog();
        animal.eat();

        Dog dog = new BlackDog();
        dog.bark();




    }
}
