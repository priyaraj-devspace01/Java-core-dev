package com.colllectionsWithBetter.addsOnToCollections.BiFunctionalCapability;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class HandsOn {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = Integer::sum;
        System.out.println(sum.apply(11,22));


//        BiConsumer<Integer, Integer> biConsume = (x,y)-> System.out::println; // not work because consumer always expects void - but here we are giving method reference
        BiConsumer<String, String> print = (s1, s2)-> System.out.println(s1.concat(s2));
        print.accept("hello ", "priyaraj");

        BiPredicate<Integer, Integer> biP = (x,y)-> (x+y >= 100);
        boolean isGreaterThanEquals100 = biP.test(100, 100);
        if(isGreaterThanEquals100)
        {
            System.out.println("yes, greater or equals to 100");
        }else {
            System.out.println("smaller than 100 ");
        }



        /// as Supplier doesn't take any parameter so it doesn't support the bi-input
    }
}
