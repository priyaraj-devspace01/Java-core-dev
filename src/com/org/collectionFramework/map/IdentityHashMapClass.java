package com.org.collectionFramework.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapClass {

    public static void main(String[] args) {
        String name1 = new String("one");
        String name2 = new String("one");


        HashMap<String, Integer> map = new HashMap<>();
        map.put(name1, 1);
        map.put(name2, 2);

        System.out.println(map); // we will get one entry as the hashcode is defined by the String class which is common to both objects
        // even we can check that they have the same hashcode
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
         // they both are same for both
        // Remember always for the Hashmap class, it is always true that it only uses the hashcode
        // defined by the class itself or by its object using equals method if the key are found to be same then only one single memory will be allocated.

        // but in case of identityHashMap class checks for individually for each object hashcode and treat them as different identity.
         // using identityHashCode and == method


        // but for identity Hashmap
        String str1 = new String("one");
        String str2 = new String("one");

        IdentityHashMap<String, Integer>  entry = new IdentityHashMap<>();

        entry.put(name1, 1);
        entry.put(name2, 2);

        System.out.println(entry); // so basically both objects hashcode will be treated as separated so we will get tow entries
        // though they have the same key value

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2)); // they are different






    }
}
