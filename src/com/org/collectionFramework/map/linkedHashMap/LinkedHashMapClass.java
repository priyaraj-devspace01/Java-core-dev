package com.org.collectionFramework.map.linkedHashMap;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapClass {
    public static void main(String[] args) {

        // it's a subclass of HashMap class
        // the main difference of linked HashMap from hashmap is that it maintains the order unlike Hashmap
        // it typically used a doubly linked list to store the entries due to that it faces a performance overhead.

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "one");
        linkedHashMap.put(2, "two");
        linkedHashMap.put(3, "three");
        linkedHashMap.put(4, "four");

        for(Map.Entry<Integer, String> entry : linkedHashMap.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        // during object creation of linked hashmap we can pass the initial capacity, load factor and access order
        LinkedHashMap<Integer, String > linkedHashMap2 = new LinkedHashMap<>(10, 0.5f, true);
        linkedHashMap2.put(1, "one");
        linkedHashMap2.put(2, "two");
        linkedHashMap2.put(3, "three");
        linkedHashMap2.put(4, "four");

        // by passing the access order as true we are ensuring that the most recent used will be get at last

        linkedHashMap2.get(4);
        linkedHashMap2.get(2);
        System.out.println(linkedHashMap2);

    }
}
