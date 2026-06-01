# Method Overriding vs Method Hiding in Java

## Method Overriding

### Definition

When a subclass provides its own implementation of an inherited **instance (non-static) method** with the same signature, it is called **Method Overriding**.

### Purpose

* Achieves Runtime Polymorphism
* Allows specialized behavior in child classes

### Example

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

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
```

### Output

```text
Child
```

### Key Points

* Only applies to instance methods.
* Method selection occurs at runtime.
* Depends on the actual object type.
* Supports Dynamic Method Dispatch.
* `@Override` annotation can be used.

---

## Method Hiding

### Definition

When a subclass declares a **static method** with the same signature as a static method in the superclass, the superclass method is hidden rather than overridden.

### Example

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

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
```

### Output

```text
Parent
```

### Why?

* Static methods belong to the class, not the object.
* Method resolution happens at compile time.
* Depends on the reference type.

### Key Points

* Applies only to static methods.
* No runtime polymorphism.
* `@Override` cannot be used.
* Method selection occurs at compile time.

---

# Dynamic Method Dispatch

## Definition

The mechanism by which JVM determines which overridden method to execute at runtime based on the actual object type.

### Example

```java
Parent p = new Child();
p.show();
```

At runtime:

```java
Child.show();
```

is executed because the actual object is `Child`.

### Key Point

> Object type decides the method call during overriding.

---

# Access Modifier Rule in Overriding

## Visibility Hierarchy

```text
private < default(package-private) < protected < public
```

## Rule

A child class cannot reduce the visibility of an inherited method.

### Valid Example

```java
class Parent {
    protected void show() {}
}

class Child extends Parent {
    public void show() {}
}
```

Visibility increased:

```text
protected → public
```

### Invalid Example

```java
class Parent {
    public void show() {}
}

class Child extends Parent {
    protected void show() {}
}
```

Compile-Time Error:

```text
Cannot reduce the visibility of the inherited method
```

### Remember

> Visibility can be maintained or increased, but never decreased.

---

# Static vs Instance Method Rules

## Instance → Instance

```java
class Parent {
    void show() {}
}

class Child extends Parent {
    void show() {}
}
```

✅ Method Overriding

---

## Static → Static

```java
class Parent {
    static void show() {}
}

class Child extends Parent {
    static void show() {}
}
```

✅ Method Hiding

---

## Static → Instance

```java
class Parent {
    static void show() {}
}

class Child extends Parent {
    void show() {}
}
```

❌ Compile-Time Error

```text
Cannot override static method
```

---

## Instance → Static

```java
class Parent {
    void show() {}
}

class Child extends Parent {
    static void show() {}
}
```

❌ Compile-Time Error

```text
Cannot hide an instance method with a static method
```

---

# Overriding vs Hiding

| Feature             | Method Overriding | Method Hiding  |
| ------------------- | ----------------- | -------------- |
| Method Type         | Instance Method   | Static Method  |
| Binding             | Runtime           | Compile Time   |
| Polymorphism        | Yes               | No             |
| Decision Based On   | Object Type       | Reference Type |
| Dynamic Dispatch    | Yes               | No             |
| `@Override` Allowed | Yes               | No             |

---

# Interview Notes

## Method Overriding

* Same method signature.
* Instance methods only.
* Runtime polymorphism.
* Resolved at runtime.
* Child can maintain or increase visibility.

## Method Hiding

* Same method signature.
* Static methods only.
* No polymorphism.
* Resolved at compile time.
* Depends on reference type.

---

# Memory Trick

```text
Object decides  → Overriding
Reference decides → Hiding
```

### Golden Rule

> Instance methods are overridden, while static methods are hidden.
