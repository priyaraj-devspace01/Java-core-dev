package com.org.collectionFramework.map.ImmutableMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ImmutableMapDemoClass {
    public static void main(String[] args) {

        // Generally in our general Map We are able to perform any modification
        Map<Integer, String> map  =  new HashMap<>();
        map.put(2, "two");

        Set<Integer> keys = map.keySet();
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Integer key : keys) {
            System.out.println(key);
        }
        for(Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);
        }

        // it's normal

        // what if we want a map which can't be modifiable
        // method - 1 to create
        Map<Integer, String> unmodifiedMap = Collections.unmodifiableMap(map);
        // But the issue is that it taking the reference of map which is a normal map but in future if someone make any changed
        // to map will it affect unmodifiedmap
//        unmodifiedMap.put(33,"thirty three");
//        System.out.println(unmodifiedMap); // unsupportedoperationexception

        // method - 2
        Map<Integer, String> imuute2 = Map.of(001,"emp01", 002, "emp02", 003, "emp03");
        System.out.println(imuute2);
         // but here the limit it can hold upto 10 number of entries,
        // but by using it we can directly can make a immutable map

        // method - 3
        Map<Integer, String> unmodifiedMap2 = Map.ofEntries(Map.entry(001,"code"),Map.entry( 002, "HR"));
        System.out.println(unmodifiedMap2);



    }
}
