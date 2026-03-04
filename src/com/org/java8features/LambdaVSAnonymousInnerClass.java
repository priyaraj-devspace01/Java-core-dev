package com.org.java8features;

import javax.swing.*;

interface DemoTest
{
    public void start();
    public void stop();

}


// but suppose we have only one abstract method for an interface, then we need to use the lambda expression approach
interface singleMethod
{
    public void amTheOnlyOne();
}

class Main
{
    public void callAbstracts()
    {
        int a  =22;  // Here it's a local variable so we can easily can access inside the anonymous inner class as well
        singleMethod s1 = ()-> {
            System.out.println(a);
            System.out.println("i am the only one here .. ");
        };
        // here, optimized for better readability and concise code otherwise we can also use anonymous inner class for this as well
        s1.amTheOnlyOne();

        DemoTest d1Ano = new DemoTest() {
            int a = 22;
            @Override
            public void start() {
                System.out.println(this.a); //as it's class here a is a instance variable instead of local variable
                System.out.println("Started ....");
            }
            @Override
            public void stop() {
                System.out.println("Stopped .........");
            }
        };


        d1Ano.start();
        d1Ano.stop();
    }
}
public class LambdaVSAnonymousInnerClass {
    public static void main(String[] args) {
        Main m = new Main();
        m.callAbstracts();




    }
}
