package com.org.learnOOPS.termsToRemember.constructor.constructorAccess;

public class Phase1 {
    public Phase1()
    {
        System.out.println(" I AM PHASE ONE AND CAN ACCESSED FROM ANYWHERE .  ");
    }

    Phase1(String value)
    {
        System.out.println("I am package protected only accessed inside the current  package only");
    }

    protected Phase1(int priority)
    {
        System.out.println(" i am a protected constructor with marks "+ priority);
    }
}
