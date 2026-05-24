package com.core.backToBasicOOPS.part1.interfaceClass;

//interface -> pure what , not how ?
// pure abstraction but still changing after java 8 , with default method, static methods with body we can add

// it defines the roles/ responsibilities example:
//interface Flyable
//{
//    void fly();
//}

// so for the classes like, Bird and Airplane needs to follow the contract to implement the fly methods to give
// their own implements to be flyable.


// Abstract class
//families of similar objects
interface Flyable
{
      void defineImp();

}

class AirPlane implements Flyable
{
    @Override
      public  void defineImp() {  // need to declare as public as if we remove if becomes default, which is less level than public as interfaces all methods are default public and abstract
        System.out.println("Air plane defined");
        System.out.println("it can now able to fly ");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

          Flyable fly1 = new AirPlane();
        fly1.defineImp();


    }
}
