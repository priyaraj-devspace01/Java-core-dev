package com.org.learnOOPS.termsToRemember.constructor.copyConstructor;

class Student {
    int id;
    String name;

    // Normal constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }

    void show() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Raja");
        Student s2 = new Student(s1);   // copying s1 into s2

        s1.show();
        s2.show();

        System.out.println(s1 == s2);      // false (different objects)
        System.out.println(s1.equals(s2)); // false (unless equals() is overridden)
    /*

    ❓ Do s1 and s2 have the same data and same address on heap?
✅ Same data
❌ Different address (different objects)
🧠 Why?
Student s1 = new Student(1, "Raja");
Student s2 = new Student(s1);   // copy constructor


new Student(...) is executed twice

JVM allocates two separate objects on the heap

Data is copied, not shared

So:

s1  ──▶  [Student{id=1, name="Raja"}]   (heap address A)
s2  ──▶  [Student{id=1, name="Raja"}]   (heap address B)
     */
    }
}



