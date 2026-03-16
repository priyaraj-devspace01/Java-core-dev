package com.org.java8features.streams.collectorDemo;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
     // Collector is a utility class
        // provide a set of methods to create common collectors

        // Collecting to List
        List<String> names = List.of("raju", "raka", "aman");
        List<String> r = names.stream().filter(name -> name.startsWith("r"))
                .collect(Collectors.toList());
        System.out.println(r);

        // Collecting to set
        List<Integer> nums = List.of(12,3,4,12,2,3,4,44,3,2,4);
        Set<Integer> collect = nums.stream().collect(Collectors.toSet());
        System.out.println(collect);

        // collecting to any Collection
        ArrayDeque<String> collect1 = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));


        // joining strings - concatenate string element into a single string
        String collect2 = names.stream().map(String::toUpperCase).collect(Collectors.joining("   "));
        System.out.println(collect2);


        // Summarizing Data
        // Generate statistical summary (count, sum, min, average, max)

        List<Integer> numbers = Arrays.asList(2,345,6,677,8,5);
        IntSummaryStatistics collect3 = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(" min : " + collect3.getMin());
        System.out.println("max : " + collect3.getMax());
        System.out.println("average: " + collect3.getAverage());
        System.out.println("count " + collect3.getCount());
        System.out.println("sum : " + collect3.getSum());

        // also we can do this directly
        Double collect4 = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(collect4);

        // grouping elements
        List<String> strs = List.of("HELLO", "world", "power", "rangers", "eagle", "ram", "anu");
        System.out.println(strs.stream().collect(Collectors.groupingBy(String::length)));
        // approach -1 ( only grouped using Function only


        System.out.println(strs.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(" "))));
        // approach - 2 , ( function for grouping then after perform operations )

        HashMap<Integer, Long> collect5 = strs.stream().collect(Collectors.groupingBy(String::length, HashMap::new, Collectors.counting()));
        System.out.println(collect5);


        // Partitioning elements
        // Partitioning elements into two groups (true and false) based ona predicate

        Map<Boolean, List<String>> collect6 = strs.stream().collect(Collectors.partitioningBy(x -> x.length() > 5));
        System.out.println(collect6);

         // Mapping and Collecting
        // Applies a mapping function before collecting

        System.out.println(strs.stream().collect(Collectors.mapping(x->x.toUpperCase(), Collectors.toList())));

    }
}
