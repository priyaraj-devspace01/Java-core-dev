package com.org.collectionFramework.collections.List.comparatorandcomparable.comparator;

public class Student {
    private String name;
    private double gpa;


    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

}
