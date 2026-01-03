package com.org.collectionFramework.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    int capacity;

    LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }


    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
         return size() > capacity;
    }

    public static void main(String[] args) {

        LRUCache<Integer, String>  lruCache = new LRUCache<>(4);
        lruCache.put(1, "one"); // will be removed
        lruCache.put(2, "two");
        lruCache.put(3, "three");
        lruCache.put(4, "four");
        lruCache.put(1, "hello"); // as it is removed before can't be added as well
        lruCache.put(5, "five");
        System.out.println(lruCache);


    }
}
