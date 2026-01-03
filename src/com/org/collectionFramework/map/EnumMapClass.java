package com.org.collectionFramework.map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapClass {
    public static void main(String[] args) {



    /*
    it used basically a array of size as same as enum numbers.
    No hashing.
    faster than HashMap used ordinal/ index to store on the array
    it also memory efficient as well
     */
        Map<Day, String> schedule = new EnumMap<>(Day.class);
        // why to use EnumMap class here ?
        /*
        If all the keys in a Map are values from a single enum,
         it is recommended to use an EnumMap as the specific implementation.
         An EnumMap, which has the advantage of knowing all possible keys in advance,
          is more efficient compared to other implementations, as it can use a simple array
           as its underlying data structure.
         */

        schedule.put(Day.TUESDAY, "jogging");
        schedule.put(Day.MONDAY,"GYM");
        // order should be based on the ordinal of the enum values in sequence
        System.out.println(schedule);


    }

}

enum Day
{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
}