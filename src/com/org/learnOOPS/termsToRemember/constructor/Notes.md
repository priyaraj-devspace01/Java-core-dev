1️⃣ What is a Constructor?

A special method used to initialize objects

Name must be same as class

No return type (not even void)

Automatically called when new keyword is used

class A {
A() {
System.out.println("Constructor called");
}
}

2️⃣ Default Constructor (Compiler Provided)
Case: No constructor written
class A {
}


✔ Compiler creates:

A() {
super();
}


📌 Initializes object with default values

3️⃣ No-Argument Constructor (User Defined)
class A {
A() {
System.out.println("No-arg constructor");
}
}


📌 Stops compiler from creating default constructor

4️⃣ Parameterized Constructor
class A {
int x;

    A(int x) {
        this.x = x;
    }
}


📌 Used to pass values during object creation

5️⃣ Constructor Overloading
class A {
A() {
System.out.println("No-arg");
}

    A(int x) {
        System.out.println("Param: " + x);
    }
}


📌 Same constructor name, different parameter list

6️⃣ this Keyword in Constructor
a) Referring instance variable
class A {
int x;

    A(int x) {
        this.x = x;
    }
}

b) Calling another constructor (this())
class A {
A() {
System.out.println("Default");
}

    A(int x) {
        this(); // must be first
        System.out.println(x);
    }
}

7️⃣ Constructor Chaining (Same Class)
class A {
A() {
this(10);
System.out.println("No-arg");
}

    A(int x) {
        System.out.println(x);
    }
}


📌 Flow: this() → target constructor → back

8️⃣ super() in Constructors
class Parent {
Parent() {
System.out.println("Parent");
}
}

class Child extends Parent {
Child() {
super(); // optional if no-arg exists
System.out.println("Child");
}
}


📌 Parent constructor always executes first

9️⃣ Automatic super() Call
class Parent {
Parent() {}
}

class Child extends Parent {
Child() {
// super(); automatically added
}
}


📌 Happens only if parent has no-arg constructor

🔟 When super() is Mandatory
class Parent {
Parent(int x) {}
}

class Child extends Parent {
Child() {
super(10); // must
}
}


❌ Without this → compile-time error

1️⃣1️⃣ this() vs super() Rule (VERY IMPORTANT)

❌ Not allowed:

Child() {
this();
super();
}


✔ Rule:

Only one constructor call is allowed, and it must be the first statement

1️⃣2️⃣ Order of Constructor Execution
class A {
A() {
System.out.println("A");
}
}

class B extends A {
B() {
System.out.println("B");
}
}

class C extends B {
C() {
System.out.println("C");
}
}

Output
A
B
C


📌 Top → Down (Parent → Child)

1️⃣3️⃣ Constructor vs Method
Constructor	Method
Same name as class	Any name
No return type	Has return type
Called automatically	Called explicitly
Initializes object	Performs logic
1️⃣4️⃣ Can Constructor be static?

❌ NO

Reason:

Constructor belongs to object creation, static belongs to class

1️⃣5️⃣ Can Constructor be final or abstract?

❌ NO

final → cannot be overridden (constructors aren’t inherited)

abstract → incomplete (constructors must execute fully)

1️⃣6️⃣ Can Constructor be private?

✅ YES

class A {
private A() {}
}


📌 Used in:

Singleton

Utility classes

1️⃣7️⃣ Can We Call Constructor Explicitly?

❌ NO

A a = new A(); // valid
a.A();         // ❌ invalid

1️⃣8️⃣ Can Constructor Throw Exception?

✅ YES

class A {
A() throws Exception {
}
}


Child must handle or declare it.

1️⃣9️⃣ Default Values via Constructor
class A {
int x;

    A() {
        x = 10;
    }
}


📌 Constructor initializes object state

2️⃣0️⃣ Interview Golden Lines (Remember These)

Constructor initializes object

Parent constructor executes before child

Only one of this() or super() allowed

Constructor has no return type

Not inherited, but chaining exists

Compiler provides default constructor only if none is written

🧠 FINAL MEMORY BLOCK (copy this)

Constructor is a special method with class name, no return type, used to initialize objects.
Only one constructor call (this() or super()) is allowed and must be first.
Parent constructors execute before child constructors.
Compiler provides a default constructor only if no constructor is defined.