package com.colllectionsWithBetter.addsOnToCollections.streams.parallelStream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamHandsOn01 {
    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(12, 24, 242, 525, 255, 25, 22);

        /// sequential stream - >  one element at a time processed via vertical pipeline
        nums.stream()
                .map(x-> x*x) // stateless operation
                .sorted()  // stateful operation
                .forEach(System.out::println);

        /// parallel Stream
        /*
             - split the data into chunks
              - assign chunk to thread
              - process independently
              - combine result
         */
        nums.stream()
                .map(x->x*x)
//                .forEach(System.out::println);
                .forEachOrdered(System.out::println); // overhead as waiting for all elements to be available to maintain the order



        // split iterator to iterator over parallel stream
        // steps:
//        1) traverse the elements
         //2) decompose the source into parts(fork join pool)
        //3) describe the source

        /*
                            List
                     |
                     v
                    parallelStream()
                     |
                     v
                    Fork
                     |
                     +--------------------+
                     |                    |
                    Worker-1         Worker-2
                     |                    |
                    map()             map()
                     |                    |
                    filter()          filter()
                     |                    |
                     +---------+----------+
                               |
                               v
                             Join
                               |
                               v
                            sorted()
                               |
                               v
                    Collectors.joining(", ")
                               |
                               v
                    "ALEX, CHARLIE, JOHN, PRIYA RAJ"
         */

        // two methods : tryAdvance  - responsible for traversal
//                         trySplit -



        // uses:
         // if we have a large dataset(millions)
         //2) CPU intensive work.
         //3) Stateless operation
         //4) optimized data structure (arrays, arrayList




/*
List<Integer> source = List.of(1, 2, 3, 4, 5);
List<Integer> target = new ArrayList<>(); // Shared Mutable State (same list shared by all threads)

source.parallelStream()
      .forEach(target::add); // ❌ Multiple threads modifying same ArrayList -> Race Condition / Data Loss Possible
Interview One-Liner
// Shared Mutable State: Multiple threads modifying the same mutable object concurrently.
 */





    }
}
