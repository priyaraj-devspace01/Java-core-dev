package com.org.learnOOPS.VeryBasics.classObject;
class Demo
{
    public int add(int num1, int num2)
    {
        return num1+num2;
    }

}
public class ObjectCreation {
    //  What is an object?
    /*
    An object is a real world entity, which has some attributes and some behaviours.
     In java, each object has some variables and some methods.
     example:A car can be an object having gears, wheels, mirror, steering as properties and accelerate(), brake(), moveBack() are the functions it can perform


     Class
     A class is a blueprint to create an object.
      class got compiled by compiler and then JVM which then execute the code and create the object.

      Example: Vehicle is a class and car is it's one of the object.


     */

    public static void main(String[] args) {

        // Let's create an object of a class
        Demo obj = new Demo();
        System.out.println(obj.add(22, 22));

    }
}


    class Calc
    {
        public int add(int a , int b)
        {
            return a+b;
        }
    }


class Main4
{
    public static void main(String[] args) {
        int ab = 33;

        Calc calc = new Calc();
        int res = calc.add(33,33);
        System.out.println(res);
    }
}

