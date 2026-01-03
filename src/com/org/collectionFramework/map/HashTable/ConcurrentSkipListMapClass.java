package com.org.collectionFramework.map.HashTable;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapClass {
    public static void main(String[] args) {
        // it works based on skipList data structure
        ConcurrentNavigableMap<Integer, String> cmap = new ConcurrentSkipListMap<>();
        // all are same as Navigable and sorted as before

    }
}

/*
1,2,3,4,51 6, 4, 8, 9
 it's a probabilistic data structure that allows for efficient search, insertion, and deletion operations.
 It is similar to a sorted linked list but with multiple layers that "skip" over
  portions of the list to provide faster access to elements.
  // it's basically the thread safe version of treemap

 */