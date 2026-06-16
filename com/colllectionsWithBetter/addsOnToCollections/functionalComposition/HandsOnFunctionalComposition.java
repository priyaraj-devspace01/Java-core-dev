package com.colllectionsWithBetter.addsOnToCollections.functionalComposition;

import java.util.function.Function;

public class HandsOnFunctionalComposition {
    public static void main(String[] args) {
//        Function<Integer, Integer>  fun  =  (x )->x*x;
//        System.out.println(fun.apply(22));;

        /// andThen and compose
        /// operation - ((x+2)*3)


//        Function<Integer, Integer> fun2 = (x)-> ((x+2)*3);
        // break it into parts
        Function<Integer, Integer> eq1 = (x)-> (x+2);
        Function<Integer, Integer> eq2 = (x)-> (x*3);

//        int a  = eq1.apply(2);
//        int b  = eq2.apply(a);

        // or
//        int c = eq2.apply(eq1.apply(2));
        //g(f(x))

        int ans = eq1.andThen(eq2).andThen((x)-> x*x*x).apply(2);  // left to right
        /// meaning - input(function) -->  output - apply(function)
        System.out.println(ans);

        // but remember - g(f(x)) but the f(x) return type of output and g(x) input type must be same



        /// compose()
        // it's the reverse of andThen() ---- right to left
        Function<Integer, Integer > eq3 = (x)-> x + 100;
        Function<String, Integer> eq4  = Integer::parseInt;

        String apply = String.valueOf(eq3.compose(eq4).apply("2"));
        System.out.println(apply);


    }
}
