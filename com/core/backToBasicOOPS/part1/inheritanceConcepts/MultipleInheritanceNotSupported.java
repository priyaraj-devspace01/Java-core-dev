package com.core.backToBasicOOPS.part1.inheritanceConcepts;

class A
{
    public void show()
    {
        System.out.println("Hiii");
    }
}

class B extends A{
    public void show()
    {
        System.out.println("Hii");
    }
}

//class C extends A, B{
//
//}
public class MultipleInheritanceNotSupported {
    public static void main(String[] args) {

//         if java allowed multiple inheritance may be C can inherit the A,B at a time but
                //  when we will try to create a object of it and try to call the show method it will confuse which parent class method to call, if in case C has no methods

        // Ultimately, it leads to a diamond problem, that's why in java we don't have multiple inheritance concepts
        // But it can be achievable via using interface concept in java.
    }
}
