package com.org.java8features;

@FunctionalInterface
interface A
{
    public void hello();
    static int add(int a, int b)
    {
        return a+b;
    }

}

class child implements A{
    public void hello()
    {
        System.out.println("hello");
    }

    public int add(int a, int b)    // it can't be overridden here because it not visible here
    {
        return a+b+10;
    }
}
public class Java8DemoClass {
    public static void main(String[] args) {
        // WHY ?
        /*
           Requirements : Minimal code, functional programming
           what introduced : lambda expression, streams, date and time api


         */

        // lambda expression

       A a = ()-> System.out.println("Hii");
       a.hello();
      int ans2 =  A.add(33,33);
        System.out.println(ans2);



       child c = new child();
        int ans = c.add(22,22);
        c.hello();
        System.out.println(ans);

      child d = new child()
      {
          @Override
          public int add(int a, int b)
          {
              return a+b-10;
          }
      };
    int ans3 =   d.add(232,22);
        System.out.println(ans3);

    }
}
