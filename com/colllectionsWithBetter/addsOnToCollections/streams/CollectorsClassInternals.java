package com.colllectionsWithBetter.addsOnToCollections.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsClassInternals {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        /// Basic conversion for toList(), toSet(), toMap()



        //1) toList()
        List<Integer> collect = list.stream()
                .map(x -> x + 2)
                .collect(Collectors.toList());

        //2) toSet
        Set<Integer> collect1 = list.stream()
                .map(x -> x + 1)
                .collect(Collectors.toSet());



        /// now to hands on for toMap let's take scenario, where we need to store the word lengths as key and word itself in value via stream
        List<String> words = Arrays.asList("AAA","BB", "CCCCC", "DDDDDDD", "EEEEEEEEEEEEEEE", "FF", "GGG");
//        Map<Integer, String> map = words.stream()
//                .collect(Collectors.toMap(
//                        String::length,
//                        s ->s
//                ));
//
//        System.out.println(map);




        /// groupingBy
        Map<Integer, List<String>> collect2 = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect2);


        /// partitioningBy
        Map<Boolean, List<Integer>> collect3 = list.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect3);

        // we can also use the collectors.mapping inside the groupingBy as a parameter


        /// mapping with groupingBy
        Map<Integer, List<String>> ansFinal =  words.stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.mapping(String::toLowerCase, Collectors.toList())));
        System.out.println(ansFinal);


        /// joining
        String collect4 = words.stream()
                .collect(Collectors.joining("-"));
        System.out.println(collect4);


    }
}
