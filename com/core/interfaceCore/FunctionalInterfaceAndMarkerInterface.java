package com.core.interfaceCore;


interface AB{
    void run();
}

class Bc implements AB{
    @Override
    public void run() {
        System.out.println("B");
    }
}


public class FunctionalInterfaceAndMarkerInterface {
    public static void main(String[] args) {
        /// 1)  Functional Interface
        // An Interface having only one abstract method are called, functional Interface

        // WHY ? - because they enabled java functional programming( using lambda expression)
        Bc b = new  Bc();
        b.run();




        ///2) Marker Interface
         /*A marker interface is an empty interface used to mark a class with special metadata or behavior.
             1) clonable interface
             2)  serializable interface
             3) RandomAccess
          */
    }
}
