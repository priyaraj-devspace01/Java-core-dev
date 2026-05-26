package com.core.backToBasicOOPS.part1.additionals;

class College_Std {

    int id;
    String branch;
    String name;

    static String coll_name;
    static String location;

    static {
        coll_name = "IIT-K";
        location = "KANPUR";
        System.out.println("I am the static block which runs first");
    }
    public void sayHii()
    {
        System.out.println("I am at the object creation after static block");
    }
}

public class StaticBlock {

    public static void main(String[] args) throws ClassNotFoundException {

         College_Std college = new College_Std();
         college.sayHii();           ///2

        Class.forName("com.core.backToBasicOOPS.part1.additionals.College_Std");  ///1
        // IT ALWAYS RUN BEFORE THE OBJECT CREATION

        System.out.println("I am inside the main method");  ///3



    }


    /*
    ALWAYS REMEMBER :
    1) A ROOT CLASS CAN'T BE DECLARED AS STATIC AS INSIDE A PACKAGE NOT INSIDE A CLASS LEVEL AS THE RULE FOR STATIC
       BUT A NESTED CLASS CAN BE STATIC.
     */
}