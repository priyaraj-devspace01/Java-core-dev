package com.colllectionsWithBetter.addsOnToCollections.comparableInterface01;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Learner   implements Comparable<Learner>
{
    String name;
    int marks;
    public Learner(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Learner other) {
        return this.marks - other.marks;
    }

    // if want to handle the scenario in case of marks got same for two students then want to sort them based on their names lexicographical order
//    @Override
//    public int compareTo(Learner other) {
//        if(this.marks != other.marks) {
//            return this.marks - other.marks;
//        }
//
//        return this.name.compareTo(other.name);
//    }

    @Override
    public String toString() {
        return "Learner{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
// only 3 conditions java will check :
     /*   s1.compareTo(s2)
         1) if(this.marks < other.marks) returns -ve(1) means, the this.marks will come first and then other marks
         2) if(this.mark == other.marks) return - 0 means, both are same
         3) if(this.mark > other.marks) return +ve(1) means, the order will be opposite, means other marks comes first then this.mark in the result


         // Trick to remember:
         whenever want the natural order like for numbers , ascending order - use as it is (if a =1 ,b = 3) use (a-b) otherwise, opposite of it
         // for strings comparison - if we want (natural order ,a->b->c) then use, a.compareTo(b) else b.compareTo(a)
         // it's that simple
      */
}
public class ComparableInterface {
    public static void main(String[] args) {
        ///  WHY NEEDED?  -- TO COMPARE THE CUSTOM TYPES like,  CLASS OBJECTS instance based data
        /*
           When we declare the variables as primitives java knows
            that int a = 25, b = 23 - that an is greater than b, due to natural order preserved
            // but what if
            Student s1 = new Student(101, "Rahul");
            Student s2 = new Student(102, "Aman");
              // now how to it should compare the both objects, we need to provide the comparison factor using comparable interface,
                // either based on id's , or names with lexicographical order,

                And the main issue will come , when used with collection

                // now comparable interface-provides a contract - that defines i know how to compare myself with other object with the same type
         */
        List<Learner> learners = new ArrayList<>();
        learners.add(new Learner("rahul", 98));
        learners.add(new Learner("jaya", 77));
        learners.add(new Learner("ayan", 77));

        // now we have a method to sort this list when the type is a user defined class object
//        Collections.sort(learners); // as this point java doesn't know to sort on which basis names or marks

        /// in java,
        // one class -> one natural order
         Collections.sort(learners);
        System.out.println(learners);








    }
}

