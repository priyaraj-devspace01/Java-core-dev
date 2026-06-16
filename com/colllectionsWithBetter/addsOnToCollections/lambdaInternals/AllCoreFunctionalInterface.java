package com.colllectionsWithBetter.addsOnToCollections.lambdaInternals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AllCoreFunctionalInterface {
    public static void main(String[] args) {

        // all inside the java.util.function package

        // Main four major core functional interface,
        ///1) Function
        ///2) Consumer
        ///3) Supplier
        ///4) Predicate




        ///1) Function interface
        /*
            ( take input) -> [perform some operation] -> returns the output
            interface Function<T,R>
             {
                 R apply(T t)
              }
         */

        Function<Integer, Integer> square = x-> x*x;
        System.out.println(square.apply(5));


        ////2) Consumer<T> - take T returns -> nothing(void)
//        public interface Consumer<T>
//        {
//            void accept(T t)
//        }

//        example - (x) -> system.out.println(x);

        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(1);


        /// 3) Supplier - () > return something
        // syntax - Supplier<T> - void - T
//        public interface Supplier<T>
//        {
//            T get();
//        }

        // example - () -> Math.random();

        Supplier<Double> supplier = () -> (double) Math.random();
        System.out.println(supplier.get());


        ////4) Predicate<T>
        // internal-public interface Predicate<T>
//        {
//            boolean test(T t);
//        }

        // syntax - (x) -> (x%2 ==0)


        // example
        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(1));





        ///
        List<Integer> list = new ArrayList<>(Arrays.asList(12,34,56,4,2,25,55));
//        for(Integer i : list) {
//            System.out.println(i);
//        }
        list.forEach((x) -> System.out.println(x));// requires a consumer to print as same as above
    }




    /// Primitive functional interface - (as before all four interfaces accepts Integer - not int) which is more lengthy in terms of autoboxing unboxing if we have n operations
    // that's why java provided some functional interface which often works on primitive types

//    int, long, double - mainly for

    //=====================================================
// 1) Function
//=====================================================

/// IntFunction<R>      = (int -> R(Object))             <-------> ToIntFunction<T>      = (T -> int)

/// LongFunction<R>     = (long -> R(Object))            <-------> ToLongFunction<T>     = (T -> long)

/// DoubleFunction<R>   = (double -> R(Object))          <-------> ToDoubleFunction<T>   = (T -> double)



//=====================================================
// 2) Consumer
//=====================================================

/// IntConsumer         = (int -> void)                  <-------> ObjIntConsumer<T>      = (T,int) -> void

/// LongConsumer        = (long -> void)                 <-------> ObjLongConsumer<T>     = (T,long) -> void

/// DoubleConsumer      = (double -> void)               <-------> ObjDoubleConsumer<T>   = (T,double) -> void



//=====================================================
// 3) Supplier
//=====================================================

/// IntSupplier         = ( ) -> int

/// LongSupplier        = ( ) -> long

/// DoubleSupplier      = ( ) -> double

/// BooleanSupplier     = ( ) -> boolean



//=====================================================
// 4) Predicate
//=====================================================

/// IntPredicate        = (int -> boolean)

/// LongPredicate       = (long -> boolean)

/// DoublePredicate     = (double -> boolean)



//=====================================================
// 5) Unary Operator
//=====================================================

/// IntUnaryOperator    = (int -> int)

/// LongUnaryOperator   = (long -> long)

/// DoubleUnaryOperator = (double -> double)



//=====================================================
// 6) Binary Operator
//=====================================================

/// IntBinaryOperator    = (int,int -> int)

/// LongBinaryOperator   = (long,long -> long)

/// DoubleBinaryOperator = (double,double -> double)                           ObjectDoubleConsumer<T> =========
}
