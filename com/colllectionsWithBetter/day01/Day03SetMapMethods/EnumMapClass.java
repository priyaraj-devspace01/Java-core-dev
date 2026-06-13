package com.colllectionsWithBetter.day01.Day03SetMapMethods;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

enum Day
{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
public class EnumMapClass {
    public static void main(String[] args) {
        // if we have a scenarios when we want to use the enum constants to be key of our Map , then instead of using
        // HashMap class which uses hashing may be having collision chances, we may prefer EnumMap instead
        // which uses the ordinal values for the bucket index respectively, which more efficient in memory wise
        // but TERMS TO REMEMBER:
          // it doesn't allow null keys but null values are allowed.
          // Hashing ( x )
          // memory efficient


//        Map<Day,Integer> map = new HashMap<>();
        /// instead of it use EnumMap
        Map<Day, Integer> daysMap = new EnumMap<>(Day.class);  // here we need to pass the enum to the constructor
        daysMap.put(Day.MONDAY, 1);
        daysMap.put(Day.TUESDAY, 2);
        daysMap.put(Day.WEDNESDAY, 3);
        daysMap.put(Day.THURSDAY, 4);
        daysMap.put(Day.FRIDAY, 5);
        daysMap.put(Day.SATURDAY, 6);
        daysMap.put(Day.SUNDAY, 7);

        Set<Map.Entry<Day, Integer>> entries = daysMap.entrySet();
        for(Map.Entry<Day, Integer> entry : entries){
            Day day = entry.getKey();
            Integer value = entry.getValue();
            System.out.print(day + " : " + value+ ", ");

        }
        System.out.println();

    }
}
