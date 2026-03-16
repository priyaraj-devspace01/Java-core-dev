package com.org.java8features.streams.primitiveStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreamClass {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,7};
        IntStream stream = Arrays.stream(numbers);

        System.out.println(IntStream.range(1,5).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1,5).boxed().collect(Collectors.toList()));


                DoubleStream doubles = new Random().doubles().limit(5);

                System.out.println(doubles.sum());
            }
        }

