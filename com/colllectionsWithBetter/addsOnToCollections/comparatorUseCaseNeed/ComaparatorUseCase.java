package com.colllectionsWithBetter.addsOnToCollections.comparatorUseCaseNeed;


import java.util.*;


//class Student implements Comparable<Student>
class Student
{
     String name;
     int id;
     int marks;

     public Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
     }

//    @Override
//    public int compareTo(Student o) {
//        return this.id - o.id;
//    }




    /// not depending on this single custom logic for each time,
//    instead take the comparing logic out-side of the class to be separated


    static class IdBasedSorting implements Comparator<Student>
    {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.id - o2.id;
        }
    }

    static class nameBasedSorting implements Comparator<Student>
    {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    static class markBasedSorting implements Comparator<Student>
    {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.marks - o2.marks;
        }
    }

}
public class ComaparatorUseCase {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("rahul", 101, 99));
        students.add(new Student("rajShamani", 178, 99));
        students.add(new Student("rajib", 188, 92));


//        Collections.sort(students); // now it can't be possible , because don't sort on which basis
        // solution - we can define our compareTo method by implementing comparable interface but that is very specific to a particular based sorting like name, id or marks one at a time but what if
        // -  we want to sort on based on our reference we can define

        /// there Comparator interface comes into the picture,
        // now we can, easily pass on which basis we want to sort
//        Student.IdBasedSorting idBasedSorting = new Student.IdBasedSorting();
//        Student.nameBasedSorting nameBasedSorting = new Student.nameBasedSorting();
//        Student.markBasedSorting markBasedSorting = new Student.markBasedSorting();
//
//        Collections.sort(students, nameBasedSorting);


        /// we can also use the anonymous inner class as well instead of creating several classes
        // let for example based on id's
        /// -----------
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
              return o1.id - o2.id;
            }
        });
        //// still verbose , just to say sort() method that "HOW" to sort

        //// ----------
        for(Student student : students) {
            System.out.println(student.id + " , " + student.name + " , "+ student.marks);
            /// note - the reason here the rajShamani comes first because after comparison till, "raj" comes S not s so don't confuse, as S < i in terms of their ASCII value so it comes first
        }

    }


    /// but the main disadvantages is here, to simply give the custom logic for sorting order to the sort method we need to create separate class for each, create object and pass their object to the sort method
    // making it so verbose as comparing to other programming language, that's why "LAMBDA FUNCTION" comes into the picture to solve these kind of issues
}
