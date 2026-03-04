package com.org.java8features.predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateClass {
    public static void main(String[] args) {

        // it's a functional interface,
//        Predicate - boolean valued function representing
//        Predicate<Integer> salaryGreaterThan1Lac = x -> x>100000;
//        System.out.println(salaryGreaterThan1Lac.test(20000));

        // let's play with predicates
        Predicate<Integer> findBiggerThan100 = x -> x%2 ==0 && x >100;
        List<Integer> list = List.of(22,34,55,6676,22,442);
        for(Integer i : list){
            if(findBiggerThan100.test(i))
            {
                System.out.print(i+", " );
            }
            System.out.println();
        }



        Predicate<String> checkValidity = s->s.startsWith("A");
        List<String >names = List.of("Arun", "Amaan", "anu");
        for(String s : names){
            if(checkValidity.test(s))
            {
                System.out.println(s + "it's starting with A");
            }
        }


    }
}
