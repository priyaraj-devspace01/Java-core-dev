package com.org.collectionRevise.map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableClass {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashTable = new Hashtable<>();
        hashTable.put(1, "one");
        hashTable.put(2, "two");
        hashTable.put(3, "three");
        hashTable.put(4, "four");

        //Hashtable is synchronized.
        // no null key or value
        // legacy class -> ConcurrentHashMap
        // Performance - slower than HashMap
        // all methods are synchronized

        System.out.println(hashTable);
        System.out.println(hashTable.contains(22));
        System.out.println(hashTable.get(22));

        // all methods as HashMap as implementing Map interface.


        Hashtable<Integer, String > map = new Hashtable<>();


        Thread t1 = new Thread(() -> {
            for(int i =1;i<=1000;i++)
            {
                map.put(i, "Thread1.");

            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1000;i<=2000;i++)
            {
                map.put(i, "Thread2.");
            }
        });

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(map.size());


    }
}
