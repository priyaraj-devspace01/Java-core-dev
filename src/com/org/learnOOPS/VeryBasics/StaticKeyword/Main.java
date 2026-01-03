package com.org.learnOOPS.VeryBasics.StaticKeyword;


class Demo
{



    // 1st - acts as instance variable (different for each object)
//    int common;



    //2nd - static
    static int common;


    public  void show()
    {
        System.out.println("say hii");
    }
}

public class Main extends Demo {
    public static void main(String[] args) {

//        Demo m = new Main ();
//        m.show();

        Demo.common = 100;
        // now it will be common for every object which are going to create for this class
        Demo demo1 = new Demo();
        demo1.common = 33;

        Demo demo2 = new Demo();
        demo2.common = 44;

        demo1.common = 66;
        // as it was the last value assigned to that static field so the value is taken as per for last assigned value to the
        // static variable


        System.out.println(demo1.common);
        System.out.println(demo2.common);

    }




    @Override
    public void show()
    {
        System.out.println("say hello");
    }
}
