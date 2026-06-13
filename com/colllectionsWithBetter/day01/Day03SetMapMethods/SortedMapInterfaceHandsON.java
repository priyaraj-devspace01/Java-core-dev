package com.colllectionsWithBetter.day01.Day03SetMapMethods;

import com.sun.source.tree.Tree;

import javax.swing.*;
import java.util.*;

public class SortedMapInterfaceHandsON {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>(Map.of(1, "one",  2, "two", 3, "three"));
        // same method as sorted set but only based on keys
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(2)); // 2 is not inclusive
        System.out.println(map.tailMap(2)); //2 is inclusive

        System.out.println(map.subMap(1, 3));  // 1 is inclusive but 3 is not





    }
}
