package com.core.foundation.conditionals;

public class SwitchStatement {
    public static void main(String[] args) {

        // WHY ?
        /*
        Before as we have already if-else is there , why we even need switch statement.
         // advantage  - it makes the things faster but having some limitations
         switch(value) - value can only be int, short, byte, char, Enumeration
         // no duplicate case

         if-else
         whereas if-else, can hold boolean expression - (true or false )


         // After
         JDK-14 in enhanced too much.


         WHY switch is faster than if-else
         1) switch - can only check equality           if-else - can check equality as well as other's.

         Efficient - why ?
         instead of checking in order from first to last if-else, switch only moves to the case 'a' not one by one

         HOW ?
         jvm - Jump Table
         stores the case of switch , like at each index it stores the condition and jump
         o(n) - > o(1)

         */




    }
}
