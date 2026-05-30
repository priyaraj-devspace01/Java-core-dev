package com.core.objectClassAbout.coreMethods;


class Animal
{

}

class Dog extends Animal
{

}
public class instanceOfOperator {
    public static void main(String[] args) {
        // instanceOf - check if an object is instance of a class or any of it's sub class


        Student s1 = new Student(101, "ram");
        System.out.println(s1 instanceof Student);
        System.out.println(s1 instanceof Object);


        Animal a1 = new Animal();
        Animal a2 = new Dog();
        System.out.println("a1 classname : " + a1.getClass().getName());
        System.out.println("a2 classname "  + a2.getClass().getName());


        System.out.println(  (a1 instanceof Animal));
        System.out.println(a2 instanceof Animal);
        System.out.println(a2 instanceof Dog);


        // but the parent class a1 is not instance of a2 child
        System.out.println(a1 instanceof Dog);


    }
}
