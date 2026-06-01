package com.core.interfaceCore;
interface A
{
    void show();
}

interface B extends A{
    @Override
   default void show(){
        System.out.println("show by interface B");
    }
}

interface C extends A{

    @Override
    default void show(){
        System.out.println("show by interface c");
    }
}

class Main implements B, C{
    @Override
    public void show() {
//        System.out.println("I am Main");
        // Here, instead of depending on interface implementation it is always going to give the implementation by our own
        // so there is no chance of diamond problem

        // also instead of always taking our own implementation, if the parent interface have their default method we can call them as well
        B.super.show();
        C.super.show();
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        A a  = new Main();
        a.show();



    }
}
