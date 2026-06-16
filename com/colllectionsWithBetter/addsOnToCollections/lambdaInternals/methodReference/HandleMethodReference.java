package com.colllectionsWithBetter.addsOnToCollections.lambdaInternals.methodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class HandleMethodReference {
    public static void main(String[] args) {
        // Type of method reference :
        /*
        1) static method reference:
          x -> Math.abs(X) -> (Math::abs)

        2) instance method reference :
        (x) -> sout(x) ---> (System.out::println)

        3) str -> str.isEmpty() --- predicate type lambda expression
        (String::isEmpty)

        => Constructor reference
            () -> ArrayList::new;
         */


//        Supplier<List<Integer>> s = ()-> new ArrayList<>();
        /// using constructor
        Supplier<List<Integer>> list =  ArrayList::new;


    }
}
