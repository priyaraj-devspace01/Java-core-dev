package com.colllectionsWithBetter.coreCollectionFrameWork.Day03SetMapMethods;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapInterfaceHandsOn {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(1, "raja");
        map.put(2, "rajesh");
        map.put(5, "aman");


        System.out.println(map);
        System.out.println(map.headMap(2, true));
        System.out.println(map.headMap(2, false));
        System.out.println(map.tailMap(2, true));
        System.out.println(map.tailMap(2, false));


        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

        System.out.println(map.lowerEntry(2));
        System.out.println(map.higherEntry(2));

        System.out.println(map.ceilingEntry(2));
        System.out.println(map.floorEntry(2));

        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());

        System.out.println(map.subMap(1, true, 2, false));


        System.out.println( map.descendingMap());
        System.out.println(map.descendingKeySet());;


    }
}
