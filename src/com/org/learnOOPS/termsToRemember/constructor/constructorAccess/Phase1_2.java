package com.org.learnOOPS.termsToRemember.constructor.constructorAccess;

public class Phase1_2 {
    public static void main(String[] args) {
        Phase1 p2 = new Phase1("liku");
        // as package protected
        Phase1 p3 = new Phase1(1);
        // as protected, it can be used inside the same package
    }

}
