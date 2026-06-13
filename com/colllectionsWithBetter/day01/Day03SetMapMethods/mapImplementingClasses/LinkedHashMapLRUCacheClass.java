package com.colllectionsWithBetter.day01.Day03SetMapMethods.mapImplementingClasses;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;


class LRUCache extends LinkedHashMap<Integer, String> {
    int capacity;
    LRUCache(int capacity) {
        super(capacity, 0.75f, false);
        this.capacity = capacity;

    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        return size() > capacity;
    }
}
public class LinkedHashMapLRUCacheClass {
    public static void main(String[] args) {
//        Map<Integer, String> kvMap = new LinkedHashMap<>(10, 0.75f, false);
//        kvMap.put(1, "hello");                                                                           // |
//        kvMap.put(2, "hii");                                                                             // ^
//        kvMap.put(3, "raja");                                                                            // ^
//                                                                                                         // |
//        kvMap.get(1); // most recently used becomes the last k-v pair, while accessing             ------ when true
//        System.out.println(kvMap);


        // as we have override the remove the eldest entry it basically removes the eldest entry when size() > capacity
       LinkedHashMap<Integer, String> map = new LRUCache(4);
       map.put(1, "hello");
        map.put(2, "hii");
        map.put(3, "raja");
        map.put(4, "rahul");
        System.out.println(map);
        map.put(5, "aman");
        System.out.println(map); // now here as "hello" is the last recently used when size() exceeds than capacity it got removed


    }
}
