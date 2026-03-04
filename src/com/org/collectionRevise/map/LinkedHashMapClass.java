package com.org.collectionRevise.map;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapClass {
    public static void main(String[] args) {

        Map<Integer, String > hashMap = new HashMap<>();
        hashMap.put(11, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");
        System.out.println(hashMap);

        LinkedHashMap<String , Integer> fruits = new LinkedHashMap<>(10, 04f, true);
        // LinkedHashMap unlike normal hashmap doesn't follow the order the elements are added and extracted
        // here we can pass the initial_capacity, load factor -> after that the bucket array resizes, and accessOrder - true (false (default)
        fruits.put("Apple", 1);
        fruits.put("orange", 3333);
        fruits.put("Banana", 2);
        fruits.put("Orange", 3);
        fruits.put("Watermelon", 4);
        System.out.println(fruits);


        fruits.get("Orange"); // making it the most frequently used object and to get the less recently used
        // (first object of the map helps for caching)
        System.out.println(fruits); // Orange at last

        LinkedHashMap<Integer, String> newLmap = new LinkedHashMap<>(hashMap);
        newLmap.put(11, "one");
        newLmap.put(2, "two");
        newLmap.put(3, "three");
        newLmap.put(4, "four");
        newLmap.put(5, "five");


        System.out.println(newLmap.getOrDefault(44, "raju")); // get if present, otherwise put default
        newLmap.putIfAbsent(123, "onetwothree"); // put if not there, otherwise do nothing










    }
}
