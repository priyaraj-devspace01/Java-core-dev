package com.org.collectionFramework.map.sortedMap;


import java.util.ArrayList;
import java.util.List;

class Student  implements Comparable<Student>
{
    String name;
    double mark;

    public Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.mark, this.mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class ComarableClass {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("John", 8.5));
        students.add(new Student("Jane", 7.5));
        students.add(new Student("Jack", 6.5));
        students.add(new Student("Bob", 8.5));

        students.sort(null);
        for(Student std : students)
        {
            System.out.println(std.toString());

        }
    }
}
