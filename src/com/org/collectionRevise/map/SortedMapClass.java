package com.org.collectionRevise.map;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapClass {
    public static void main(String[] args) {


        // Sorted map is an interface which stores the elements in their keys sorted order.
           // implementing classes are treeMap.



                                      // also we can provide our own sorting order by giving the comparator to the constructor of treeMap
        SortedMap<Integer,String> map = new TreeMap<>((a,b)-> b-a);
        map.put(1, " one");
        map.put(22, "twenty two");
        map.put(32, "thirty two");
        System.out.println(map);


        System.out.println(map.firstKey());  //32
        System.out.println(map.lastKey());
        System.out.println(map.headMap(22)); // range base accessing and basic sorting order
        System.out.println(map.tailMap(22));





    }
}
