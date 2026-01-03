package com.org.learnOOPS.termsToRemember.thisvssuper;


class A
{

    int a ;
    public A(int a )
    {
       this.a = a;
        System.out.println("the value of parent a is : "+ a);
    }
}

class B extends A
{
    int a;

    public B()
    {
        this(33);
//        super(22);
//        not possible at a time only one of this() or super() can be the first statement inside a constructor



    }
    public B(int a)
    {
        super(22);
        System.out.println("the value of child a is : "+ a);

    }
}

public class ThisvsSuperforConstrctCalling {
    public static void main(String[] args) {

        B obj = new B(66);
        B obj2 = new B();


    }
}

/*
In a Java constructor, only ONE of this() or super() can be used, and only once.

The reason is simple:

Both this() and super() must be the first statement in a constructor, and a constructor can have only one first statement.

🔹 Purpose of each

this() → calls another constructor in the same class

super() → calls a constructor of the parent class

Both start a constructor chain, and Java allows only one chain at a time to avoid ambiguous object initialization.

🔹 Automatic super() call (very important)

If a child class constructor does not explicitly call super(),
Java automatically inserts a call to the parent’s no-argument constructor.

class Parent {
    Parent() {}
}

class Child extends Parent {
    Child() {
        // super();  // automatically added by compiler
    }
}


✔ This works only if the parent has a non-parameterized constructor.

🔹 When explicit super() is mandatory

If the parent class does not have a no-argument constructor,
the child must explicitly call a parameterized super(...).

❌ What is NOT allowed
Child() {
    this();
    super(); // ❌ compile-time error
}

🧠 Remember-forever lines

One constructor → one chain → one first statement

Parent is initialized before child

No explicit super() → compiler adds it automatically (if possible)

🎯 Interview one-liner

“In Java, a constructor can call either this() or super(), not both, because both must be the first statement. If a child constructor does not explicitly call super(), the compiler automatically calls the parent’s no-argument constructor.”

If you want, I can also give you a constructor chaining diagram (Parent → Child → Child) in one glance 👌

but what if the parent class has no constructoe does super callthe parent non-args contuctor

Yes — and this is a very important Java rule. Let’s lock it in clearly.

❓ What if the parent class has no constructor at all?
✅ YES, super() still calls the parent’s no-arg constructor
Why?

Because Java automatically provides a default no-argument constructor if and only if no constructor is written by the programmer.

🔹 Example
class Parent {
    // No constructor written
}

class Child extends Parent {
    Child() {
        // super();  // implicitly added by compiler
        System.out.println("Child constructor");
    }
}

✔ What happens internally

Compiler adds a default no-arg constructor to Parent

Compiler adds super() as the first line in Child

Parent is initialized first, then child

❌ When it FAILS (very important contrast)
class Parent {
    Parent(int x) {}
}

class Child extends Parent {
    Child() {
        // super();  ❌ implicit call fails
    }
}

❌ Compile-time error
constructor Parent() is undefined

✔ Fix
Child() {
    super(10);
}

🧠 Final truth table (remember this)
Parent class situation	Does super() work implicitly?
No constructor written	✅ YES
Explicit no-arg constructor	✅ YES
Only parameterized constructor	❌ NO (must call explicitly)
🧠 Remember-forever line

No constructor written → compiler creates one → super() works.

🎯 Interview one-liner

“If a parent class has no constructor defined, the compiler provides a default no-argument constructor, and the child’s constructor implicitly calls it using super().”
 */