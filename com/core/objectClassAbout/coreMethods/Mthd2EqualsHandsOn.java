package com.core.objectClassAbout.coreMethods;

// DEFAULT
/*
  public boolean equals(Object obj) {
        return (this == obj);
    }

 */


class StudentImp extends  Student{


    StudentImp(int id, String name) {
        super(id, name);
    }


    @Override
    public boolean equals(Object obj)
    {

        // 1. Same reference?
        if(this == obj)
        {
            return true;
        }
        // null as reference ?
        if(obj == null)
        {
            return false;
        }
        // 3. Type/Class check ?
        if (this.getClass() != obj.getClass())
            return false;

        Student std = (Student)obj;
        return this.id==std.id && this.name==std.name;

    }
}
public class Mthd2EqualsHandsOn {
    public static void main(String[] args) {
        Student s1 = new Student(101, "ram");
        Student s2 = new Student(102, "ram");

        System.out.println(s1.equals(s2));

        // but we can override that

   // now we have over-ride the equals method logic now instead of checking the reference equality it's checking for value inside them
        StudentImp s3 = new StudentImp(101, "ram");
        StudentImp s4 = new StudentImp(101, "ram");
        System.out.println(s3.equals(s4));


        StudentImp s5  = null;    // null pointer exception
        System.out.println(s3.equals(s5));


        // when class Type mismatch
        Integer  i = 22;
        System.out.println(s3.equals(i));

        // when the reference are same
        System.out.println(s1.equals(s1));

    }
}
