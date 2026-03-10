package com.org.java8features.bipredicateFunctionConsumer;
import com.org.java8features.consumerpr.ConsumerClass;

import java.util.Random;
import java.util.function.*;

public class ReviseAllPredFunAndConsumeSupplierClass {
    public static void main(String[] args) {

        Predicate<Integer> checkPrime = num ->
        {
            if (num < 2) {
                return false;
            }
            if (num == 2) {
                return true;
            }

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };

        Predicate<Integer> isEven = n -> n > 1 && n % 2 == 0;

        if (checkPrime.and(isEven).test(4)) {
            System.out.println(4 + " is a prime number . and also an even number ");
        } else {
            System.out.println("one of them is not satisfied ");
        }


        Consumer<Integer> letTakeWhtgiven = x -> System.out.println(x);
        letTakeWhtgiven.accept(44);

        Supplier<String> ss = () -> "hiio";
        System.out.println(ss.get());

        Function<Integer, Integer> findSqr = num -> num * num;
        Function<Integer, Integer> findSQRT = num -> (int) Math.sqrt(num);

        Integer ans = findSqr.apply(2);
        System.out.println(ans);

        Integer ans2 = findSQRT.apply(4);
        System.out.println(ans2);

        Integer findSqSqrt = findSqr.andThen(findSQRT).apply(6);
        System.out.println(findSqSqrt);
        // reverse
        Integer findSqrtThenSqr = findSQRT.andThen(findSqr).apply(16);
        System.out.println(findSqrtThenSqr);


        // Bipredicate and Bifunction
        BiPredicate<Integer, Integer> checkBothTwoNums = (n1, n2) -> n1 % 2 == 0 && n2 % 2 == 0;
        if (checkBothTwoNums.test(12, 15)) {
            System.out.println("both are even number ");
        } else {
            System.out.println("both are not even number ");
        }


        BiFunction<String, String, Integer> convertUpperCaseTrimReturnLength = (s1, s2) ->
        {
            s2 = s1.toUpperCase().trim();
            return s2.length();
        };
        Integer lenAfterTrim = convertUpperCaseTrimReturnLength.apply("hitesh   ", "");
        System.out.println("len : " + lenAfterTrim);


        // let's use all together
        Supplier<Integer> iGiveSomething = () -> new Random().nextInt();
        Consumer<Integer> getFromSupplier = n -> System.out.println(n);
        Predicate<Integer> checkPos = n -> n > 0;
        Function<Integer, Integer> performAddition = num -> num + num;

        getFromSupplier.accept(iGiveSomething.get());
        Integer ansLast =Math.abs( iGiveSomething.get());
        System.out.println(ansLast);
        if (checkPos.test(ansLast)) {
            System.out.println( performAddition.apply(ansLast));
        } else {
            System.out.println("its a negative number ");
        }


    }
}

