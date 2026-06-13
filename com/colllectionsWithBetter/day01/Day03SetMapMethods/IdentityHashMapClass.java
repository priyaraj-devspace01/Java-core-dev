package com.colllectionsWithBetter.day01.Day03SetMapMethods;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IdentityHashMapClass {
    public static void main(String[] args) {

        // in case of HashMap it compares the objects , keys and values based on values inside them
        Map<String, Integer> map = new HashMap<>();
        map.put(new String("two"),1);
        map.put(new String("one"),1);
// don't consfuse at the output if the order is not correct as hashMap doesn't maintain the order it is fine, you can also use LinkedHashMap for proper order of insertion output
        System.out.println(map);


        Map<String, Integer> map2 = new IdentityHashMap<>();  //it uses ==  as the reference of string object provided by Object class default equals returns false, it will add both
        map2.put(new String("one"),1);
        map2.put(new String("one"),1);
        System.out.println(map2);
        // used for graphs topological sorting
    }
}
