package com.colllectionsWithBetter.day01.listInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);
        // at this moment the capacity will shrink to 1.5x of 3
        list.add(444);
        System.out.println(list);

        // remain method are same
        // Advantages:
        /*
            1) random access and better cache for faster access, while for adding and removing needs time (o(n)


            // constructor:
             1) ()
             2) (10)  -- initial capacity
             3) (Collection)


             // Additional methods for arrayList
              ensureCapacity(100)
              trimToSize()


              /// remember :
              1) capacity - how many elements it can hold
              2) size () - how many elements currently in.
         */

        ArrayList <Integer> arrayList = new ArrayList<>(List.of(12,34,55,666,3));
        arrayList.ensureCapacity(100);
        arrayList.trimToSize();


    }
}

/// REMEMBER ALWAYS :
/*
Interview Difference
Feature     	          new ArrayList<>(100)    	ensureCapacity(100)
---------                  ------------------      -------------------------
When used                	During creation             	After creation
Available in	               Constructor	                ArrayList method
Works on List reference	          Yes                         	No
Purpose	                        Initial capacity      	Increase future capacity
 */