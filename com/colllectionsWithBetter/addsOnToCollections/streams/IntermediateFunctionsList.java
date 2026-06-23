package com.colllectionsWithBetter.addsOnToCollections.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateFunctionsList {
    public static void main(String[] args) {

        List<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(26);
        aList.add(43);
        aList.add(44);
        aList.add(53);
        aList.add(6);
        aList.add(72);
        aList.add(82);
        aList.add(91);
        aList.add(1011);
        aList.add(111);

        // =========================================================
        // 1. FILTER
        // Used to filter elements based on condition
        // =========================================================
        aList.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        // =========================================================
        // 2. MAP
        // Transform one object into another
        // Most used operation in production
        // =========================================================
        aList.stream()
                .map(x -> x * 10)
                .forEach(System.out::println);

        // =========================================================
        // 3. DISTINCT
        // Removes duplicate values
        // =========================================================
        Stream.of(1, 1, 2, 2, 3, 4, 4)
                .distinct()
                .forEach(System.out::println);

        // =========================================================
        // 4. SORTED
        // Natural sorting
        // =========================================================
        aList.stream()
                .sorted()
                .forEach(System.out::println);

        // =========================================================
        // 5. SORTED WITH COMPARATOR
        // Descending order
        // =========================================================
        aList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // =========================================================
        // 6. LIMIT
        // Take first N records
        // Very common for pagination
        // =========================================================
        aList.stream()
                .limit(5)
                .forEach(System.out::println);

        // =========================================================
        // 7. SKIP
        // Skip first N records
        // Used in pagination
        // =========================================================
        aList.stream()
                .skip(5)
                .forEach(System.out::println);

        // =========================================================
        // 8. PEEK
        // Debugging stream data
        // Avoid business logic here
        // =========================================================
        aList.stream()
                .peek(x -> System.out.println("Before : " + x))
                .map(x -> x * 10)
                .forEach(System.out::println);

        // =========================================================
        // 9. FLATMAP
        // Converts Stream<Collection<T>>
        // into Stream<T>
        // Most important interview topic
        // =========================================================
        List<List<Integer>> nestedList = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );

        nestedList.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        // =========================================================
        // 10. TAKEWHILE (Java 9+)
        // Take elements until condition fails
        // =========================================================
        List<Integer> orderedList =
                List.of(1, 2, 3, 4, 5, 10, 2, 3);

        orderedList.stream()
                .takeWhile(x -> x < 6)
                .forEach(System.out::println);

        // =========================================================
        // 11. DROPWHILE (Java 9+)
        // Drop elements until condition fails
        // =========================================================
        orderedList.stream()
                .dropWhile(x -> x < 6)
                .forEach(System.out::println);



        /*
                    takeWhile()

            👉 Take elements while the condition is true. Stop when it becomes false.

            List<Integer> numbers = List.of(1, 2, 3, 4, 1, 2);

            numbers.stream()
                   .takeWhile(n -> n < 4)
                   .forEach(System.out::println);

            Output:

            1
            2
            3

            Explanation:

            1 < 4 ✅
            2 < 4 ✅
            3 < 4 ✅
            4 < 4 ❌ Stop here

            Everything after 4 is ignored.

            dropWhile()

            👉 Skip elements while the condition is true. Once false is found, return the rest.

            List<Integer> numbers = List.of(1, 2, 3, 4, 1, 2);

            numbers.stream()
                   .dropWhile(n -> n < 4)
                   .forEach(System.out::println);

            Output:

            4
            1
            2

            Explanation:

            1 < 4 ✅ Skip
            2 < 4 ✅ Skip
            3 < 4 ✅ Skip
            4 < 4 ❌ Stop skipping

            Return everything from 4 onward.
                     */

    }
}