package com.core.backToBasicOOPS.part1;


class Student
{
    int roll_num;
    String name;                  // characteristics - identity
    String section;



    public void fetchDetails (int  roll, String name, String section)
    {
        System.out.println(this.roll_num+" : " + this.name + ": "+ this.section);      // behaviors - object can do with the attributes
    }

    public void markAttendance()
    {
        System.out.println("Attendance Marked . ");
    }
}
public class Demo {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "raj";
        student.roll_num = 101;
        student.section  = "B";

        student.markAttendance();
        student.fetchDetails(student.roll_num, student.name, student.section);






    }
}
