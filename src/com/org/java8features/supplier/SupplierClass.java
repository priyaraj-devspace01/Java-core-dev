package com.org.java8features.supplier;

import java.util.Random;

import java.util.function.Supplier;


public class SupplierClass {
    public static void main(String[] args) {
        // it's also a functional interface having only one abstract method - get( )
//         Supplier


        Supplier<String> giveHello = () -> "Hello i supplied hello ";
        Supplier<Integer> giveRandomNum = ()-> new Random().nextInt();


        System.out.println(giveHello.get());

        System.out.println(giveRandomNum.get());


    }
}
