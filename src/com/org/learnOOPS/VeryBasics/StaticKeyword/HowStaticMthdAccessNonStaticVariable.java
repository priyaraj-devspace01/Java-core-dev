package com.org.learnOOPS.VeryBasics.StaticKeyword;


class Demo2
{
      int age;
      public static void sayHii(Demo2 obj)
      {
          System.out.println(obj.age);
          // as the non-static or instance variable is associated to an object only, therefore by passing the object
//          as the parameter inside the static method, we can access the non-static variable through that object.
      }
}
public class HowStaticMthdAccessNonStaticVariable {
    public static void main(String[] args) {

        Demo2 obj = new Demo2();
        Demo2.sayHii(obj);
    }
}
