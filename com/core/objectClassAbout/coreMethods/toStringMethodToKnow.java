package com.core.objectClassAbout.coreMethods;


import java.sql.SQLOutput;

// Object class - > java.lang package
class Student  // extends Object -  even though we are not declaring by ourselves
{
    int id;
    String name;

    // by default Object class has toString method which basically used to represent any object as string,
    // but we can override
    Student(int id, String name)
    {
        this.id = id;
        this.name = name;

    }
    @Override
    public String toString()
    {
        return ("id : " + id + " || " + "name : "+name);
    }
}
public class toStringMethodToKnow {
    public static void main(String[] args) {


        Student s1 = new Student(1, "john");
        Student s2 = new Student(2, "jane");

        System.out.println(s1.toString());
        System.out.println(s2);
        // even if we don't call the toString it will be automatically call that behind the scene

    }
}
