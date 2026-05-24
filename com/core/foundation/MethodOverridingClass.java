package com.core.foundation;


import java.sql.SQLOutput;

class Office
{
    public void showName()
    {
        System.out.println("i am office at delhi ");
    }

    public static void showLocation()
    {
        System.out.println("DELHI");
    }

    int a  = 22;

}

class Suboffice  extends Office
{
    @Override
    public void showName()
    {
        System.out.println("i am suboffice at chennai ");
    }

    int a = 21;



    public static void  showLocation()
    {
        System.out.println(" CHENNAI");
    }
}
public class MethodOverridingClass {
    public static void main(String[] args) {

        Office office = new Office();
        System.out.println("i am office at delhi ");

        // Even if the suboffice overriding the Office method,
           // still it going to be decided at the run time which class showName method will call, irrespective of which reference type we are considering


        // But in case of static methods as the static is only belonging to the class level, instead of depending on the which class object we are creating
        // it depends on which reference type we are taking


        Office office1Always = new Suboffice();  // even the object is creating for sub-class
        office1Always.showLocation();  // always show the location of office 1 not sub office location

        // Variables can't participate on overridden
        Office a = new Suboffice();
        System.out.println(a.a);  // 22 - based on reference type not based on object type
    }
}


/// NOTES:
/*
1) Static = they belong to the class and not to objects
2) private methods can't be overridden = as not accessible to the child classes due to access restriction limit.
3) final methods can't be overridden, final class can't be instantiated, final variable can't be modifiable

Can a Constructor Be final in Java?
Answer
No, a constructor cannot be final in Java.

Why?
The purpose of final is to prevent overriding.
But constructors:


are not inherited


therefore cannot be overridden


So making a constructor final makes no sense.



5) fields/ variables they can't be polymorphic.
 */