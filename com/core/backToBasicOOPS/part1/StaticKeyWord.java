package com.core.backToBasicOOPS.part1;


class Car
{
    String name;
    double price;
    String color;


    static String brand;    // Also known as ->  class-variable -> not stored inside the heap memory


    // but what if, i only want to create the blueprint for brand BMW, for which don't want to assign the value "BMW" for every instance
    // then we can declare that field as static so that, it acts as a class field,can be access via className
    // we don't need to even initialize and also if modify by any instance will reflect to every instance of that class

    public Car(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }


    public void start()
    {
        System.out.println("car is starting  .. ");
//        demoDrive(); // when the method has no param.
        // HowEver, a non-static instance method can call a static method as it shared among all objects of the class
    }


    // static method
    public static void demoDrive(Car car)
    {
//       static int a = 22;  X

        /// NOTE :
//        static variables belong to the class and are stored in class-level memory.
//            Local variables belong to method stack memory, so Java does not allow static local variables inside methods in Java.
//


        System.out.println("Demo drive is in process. ");
//        System.out.println(name); ->  X

        // start();

        //  Because for this it doesn't know which instance start()  method to call as it is at the class level
        // problem occur - while invoking it -

    ///  CODE:-
       /// demoDriver() {
                // start(); // which is a non-static instance level method
        /// }
        // But we can explicitly can call the non-static method by providing the object reference as method parameter
          car.start();



        // but it has some limitation
         /*
            i) it can't call a non-static method
            ii) it can't access a non-static variables.
            iii) it doesn't have this() method as not referencing to the instance object level.
          */
    }

}
public class StaticKeyWord {
    public static void main(String[] args) {
        // used to make the fields and methods to be class level
        Car bmwM5 = new Car("BMWm5", 750000.21, "black");
        Car.brand = "BMW";

        // only need to intialize once, and then shared across every instance of the same class in future
        System.out.println(bmwM5.brand);

        Car bmwm4 = new Car("BMWm4 competition", 950000.21, "black");
        Car.brand = "BMWV2";


//        System.out.println(bmwM5.brand);
//        // now it same as bmwm4
//        System.out.println(bmwm4.brand);

        // we can directly call it using class name
//        Car.demoDrive();


        // call static method inside non-static method
//        bmwm4.start();



        // Call a non-static method inside a static method by giving the reference as argument for the static method
        Car.demoDrive(bmwM5);


    }
}
