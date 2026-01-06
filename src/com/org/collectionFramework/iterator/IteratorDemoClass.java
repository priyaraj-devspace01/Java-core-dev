package com.org.collectionFramework.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorDemoClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(122, 22, 345, 2, 34, 32, 2));
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        // but it actually works using iterator which is an interface having method iterator
        Iterator<Integer> iterate = list.iterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + " ");
        }

        System.out.println();
//        List<Integer> testList1 = new CopyOnWriteArrayList<>(List.of(122,22,345,2,34,32,2)); // need to be done (first)
        List<Integer> testList1 = new ArrayList<>(List.of(122, 22, 345, 2, 34, 32, 2));
//        for(Integer i : testList1)
//        {
//            if(i %2 == 0)
//            {
//                testList1.remove(i); // it's not going to work without using the class implementation for copywriterArraylist
//            }
//        }
//
//        System.out.println(testList1);


        // but we can perform the same using the iterator without having any concurrent exception
        Iterator<Integer> ite = testList1.iterator();
        while (ite.hasNext()) {
            int num = ite.next();
            if (num % 2 == 0) {
                ite.remove();
            }
        }


        // Also we have
        ListIterator<Integer> listIterator = testList1.listIterator();
        // then we have some extra method
        while (listIterator.hasNext()) {
            listIterator.set(listIterator.next());
        }
    }
    }
