package com.org.collectionFramework.map.sortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Base {

    public static void main(String[] args) {

        SortedMap<Integer, String> sMap  = new TreeMap<>();
        sMap.put(55,"raju");
        sMap.put(44, "aman");
        sMap.put(22, "ritesh");
        sMap.put(1, "ritu");

        // so here, unlike map and hashmap, the sorted map will be ordered in sorting manner based on the keys, either in natural order or defined by Comparator
        System.out.println(sMap);

        System.out.println(sMap.firstKey());
        System.out.println(sMap.lastKey());
        System.out.println(sMap.headMap(44)); // exclude the max
        System.out.println(sMap.tailMap(44));
        sMap.subMap(22, 55);
        System.out.println(sMap);
    }


}

/*
SortedMap is an interface that extends Map and guarantees
 that the entries are sorted based on the keys,
 either in their natural ordering or by a specified Comparator.
 // and it can be implemented by the class TreeMap.

 // here we need to remember that sorted map extends the map interface and navigableMap extends the SortedMap as both are interaces.
 // but TreeMap implements the NavigableMap interface that's why indirectly it's also implementing the SortedMap as well


 */
