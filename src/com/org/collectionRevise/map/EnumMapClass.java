package com.org.collectionRevise.map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapClass {
    public static void main(String[] args) {

        EnumMap<Days, String> map = new EnumMap<>(Days.class);
        map.put(Days.THURSDAY, "Walk");
        map.put(Days.MONDAY, "Swim");
        System.out.println(map);

    }


    // it is always recommended to use the enumMap instead of normal HashMap where all keys inside the map are the members of an enum.
    // in that case, no having is there need to be performed, because each enum members mapped with their corresponding index/ordinal value, for bucket it directly take that index only.
    // it also maintains the order for storing the map elements irrespective of in which order we are putting the entire.
    enum Days
    {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

    }
}
