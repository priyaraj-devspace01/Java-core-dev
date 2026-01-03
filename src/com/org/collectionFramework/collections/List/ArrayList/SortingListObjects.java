package com.org.collectionFramework.collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class ComparatorClass implements Comparator<String>
{
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}


class NumericComparator implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2) {

        // 3 5
        // 5 3
        return o1-o2;
    }
}

public class SortingListObjects {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>(List.of(12,24,56,77,3,2,31,1));
        list.sort(null);
        // but to sort them in descending order
//        list.sort(new NumericComparator());
        // using lambda expression
        list.sort((a,b) -> b-a);
        System.out.println("Numeric list printing  ... ");
//        Collections.sort(list);
        System.out.println(list);


        List<String>list2 = new ArrayList<>(List.of("ram", "apple", "accept","banana"));
        list2.sort(null);
        System.out.println("String list printing  ... ");

        Collections.sort(list2);
//        list2.sort(new ComparatorClass());
        // using lambda expression
        list2.sort((a,b)->b.length()-a.length());
        System.out.println(list2);


        // in both of the case it only sorts the collection in ascending order,
        // BUT WHAT ABOUT IF WE WANT CUSTOM SORTING
        // based on length, descending order or something like that

        // then we need the help of comparator and comparable

        // in terms of Numbers,
        // my trick always take two example with their expected order
//          example
    /*
              Suppose if we took two numbers 2,5
              case - 1 )if we want them to be in order 2 and then 5,
                                  then  we need to return for the compare method -ve(i,e. first -second) for 2 comes first then 5.

               case -2) if we want them to be in order 5 and then 2,
                                 then we need to return +ve(i,e. second-first) for 5 to become first as we want the order to be.



     */

    }
}
