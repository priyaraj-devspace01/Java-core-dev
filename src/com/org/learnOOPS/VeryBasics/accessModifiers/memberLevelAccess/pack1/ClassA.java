package com.learnBasicsToStartOOPS.accessModifiers.memberLevelAccess.pack1;


// Member level access specifier standard:
/*
out of private, public, default, protected
 // it is always recommended to use members those are variables as private and
 // all the methods to be public


 public - access from anywhere
 private - only accessible inside the class only
 default - only accessible only inside the same package
 protected - only accessible inside the same package or outside the package for child classes.

 */
public class ClassA {
    private String name = "Liku";
    public void sayHii()
    {

        System.out.println("Hello ");
    }
     void sayGoodBye()
     {
         System.out.println("Goodbye ");
     }

    protected void sayBye()
    {
        System.out.println("Bye ");
    }
    private void sayGreet()
    {
        System.out.println("Hello ");
    }


}



class Main
{
    public static void main(String[] args) {
        ClassA a = new ClassA();
//        System.out.println(a.name);
//        a.sayGreet(); // can't be accessible from here




    }
}



