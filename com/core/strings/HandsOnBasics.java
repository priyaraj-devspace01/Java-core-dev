package com.core.strings;

public class HandsOnBasics {
    public static void main(String[] args) {
       String str = "Hello";
       String str2 = "Hello";
        System.out.println(str == str2); // as both pointing to the same object inside the string pool //true


        String str3 = new String("WORLD");
        String str4 = new String("WORLD");
        System.out.println(str3 == str4); // Even though having the same value but pointing to two different objects inside heap //false

    }
}
