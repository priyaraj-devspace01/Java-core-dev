package com.core.backToBasicOOPS.part1;

import java.text.CollationElementIterator;

class College
{
    int coll_id;
    String college_name;


    College(int id, String college_name)
    {
        this.coll_id = id;
        this.college_name = college_name;
    }

    College(College college)
    {
        this.coll_id = college.coll_id;
        this.college_name = college.college_name;
    }

    @Override
    public String toString() {
        return "College{" +
                "coll_id=" + coll_id +
                ", college_name='" + college_name + '\'' +
                '}';
    }
}
public class ConstructorWithObjectReference {
    public static void main(String[] args) {

        // we can also create a constructor who takes an object reference as it's parameter

        College college = new College(1,"College1");
        College college2 = new College(college);  // Deep Copy
        // Basically, it will create one another object but having the same values as college, at this point they are at different location in heap with having same values.
        // but any modification made by one reference won't affect other object value

        System.out.println(college);
        System.out.println(college2);
        System.out.println();

        college2.coll_id = 1011;
        college2.college_name = "Dav";

    // CAN'T AFFECT REFERENCE OBJECT VALUES
        System.out.println(college2);
        System.out.println("College 1 doesn't affected by college 2 manipulation");
        System.out.println(college);

        // BUT WE ASSIGN THE ACTUAL REFERENCE WIHOUT USING "new", they both will points to the same object and affected changes reflected for both

        College college3 = college;   // shallow copy
        System.out.println("college 3 also contain the value of college 1");
        System.out.println(college3);

    }
}
