package com.colllectionsWithBetter.addsOnToCollections.streams.optionalClass;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class PrimitiveOptionalClass {

    public static void main(String[] args) {

        // =========================
        // OptionalInt
        // =========================

        OptionalInt optionalInt = OptionalInt.of(100);

        System.out.println(optionalInt.isPresent());     // true
        System.out.println(optionalInt.getAsInt());      // 100
        System.out.println(optionalInt.orElse(0));       // 100

        optionalInt.ifPresent(value ->
                System.out.println("Value : " + value));

        OptionalInt emptyInt = OptionalInt.empty();

        System.out.println(emptyInt.isPresent());        // false
        System.out.println(emptyInt.orElse(999));        // 999

        // =========================
        // OptionalDouble
        // =========================

        OptionalDouble optionalDouble = OptionalDouble.of(99.99);

        System.out.println(optionalDouble.isPresent());  // true
        System.out.println(optionalDouble.getAsDouble());// 99.99
        System.out.println(optionalDouble.orElse(0.0)); // 99.99

        optionalDouble.ifPresent(value ->
                System.out.println("Double : " + value));

        OptionalDouble emptyDouble = OptionalDouble.empty();

        System.out.println(emptyDouble.orElse(1.1));    // 1.1

        // =========================
        // OptionalLong
        // =========================

        OptionalLong optionalLong = OptionalLong.of(999999L);

        System.out.println(optionalLong.isPresent());    // true
        System.out.println(optionalLong.getAsLong());    // 999999
        System.out.println(optionalLong.orElse(0L));     // 999999

        optionalLong.ifPresent(value ->
                System.out.println("Long : " + value));

        OptionalLong emptyLong = OptionalLong.empty();

        System.out.println(emptyLong.orElse(111L));      // 111

        // =========================
        // orElseThrow()
        // =========================

        OptionalInt optional = OptionalInt.of(10);

        System.out.println(optional.orElseThrow());

        // OptionalInt.empty().orElseThrow(); // Exception

        // =========================
        // stream()
        // =========================

        OptionalInt.of(10)
                .stream()
                .forEach(System.out::println);

        // =========================
        // Primitive Stream Example
        // =========================

        OptionalInt max =
                java.util.stream.IntStream.of(10, 20, 30, 40)
                        .max();

        System.out.println(max.getAsInt()); // 40
    }
}