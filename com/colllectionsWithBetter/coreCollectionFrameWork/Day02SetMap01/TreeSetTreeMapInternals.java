package com.colllectionsWithBetter.coreCollectionFrameWork.Day02SetMap01;

public class TreeSetTreeMapInternals {

    /*
    =====================================================
    TREEMAP INTERNALS
    =====================================================

    TreeMap:
        - Stores data in sorted order.
        - Uses Red-Black Tree internally.
        - Keys are sorted automatically.
        - Does NOT use buckets or hashing.

    Example:

        map.put(30,"C");
        map.put(10,"A");
        map.put(20,"B");

    Internally:

              20
             /  \
           10    30

    Output:

        {10=A, 20=B, 30=C}

    Time Complexity:

        put()      O(log n)
        get()      O(log n)
        remove()   O(log n)

    Interview Insight:
        TreeMap uses a Red-Black Tree
        and keeps keys sorted.

    =====================================================
    TREESET INTERNALS
    =====================================================

    TreeSet:
        - Stores unique elements.
        - Maintains sorted order.
        - Internally backed by TreeMap.

    Internal Storage:

        TreeMap<E, Object>

    Example:

        set.add(30);
        set.add(10);
        set.add(20);

    Internally:

              20
             /  \
           10    30

    Output:

        [10, 20, 30]

    Duplicate:

        set.add(20);

    Not Added.

    =====================================================
    TREESET BACKING
    =====================================================

    TreeSet<Integer> set = new TreeSet<>();

    Internally:

        TreeMap<Integer, Object>

        10 -> PRESENT
        20 -> PRESENT
        30 -> PRESENT

    Similar to:

        HashSet -> HashMap
        TreeSet -> TreeMap

    =====================================================
    QUICK INTERVIEW DIFFERENCE
    =====================================================

    HashMap
        -> Hashing
        -> O(1)
        -> No Sorting

    TreeMap
        -> Red-Black Tree
        -> O(log n)
        -> Sorted Keys

    HashSet
        -> HashMap
        -> No Sorting

    TreeSet
        -> TreeMap
        -> Sorted Elements

    =====================================================
    MEMORY TRICK
    =====================================================

    HashSet  -> HashMap
    TreeSet  -> TreeMap

    HashMap  -> Buckets + Hashing
    TreeMap  -> Red-Black Tree

    Hash = Fast
    Tree = Sorted
    =====================================================
    */

}