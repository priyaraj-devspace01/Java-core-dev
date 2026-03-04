package com.org.collectionRevise.map;


import java.util.WeakHashMap;

public class WeakHashMapClass {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map  = new WeakHashMap<>();
        map.put(new String("a"),1);
        map.put(new String("b"),2);
        map.put(new String("c"),3);
        map.put(new String("d"),4);
        // as they are weekly references may cleaned by garbage collector after sometime
        /// but if we use
        map.put("c",3);
        map.put("d",4);
        // it's not going to work because for each time each taking the keys from string constant pool which has the strong reference to all the
        // strings inside the whole life span, for future comparison and reusability.
        System.gc();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(map);

    }
}
