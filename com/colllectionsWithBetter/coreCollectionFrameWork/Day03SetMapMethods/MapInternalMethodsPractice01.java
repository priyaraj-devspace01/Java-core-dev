package com.colllectionsWithBetter.coreCollectionFrameWork.Day03SetMapMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInternalMethodsPractice01 {
    public static void main(String[] args) {
        /*
        MAP -> HASHMAP - > LINKED-HASHMAP
        TREEMAP

        // OTHERS ---
             HASHTABLE
             PROPERTIES
             ENUM MAP
             IDENTITY MAP
             CONCURRENT HASHMAP
             WEAK HASHMAP
         */


      Map<Integer, String> stdMap = new HashMap<Integer, String>();
      stdMap.put(1, "Anmol");
      stdMap.put(2, "Rahul");


        System.out.println(stdMap.size());
        System.out.println(stdMap.isEmpty());
        System.out.println(stdMap.containsKey(1));   //o(1)
        System.out.println(stdMap.containsValue("Anmol")); // o(n)

        System.out.println(stdMap.get(1)); // returns value if not returns null


        //  but if we pass the put with same key updates the values and return  the old value ,
          // if it's a new key, returns null
        System.out.println(stdMap.put(5, "ajaya")); // returns null
        System.out.println(stdMap.put(5, "rohit")); // returns ajaya as old value replaced by rohit

        System.out.println(stdMap.remove(2)); // returns the key-2 , value pair in map
        System.out.println(stdMap);

        Map<Integer, String > map2 = new HashMap<>(Map.of(1, "hello", 2,"hii"));
        stdMap.putAll(map2); // but the key, value type should be same
        System.out.println(stdMap);

        map2.clear();


        // to get all the keys
        Set<Integer> keys = stdMap.keySet();
        System.out.println(keys);
        // to get all the values
        Collection<String> values = stdMap.values();
        System.out.println(values);
        // to get all the entries
        Set<Map.Entry<Integer, String>> map  = stdMap.entrySet();
        for(Map.Entry<Integer, String > m : map)
        {
            System.out.print("{ ");
            System.out.println(m);
            System.out.println(m.getKey() + " : " + m.getValue());
            System.out.println("}");
        }

        System.out.println();
        Map<Integer, String> myMap = new HashMap<>(Map.of(1, "hello", 2, "hii", 3, " ajaya"));
        myMap.getOrDefault(2, "default "); /// as 2 key is exist returns it's actual value
        System.out.println(myMap.getOrDefault(55, "default value"));

        // putIfAbsent - only put the value corresponds to the key if not present else ignore
        System.out.println(myMap.putIfAbsent(1, "chacha"));
        System.out.println(myMap.put(1, "chache")); // it replaces the value if present
        System.out.println(myMap.putIfAbsent(4, "raja"));
        System.out.println(myMap);


        System.out.println(myMap.remove(4, "raja"));; // if it founds any match like this then remove and return true, else false
        // replace
        System.out.println(myMap.replace(1, "hello")); // if found replace but if not present doesn't add new entry
        System.out.println(myMap.replace(1, "hello", "Hello")); // safe replace - only going to replace if the key-value pair actually satisfying



        // Immutable map
        Map<Integer, String>  immutableMap = Map.of(1, "hello", 2, "hii");
        System.out.println(immutableMap);
        /*
        Map.of() Size Limitation

            Map.of() provides overloaded methods only up to 10 key-value pairs.
         */

        /// in that case use, Map.ofEntries(k1, v1, k2, v2, ....)

        Map<Integer, String> kvMap = Map.ofEntries(Map.entry(1, "hello"), Map.entry(2, "hii"), Map.entry(3, "raja"));
        System.out.println(kvMap);

    }
}
