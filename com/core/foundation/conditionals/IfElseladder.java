package com.core.foundation.conditionals;

public class IfElseladder {
    public static void main(String[] args) {



        // it comes under the selective control flow
        int age = 50;

        if(age > 50 )
        {
            System.out.println("you are mid aged group citizen . ");
        }
        System.out.println("you are also eligible for voting . ");

        // here nno matter whether the expression inside the if - returns true or false, the statement after it always run



        // if-else
        if(age >= 18 )
        {
            System.out.println("you are young and now ready to driver ");
        }else
        {
            System.out.println("you are not ready to drive ");
        }

        // here we are restricting that the else block only going to execute when only the if block returns false


        // if -else ladder
        int marks = 90;
        if(marks > 90)
        {
            System.out.println("you got 90 percent");

        }else if(marks >= 80 && marks <= 90)
        {
            System.out.println("you got A+ grade");
        }
        else if(marks > 70 && marks < 80)
        {
            System.out.println("you got a B grade");
        }else
        {
            System.out.println("Sorry , better luck next time, you got failed in the exam . ");
        }

    }
}
