package com.org.learnOOPS.termsToRemember.constructor.constructorAccess.Access2;

import com.org.learnOOPS.termsToRemember.constructor.constructorAccess.Phase1;

public class Phase2 extends Phase1 {
    public Phase2() {
        super(22);
    }
    public static void main(String[] args) {
        Phase1 p1 = new Phase1();


//        Phase1 p2 = new Phase1("Raja");
        // can't be accessed from here as outside Phase1 package,
//        because,
//        A protected constructor can be accessed from a subclass ONLY via super(), not via new Parent(
          new Phase2();

    }

}
