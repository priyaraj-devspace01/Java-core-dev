Concrete Class in Java

Definition:
A concrete class in Java is a class that has complete implementation of its methods and whose objects can be created directly.

In simple words:

A class that is not abstract and can be instantiated is called a concrete class.

Example

class Student {

    void study() {
        System.out.println("Student is studying");
    }
}

public class Main {

    public static void main(String[] args) {

        Student s = new Student(); // object creation allowed
        s.study();
    }
}