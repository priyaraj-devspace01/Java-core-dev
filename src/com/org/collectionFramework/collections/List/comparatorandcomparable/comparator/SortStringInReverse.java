package com.org.collectionFramework.collections.List.comparatorandcomparable.comparator;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StringReverseComparing implements Comparator<String>
{
   @Override
    public int compare(String o1, String o2)
   {
       return o1.compareTo(o2);
       // it's like
       /*
       if we take apple and banana as order
       then -> we want apple, then banana
           it compares "apple".compareTo("banana") -> here apple comes first then banana, so we need to return opposite
           therefore we use,
           "apple".compareTo("banana"). accordingly which one we want first

           // ALWAYS REMEMBER:
             JUST LIKE NUMBER
             1) if we want the same order as they are use , (FIRST -> SECOND) during comparison
             2) if we want them opposite order as they called,(SECOND -> FIRST)

        */
   }
}

public class SortStringInReverse {
    public static void main(String[] args) {


        List<String> list =  new ArrayList<>(List.of("ram", "apple", "banana", "kite", "fruits"));
//        list.sort(null);// it always sorts on ascending order on the basis of the first letter
//        list.sort(new StringReverseComparing());
        /// using lambda expression
        list.sort((o1, o2)-> o2.compareTo(o1));   // for descending
        System.out.println(list);

    }
}
