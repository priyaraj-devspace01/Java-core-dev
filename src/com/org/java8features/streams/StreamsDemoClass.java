package com.org.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemoClass {
    public static void main(String[] args) {
        // it also a java 8 feature, by using which we can process collections of data in a functional and declarative manner
        // simplify the data processing,
        // Embrace the functional programming,
        // improve readability and maintainability
        // Enable easy parallelism

        // how to use stream ?
         // source, intermediate operations & terminal operation


        // What is Streams ?
         // A sequence of elements supporting functional and declarative programming.


        List<Integer> list = List.of(12,2,3,4,56,7,866,77,33);
        // problem without stream
          // let's suppose we want to find the even numbers count
         int count = 0;
         for(int n : list)
         {
             if(n%2 ==0)
             {
                 System.out.print(n+ " ");
                 count++;
             }
         }
        System.out.println();
        System.out.println(count);


        // instead we can tae the help of stream as well
        long count1 = list.stream().filter(s -> s % 2 == 0).count();
        System.out.println(count1);

        // Creating Stream
        //1. from Collection
        // list.stream()
        //2 .Array  to stream
        String[]arr = {"a","b","c"};
        Stream<String> streamOfArr = Arrays.stream(arr);
        //3 . using Stream.of()
        Stream<String> stream2 = Stream.of("a", "b");
        //4. infinite length
        Stream<Integer> limit = Stream.generate(() -> 1).limit(100);

        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(10).collect(Collectors.toList());
        System.out.println(collect);

    }
}
