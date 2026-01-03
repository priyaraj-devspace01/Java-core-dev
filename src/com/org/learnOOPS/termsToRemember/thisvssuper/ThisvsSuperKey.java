package com.org.learnOOPS.termsToRemember.thisvssuper;
class Parent
{
    int age;
    int marks = 100;
//    public Parent()
//    {
//        System.out.println("Parent Constructor");
//    }

    public Parent(int age)
    {
        this.age = age;
        /*
        Uses of this .
         "this" keyword ensures that we're referring to the current object's instance variables,
         especially when there's a naming conflicts between parameters and fields. That's why it's so commonly
          used in constructors and setters.

         */
        System.out.println("Parent age is "+ age);
    }
}

class Child extends Parent
{
    int age;
    public Child(int age)
    {

        // REMEMBER:
        /*
          To access the parameterized constructor in the parent class,
          the child class must explicitly call it using super with the required
          arguments.
          for example, in  child's constructor, we can pass the necessary values to super, ensuring
          it matches the parent's parameterized constructor. This way,we avoid the no-parameter constructor
          error entirely.
          [ Even if the parent class has no no-parameter constructor present which is normally required]
         */
        super(44);
        this.age = age;
    }

    public void childAge()
    {
        System.out.println("Child Age"+ age);
        System.out.println("Parent mark is : "+ super.marks);


        // Super Keyword.
         /*
         The super keyword helps you access the parent class, either by calling the constructor with parenthesis
         or by accessing the parent methods and variables with dot notation. This way, you can clearly differentiate
         between child and parent attributes or methods, especially when they have the same name.

          */
    }
}

public class ThisvsSuperKey {
    public static void main(String[] args) {


//        Parent p = new Parent(10);


        Child c = new Child(32);
        c.childAge();



    }
}
