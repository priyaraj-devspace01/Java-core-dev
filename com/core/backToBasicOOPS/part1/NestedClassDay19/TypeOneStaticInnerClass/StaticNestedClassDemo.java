package com.core.backToBasicOOPS.part1.NestedClassDay19.TypeOneStaticInnerClass;

class Employee {

    static int id = 101;
    static void validationSuccess()
    {
        System.out.println("Validation success . ");
    }



    // non-static member
    private int emp_id = 2220;
    private void showSalary()
    {
        System.out.println("Showing salary ");
    }

    static class Validator {
        // it can access outer class static methods and variables

        void validate(Employee emp_internal) {
            System.out.println("Employee id. = " + id);
            System.out.println("Validating Employee");
            validationSuccess();

            // although they are private but as we inside the same outer class it should allow us but in reality it won't as
            // non-static member only associated with instances of the class as we are inside a static inner class, we only can access the variables and methods at outer class level not object level.


            // the way only way is we can access them is we need the reference to access the non-static members of parent class


            System.out.println(emp_internal.emp_id);
            emp_internal.showSalary();
        }
    }
}

public class StaticNestedClassDemo
{
    public static void main(String[] args) {

        Employee.Validator validator = new Employee.Validator();

        // but here we need pass the object of Employee class to access the non-static fields inside the inner class which is static
        Employee emp = new Employee();
        validator.validate(emp);
    }
}


// SOME POINTS TO NOTE FOR STATIC INNER CLASS :
/*
1)
 */