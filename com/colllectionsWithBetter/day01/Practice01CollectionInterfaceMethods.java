package com.colllectionsWithBetter.day01;

import java.util.*;

public class Practice01CollectionInterfaceMethods
{
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);


        //1) size()
        System.out.println(collection.size());

        //2) isEmpty()
        System.out.println(collection.isEmpty());

        //3) boolean contains(Object o)
        System.out.println(collection.contains(1));

        // iterate () -as collection implements iterable

        //5) toArray() - converts object array
//        Object[] array = collection.toArray();
//        for(Object o : array){
//            System.out.println(o);
//        }

        // T[] toArray(T[] a)
         // Type specific
        Integer[] array = collection.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

         Collection<Integer> c2 = new HashSet<>();
         c2.add(3);
        // Boolean add(E e)
        boolean a  = c2.add(3); // duplicate element entering again
        System.out.println(a);

        // boolean remove(Object obj)
        System.out.println(collection.remove(1)); //true
        System.out.println(c2.remove(55)); //false - not present

        System.out.println(collection);


        // addAll(Collection<? extends E> c)
        c2.addAll(List.of(122,335,556,66,4));
        System.out.println(c2);

        // containsAll(Collection<?> c);
        System.out.println(c2.containsAll(List.of(122,335)));

        // boolean removeAll(Collection<?> c)
        System.out.println(c2.removeAll(List.of(122,335)));


        // boolean retainAll(Collection<?>c)
        Collection<Integer> c3 = new ArrayList<>(List.of(12,335,553,2,52,2));
        c3.retainAll(List.of(12, 2));
        System.out.println(c3);

        // clear
        c3.clear();
        System.out.println(c3);



    }
}
