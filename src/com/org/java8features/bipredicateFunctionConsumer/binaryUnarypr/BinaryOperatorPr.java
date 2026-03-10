package com.org.java8features.bipredicateFunctionConsumer.binaryUnarypr;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorPr {
    public static void main(String[] args) {

        // how it works ?
//        normal bi- function
        BiFunction<Integer, Integer, Integer> firstAddThenSqr = (num1, num2)->
        {
            int ans = num1+ num2;
            return ans * ans;
        };
        Integer res = firstAddThenSqr.apply(2,14);
        System.out.println(res);

        // Let's perform the same with binary operator
         // REMEMBER - IT only applicable if the input and output are same, irrespective of whether it's a function or bi-function

        BinaryOperator<Integer > findSumThenSubtract =  (num1, num2) -> (num1 + num2 ) -num2;
        int ans = findSumThenSubtract.apply(20, 10);
        System.out.println(ans);


    }
}
