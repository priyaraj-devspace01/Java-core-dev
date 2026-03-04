package com.org.collectionRevise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterableClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for (Integer integer : list) {
            System.out.println(integer);
        }


        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext())
        {
            listIterator.set(2);
        }


    }
}
