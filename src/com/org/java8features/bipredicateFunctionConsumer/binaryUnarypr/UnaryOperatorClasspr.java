package com.org.java8features.bipredicateFunctionConsumer.binaryUnarypr;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorClasspr {
    public static void main(String[] args) {

        // Both unary and binary operator are the special case to handle the function,
           // when the both and input and output type are equal
        // In general function
        Function<Integer, Integer> findSqr = num -> num * num;
        Function<String, String>  addTitle = s -> s + "mohanty";

        // but if the in -out are different like below,
        Function<String, Integer> findLen = s ->s.length(); //❌ - NOT APPLICABLE

        // Transformation - function to unary
        UnaryOperator<Integer> findSqr2 = num -> num * num; // it knows that the output type is also an Integer type
        int ans1 = findSqr.apply(2);
        int ans2 = findSqr2.apply(2);
        System.out.println("ans1 : " + ans1 + ", ans2 :" + ans2);


    }
}
