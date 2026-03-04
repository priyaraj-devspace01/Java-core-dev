package com.org.collectionRevise.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapClass {
    public static void main(String[] args) {

        NavigableMap<Integer, String> map = new TreeMap<>();
//         SortedMap(i)  --------> NavigableInterface(i) -----> TreeMap(c)

        // it provides navigation to the elements
        map.put(1, "22");
        map.put(2, "33");
        map.put(22, "44");
        map.put(4, "55");

        System.out.println(map.lowerKey(2)); //1
        System.out.println(map.higherKey(2)); // greater or equal
        System.out.println(map.ceilingKey(2));
        System.out.println(map.reversed());
        System.out.println(map.descendingKeySet());
        System.out.println(map.keySet());


    }
}
