package com.colllectionsWithBetter.addsOnToCollections.functionalComposition;

import java.util.function.Predicate;

public class PredicateChaining {
    public static void main(String[] args) {
        /// and() , or() and negate()
        // task - to check whether a number is greater than hundred and is even

//        Predicate<Integer> isEven = (x) -> x%2 ==0;
//        Predicate<Integer> isGreater0 = (x)-> x>0;
//        Predicate<Integer> fin = isEven.and(isGreater0);
//        System.out.println(fin.test(22));
//        Predicate<Integer> isGreater1 = isGreater0.or(isEven);
//        System.out.println(isGreater1.test(-22));

        Student s1 = new Student(55, 19);
        Predicate<Student> passed = (s) -> s.mark> 40;
        Predicate<Student> isAdult = (s) -> s.age > 18;

        Predicate<Student> finalRes = passed.and(isAdult);

         if(finalRes.test(s1)) {
            System.out.println("student is elligible to go for this trip ");
        }





    }
}

class Student
{
    int mark;
    int age;
    public Student(int mark, int age) {
        this.mark = mark;
        this.age = age;
    }
}
