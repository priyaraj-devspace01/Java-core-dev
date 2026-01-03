package com.org.collectionFramework.collections.List.basics;

import java.util.ArrayList;

public class WhyNeedCollection {
    public static void main(String[] args) {

        // type safety
        // compile time checking
        // resizeable array
        // ready-made data structures


        // Problem
        Object[] objArr= new Object[3];
        objArr[0] = 11;
        objArr[1] = "liku";

        // not type safe


        // compile time check failure case without generics
        ArrayList  list  = new ArrayList();
        list.add(33);
        list.add("22");

//        int x = (int)list.get(1); // no compile time error
//        System.out.println(x);

        int []arr = {222,33,4,5,5};
//        arr[8] = 44;// non-resizeable



        // But due to collection, we can solve these all

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(22);
//        list2.add("liku"); // checked at compile type



    }
}
