package com.colllectionsWithBetter.addsOnToCollections.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // way - 1
        Stream<Integer> stream  = numbers.stream();
        stream.filter(number -> number % 2 == 0)
                .filter(number-> number >4)
                .map(x->x*x)
                .toList()
                .forEach((x) -> System.out.print(x + " "));
        System.out.println();


        /// way -2 ) direct approach
        numbers.stream()
                .filter((number -> number%2 ==0 ))
                .filter(num -> num > 4)
                .forEach(System.out::println);
    }
}
