package com.colllectionsWithBetter.addsOnToCollections.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateHandsOn02 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // filter and map
        list.stream()
                .filter(e-> e % 2 == 0)
                .map(e -> e + e)
                .forEach(System.out::println);


        /// flatMap
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(12,345,56,33,2), Arrays.asList(222,22,43,2,2));
        // if we try to do it with normal map
//        listOfLists.stream()
//                .map(x-> x*2)
//                .forEach(System.out::println);

        /// can't infere issue
        // we need to use the flatMap
        listOfLists.stream()
//                .flatMap(x->x.stream())
                /// or
                .flatMap(Collection::stream)
                .map(x-> x*2)
//                .sorted()  // sort the list

                // or may be with descending order using comparator
                .sorted((a,b)->b-a)     /// stateful, wait until all the elements comes first
                .forEach(x-> System.out.print(x+ " "));
        System.out.println();


        list.stream()
                .map(x-> x*2)
                .distinct()
                .forEach(System.out::println);




        // limit and skip

        Stream<Integer> iterate = Stream.iterate(1, i -> i + 1);
        iterate.limit(15)
                .skip(5)
                .forEach(x-> System.out.print(x+ " "));
        System.out.println();


        /// peek() -generally used for debugging
        System.out.println("peek debugging ................");  // because if we put the debugger at the end it will stop at the end, but at the mid-step we can't see what's happening, so need to use peek()
        List<Integer> listMine = Arrays.asList(12,3,2,4,22,52,2,1);
        listMine.stream()
                .filter(x -> x>20)
                .peek(System.out::println)
                .map(x->x*2)
                .sorted()
                .limit(2)
                .forEach(x-> System.out.print(x+ " "));
        System.out.println();


    }
}
