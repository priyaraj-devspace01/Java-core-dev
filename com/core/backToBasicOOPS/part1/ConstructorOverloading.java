package com.core.backToBasicOOPS.part1;
class Employee2 {
    int emp_id;
    String emp_name;
    float emp_salary;
    String emp_city;

    // so basically we can create the constructor to give the specification creation with initialization differ



    Employee2()
    {
        this(101);
        System.out.println("I am the Employee default constructor . ");
    }

    Employee2(int emp_id)
    {
       this(emp_id, "rajesh");
    }
    Employee2(int emp_id, String emp_name)
    {
        this(emp_id, emp_name, "delhi");
    }

    Employee2(int emp_id, String emp_name, String emp_city)
    {
      this(emp_id, emp_name, emp_city, 444444.55f);

    }

    Employee2(int emp_id, String emp_name, String emp_city, float emp_salary)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_city = emp_city;
        this.emp_salary = emp_salary;

    }


    @Override
    public String toString() {
        return "Employee2{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_salary=" + emp_salary +
                ", emp_city='" + emp_city + '\'' +
                '}';
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        Employee2 emp2 = new Employee2();
        System.out.println(emp2);


        // we can only call the constructor , while creating the object and using "this()"
        // as the new (), creating the object dynamically during runtime, but in time of insufficient may have the exception, outOfMemory Exception
        // in case there is no space on heap


    }

    // WHY THIS() always needs to be the first statement inside any constructor?
    /*
    Because Java wants object initialization chain to complete BEFORE executing other logic.
    If Java allowed:

Student(int id) {
    System.out.println("Hello");
    this(); // ❌ illegal
}

then:

partial initialization could happen
constructor order becomes inconsistent
object state may become unsafe

So Java enforces:

constructor chaining first,
then remaining logic
Internal Flow

When constructor starts:

Current constructor
↓
calls another constructor using this()
↓
that constructor completes
↓
returns back
↓
remaining code executes
     */

}
