package com.org.java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LazyOPerationsClass {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Raja", "mali", "ram", "himesh"));
         Stream<String> nameList = names.stream().filter(s->
         {
             System.out.println("Filtering "+ s);
             return s.length()> 3;
         });
        System.out.println("BEFORE TERMINATION . ");   // it executes first as before this even if the filtering is performing it's still a lazy intermediate method should not be called until the terminal operation called it so waited and when terminal called it's executed

        List<String> list = nameList.toList();


        System.out.println("After Termination . ");
        System.out.println(list);

    }
}
