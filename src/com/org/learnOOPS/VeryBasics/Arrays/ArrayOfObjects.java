package com.org.learnOOPS.VeryBasics.Arrays;

class Student
{
    String name;
    int age;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 20;
        s1.marks = 50;

        Student s2 = new Student();
        s2.name = "Sumit";
        s2.age =22;
        s2.marks = 70;

        Student s3 = new Student();
        s3.name = "Raj";
        s3.age =22;
        s3.marks = 90;

        // create the array of Student class Objects
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


//        print the name of first student object
        System.out.println(students[0].name);
        // iterate through each student
        for(int i = 0;i<students.length;i++)
        {
            System.out.println(students[i].name +" : "+ students[i].age + " : "+ students[i].marks );
        }



        System.out.println("Enhanced one .....................");
//                using enhanced for loop
        for(Student student : students)
        {
            System.out.println(student.name +" : "+ student.age + ":"+ student.marks);
        }




    }
}
