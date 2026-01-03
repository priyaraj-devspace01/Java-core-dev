package com.org.collectionFramework.map.Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;


public class HashMapDemoClass {
    public static void main(String[] args) {
        // it implements the map interface
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"riya");
        hashMap.put(2,"kami");
        hashMap.put(33,"roy");
        hashMap.put(33,"Aman"); // override
        hashMap.put(41,"akhsit");
        System.out.println(hashMap);
        // Hashmap doesn't follow any order for storing the key-value pair


        System.out.println(hashMap.get(2));
        System.out.println(hashMap.get(33));

        System.out.println(hashMap.containsKey(22));
        System.out.println(hashMap.containsValue("akhsit"));

        Set<Integer> ketSet = hashMap.keySet();
        //  as we want to get the key as unique
        for(Integer i : ketSet)
        {
            System.out.print(i + " ");
        }

        System.out.println();


        Set<Map.Entry<Integer, String>> setOfMap = hashMap.entrySet();
        for(Map.Entry<Integer, String> i : setOfMap)
        {
             i.setValue(i.getValue().toUpperCase());
        }
        System.out.println(hashMap);


        hashMap.remove(33);
        System.out.println(hashMap);

       boolean res=  hashMap.remove(33, "raj");
        System.out.println("Removed ? " + res);


        System.out.println(hashMap);



    }
}


/*
Key Characteristics:

  Unordered: Does not maintain any order of its elements.
   Allows null Keys and Values: Can have one null key and multiple null values.
   Not Synchronized: Not thread-safe; requires external synchronization if used in a multithreaded context.
    Performance: Offers constant-time performance (O(1)) for basic operations like get and put, assuming the hash function disperses elements properly.
 */