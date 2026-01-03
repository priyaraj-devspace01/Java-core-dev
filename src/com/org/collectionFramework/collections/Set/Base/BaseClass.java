package com.org.collectionFramework.collections.Set.Base;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class BaseClass {
    public static void main(String[] args) {
        /*
        Set is a collection which can't contain duplicate values.
        // like map - HashMap, LinkedHashMap, TreeMap, EnumMap,
        //      Set - HashSet, LinkedHashSet, TreeSet, EnumSet

         */


        // almost all the thing which are there in the map is also available for set as well

        //1) HashSet
        // focuses on uniqueness, not ordering.
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println(set1);
        // the only thing is that like HashMapKit doesn't maintain any order during storing or accessing


        //2) LinkedHashSet
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        System.out.println(set2);
        // here it only maintains the insertion order as element are inserted

        //3) TreeSet
        Set<Integer> set3 = new TreeSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(4);
        System.out.println(set3);
        // here it maintains a sorted order of element


//        Set<Day> set4 = new EnumSet<>(Day.class); --------->  WRONG WAY OF DECLARATION(❌❌❌❌)

//        ✅ Correct ways to create an EnumSet
//✔ 1️⃣ Empty EnumSet
        Set<Day> setEnum1 = EnumSet.noneOf(Day.class);
        setEnum1.add(Day.MONDAY);
        setEnum1.add(Day.TUESDAY);
        System.out.println(setEnum1);

//✔ 2️⃣ EnumSet with all enum constants
        Set<Day> setEnum2 = EnumSet.allOf(Day.class);
        System.out.println(setEnum2);

//✔ 3️⃣ EnumSet with specific values
        Set<Day> setEnum3 = EnumSet.of(Day.MONDAY, Day.WEDNESDAY);
        System.out.println(setEnum3);

//✔ 4️⃣ EnumSet from another collection
        Set<Day> setEnum4 = EnumSet.copyOf(List.of(Day.MONDAY, Day.TUESDAY));
        System.out.println(setEnum4);


        // Immutable Set
        // method - 1
        Set<Integer> imuutable1  =  Set.of(12,23,556,72,34,5,6,7,888,33,3,33,22,3);
        // unlike map by using this we can store as many value as we can for map
        // method -2
        Set<Integer> immutabl2 = Collections.unmodifiableSet(imuutable1);
        // but it is not recommended





        // Remember:
//          for thread safety
//        they (map and set ) both have one approach is there using Collections
        Set<Integer> synchro = new HashSet<>();
        synchro.add(1);
        synchro.add(2);
        synchro.add(3);
        synchro.add(4);
        Set<Integer> synchro2 = Collections.synchronizedSet(synchro);
        // similarly it is also available for map as well but not recmmended

        // always try to use
        ConcurrentSkipListSet<Integer> synchro3 = new ConcurrentSkipListSet<>();
        synchro3.add(1);
        synchro3.add(2);
        synchro3.add(3);
        synchro3.add(4);
        System.out.println(synchro3);

        // WHY TO USE CONCURRENTSKIPLISTSET ?


        /*
        EXPLANATION:
        🔹 Two ways you mentioned
1️⃣ Collections.synchronizedSet(...)
Set<Integer> synchro2 =
    Collections.synchronizedSet(new HashSet<>());

2️⃣ ConcurrentSkipListSet
ConcurrentSkipListSet<Integer> synchro3 = new ConcurrentSkipListSet<>();

❓ Why is the concurrent approach recommended over Collections.synchronizedSet?
🔑 Short answer (remember this):

Collections.synchronizedXxx uses a single lock (coarse-grained locking), while concurrent collections use fine-grained or lock-free techniques.

🔍 What’s wrong with Collections.synchronizedSet
🔴 1️⃣ Single lock → poor scalability

Every operation (add, remove, read, iterate) acquires one global lock

Only one thread can access the set at a time

Threads block each other → bad performance

// Internally (conceptual)
synchronized (mutex) {
    // every operation
}

🔴 2️⃣ Iteration is still NOT thread-safe by default

You must manually synchronize while iterating:

synchronized (synchro2) {
    for (Integer i : synchro2) {
        System.out.println(i);
    }
}


If you forget this → ❌ ConcurrentModificationException

🔴 3️⃣ Old-style design (legacy approach)

Introduced before java.util.concurrent

Works, but not modern or scalable

✅ Why ConcurrentSkipListSet is preferred
🟢 1️⃣ Fine-grained locking / lock-free behavior

Multiple threads can:

read concurrently

write concurrently (in many cases)

Much better throughput under load

🟢 2️⃣ Iterators are fail-safe
for (Integer i : synchro3) {
    synchro3.add(10); // ✅ no exception
}


No need for external synchronization

Iterator works on a safe view

🟢 3️⃣ Designed for high concurrency

Part of java.util.concurrent

Built specifically for multi-threaded environments

🟢 4️⃣ Predictable ordering

ConcurrentSkipListSet maintains sorted order

Thread-safe + ordered (bonus feature)

🔁 Side-by-side comparison (important)
Feature	     synchronizedSet	ConcurrentSkipListSet
Thread-safe	        ✅            	   ✅
Locking    	      Single lock   	Fine-grained
Performance  	    ❌ Slower	     ✅ Faster
Iteration safety	❌ Manual sync	 ✅ Built-in
Modern usage	    ❌ Legacy	     ✅ Recommended
Ordering	        ❌ No order	     ✅ Sorted
         */
    }
}


enum Day {
    MONDAY, TUESDAY, WEDNESDAY;
}