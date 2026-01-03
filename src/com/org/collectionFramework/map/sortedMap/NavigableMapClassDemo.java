package com.org.collectionFramework.map.sortedMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapClassDemo {
    public static void main(String[] args) {

        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(11,"ritesh");
        map.put(122, "ritu");
        map.put(33, "rittt");


        System.out.println(map.reversed());
        System.out.println(map.lowerKey(122));
        System.out.println(map.higherKey(33));
        System.out.println(map.ceilingEntry(33));
        System.out.println(map.floorEntry(33));



    }

    /*
    NavigableMap extends SortedMap, providing more powerful navigation options such as finding
     the closest matching key or retrieving the map in reverse order.

     */
}
