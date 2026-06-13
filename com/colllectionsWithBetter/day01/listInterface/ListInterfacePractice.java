package com.colllectionsWithBetter.day01.listInterface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

// List interface :
 //1) Elements have their position.
 //2) Duplicates allowed and insertion order is preserved, and we can access the element by index.
  // After java 21 list interface not directly extends from Collection instead of (Sequence collection)
public class ListInterfacePractice {
    public static void main(String[] args) {

        // SEQUENCE COLLECTION METHODS:
        /*
        1) getFirst( )
        2) getLast()
        3) addFirst()
        4) addLast()
        5) removeFirst()
        6) removeLast



        List interface methods
        1) E get(E index)  --- E -> type of list
        2) E set(E value)
        3) boolean add(index, E value)
        4) boolean addAll(index, Collection<?  extends E>)
        5) boolean remove(index)
        6) indexOf(Object value)
        7) lastIndexOf(Object o)
        8) listIterator()
        9) listIterator(int index) - iteration starts from the index
        10) List.of(Collection)
        11) copyOf(list)            -- unmodifiable


         */

        List<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        System.out.println(list);
        System.out.println(list.get(1));
        list.set(1, 22);
        System.out.println(list);

        list.addAll(0, List.of(12, 224, 455, 333));
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.remove(Integer.valueOf(224));
        System.out.println(list);

        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());


            // move backward
            List<Integer> list2 = Arrays.asList(12, 334, 45, 532);
            ListIterator<Integer> listIterator2 = list2.listIterator(list2.size());
            while (listIterator2.hasPrevious()) {
                System.out.println(listIterator2.previous());
            }


            while (listIterator2.hasPrevious()) {
                System.out.print(listIterator2.previousIndex());
                listIterator2.previous();
            }
            System.out.println();

        }


        // immutable list
//        List<Integer> list3 = List.of(22,45,566,33,2);
////        list3.add(22);   /// not possible
//        System.out.println(list3);
//
//        List<Integer> list4 = List.copyOf(list3);
//        list4.add(22);// not possible
//        System.out.println(list4);
//    }

      // Arrays.asList() - returns the fixed size array of length of total element
        List<Integer> list5 = Arrays.asList(12, 224, 455, 333);
        list5.set(2,44444);

        // but
//        list5.add(44);        /// not possible as the array size is fixes
//        list5.remove(3);
        System.out.println();
    }
}
