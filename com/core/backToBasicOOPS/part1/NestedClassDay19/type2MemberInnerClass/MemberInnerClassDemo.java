package com.core.backToBasicOOPS.part1.NestedClassDay19.type2MemberInnerClass;

/*
========================================================
                MEMBER INNER CLASS
========================================================

DEFINITION
--------------------------------------------------------
A member inner class is a NON-STATIC class declared
inside another class.

========================================================
                IMPORTANT POINT
========================================================

A member inner class ALWAYS needs outer class object.

Because:
--------------------------------------------------------
Member inner class belongs to OBJECT LEVEL
not CLASS LEVEL.

========================================================
                BASIC SYNTAX
========================================================
*/

class Outer2 {

    class Inner {

    }
}

/*
========================================================
                SIMPLE EXAMPLE
========================================================
*/

class Car {

    private String carName = "BMW";

    /*
    ----------------------------------------------------
    MEMBER INNER CLASS
    ----------------------------------------------------
    Engine belongs to specific Car object.
    */

    class Engine {

        void startEngine() {

            /*
            ------------------------------------------------
            Inner class can directly access private members
            of outer class.
            ------------------------------------------------
            */

            System.out.println(
                    "Engine Started for : " + carName
            );
        }
    }
}

/*
========================================================
                OBJECT CREATION FLOW
========================================================
*/

public class MemberInnerClassDemo {

    public static void main(String[] args) {

        /*
        ------------------------------------------------
        STEP 1
        Create OUTER class object first.
        ------------------------------------------------
        */

        Car car = new Car();

        /*
        ------------------------------------------------
        STEP 2
        Create INNER class object using outer object.
        ------------------------------------------------

        Syntax:
        outerObject.new InnerClass()
        ------------------------------------------------
        */

        Car.Engine engine = car.new Engine();

        /*
        ------------------------------------------------
        STEP 3
        Call methods normally.
        ------------------------------------------------
        */

        engine.startEngine();
    }
}

/*
========================================================
                WHY OUTER OBJECT REQUIRED?
========================================================

Because member inner class belongs to:
--------------------------------------------------------
specific outer object
--------------------------------------------------------

Example:
--------------------------------------------------------
Engine belongs to specific Car.

NOT generic Car class.

========================================================
                MEMORY FLOW
========================================================

Create Outer Object
        ↓
Outer object gets memory
        ↓
Inner object linked with outer object
        ↓
Inner class can access outer members

========================================================
                IMPORTANT DIFFERENCE
========================================================

STATIC NESTED CLASS
--------------------------------------------------------
- No outer object needed
- Class-level relationship

Example:
new Car.Engine();

--------------------------------------------------------

MEMBER INNER CLASS
--------------------------------------------------------
- Outer object mandatory
- Object-level relationship

Example:
car.new Engine();

========================================================
        MEMBER INNER CLASS ACCESSING OUTER MEMBERS
========================================================

Member inner class can directly access:
--------------------------------------------------------
- private variables
- private methods
- protected members
- public members

of outer class.

========================================================
                EXAMPLE
========================================================
*/

class Bank {

    private int amount = 5000;

    private void showSecretAmount() {

        System.out.println(
                "Secret Amount : " + amount
        );
    }

    class Account {

        void accessBankData() {

            /*
            ------------------------------------------------
            Direct access to private outer members.
            ------------------------------------------------
            */

            System.out.println(amount);

            showSecretAmount();
        }
    }
}

/*
========================================================
                REAL-WORLD USE CASES
========================================================

--------------------------------------------------------
1. Car -> Engine
--------------------------------------------------------
Engine belongs to specific Car object.

--------------------------------------------------------
2. Bank -> Account
--------------------------------------------------------
Account belongs to specific Bank.

--------------------------------------------------------
3. Order -> Item
--------------------------------------------------------
Item belongs to specific Order.

--------------------------------------------------------
4. University -> Department
--------------------------------------------------------
Department belongs to specific University object.

--------------------------------------------------------
5. Employee -> Address
--------------------------------------------------------
Address linked with specific Employee.

========================================================
                INTERVIEW IMPORTANT POINTS
========================================================

1. Member inner class is NON-STATIC.

2. Requires outer object.

3. Can directly access outer private members.

4. Outer class CANNOT directly access inner members
   without inner object.

5. Compiled internally as:
--------------------------------------------------------
Outer$Inner.class
--------------------------------------------------------

========================================================
                OUTER ACCESSING INNER
========================================================
*/

