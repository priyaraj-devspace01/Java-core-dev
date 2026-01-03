package com.org.collectionFramework.map.HashTable;


import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapClass {
    public static void main(String[] args) {
         // can use the ConcurrentMap reference as well as concurrentHashMap extends ConcurrentMap
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        // java -7 -> segment based locking -> 16 segments -> smaller hashmaps
        // only the segment being written ro or read from is locked.
        // read : don't require locking unless there  is a write operation happening on the same segment.
        // write: lock

        // java-8 -> no segmentation
        //  --> compare and swap approach
                   // no locking except resizing or collision

        // it's like
          /*
             Thread A last saw - x = 45
             Thread A work to make x -> 50
             if x is still 45, after sometime, then it changes it to 50 else don't change and retry
             // put --> index


           */







    }
}
