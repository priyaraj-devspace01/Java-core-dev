package com.colllectionsWithBetter.addsOnToCollections.comparableInterface01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityClass {
    public static void main(String[] args) {
        // it's a utility class with several static method for collections

        /*
           1) sort()
           2) max()
           3) min()
           4) fill(list, 0),
           5) shuffle()
           6) reverse()
           7) swap(list, a, b)
           8) binarySearch( sorted_list, value)  -> in o(log(n) time complexity
           9) frequency(list, value)
           10) Collections.unModifiableList, or set, or map - which can't be modifiable

           11) Collections.emplyList() , or set or map - to handle the null handling
         */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,2);
        Collections.sort(list);
//        Collections.reverse(list);
//        Collections.shuffle(list);
        System.out.println(Collections.binarySearch(list,1));
        System.out.println( Collections.frequency(list, 2));


    }
}