class Company {

    class HR {

        void displayHR() {

            System.out.println("HR Department");
        }
    }

    void show() {

        /*
        ------------------------------------------------
        Outer class needs inner object.
        ------------------------------------------------
        */

        HR hr = new HR();

        hr.displayHR();
    }
}

/*
========================================================
                COMMON INTERVIEW QUESTION
========================================================

Q) Can member inner class have static members?

ANSWER:
--------------------------------------------------------
NO

Except:
--------------------------------------------------------
static final constants
--------------------------------------------------------

========================================================
                VALID EXAMPLE
========================================================
*/

class Test2 {

    class Demo {

        /*
        Allowed because constant.
        */

        static final int x = 10;
    }
}

/*
========================================================
                INVALID EXAMPLE
========================================================
*/

class Invalid {

    class Demo {

        /*
        NOT ALLOWED
        */

        // static int y = 20;
    }
}

/*
========================================================
                EASY MEMORY TRICK
========================================================

MEMBER INNER CLASS
--------------------------------------------------------
"Part of object"

STATIC NESTED CLASS
--------------------------------------------------------
"Utility/helper grouped inside class"

========================================================
/*
========================================================
        WHY BEFORE JAVA 16 MEMBER INNER CLASS
        COULD NOT DECLARE STATIC MEMBERS?
========================================================

BEFORE JAVA 16:
--------------------------------------------------------
Member inner class belongs to OBJECT LEVEL.

Meaning:
--------------------------------------------------------
Inner class object exists only when outer object exists.

But:
--------------------------------------------------------
static members belong to CLASS LEVEL.

Static members load when class loads.

========================================================
                MAIN CONFLICT
========================================================

JAVA GOT CONFUSED:
--------------------------------------------------------

Object-level class
trying to contain
Class-level members

========================================================
                SIMPLE UNDERSTANDING
========================================================

NON-STATIC INNER CLASS:
--------------------------------------------------------
depends on outer object.

STATIC MEMBER:
--------------------------------------------------------
does NOT depend on object.

So both concepts conflicted.

========================================================
                EXAMPLE
========================================================
*/

class Outer {

    class Inner {

        /*
        BEFORE JAVA 16
        ----------------
        NOT ALLOWED
        */

        // static int x = 10;
    }
}

/*
========================================================
                WHY?
========================================================

Because Inner class itself is:
--------------------------------------------------------
NON-STATIC
--------------------------------------------------------

Meaning:
--------------------------------------------------------
Inner class tied to outer object.

But:
--------------------------------------------------------
static variable wants independent memory
at class-loading time.

========================================================
                ONLY EXCEPTION
========================================================

BEFORE JAVA 16:
--------------------------------------------------------
static final constants were allowed.
--------------------------------------------------------

Example:
*/

class Test {

    class Demo {

        /*
        Allowed because compile-time constant.
        */

        static final int x = 10;
    }
}

/*
========================================================
                WHY CONSTANT ALLOWED?
========================================================

Because:
--------------------------------------------------------
compile-time constants do not need separate
runtime object memory.

Compiler directly replaces value.

========================================================
                AFTER JAVA 16
========================================================

Java relaxed this restriction.

Now member inner class CAN declare:
--------------------------------------------------------
- static variables
- static methods
- static blocks
--------------------------------------------------------

because JVM/compiler implementation improved.

========================================================
                EASY MEMORY TRICK
========================================================

Before Java 16:
--------------------------------------------------------
Object-level class
could not contain
independent class-level members.

========================================================

                FINAL CORE UNDERSTANDING
========================================================

Member inner class:
--------------------------------------------------------
- strongly tied to outer object
- can access outer private data
- used for logical grouping with object dependency

========================================================
*/