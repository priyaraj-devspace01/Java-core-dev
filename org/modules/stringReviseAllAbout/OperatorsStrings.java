package org.modules.stringReviseAllAbout;

import java.util.ArrayList;

public class OperatorsStrings {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // add their ASCII values

        System.out.println("a"+"b"); // concatenate
        System.out.println("a".concat("b"));

        System.out.println("a" + 3); // concatenate
        // "a" +"3"
        System.out.println(3+ "a");


//        System.out.println(new Integer(33) + new ArrayList<>());

        // at least one of them needs to be of type string
        System.out.println(new Integer(33) +""+  new ArrayList<>());

    }


}
