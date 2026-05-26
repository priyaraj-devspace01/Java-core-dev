package com.core.backToBasicOOPS.part1.abstractionClass.abstractClassDetail;


abstract class Animal
{

    String name;
    Animal(String name)
    {
        this.name = name;
    }
    abstract void makeSound();
    public void eat()
    {
        System.out.println("i also eat ");
    }



}

class Dog extends Animal
{
    Dog(String name)
    {
        super(name);
    }


    public void makeSound()
    {
        System.out.println("Barking . .."+name);
    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("bruno");
        dog.makeSound();
        dog.eat();

    }



    /// SCENARIOS :

    /*
           1) CAN AN ABSTRACT CLASS HAS CONSTRUCTORS ?
                 ANS: Yes,
                   BCZ, Abstract classes can have constructors because constructors are needed to initialize the parent part of subclass objects during object creation.

           2) Can be an abstract class be final ?
           // as making final the class we are not able to override the abtract methods inside the subclass, which is not allowed

           3) Can we declare static variable and static method and static block inside an abstract class ?
           // Yes, BECAUSE  - even if we are not able to create the object of the abstract class but the static keyword main use is for making any variable, method as class associated.


           4) Can abstract classes have private method ?
               yes but non-abstract, Private methods in abstract classes are used for internal implementation logic that should not be exposed or overridden by subclasses.
                 but can be used inside the abstract class within it's class scope.

            5) Can abstract classes have final methods ?
              Yes-  as abstract class contains both abstract and non-abstract methods, we can make the non-abstract methods as final.

            6) Can an abstract class doesn't contain no abstract method ?
              Yes - bcz, sometime i only want to provide You want:
                           1. common/default behavior
                           2.partial implementation
                           3. prevent direct object creation
                           4. force usage through subclasses
               An abstract class without abstract methods is used to provide common functionality while preventing direct instantiation of the class.
                 */


}
