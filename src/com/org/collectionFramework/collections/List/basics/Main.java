package com.org.collectionFramework.collections.List.basics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Remember before starting with collection framework in java
           /*
             1) Collection framework provides a set of classes and interfaces to manage the objects.
             2) collection_interface - the root interface in collection hierarchy.
             3) then there is mainly four interfaces extending the collection interface
             i) List ii) set iii) queue iv) dequeue




            */


        // 1) List Interface
//           i) it used for ordered collection of elements.
//             ii) can contain the duplicate elements as well


        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<10;i++)
        {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);
    }
}
