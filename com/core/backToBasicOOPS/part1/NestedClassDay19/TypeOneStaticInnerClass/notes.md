# Static Nested Class in Java

---

# Definition

A static nested class is a class declared with `static`
inside another class.

```java
class Outer {

    static class Inner {

    }
}
```

It behaves almost like a normal class but is logically
grouped inside outer class.

---

# Main Intuition

Static nested class means:

```text
"Logically related to outer class
but does NOT need outer object"
```

---

# Object Creation

```java
class Car {

    static class Engine {

        void start() {
            System.out.println("Engine Started");
        }
    }
}

public class Demo {

    public static void main(String[] args) {

        Car.Engine engine = new Car.Engine();

        engine.start();
    }
}
```

---

# Important Flow

## Step 1
Outer class gets loaded.

```text
Car class loaded
```

---

## Step 2
Static nested class becomes available.

```text
Car.Engine available
```

---

## Step 3
Object can be created directly.

```java
new Car.Engine();
```

No outer object needed.

---

# Why No Outer Object Needed?

Because static nested class belongs to:

```text
CLASS LEVEL
```

NOT object level.

It behaves almost like:

```text
normal class grouped inside another class
```

---

# Static Nested Class vs Inner Class

| Static Nested Class | Non-Static Inner Class |
|---|---|
| No outer object needed | Outer object required |
| Class-level relationship | Object-level relationship |
| Logical grouping | Logical grouping + object dependency |
| `new Car.Engine()` | `car.new Engine()` |

---

# Non-Static Inner Class Example

```java
class Car {

    class Engine {

    }
}

Car car = new Car();

Car.Engine engine = car.new Engine();
```

Because Engine belongs to specific Car object.

---

# Static Nested Class Example

```java
class Car {

    static class Engine {

    }
}

Car.Engine engine = new Car.Engine();
```

No Car object required.

---

# Real-World Use Cases

---

## 1. Builder Pattern

```java
class User {

    static class Builder {

        Builder setName() {
            return this;
        }

        User build() {
            return new User();
        }
    }
}
```

Usage:

```java
new User.Builder().setName().build();
```

### Why?

Builder logically belongs to User
but does not need User object.

---

## 2. Validator Helper

```java
class Employee {

    static class Validator {

        static boolean isValid() {
            return true;
        }
    }
}
```

Usage:

```java
Employee.Validator.isValid();
```

### Why?

Validator is helper logic related to Employee.

---

## 3. Config Holder

```java
class Database {

    static class Config {

        static String URL = "localhost";
    }
}
```

Usage:

```java
Database.Config.URL
```

### Why?

Configuration logically grouped with Database.

---

## 4. Factory Helper

```java
class Vehicle {

    static class Factory {

        static Vehicle createCar() {
            return new Vehicle();
        }
    }
}
```

Usage:

```java
Vehicle.Factory.createCar();
```

### Why?

Factory helps create Vehicle objects.

---

## 5. DTO / MetaData Helper

```java
class APIResponse {

    static class MetaData {

        int status = 200;
    }
}
```

Usage:

```java
new APIResponse.MetaData();
```

---

# Access Rules

## Static Nested Class CAN access:

- static variables
- static methods

Example:

```java
class Test {

    static int x = 10;

    static class Demo {

        void show() {
            System.out.println(x);
        }
    }
}
```

---

## Static Nested Class CANNOT directly access:

- non-static outer variables
- non-static outer methods

Wrong:

```java
class Test {

    int y = 20;

    static class Demo {

        void show() {
            System.out.println(y); // ERROR
        }
    }
}
```

Because:

```text
non-static members belong to object
```

---

# Memory Understanding

```text
Outer Class Loaded
        ↓
Static Nested Class Available
        ↓
Object created directly
        ↓
No outer object involved
```

---

# Why Companies Use It

- Better logical grouping
- Cleaner namespace
- Hide helper classes
- Builder Pattern
- DTO grouping
- Utility/helper logic
- Framework internals

---

# Used Heavily In

- Builder Pattern
- Spring Framework
- Selenium internals
- DTOs
- API payloads
- Factory helpers
- Config classes

---

# Easy Memory Trick

## Static Nested Class

```text
"Logical grouping only"
```

---

## Non-Static Inner Class

```text
"Logical grouping + needs outer object"
```

---

# Final Core Understanding

Static nested class behaves almost like:

```text
normal independent class
```

BUT:

```text
grouped inside another class for better organization
```
