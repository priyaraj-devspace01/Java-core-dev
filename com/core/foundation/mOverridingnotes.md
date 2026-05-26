# Static Method Overriding vs Method Hiding in Java

---

# Important Truth

Static methods are:

```text
NOT overridden
```

They are:

```text
HIDDEN
```

This concept is called:

# Method Hiding

---

# WHY STATIC METHODS CANNOT BE OVERRIDDEN?

Because static methods belong to:

```text
CLASS LEVEL
```

NOT object level.

Overriding needs:
```text
runtime polymorphism
```

But static methods are resolved at:
```text
COMPILE TIME
```

using:
```text
reference type
```

---

# Static Method Example

```java
class Parent {

    static void show() {

        System.out.println("Parent");
    }
}

class Child extends Parent {

    static void show() {

        System.out.println("Child");
    }
}
```

---

# Method Call

```java
public class Demo {

    public static void main(String[] args) {

        Parent p = new Child();

        p.show();
    }
}
```

---

# Output

```text
Parent
```

---

# WHY OUTPUT IS PARENT?

Because:

```text
static methods are resolved using REFERENCE TYPE
```

Reference type is:

```java
Parent p
```

So compiler calls:

```text
Parent.show()
```

NOT Child.show()

---

# This Is Called

# Method Hiding

Because child method hides parent static method.

---

# VERY IMPORTANT

This is NOT runtime polymorphism.

Because:
```text
object type does not matter
```

Only:
```text
reference type matters
```

---

# Compare With REAL Overriding

```java
class Parent {

    void show() {

        System.out.println("Parent");
    }
}

class Child extends Parent {

    @Override
    void show() {

        System.out.println("Child");
    }
}
```

---

# Method Call

```java
Parent p = new Child();

p.show();
```

---

# Output

```text
Child
```

---

# WHY?

Because non-static methods support:

```text
runtime polymorphism
```

Java checks:
```text
actual runtime object
```

which is:
```text
Child
```

So Child method executes.

---

# Core Difference

| Static Method | Non-Static Method |
|---|---|
| Method Hiding | Method Overriding |
| Compile Time | Runtime |
| Reference decides | Object decides |
| Class-level | Object-level |
| No runtime polymorphism | Runtime polymorphism |

---

# Easy Memory Trick

## Static Method

```text
Class decides
```

---

## Non-static Method

```text
Object decides
```

---

# Important Interview Point

Q) Can static methods be overridden?

Answer:

```text
NO
```

They are:
```text
hidden
```

because static methods belong to class,
not object.

---

# Another Example

```java
class Animal {

    static void sound() {

        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    static void sound() {

        System.out.println("Dog Bark");
    }
}
```

Usage:

```java
Animal a = new Dog();

a.sound();
```

Output:

```text
Animal Sound
```

Because:
```text
reference type = Animal
```

---

# Final Core Understanding

Static methods:
```text
do not participate in runtime polymorphism
```

because they belong to:
```text
class memory
```

NOT object memory.
