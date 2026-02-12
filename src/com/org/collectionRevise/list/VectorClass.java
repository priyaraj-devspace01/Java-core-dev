package com.org.collectionRevise.list;

import com.org.collectionFramework.collections.List.ArrayList.ArrayAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) throws InterruptedException {
        // other implementation class of List interface but, legacy and thread safe having memory overhead and performance overhead also in case of single threaded env
        Vector<Integer>  vector = new Vector<>();
        // it is also uses the dynamic array as arraylist , and all the other methods are same but thread safe ,


        // Remember :
//        for vector only we can add the initial capacity with increment capacity value , accordingly it will shrink(10, if i_value - 2, new capacity - 12 )
        Vector <Integer> vector2 = new Vector<>(3, 2);
        System.out.println(vector2.capacity());
        vector2.add(33) ;
        vector2.add(44);
        vector2.add(55);
        vector2.add(66);
        System.out.println("incremented " + vector2.capacity());


        // example :
//        ArrayList<Integer> vector3 = new ArrayList<>();
               Vector<Integer> vector3 = new Vector<>();
       Thread t1 = new Thread(() -> {
           for(int i = 0;i<1000;i++)
           {
                vector3.add(i) ;
           }
       });

        Thread t2 = new Thread(() -> {
            for(int i = 0;i<1000;i++)
            {
                vector3.add(i) ;
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(vector3.size());
    }
}
