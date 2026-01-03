package com.org.learnOOPS.termsToRemember.constructor;

/*
Things to Remember:
  1) The default no-parameter constructor is only provided if no constructors
  are defined. Once you define any constructor, like a parameterized one, Java does not
  auto-generate the no-parameterized constructor.
  So, you need to declare it explicitly if you want the child class to call a no-argument constructor.

 */

class Demo
{
//   public Demo() -----> Default constructor (TYPE -1)
//   {
//       super();
//   }

    //.......................
//     Even if don't mention Still going to be given by compiler during compilation.
    //By the time JVM sees the .class file,
    //👉 the constructor already exists.
    //.............................
}


class Demo2{
    public Demo2()               //--> (TYPE-2)
    {
        System.out.println("I am a no-args constructor . ");
    }

    public Demo2(String name) // ----> (TYPE-3)
    {
        System.out.println("I am a no-args constructor with name . "+name);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Demo demo = new Demo();
                   // only way to call a constructor,
                   // Here, even if the Demo class doesn't have any no-args constructor but still it given by Compiler.




        Demo2 demo2 = new Demo2();
        // calls the no-args constructor made explicitly
        Demo2 demo3 = new Demo2("liku");
        //calls the parametrized one
    }



}
