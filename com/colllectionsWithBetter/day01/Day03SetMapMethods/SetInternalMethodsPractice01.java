package com.colllectionsWithBetter.day01.Day03SetMapMethods;

import java.util.*;

public class SetInternalMethodsPractice01 {
    public static void main(String[] args) {
        // constructor
        //1)
        Set<Integer> set = new HashSet<>();   // initial size - 16 when exceed size * 0.75% , then resizing
        //2)
        Set<Integer> set2 = new HashSet<>(100);
        //3) with capacity and load factory
        Set<Integer> set3 = new HashSet<>(4, 0.80f);
        //4) pass a collection
        Set<Integer> set4 = new HashSet<>(List.of(12, 34, 12, 34, 134, 2));
        System.out.println(set4);

        // same for LinkedHashMap as well


        // TreeSet -> NavigableSet -> Sortedset -> Set
        // so treeSet implements all the methods


        // constructor type
        Set<Integer> ts = new TreeSet<>();
        //2)
//        Set<Integer> ts2 = new TreeSet<>(List.of(12,34,12,34,134,2));

        ts.add(80);
        ts.add(12);
        ts.add(34);
        ts.add(50);
        System.out.println(ts);
        /// Sorted set methods
//        SortedSet<Integer> sortedSet = new TreeSet<>();
//        NavigableSet<Integer> navigableSet = new TreeSet<>();


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(33);
        treeSet.add(34);
        treeSet.add(50);
        treeSet.add(22);
        treeSet.add(11);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(50));  // strictly less than 50 not 50 inclusive
        System.out.println(treeSet.tailSet(50)); // strictly greater number but not 50
        System.out.println(treeSet.subSet(20, 50)); /// from element is inclusive but the two element is exclusive


        /// Navigable set methods
        System.out.println(treeSet.lower(50));  /// next greatest element less than 50
        System.out.println(treeSet.floor(50));  /// here find the greatest inclusive the 50 as well

        System.out.println(treeSet.higher(50));  /// smallest element greater than 50 strictly
        System.out.println(treeSet.ceiling(50));  /// smallest element greater than 50 but also include 50

        // Navigable other methods like first and last
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());

        /// descending set
        System.out.println(treeSet.descendingSet());
        // descending iterator
        Iterator<Integer> integerIterator = treeSet.descendingIterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }


        // headSet and tailSet - for more control over inclusive and exclusive while extracting
        System.out.println(treeSet.headSet(33, true));
        System.out.println(treeSet.tailSet(33, false));
        System.out.println(treeSet.subSet(20,false, 50, true));
        /// BST - left most node - smallest
//              - right most node - largest

        /// time - o(log(n)) -- for all methods of all treeSet



    }
}
