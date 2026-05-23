package com.core.backToBasicOOPS.part1;


// Need
class Employee
{
    int emp_id;
    String emp_name;
    float emp_salary;
    String emp_city;


    // Issue
//    Employee(int emp_id, String emp_name, float emp_salary, String emp_city)
//    {
//        emp_id = emp_id;
//        emp_name = emp_name;            // Here java main confusion, whether the assignment pointing to the local parameters of constructor or class attributes
//        emp_salary = emp_salary;
//        emp_city = emp_city;
//
//    }


    // to solve this we can use "this" to points to the current object reference
    Employee(int emp_id, String emp_name, float emp_salary, String emp_city)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;            // Here java main confusion, whether the assignment pointing to the local parameters of constructor or class attributes
        this.emp_salary = emp_salary;
        this.emp_city = emp_city;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_salary=" + emp_salary +
                ", emp_city='" + emp_city + '\'' +
                '}';
    }
}
public class ThisKeyWord {
    public static void main(String[] args) {

        // this keyword  - always points to the current object reference

        Employee emp1 = new Employee(101, "hitesh", 555555.55f, "Pune");
        System.out.println(emp1);

    }
}
