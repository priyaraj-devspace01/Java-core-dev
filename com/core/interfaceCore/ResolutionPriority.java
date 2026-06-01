package com.core.interfaceCore;

interface Plane
{
   default void fly()
   {
       System.out.println("Flying via normal plane . ");
   }
}

class FighterPlane
{
    public void fly()
    {
        System.out.println("Flying via fighter plane . ");
    }

}


class Demo extends FighterPlane implements Plane
{
    @Override    // it overrides both the fly methods
       public void fly()
       {
           System.out.println("Just flying via either plan or using a fighter plane");
       }
}

public class ResolutionPriority {
    public static void main(String[] args) {
          Demo  d  = new Demo();
//          d.fly(); // it should always call the FighterPlane method

        // but if we want to give our own implementation we can give inside the implementing class
        d.fly(); // always call the override method implementation for the subclass

    }

    // Resolution Priority Rule:
// If a class inherits a method from a superclass and also inherits a
// default method with the same signature from an interface, the
// superclass method takes precedence over the interface's default method.
//
// In short: Class methods always win over interface default methods.
//
// If a different behavior is needed, the implementing class can override
// the method and provide its own implementation.




    /// Interface vs Abstract class
    /*
     1) Interface - contract( roles /functionalities) - class Airplane implements Flyable ( can-do relationship)
     2) Abstract class - families of similar class  - class Animal - (dog, cat, cow) - (is-a-relationship)



     Interface              vs            Abstract class
     fields( x)                            fields(true)
     interface a{                         abstract class A
          int x = 22; (x)                 { int a  = 33;
      }                                    }
      multiple inheritance                 false(no multiple inheritance)
      methods - can be of                   Methods can be of - of any(private.protected, public)
        either, private or public

     */

}
