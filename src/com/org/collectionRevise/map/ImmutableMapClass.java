package com.org.collectionRevise.map;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
public class ImmutableMapClass {
    public static void main(String[] args) {
        // we can't make changes once it is instantiated.

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        Map<Integer, String> map2 = Collections.unmodifiableMap(map);
//        map2.put(4, "four");  //Exception in thread "main" java.lang.UnsupportedOperationException
        System.out.println(map2);

        // clean approach -1) but limited to only 10 key-value pairs
        Map<String, Integer> map3 = Map.of("ritu",100, "raja", 200, "liku", 88);
//        System.out.println(map3); // Exception in thread "main" java.lang.UnsupportedOperationException


        // clean approach -2) not limited to only 10 key-value pairs
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("ritu", 100), Map.entry("liku", 200));
//        System.out.println(map4);//Exception in thread "main" java.lang.UnsupportedOperationException



    }
}
