package com.org.collectionFramework.collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {

        //List<Integer> list = new ArrayList<>();
//        or

        ArrayList<Integer> list2 = new ArrayList<>();
                                     //        Always remember during arraylist object creation for its constructor either we can
//                                     pass either the capacity or other collection

        ArrayList<Integer> lista = new ArrayList<>(10);
        List<Integer> listb= new ArrayList<>(List.of(22,445,566,7));
        listb.add(44);
        System.out.println("printing list b ");
        System.out.println(listb);
        List<Integer>listc = new ArrayList<>(Arrays.asList(22,445,566,7));
        System.out.println("printing list c ");
        System.out.println(listc);
        // These both can be possible

        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);

        // to get the list initial capacity - initial capacity is always - 10 later resizeable
        System.out.println(list2.size());


        // to get the value with index
        System.out.println(list2.get(2));
        // to add an element at any position on the list
        list2.add(2,44);
        // to set which replace the element any index
        list2.set(2, 44);
        System.out.println(list2);


        // iteration -1
        for(int i = 0;i< list2.size();i++)
        {
            System.out.print(list2.get(i));
        }
        System.out.println();


        System.out.println("Using enhanced loop");
        // iteration -2
        for(Integer i : list2)
        {
            System.out.print(i);
        }
        System.out.println();


        // we can also set the initial capacity as well
        list2.ensureCapacity(20);
        System.out.println(list2.size()); // it's not going to show 20 because it's only getting the total current element present .


        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>(List.of(33,44,56,78,7744,3));
        list4.addAll(list5);
        System.out.println(list4);


        list4.remove(1);
        // removes by index
        list4.remove(Integer.valueOf(33));
        // removes by value
        // check the value presence
        System.out.println(list4.contains(44));

        // convert list to array
        Object[] array  = list4.toArray();
        Integer[] array1 = list4.toArray(new Integer[0]);


        // we can sort the list as well
        Collections.sort(list4);
        // or else we can also use
        list4.sort(null); // using comparator
        System.out.println(list4);












        // Internal Working
            /*
           1) When you create an ArrayList, it has an initial capacity (default is 10).
           The capacity refers to the size of the internal array that can hold elements before
            needing to resize.

         //------WORKING---------------

            When we add an element to an ArrayList, the following steps occur
              1)Check Capacity: Before adding the new element, ArrayList checks if there is enough space in
               the internal array (elementData). If the array is full, it needs to be resized.
              2) Resize if Necessary: If the internal array is full, the ArrayList will create a new array with a
                larger capacity (usually 1.5 times the current capacity) and copy the elements from the old array to the
                 new array.
               3)Add the Element: The new element is then added to the internal array at the appropriate index,
                  and the size is incremented.



                  // -----------RESIZING THE ARRAY .............
                  . Initial Capacity: By default, the initial capacity is 10. This means the internal array can
                  hold 10 elements before it needs to grow.  .
                  Growth Factor: When the internal array is full, a new array is created with a size 1.5 times
                  the old array. This growth factor balances memory efficiency and resizing cost.  .
                   Copying Elements: When resizing occurs, all elements from the old array are copied to the new array,
                   which is an O(n) operation, where n is the number of elements in the ArrayList.

                   // -----------REMOVING THE ELEMENT ............
                   . Check Bounds: The ArrayList first checks if the index is within the valid range.
                   . Remove the Element: The element is removed, and all elements to the right of the
                   removed element are shifted one position to the left to fill the gap.  .
                   Reduce Size: The size is decremented by 1.


                   // TIME COMPLEXITY.
                   Time Complexity  . Access by index (get) is O(1).
                                    . Adding an element is O(n) in the worst case when resizing occurs.
                                    . Removing elements can be O(n) because it may involve shifting elements.
                                    . Iteration is O(n).


             */

    }
}
