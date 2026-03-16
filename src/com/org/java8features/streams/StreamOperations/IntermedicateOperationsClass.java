package com.org.java8features.streams.StreamOperations;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class IntermedicateOperationsClass {
    public static void main(String[] args) {
         // Intermediate operation transforms a stream into another stream
         // They are lazy, meaning they don't execute until a terminal operation is invoked.


        List<String> names = Arrays.asList("ram", "shyam","shyam", "situ");

        // Filter method.
         // accepts a Predicate
        Stream<String> filtered = names.stream().filter(s->s.startsWith("s")); // intermediate operation
        List<String> collect = filtered.collect(toList()); // terminal operation
        System.out.println(collect);

        // map method - accept function
//        names.stream().map(s-> s.toUpperCase()).forEach(System.out::println);
        List<String> res = names.stream().map(String::toUpperCase).collect(toList());
        System.out.println(res);

        // sorted
        names.stream().sorted((a,b)-> b.compareTo(a)).forEach(x-> System.out.print(x+ " "));
        System.out.println();

        // distinct
        names.stream().filter(x-> x.startsWith("s")).distinct().forEach(x-> System.out.print(x+ " "));
        System.out.println();


        // limit
        names.stream().map(String::toUpperCase).filter(x->x.endsWith("M")).limit(2).forEach(x-> System.out.print(x + " "));
        System.out.println();

        Stream<Integer> list = Stream.generate(()-> 10);
        list.limit(10).forEach(x-> System.out.print(x + " "));

        System.out.println();


        // skip
       Stream<Integer> iterator =  Stream.iterate(1, x-> x+2).limit(10);
       iterator.skip(3).forEach(x-> System.out.print(x +" "));


       // flatMap
        // primarily used for nested list
        // handle the stream of collections, lists, or arrays where each element is itself a collection
        List<List<Integer>> listOfListNum = Arrays.asList(
                Arrays.asList(12, 33),
                Arrays.asList(44, 55)
        );

        listOfListNum.stream().flatMap(Collection::stream).forEach(x-> System.out.print(x+ " "));
        System.out.println();


// split the sentence of different list of streams to one and flat to single strings
        List<List<String>> sentence = Arrays.asList(
                Arrays.asList("hello world"),
                Arrays.asList("java streams are powerful")
        );

        List<String> list1 = sentence.stream()
                .flatMap(Collection::stream)
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .toList();

        System.out.println(list1);

        // peek - primarily used for debugging
        names.stream().peek(System.out::println);










    }
}
