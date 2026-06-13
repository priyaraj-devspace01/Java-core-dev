package com.colllectionsWithBetter.day01.Day02SetMap01;

public class LinkedHashMapHashSet {

    /*
    =====================================================
    LINKED-HASHMAP INTERNALS
    =====================================================

    HashMap:
        - Stores data using buckets.
        - Does NOT maintain insertion order.

    LinkedHashMap:
        - Extends HashMap.
        - Maintains insertion order.
        - Uses HashMap + Doubly Linked List.

    Node Structure:

        Node {
            hash
            key
            value
            next        // bucket chain
            before      // previous node
            after       // next node
        }

    Example:

        map.put(10,"A");
        map.put(20,"B");
        map.put(30,"C");

    Buckets:

        [5] -> (10,A)
        [2] -> (20,B)
        [7] -> (30,C)

    Doubly Linked List:

        10 <--> 20 <--> 30

    Output:

        {10=A, 20=B, 30=C}

    Interview Insight:
        LinkedHashMap maintains insertion order
        using a Doubly Linked List in addition
        to HashMap buckets.

    =====================================================
    LINKEDHASHSET INTERNALS
    =====================================================

    HashSet:
        - Backed by HashMap.
        - Does NOT guarantee insertion order.

    LinkedHashSet:
        - Backed by LinkedHashMap.
        - Maintains insertion order.

    Internal Storage:

        LinkedHashMap<E, Object>

    Example:

        set.add(100);
        set.add(200);
        set.add(300);

    Internally:

        100 -> PRESENT
        200 -> PRESENT
        300 -> PRESENT

    Doubly Linked List:

        100 <--> 200 <--> 300

    Output:

        [100, 200, 300]

    Interview Insight:
        LinkedHashSet internally uses
        LinkedHashMap and preserves
        insertion order.

    =====================================================
    QUICK INTERVIEW DIFFERENCE
    =====================================================

    HashMap       -> No Order
    LinkedHashMap -> Insertion Order

    HashSet       -> No Order
    LinkedHashSet -> Insertion Order

    Extra Memory:
        LinkedHashMap/LinkedHashSet use
        additional before & after pointers
        to maintain order.
    =====================================================
    */

}