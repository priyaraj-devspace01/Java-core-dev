package com.colllectionsWithBetter.day01.Day03SetMapMethods;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/*
==============================================================================
                            COLLECTIONS INTERVIEW NOTES
==============================================================================

1. WeakHashMap
--------------
- Stores keys as Weak References.
- If key has no strong reference, GC can remove the entry automatically.
- Useful for cache implementations.
- Thread Safe? NO

Interview:
Q. Does WeakHashMap use weak reference for key or value?
A. Only KEY is weakly referenced.

Q. Why use WeakHashMap?
A. To avoid memory leaks in caches.

==============================================================================

2. ConcurrentHashMap
--------------------
- Thread-safe version of HashMap.
- Allows concurrent read/write.
- Does NOT allow null key or null value.
- Iterator is Weakly Consistent.
- No ConcurrentModificationException.

Interview:
Q. Difference between HashMap and ConcurrentHashMap?
A.
    HashMap -> Not Thread Safe
    ConcurrentHashMap -> Thread Safe

Q. Why no ConcurrentModificationException?
A. Uses weakly consistent iterator.

Q. Why null not allowed?
A. To avoid ambiguity between:
       key absent
       value = null

==============================================================================

3. LinkedHashMap
----------------
- Maintains insertion order by default.
- Can maintain access order.

Constructor:

LinkedHashMap<>(capacity, loadFactor, accessOrder)

accessOrder:
false -> insertion order
true  -> access order

==============================================================================

4. LRU Cache
------------
Least Recently Used Cache

Implemented using:
- LinkedHashMap
- accessOrder = true
- removeEldestEntry()

==============================================================================

5. TreeSet Navigation Methods
-----------------------------

lower(x)   -> strictly less than (<)
floor(x)   -> less than or equal (<=)
ceiling(x) -> greater than or equal (>=)
higher(x)  -> strictly greater than (>)

==============================================================================

6. ArrayList Capacity
---------------------

new ArrayList<>()

Java 8+
Initially Capacity = 0

After first insertion:
Capacity = 10

Growth Formula:

newCapacity = oldCapacity + oldCapacity/2

Example:

10 -> 15 -> 22 -> 33 -> ...

==============================================================================

7. ConcurrentModificationException
----------------------------------

Occurs when Collection is modified during iteration.

Wrong:

for(String s : list){
    list.remove(s);
}

Solutions:

1. Iterator.remove()
2. removeIf()
3. Reverse Iteration
4. CopyOnWriteArrayList

==============================================================================

8. CopyOnWriteArrayList
-----------------------

Package:
java.util.concurrent

Implements:
List

Thread Safe:
YES

How it works:
Every write operation creates a new copy of underlying array.

Good For:
- More reads
- Fewer writes

Bad For:
- Frequent writes

==============================================================================

9. Map.of()
-----------

Immutable Map

Limit:
Supports maximum 10 key-value pairs

For more than 10:
Map.ofEntries()

Limitations:
- No null key
- No null value
- No duplicate key
- Immutable

==============================================================================
*/

public class ConcurrentHashMapHandOn {

    public static void main(String[] args) {


        Iterator<Integer> iterator = List.of(222, 33, 5, 3).iterator();

        // ==================================================================
        // WeakHashMap Example
        // ==================================================================

        WeakHashMap<Object, String> weakMap = new WeakHashMap<>();

        Object key = new Object();

        weakMap.put(key, "Employee");

        System.out.println("Before GC : " + weakMap);

        key = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        System.out.println("After GC : " + weakMap);



        // ==================================================================
        // ConcurrentHashMap Example
        // ==================================================================

        ConcurrentHashMap<Integer, String> concurrentMap =
                new ConcurrentHashMap<>();

        concurrentMap.put(1, "A");
        concurrentMap.put(2, "B");

        for (Integer k : concurrentMap.keySet()) {

            if (k == 1) {
                concurrentMap.put(3, "C");
            }
        }

        System.out.println("ConcurrentHashMap : " + concurrentMap);



        // ==================================================================
        // TreeSet Navigation Methods
        // ==================================================================

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("lower(25)   : " + set.lower(25));    // 20
        System.out.println("floor(30)   : " + set.floor(30));    // 30
        System.out.println("ceiling(25) : " + set.ceiling(25));  // 30
        System.out.println("higher(30)  : " + set.higher(30));   // 40



        // ==================================================================
        // LRU Cache Example
        // ==================================================================

        LRUCache cache = new LRUCache(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        cache.get(1);

        cache.put(4, "D");

        System.out.println("LRU Cache : " + cache);
        // Output:
        // {3=C, 1=A, 4=D}



        // ==================================================================
        // Map.of()
        // ==================================================================

        Map<Integer, String> immutableMap =
                Map.of(
                        1, "A",
                        2, "B",
                        3, "C"
                );

        System.out.println("Map.of : " + immutableMap);
    }
}



/*
==============================================================================
LRU Cache
==============================================================================

Interview:
Q. Why accessOrder=true ?

A.
Recently accessed entry moves to end.
Used to implement LRU cache.

Q. What happens if accessOrder=false ?

A.
Maintains insertion order.
Behaves more like FIFO eviction.
*/

class LRUCache extends LinkedHashMap<Integer, String> {

    private final int capacity;

    public LRUCache(int capacity) {

        super(capacity, 0.75f, true);

        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(
            Map.Entry<Integer, String> eldest) {

        return size() > capacity;
    }
}