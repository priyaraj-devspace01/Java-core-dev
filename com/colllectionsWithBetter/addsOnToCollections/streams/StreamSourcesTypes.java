package com.colllectionsWithBetter.addsOnToCollections.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamSourcesTypes {
    public static void main(String[] args) {
        /*
            1) collection
            2) array
            3) stream.of()
            4) infinite stream
            5) primitive stream
         */


        /// let's go one by one
        // source as collection
        List<Integer> numbers = Arrays.asList(12,345,6,78,99,6);
        Stream<Integer> stream = numbers.stream();

        // source as an array
        String[] str = new String[]{"raja", "rahul", "anu", "aman"};
        Stream<String> stream1 = Arrays.stream(str);


        // source as Stream.of
        Stream<Integer> stream2 = Stream.of(12,345,6,78,99,6);

        // empty stream
        Stream<Object> empty = Stream.empty();

        // infinite stream:
          //way -1 (using iterate(seed, nextStep) - >  depends on previous result
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 10).limit(100);
        iterate.forEach(System.out::println);

          // way - 2( using generate)
        Stream<Double> random2 = Stream.generate(Math::random)
                .limit(10);
        random2.forEach(System.out::println);


        // primitive Stream(only for long, int, and double)
        IntStream intStream = IntStream.of( 22,335,6,77);
        // conversion -
//        DoubleStream doubleStream = intStream.mapToDouble(number -> number*number);
        LongStream longStream = intStream.mapToLong(number -> number*number);
        longStream.forEach(System.out::println);





    }
}
