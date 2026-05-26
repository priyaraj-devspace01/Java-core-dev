package com.core.backToBasicOOPS.part1.NestedClassDay19.type3LocalInnerClass;


class Outer{
    public void greet()
    {
        int x = 10;
        class Local
        {
            int x = 20; // it will shadow the value of outer class
            // but if it is commented then it will take the outer class variable value


            // Effectively final variable
            int y = 22;
//            y++;
            void printHello()
            {
                System.out.println("Hello . " + x);
                System.out.println("y : "+ y );
                // at this point we can use y, when it's not modified. but at the point it's modified to some other value it will not allow us to use that
            }
        }
        Local local = new Local();
        local.printHello();
    }
}
public class MainLocalInnerClassDemo {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.greet();
    }
}
