package com.org.collectionFramework.collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
        // we can also create a list without using the constructor approach only but there is a small difference
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(123);
        list.add(33);
        list.add(45);
        list.add(456);
        System.out.println(list.getClass().getName());

        list.add(333); // can be possible


        List<Integer> list2 = Arrays.asList(33,3345,6,7,89,9);
        System.out.println(list2.getClass().getName());
//        list2.add(344); // it's not showing issue at compile time but going to be failed at runtime bcz, the Array.asList() always return a fixed size array,
        // but we can replace the values
        list2.set(1,33);
        System.out.println(list2);

        String arr[] = {"liku", "lima","raju"};
        List<String> list3 = Arrays.asList(arr);
//        list3.add("rima");
        list3.set(1,"raja"); // working
        System.out.println(list3);
        // but we can make it modifiable using another list
        List<String> list4 = new ArrayList<>(list3);
        // printing list4
        list4.add("ritu");

        // we can also we use
        List<Integer> integers = List.of(22, 3, 56, 7, 8);
        // the only difference between it and Arrays.asList() is that in Arrays.asList() at least we can replace the values
        // but here once it created it can't be modifiable.
        integers.set(1,22);
//        integers.add(33);   X -> not possible



    }
}
