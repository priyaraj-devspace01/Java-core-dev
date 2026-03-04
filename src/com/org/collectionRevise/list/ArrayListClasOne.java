package com.org.collectionRevise.list;

import java.util.*;

class NumericSorting implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}


class Student
{
    String name;
    double gpa;

    public Student( String name,double gpa) {
        this.gpa = gpa;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}
public class ArrayListClasOne {
    public static void main(String[] args) {

        ArrayList<Integer> list =  new ArrayList<>(20);
        list.add(22);
        list.add(44);
        list.add(44);
        System.out.println(list.get(1)); // index based accessing o(1)

        System.out.println(list.size()); // the number of elements are currently present
        list.add(0,33);  // o(n) time
        System.out.println(list);

        list.remove(2);
         // remove by index
        list.remove(Integer.valueOf(2));
        // remove by value as wrapped as object

        list.set(1, 22);  // replace the value

        System.out.println(list);

        // list declaration types
        //1 )
        List<Integer> list2 = new ArrayList<>();
        // use List reference to get the method of list interface as well
        ArrayList<Integer> list3 = new ArrayList<>();
        // access the method only inside the ArrayList class
        List<Integer> list4 = Arrays.asList(22,21,245,566,67);
        // as it only returns a fixed size array, only can replace no other operations like add, remove -> through exception
        list4.set(1,22);
        System.out.println(list4);
        List<Integer> list5 = List.of(33,3445,55,66,67);  // unmodifiable can't be modify

        // but these can be pass as a reference to a arraylist constructor
        List<String> testList = new ArrayList<>(List.of("raja", "liku"));
        // now it can be modifiable
        testList.add("ritesh");
        System.out.println(testList);


        // sorting
        List<Integer> test2list = new ArrayList<>(Arrays.asList(12,2234,45,5,65,67,73,3));
        // Approach -1
        test2list.sort(null);
        // Approach-2
        Collections.sort(test2list);
        // both sorts based on natural order .

        // for custom order either use comparator reference or lambda expression
        test2list.sort(new NumericSorting());
        System.out.println(test2list);
        // or else use lambda
        System.out.println("Ascending .....");
        test2list.sort((a,b)-> a-b);
        System.out.println(test2list);

        List<Student> students = new ArrayList<>();
        students.add(new Student("raja", 9.6));
        students.add(new Student("liku", 9.2));
        students.add(new Student("aman", 9.7));
        students.add(new Student("chetan", 9.2));

        // now to sort this objects we can't use Collections.sort()_ need to do custom sorting
//        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName).reversed();

        // before sorting
        System.out.println("Before sorting .........................");
        for(Student student : students) {
            System.out.println(student.getName() + " : " + student.getGpa());
        }
        // using comparator
        students.sort((o1, o2)->
        {
            if(o2.getGpa()-o1.getGpa() > 0)
            {
                return 1;
            }else if(o2.getGpa()-o1.getGpa() < 0 )
            {
                return -1;
            }else  {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // sorting ------------------------------------------------
//        Collections.sort(students, comparator);
//        or
//        students.sort(comparator);

        System.out.println("After sorting ..................................");
         for(Student student : students) {
             System.out.println(student.getName() + " : " + student.getGpa());
         }





    }
}
