package com.org.java8features.mthdAndConstructRefpr;

import com.org.java8features.consumerpr.ConsumerClass;

import javax.swing.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class Student
{
    int age;
    public Student (int age)
    {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}

public class MethodReferenceClass {
    public static void main(String[] args) {
        // it helps us to refer to a method without invoking it, in place of lambda expression for better code readability.

        Consumer<String> printStr = s -> System.out.println(s);
        List<String> list  = List.of("liku", "raja", "amit");

         //1- verbose use of lambda expression
         list.forEach(s -> System.out.println(s));
         // instead, we can also use
        list.forEach(System.out::println); // it will do the same thing

        // Type of method reference
        //1) Static Reference
        Function<Integer, Integer> findsqr = num -> myMathUtils(num);
        // instead we can use
        Function<Integer, Integer> findsqr2 = MethodReferenceClass::myMathUtils;
        System.out.println(findsqr2.apply(2));
        System.out.println(findsqr.apply(2));

        // Constructor reference
        Function<Integer, Student > giveStudent = num -> new Student(num);
        // instead we can also use the constructor reference
        Function<Integer, Student> giveStudent2 = Student::new;
        System.out.println(giveStudent2.apply(22));

        // instance reference for a particular object
        String s = "liku";
        Supplier<String> giveStr = () -> s.toUpperCase();
        Supplier<String> giveStr2 = s::toUpperCase;
        System.out.println(giveStr2.get());
        System.out.println(giveStr.get());






    }

    public static int myMathUtils(int a)
    {
        return a*a;
    }
}
