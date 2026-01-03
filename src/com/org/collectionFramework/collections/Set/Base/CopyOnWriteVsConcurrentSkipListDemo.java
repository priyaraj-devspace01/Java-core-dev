package com.org.collectionFramework.collections.Set.Base;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteVsConcurrentSkipListDemo {
    public static void main(String[] args) {
        // Thread safe
        // No duplicate element
        // copy on write mechanism
        // Iterators do not reflect modifications

        // Now let's understand the difference
        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>(); // used when read used with less write and easy traversal
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();// used when frequent read and write will be there

        for(int i = 1;i<= 5;i++)
        {
            copyOnWriteArraySet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("copyonwritearrayset" +copyOnWriteArraySet);
        System.out.println("initial concurrentskiplist" + concurrentSkipListSet);


        System.out.println("UPDATING 1..........");
        for(int i : copyOnWriteArraySet)
        {
            System.out.println("Reading from copyonwritearrayset" + i);
            // attempting to modifying the set during iteration
            copyOnWriteArraySet.add(6);
        }
        System.out.println(copyOnWriteArraySet);


        System.out.println("UPDATING 2 ..........");
        for(int i : concurrentSkipListSet)
        {
            System.out.println("Reading from copyonwritearrayset" + i);
            // attempting to modifying the set during iteration
            concurrentSkipListSet.add(6);
        }
        System.out.println(concurrentSkipListSet);
    }
}
