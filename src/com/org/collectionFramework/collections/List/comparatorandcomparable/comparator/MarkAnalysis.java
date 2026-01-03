package com.org.collectionFramework.collections.List.comparatorandcomparable.comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarkAnalysis {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("banku", 3.5d));
        list.add(new Student("raju",3.7d) );
        list.add(new Student("aisu",3.8d));
        list.add(new Student("kumar",3.5d));


//        list.sort(null);// can't be possible

        // Either we can extend the Student class for comparing the object based on some attributes, otherwise we can also use lambda expression.


//        list.sort((o1, o2)->
//        {
//            if(o2.getGpa() - o1.getGpa() > 0)
//            {
//                return 1;                                     // here we comparing the same condition where 3.9 then 3.5
//            }else if(o2.getGpa() - o1.getGpa() < 0)
//            {
//                return -1;
//
//            }else {
                // after comparison on gpa if we want to sort on their name
//                return o1.getName().compareTo(o2.getName()) ;
//            }
//        });



        // we can also use the method reference approach as well
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        // Therefore, after comparison made on base of gpa, then it will check of their names on alphabetical ascending order.
//        list.sort(comparator);

        // we can also pass it inside the Collections.sort(list, comparator);
        Collections.sort(list, comparator);




        for(Student student : list)
        {
            System.out.println(student.getName() + " : " + student.getGpa());
        }












    }
}
