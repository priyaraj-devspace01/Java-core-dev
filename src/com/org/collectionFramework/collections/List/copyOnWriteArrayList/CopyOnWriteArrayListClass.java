package com.org.collectionFramework.collections.List.copyOnWriteArrayList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListClass {
    public static void main(String[] args) {
        /*
        "Copy on write" means that whenever a write operation
        // like adding and removing an element
        // instead of directly modifying the existing list,
        // a new copy of the list is created, and the modification is applied to that copy.
        // This ensures that other threads reading the list while It's being modified are unaffected.

        // Read operation: Fast and direct, since they happen on a stable list without interference from modifications.
        // Write Operations: A new copy of the list is created for every modification.
                              The reference to the list is then updated so that subsequent reads use this new list.




    read more write less
         */

      // Let's take an example
//        List<String> cart = new ArrayList<String>();
        List<String> cart = new CopyOnWriteArrayList<>();
        cart.add("Milk");
        cart.add("Bread");
        cart.add("Cheese");
        cart.add("Egg");

        System.out.println("Printing before making any changes ....");
        for(String s : cart)
        {
            System.out.print(s+", ");
            if(s.equalsIgnoreCase("Egg"))
            {
                cart.add("Butter"); // which is not ideally supported by java (while reading and trying to write something)
            }
        }

        System.out.println();
        System.out.println("After making any changes ....");
        System.out.println(cart);



    }
}
