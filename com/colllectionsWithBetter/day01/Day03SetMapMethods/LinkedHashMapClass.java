package com.colllectionsWithBetter.day01.Day03SetMapMethods;

import java.rmi.MarshalledObject;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;


public class LinkedHashMapClass {
    public static void main(String[] args) {
        // constructor as same as linkedHashSet
        //1
        Map<Integer, String> lMap = new LinkedHashMap<>();
        Map<Integer, String> rMap = new LinkedHashMap<>(10);
        Map<Integer, String> mMap = new LinkedHashMap<>(10, 080f);
        Map<Integer, String> nMap = new LinkedHashMap<>(10, 0.75f, true);
        Map<Integer, String> dMap = new LinkedHashMap<>(Map.of(1, "raja"));






    }
}
