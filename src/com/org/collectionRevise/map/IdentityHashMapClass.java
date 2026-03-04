package com.org.collectionRevise.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapClass {
    public static void main(String[] args) {
        String s1 = new String("one");
        String s2  = new String("one");

        HashMap< String, Integer> map = new HashMap<>();
        map.put( s1,1);
        map.put( s2, 2);
        System.out.println(map); // replace


        // but if we use identityHashMap -> the hashcode which is inside the Object class only work
        IdentityHashMap< String, Integer> map2 = new IdentityHashMap<>();
        map2.put(s1,1);
        map2.put( s2, 2);
        System.out.println(map2);

        // since String class object returns its own hashCode based on the string value so here the both are same

    }
}
