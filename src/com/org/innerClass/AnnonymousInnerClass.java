package com.org.innerClass;

class Parent
{
    public void show()
    {
        System.out.println("Showing parent skill ");
    }
}

// suppose for a limited use only we want to change the implementations of the method by extending the class
class Child extends Parent
{
    public void show()
    {
        System.out.println("Showing child skill ");
    }
}


// also suppose if we have an abstract class and we want to provide the implementations of it sub-class, then also we can use the anonymous inner class
abstract class Needed
{
    abstract void show();
}
public class AnnonymousInnerClass {
    public static void main(String[] args) {


        // but instead we can use the anonymous inner clas
        Parent p = new Parent()
        {
            public void show()
            {
                System.out.println("Showing child skill ");
            }
        };
       Parent p2= new Child();
        p2.show();



        Needed need = new Needed()
        {
            public void show()
            {
                System.out.println("Showing parent skill ");
            }
        };

        need.show();
    }
}
