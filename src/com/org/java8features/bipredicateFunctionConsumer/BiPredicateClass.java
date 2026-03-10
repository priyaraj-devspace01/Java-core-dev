package com.org.java8features.bipredicateFunctionConsumer;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateClass {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num%2 ==0;


        BiPredicate<Integer, Integer> checkTwoEvenNum  = (num1, num2)-> num1 %2 == 0 && num2%2 == 0;
        if(checkTwoEvenNum.test(22,22))
        {
            System.out.println("both are even ");
        }

        BiPredicate< String, Integer> checkStrLengthMatch =  (s, c)-> s.length() == c;
        if(checkStrLengthMatch.test("liku", 4))
        {
            System.out.println("Matching the string length . ");
        }else
        {
            System.out.println("it's not matching the string length ");
        }
    }
}
