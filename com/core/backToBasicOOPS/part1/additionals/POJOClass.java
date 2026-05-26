package com.core.backToBasicOOPS.part1.additionals;/*
===============================================================================
                                POJO IN JAVA
===============================================================================

FULL FORM:
------------
POJO = Plain Old Java Object

===============================================================================
                        SIMPLE JAVA-LEVEL DEFINITION
===============================================================================

A POJO is simply a NORMAL Java class that:

✔ is NOT forced to extend special framework classes
✔ is NOT tightly coupled to frameworks
✔ mainly stores object state/data
✔ follows normal Java object rules

In simple words:
----------------
"Just a regular Java object."

===============================================================================
                            BASIC POJO STRUCTURE
===============================================================================

A typical POJO contains:

✔ private variables
✔ constructors
✔ getters/setters
✔ optional toString()

Example:
===============================================================================
*/

import com.core.backToBasicOOPS.part1.constructors.Employee;

class Student3 {

    // instance variables
    private int id;
    private String name;

    // constructor
    public Student3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // getter
    public int getId() {
        return id;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }
}


/*
===============================================================================
                    WHY IT IS CALLED "PLAIN OLD"?
===============================================================================

Because it uses ONLY normal Java concepts:
-------------------------------------------

✔ class
✔ object
✔ variables
✔ methods
✔ constructor

NO special framework dependency.

===============================================================================
                        NOT A POJO EXAMPLE
===============================================================================

Example of tightly coupled class:
===============================================================================
*/

//class MyServlet extends javax.servlet.http.HttpServlet {
//
//}

/*
Why NOT considered pure POJO?
------------------------------
Because class behavior now depends heavily on servlet framework.

===============================================================================
                    IMPORTANT JAVA-LEVEL CHARACTERISTICS
===============================================================================

POJO generally:
----------------
✔ uses private fields
✔ uses encapsulation
✔ can have constructors
✔ can have methods
✔ can contain logic or no logic
✔ object created using new keyword
✔ stored in heap memory like normal objects

===============================================================================
                    POJO DOES NOT MEAN:
===============================================================================

✘ "No methods allowed"
✘ "No logic allowed"
✘ "Only getters/setters"

It ONLY means:
----------------
"Simple independent Java object."

===============================================================================
                    TWO COMMON POJO STYLES
===============================================================================

1. Anemic Model
2. Rich Domain Model

===============================================================================
                        1. ANEMIC MODEL
===============================================================================

Contains:
-----------
✔ data only
✔ getters/setters
✔ constructors

Business logic kept outside.

Example:
===============================================================================
*/

class Employee3 {

    private double salary;

    public double getSalary() {
        return salary;
    }
}

/*
Logic outside:
===============================================================================
*/

class EmployeeService {

    public double calculateBonus(Employee emp) {
//        return emp.getSalary() * 0.2;
        return 0;
    }


}



/*
===============================================================================
                        2. RICH DOMAIN MODEL
===============================================================================

Contains:
-----------
✔ data
✔ business logic together

Example:
===============================================================================
*/

//        class BankAccount2 {
//
//            private double balance;
//
//            public void deposit(double amount) {
//
//                if (amount <= 0) {
//                    throw new IllegalArgumentException();
//                }
//
//                balance += amount;
//            }
//
//            public double getBalance() {
//                return balance;
//            }
//        }

/*
===============================================================================
                        IMPORTANT INTERVIEW POINT
===============================================================================

POJO can have:
---------------
✔ methods
✔ constructors
✔ business logic
✔ static methods
✔ private methods

POJO is NOT restricted to:
---------------------------
"only variables + getters/setters"

===============================================================================
                        POJO vs JAVA BEAN
===============================================================================

Java Bean is a SPECIAL type of POJO.

Java Bean rules:
-----------------
✔ private variables
✔ public getters/setters
✔ public no-arg constructor
✔ serializable (usually)

Every Java Bean is a POJO.
But every POJO is NOT a Java Bean.

===============================================================================
                        INTERVIEW ONE-LINER
===============================================================================

"POJO is a normal independent Java class that mainly represents object data
using standard Java concepts without tight framework dependency."

===============================================================================

 */
