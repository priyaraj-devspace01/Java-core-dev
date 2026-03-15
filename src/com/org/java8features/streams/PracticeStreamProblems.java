package com.org.java8features.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeStreamProblems {
    public static void main(String[] args) {
        // find the numbers starting with digit 1
        List<Integer> nums = List.of(10, 23, 14, 45, 19, 2);
        List<String> list = nums.stream().map(n -> n.toString()).filter(s -> s.charAt(0) == '1').toList();
        System.out.println(list);

        // find the duplicate elements
        List<Integer> nums2 = List.of(1,2,3,4,2,5,3,6);




        // joins the string to form the sentence
        List<String> words = List.of("Java","streams","are","powerful");
       String s =  words.stream().collect(Collectors.joining(" "));
        System.out.println(s);


        // Find the sum of squares
        List<Integer> numsqrSum = List.of(1,2,3,4);
        Integer reduced = numsqrSum.stream().map(n -> n * n).reduce(0, (x,y)-> x+y);
        System.out.println(reduced);


        // find the second Largest number on list
        List<Integer> myList = List.of(3,4,56,778,9,32,3333,223);
        Optional<Integer> first = myList.stream().sorted((a, b) -> b - a).skip(1).findFirst();
        System.out.println(first.get());

        // find the duplicates
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicatedList = List.of(1,2,3,4,2,5,3,6);
      List<Integer> ans =   duplicatedList.stream().filter(x ->
        {
            return !set.add(x);
        }).toList();
        System.out.println(ans);

        // find the first non-repeating element from the list
        List<Integer> list5 = List.of(4,5,1,2,0,4);
        Optional<Integer> result =
                list5.stream()
                        .filter(n -> Collections.frequency(list5, n) == 1)
                        .findFirst();

        result.ifPresent(System.out::println);





    }
}
