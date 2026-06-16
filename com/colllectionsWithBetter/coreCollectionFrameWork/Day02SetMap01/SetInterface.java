package com.colllectionsWithBetter.coreCollectionFrameWork.Day02SetMap01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        // Duplicates are not allowed
        // constant time search operation.

        // disadvantages:
          // it doesn't allow us for positional search.
        Set<String> set = new HashSet<>();
        set.add("aman");
        set.add("aman");
        System.out.println(set); // duplicates are not allowed
        System.out.println(set.contains("ajay"));

        // Demo
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "aman");
        map.put(1, "aman");
        map.put(2, "ajaya");
        System.out.println(map);
        System.out.println(map.containsKey(0));
        System.out.println(map.get(1));

    }
}
