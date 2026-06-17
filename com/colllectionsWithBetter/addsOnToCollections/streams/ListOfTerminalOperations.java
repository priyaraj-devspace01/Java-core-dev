package com.colllectionsWithBetter.addsOnToCollections.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfTerminalOperations {
    public static void main(String[] args) {
        /*
        Collecting Results :
          i ) toList
          ii) collect


          Reducing :
             i) reduce
             ii) sum(), min(), max(), avrage(), count(),


           Searching/ Matching:
           i) findFirst()
           ii) findAny()
           iii) anyMatch()
           iv) allMatch()
           v) noneMatch()


           Iterations:
           i) forEach
           ii) forEachOrdered()
         */



        /// let's practically implement one by one
        // Iterations
        List<Integer> list = new ArrayList<>(Arrays.asList(1,33,42,45,3,24,55));


        // forEach
        list.stream()
                .map(x-> x+1)
                .forEach(System.out::println);

        System.out.println("Parallel stream iteration .. ");
        // parallelStream - when more than one element iteration  at a time
         list.parallelStream()
                 .map(x-> x+1)
                 .forEachOrdered(System.out::println);



         ///2) Collecting the Results
          //typ2e - 1 (using toList() - > returns a immutable list which can't be used further)
        List<Integer> list1 = list.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        System.out.println(list1);

        /// type-2 (using collect(Collectors -> again this class provides a lots of functionality ))
        System.out.println("collect using collectors");
        Set<Integer> collect = list.stream()
                .filter(x -> x > 2)
//                .collect(Collectors.toList());
        .collect(Collectors.toSet());

        collect.add(2);
        System.out.println(collect);

        // reduce - Performs a reduction on the elements of this stream, using an associative accumulation function, and returns an Optional describing the reduced value, if any. This is equivalent to:
//        Optional<Integer> reduce = list.stream()
//                .reduce((a, b) -> a + b);
//        System.out.println(reduce.get());

        /// option-2 use constructor asking for identity for Integer
        Integer ans = list.stream()
                .reduce(0, Integer::sum);
        System.out.println(ans);

        /// count - operation - returns the count as the result of the end operation
        long count = Stream.of(12,44,2,4,2,422)
                .filter(x -> x > 22)
                .count();
        System.out.println("there are total " + count + " numbers are there which are greater than 22");




        /// Matching
        // findFirst()
        Optional<Integer> first = Stream.of(12, 3, 2, 43, 22, 42, 42, 2)
                .filter(x -> x > 10)
                .findFirst();
//        System.out.println(first.get());

        Optional<Integer> any = Stream.of(12, 3, 2, 43, 22, 42, 42, 2)
                .filter(x -> x % 2 == 0)
                .findAny();
//        System.out.println(any.get());
//        System.out.println(any.isPresent());


        // condition based selection
        /// task-numbers needs are divisible by 2 for each case let's check and must be greter than 10
        boolean b = Stream.of(1, 24, 56, 3, 2, 35, 234, 255, 24)
                .filter(x -> x > 20)
//                .anyMatch(x -> x % 2 == 0); /// means only one match can be accepted
//        .allMatch(x -> x % 2 == 0); // means all matches should be satisfied
        .noneMatch(x -> x % 2 == 0); // means none to be satisfied
        System.out.println(b);


    }
}
