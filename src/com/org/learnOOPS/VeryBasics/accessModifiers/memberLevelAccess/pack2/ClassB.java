package com.learnBasicsToStartOOPS.accessModifiers.memberLevelAccess.pack2;


import com.learnBasicsToStartOOPS.accessModifiers.memberLevelAccess.pack1.*;

public class ClassB extends ClassA {
    public static void main(String[] args) {
        ClassA a  = new ClassA();
//        a.name;
//        a.sayGreet();

        // can't access as both are private


//        a.goodBye();
        // as default method inside classA can't access it from outside the package,
//        but if the method is protected is a subclass from here can access

        //but the reference we can only use for subclass object or reference as well

        ClassB b2 =  new ClassB();
        // Always remember the always use the parent reference during creating the object for calling a protected method from
//        outside the current package

        b2.sayBye();







    }
}
