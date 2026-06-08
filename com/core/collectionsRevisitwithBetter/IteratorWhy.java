package com.core.collectionsRevisitwithBetter;

import java.util.*;

public class IteratorWhy {
    public static void main(String[] args) {
        // as all collection class doesn't maintain always the order while traversing, so iterating using for loop with list.size( ) [ not optimized ]
        /// Limitation:
        //1)  not all collection type maintain the index order and even though maintaining the order sometime like in case of linked list it may take o(n2) time which is unoptimized
        //2) we tightly coupled with underlying the data structure and the logic written by us
        // Solution :
        //        Iterable provides a standard way to traverse collections, enables the enhanced for-each loop, and hides the underlying data structure implementation from the client code.

        List<Integer> list = new LinkedList<>();
        // irrespective of any implementing class of Collection it will work properly
        Collection<Integer> c = new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        c.add(7);
        c.add(8);
        c.add(9);
        c.add(10);

        System.out.println(list);

        // now if we want the list to be able to iterate it needs  extends the iterable
        Iterator iterator = c.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();




        // day - 02
        List<Integer> list2 = new ArrayList<>(list);
        list2.add(22);
        list2.add(33);

        Iterator iterator2 = list2.iterator();
        while(iterator2.hasNext())
        {
            System.out.print(iterator2.next() + " ");
        }





    }
}
