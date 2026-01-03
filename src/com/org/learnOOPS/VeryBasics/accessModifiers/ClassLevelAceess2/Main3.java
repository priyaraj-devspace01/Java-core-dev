package com.org.learnOOPS.VeryBasics.accessModifiers.ClassLevelAceess2;


import com.org.learnOOPS.VeryBasics.accessModifiers.ClassLevelAceess.Main;

public class Main3 {
    public static void main(String[] args) {
//        Main1 m1 = new Main1(); // we can't access here as the class has the default modifier

//        case -2
        Main m2 = new Main();
//        m2.main();// even if the class is public as the method is default access modifier it can't be access
//        outside the package


    }
}
