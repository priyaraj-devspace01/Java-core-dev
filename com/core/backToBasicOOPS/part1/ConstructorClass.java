package com.core.backToBasicOOPS.part1;


class Student2
{
    int id;
    String name;
    String school_name;

//    Student2()   // 1)  Default constructor
//    {
//        // empty body        // default constructor added by jvm for every class in java, but still can be overloaded
//    }

    Student2()        // 2) No-args constructor
    {
        System.out.println("I am the student 2 constructor");
    }


    Student2(int roll, String Sname, String sch_name)   // 3) Parameterized Constructor
    {
        name = Sname;
        school_name = sch_name;
        id = roll;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school_name='" + school_name + '\'' +
                '}';
    }
}
public class ConstructorClass {
    public static void main(String[] args) {
        //A constructor is a special type of method-like member that is automatically called during object creation to initialize the object.



        Student2 std2 = new Student2(21, "priyaraj", "vvm");  // we can initialize the object attributes during it's creation
        // no need to for assigning the values one by one
//        std2.id = 33;
//        std2.school_name = "vvm";

        System.out.println(std2);
    }
}
