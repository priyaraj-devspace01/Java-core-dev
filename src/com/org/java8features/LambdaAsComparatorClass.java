package com.org.java8features;

import java.util.*;

class SortListInAscendingOrder implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2)
    {
        return o2-o1;
    }
}


class Student {
    int mark;
    String name;


    Student(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    public int getMark()
    {
       return mark;
    }
    public String getName()
    {
        return name;
    }


}
 // so for each custom sorting logic we need to create multiple implementing class separately, instead we can use the lambda expression

public class LambdaAsComparatorClass {
    public static void main(String[] args) {
          // use -1 ( lambda for normal sorting)
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(12,333,2,33342,32,332,2,1));
        System.out.println("Before sorting : " + list);
        // Approach -1 of sorting
        Collections.sort(list);
        System.out.println("After sorting : " + list); // Normal sorting always ascending

        // descending order
        Collections.sort(list, new SortListInAscendingOrder());
        System.out.println("After sorting for descending order :  : " + list);

        // Approach 2
        list.sort(new SortListInAscendingOrder());
        System.out.println("After sorting for ascending order :  : " + list);

        // ------ What if we want custom sorting like descending order ------ //
          // 1) Either we can create a class for implementing the comparator class to implement the compare method to pass here as second arg
           //2) else we can use lambda expression

        // POWER OF LAMBDA EXPRESSION
        System.out.println(" ..................USE LAMBDA ...........................");
        Collections.sort(list, (a,b)->b-a);
        System.out.println("sort 1 using lambda "  + list);

        list.sort((a,b)->b-a);
        System.out.println("sort 2 using lambda " + list);

        System.out.println("----custom sorting for objects");
        List<Student> stds = new ArrayList<>();
        stds.add(new Student (77 , "priyaraj"));
        stds.add(new Student (88 , "jaya"));
        stds.add(new Student (99 , "supravat"));


        // sort them using natural order (X), as objects are not directly sorted
        Collections.sort(stds, (a,b)->b.getName().compareTo(a.getName()));
        System.out.println("After the custom sorting the marks.... ");
        for(Student s : stds)
        {
            System.out.print(s.getName() +":"+ s.getMark()+", ");
        }
        System.out.println();



    }
}
