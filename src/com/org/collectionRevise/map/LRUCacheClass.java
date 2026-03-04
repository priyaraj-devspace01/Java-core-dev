package com.org.collectionRevise.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheClass<K,V> extends LinkedHashMap<K,V> {
       int capacity;
      public LRUCacheClass(int capacity)
          {

              super(capacity, 0.75f, true);
              this.capacity = capacity;
          }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
        // it basically remove the least recently used element
    }

    public static void main(String[] args) {
          LRUCacheClass<Integer,String> days = new LRUCacheClass<>(3);
          days.put(1, "monday"); // removed when fourth element added
          days.put(2, "tuesday");
          days.put(3, "wednesday");
                days.get(1);  // it removes the second element as first is shifted to least recently used element
          days.put(4, "thursday");

//          days.get(1);   // still monday removed .  because it was happened during putting beyond capacity element

        System.out.println(days);



    }
}
