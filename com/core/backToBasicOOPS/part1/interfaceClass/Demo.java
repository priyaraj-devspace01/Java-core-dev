package com.core.backToBasicOOPS.part1.interfaceClass;

public class Demo {
    public static void main(String[] args) {

        // WHY WE EVEN NEEDED THE WRAPPER CLASSES
           // 1) collection framework only works on classes not for primitives types
           // 2) it als provides some extraa functionalities


        // WHY primitives exist before  ?
        // legacy
        // fast


//        AutoBoxing <- primitives to their corresponding wrapper class
        int a = 10;
        Integer x = a;
         // internally - Integer.valueOf(a) or Integer in  = new Integer(a);
        System.out.println(x);


//        Unboxing
        Integer b = 222;
        int c = b;
             // internally - b.intValue(b)
        System.out.println(c);


        /// NOTE: we shouldn't try assigment with null value
//        Example
        Integer val = null;
//        int val2 = val; // as for primitives there is no meaning for null

        System.out.println(val); // null pointer exception at run time

        // Uses
         /*
             Assignment - Integer a = 22;
             method call
             arithmetic operations
          */


        /// Remember :
        Integer val2  = 22;
        Integer val3 =  22;
        System.out.println(val2 == val3); //compares the actual reference address pointing to the object inside the heap
        System.out.println(val2.equals(val3)); // compares the value as well as reference
        System.out.println(val2.intValue() == val3.intValue()); // same as above


    }
}
