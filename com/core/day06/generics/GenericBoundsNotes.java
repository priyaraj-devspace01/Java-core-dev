package com.core.day06.generics;

/*
 * GENERIC BOUNDS - COMPLETE NOTES
 *
 * Definition:
 * A bounded type parameter restricts the types that can be passed to a generic.
 *
 * Syntax:
 * <T extends SomeClass>
 *
 * The keyword "extends" is used for BOTH:
 * 1. Class inheritance
 * 2. Interface implementation
 *
 * Generic bounds DO NOT use the "implements" keyword.
 */

import java.util.*;

public class GenericBoundsNotes {

    public static void main(String[] args) {

        /*
         * ==========================================
         * 1. UNBOUNDED GENERIC
         * ==========================================
         */

        Box3<String> stringBox = new Box3<>();
        Box3<Integer> intBox = new Box3<>();
        Box3<Double> doubleBox = new Box3<>();

        // Anything is allowed.

        /*
         * ==========================================
         * 2. BOUNDED GENERIC
         * ==========================================
         */

        NumberBox<Integer> integerBox = new NumberBox<>();
        NumberBox<Double> doubleNumberBox = new NumberBox<>();

        // Valid because Integer and Double extend Number.

        // NumberBox<String> strBox = new NumberBox<>();
        // Compile-time Error.
        // String is NOT a subclass of Number.

        /*
         * ==========================================
         * 3. GENERIC METHOD WITH BOUND
         * ==========================================
         */

        printNumber(10);
        printNumber(25.5);

        // printNumber("Rahul");
        // Compile-time Error

        /*
         * ==========================================
         * 4. COMPARABLE BOUND
         * ==========================================
         */

        System.out.println(findMax(10, 20));

        System.out.println(findMax("Apple", "Banana"));

        /*
         * Works because:
         * Integer implements Comparable<Integer>
         * String implements Comparable<String>
         */
    }

    /*
     * Generic Method
     *
     * T must be a Number or subclass of Number.
     */
    public static <T extends Number> void printNumber(T value) {

        /*
         * Because T extends Number,
         * all Number methods are available.
         */

        System.out.println(value.doubleValue());
    }

    /*
     * Very common interview question.
     *
     * Why Comparable?
     *
     * Because compareTo() is required.
     */

    public static <T extends Comparable<T>> T findMax(T a, T b) {

        return a.compareTo(b) > 0 ? a : b;
    }
}

/*
 * ==========================================
 * UNBOUNDED GENERIC
 * ==========================================
 */

class Box3<T> {

    T value;
}

/*
 * ==========================================
 * BOUNDED GENERIC
 * ==========================================
 */

class NumberBox<T extends Number> {

    T value;

    public void print() {

        /*
         * Allowed because every Number
         * has doubleValue().
         */

        System.out.println(value.doubleValue());
    }
}

/*
 * ==========================================
 * MULTIPLE BOUNDS
 * ==========================================
 */

/*
 * IMPORTANT INTERVIEW CONCEPT
 *
 * WRONG:
 *
 * <T extends Number implements Comparable<T>>
 *
 * Generic bounds NEVER use implements.
 */

/*
 * CORRECT:
 *
 * <T extends Number & Comparable<T>>
 *
 * Use &
 * after the first bound.
 */

class DataProcessor<T extends Number & Comparable<T>> {

    T value;

    public void process() {

        /*
         * Number methods available
         */

        double num = value.doubleValue();

        /*
         * Comparable methods available
         */

        value.compareTo(value);

        System.out.println(num);
    }
}

/*
 * ==========================================
 * PRIORITY RULE
 * ==========================================
 */

/*
 * If a CLASS and INTERFACE both exist:
 *
 * Class MUST come first.
 *
 * Example:
 */

class Example1<T extends Number & Comparable<T>> {

}

/*
 * VALID
 */

/*
 * INVALID
 *
 * <T extends Comparable<T> & Number>
 *
 * Compile-time Error
 */

/*
 * Why?
 *
 * Java allows only one class inheritance.
 *
 * Therefore:
 *
 * Class first
 * Interfaces later
 */

/*
 * General Rule:
 *
 * <T extends ClassName & Interface1 & Interface2 & Interface3>
 *
 * Example:
 *
 * <T extends Number
 *      & Comparable<T>
 *      & Serializable>
 */

/*
 * ==========================================
 * MOST COMMON BOUNDS IN REAL PROJECTS
 * ==========================================
 */

/*
 * Any type
 */
class A<T> {

}

/*
 * Only numbers
 */
class B<T extends Number> {

}

/*
 * Only comparable types
 */
class C<T extends Comparable<T>> {

}

/*
 * Number + Comparable
 */
class D<T extends Number & Comparable<T>> {

}

/*
 * ==========================================
 * DSA INTERVIEW INSIGHT
 * ==========================================
 */

/*
 * Sorting requires comparison.
 *
 * Therefore:
 */

class SortingUtil {

    public static <T extends Comparable<T>> void sort(T[] arr) {

        /*
         * compareTo() can safely be used.
         */
    }
}

/*
 * TreeSet and TreeMap internally depend on ordering.
 *
 * Therefore elements are generally:
 *
 * Comparable
 *
 * OR
 *
 * A Comparator is supplied.
 */

/*
 * FINAL MEMORY TRICK
 *
 * <T>
 *      -> Any type
 *
 * <T extends Number>
 *      -> Only Numbers
 *
 * <T extends Comparable<T>>
 *      -> Only Comparable types
 *
 * <T extends Number & Comparable<T>>
 *      -> Must satisfy BOTH
 *
 * Generic bounds use:
 * extends
 *
 * NEVER:
 * implements
 *
 * Multiple bounds use:
 * &
 *
 * Class ALWAYS comes first.
 */

