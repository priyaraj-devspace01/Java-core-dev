package com.org.collectionRevise.map;

import java.util.*;

public class FirstMapHashClass {
    public static void main(String[] args) {
        // Before jumping into the hashmap, first understand that it's the first implementation class of Map interface which is not a part of Collection Framework.
        // it stores the data in terms of key-value pairs, where keys are unique and value might be duplicated.
        // one key corresponds to only one value at a time.
        // each key-value pair may also refer to as an Entry.
        // it doesn't follow any order while storing the data.


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, " one");   // to insert the value into map
        map.put(2, " two");
        map.put(3, " three");
        map.put(4, " four");
        map.put(5, " five");


        System.out.println(map);

        System.out.println(map.get(1)); // basically search for key-corresponding value inside the bucket

        // Check presence of key or value using
        System.out.println(map.containsKey(1));  // true
        System.out.println(map.containsValue("raja")); // false


        // iteration through the keys
        Set<Integer> keys = map.keySet();
        for(Integer key : keys)
        {
            System.out.println(key );
        }

       Collection<String> values = map.values();
        for(String value : values)
        {
            System.out.println(value);
        }

        // iterate through the entries instead
       Set<Map.Entry<Integer, String>> entries =  map.entrySet();
        for(Map.Entry<Integer, String> entry : entries)
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(map.size()); // o(n)
        System.out.println(map.values()); // o(n)


    }
}
