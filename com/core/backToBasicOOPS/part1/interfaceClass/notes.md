| Feature         | Interface                        | Abstract Class                        |
| --------------- | -------------------------------- | ------------------------------------- |
| Purpose         | Defines a contract (what to do)  | Defines partial implementation        |
| Inheritance     | Supports multiple inheritance    | Does not support multiple inheritance |
| Methods         | Mostly abstract methods          | Can have abstract + concrete methods  |
| Constructors    | Not allowed                      | Allowed                               |
| Variables       | `public static final` by default | Normal instance variables allowed     |
| Keyword Used    | `implements`                     | `extends`                             |
| Object Creation | Cannot create object             | Cannot create object                  |
# Abstract Classes and Interfaces in Java

---

# 1. Abstraction in Java

## Definition
Abstraction is the process of hiding implementation details and showing only essential functionality to the user.

Java achieves abstraction using:
- Abstract Classes
- Interfaces

---

# 2. Abstract Class in Java

## Definition
An abstract class is a class declared with the `abstract` keyword that may contain:
- abstract methods
- concrete methods
- variables
- constructors

It provides partial abstraction.

---

## Syntax

```java
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal eats");
    }
}
```

---

## Important Points

- Cannot create object of abstract class
- Can contain abstract and non-abstract methods
- Can have constructors
- Can have instance variables
- Child class must implement abstract methods
- Uses `extends`

---

## Example

```java
abstract class Vehicle {

    int speed = 100;

    Vehicle() {
        System.out.println("Vehicle Constructor");
    }

    void start() {
        System.out.println("Vehicle starts");
    }

    abstract void fuelType();
}

class Car extends Vehicle {

    void fuelType() {
        System.out.println("Petrol");
    }
}

public class Main {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.fuelType();

        System.out.println(c.speed);
    }
}
```

---

## Output

```text
Vehicle Constructor
Vehicle starts
Petrol
100
```

---

## When to Use Abstract Class

Use abstract class when:
- classes share common code
- common state/variables are needed
- parent-child relationship exists
- partial implementation is required

---

## Real-Life Example

### Vehicle System
All vehicles:
- start()
- stop()

But fuel type differs:
- Petrol
- Diesel
- Electric

So common code goes into abstract class.

---

# 3. Interface in Java

## Definition
An interface is a blueprint of a class that contains abstract methods and constants.

It defines:
> WHAT a class should do

not:
> HOW it should do it

---

## Syntax

```java
interface Payment {

    void pay(int amount);
}
```

---

## Important Points

- Cannot create object of interface
- Methods are public abstract by default
- Variables are public static final by default
- Supports multiple inheritance
- Uses `implements`
- Provides complete abstraction

---

## Example

```java
interface Payment {

    void pay(int amount);
}

class PhonePe implements Payment {

    public void pay(int amount) {
        System.out.println("Payment using PhonePe");
    }
}

public class Main {

    public static void main(String[] args) {

        PhonePe p = new PhonePe();
        p.pay(500);
    }
}
```

---

## Output

```text
Payment using PhonePe
```

---

# 4. Why Interface Cannot Contain Normal Variables

Interface focuses only on:
- behavior
- rules
- contracts

not object state.

So all interface variables become:

```java
public static final
```

automatically.

---

## Example

```java
interface Test {

    int x = 10;
}

public class Main {

    public static void main(String[] args) {

        System.out.println(Test.x);

        // Test.x = 20; // ERROR
    }
}
```

---

## Why?

Because interface:
- has no constructors
- cannot create objects
- cannot manage instance data

So normal instance variables are not allowed.

---

# 5. Interface vs Abstract Class

| Feature | Interface | Abstract Class |
|---|---|---|
| Purpose | Defines contract | Defines partial implementation |
| Methods | Mostly abstract | Abstract + concrete |
| Variables | public static final | Normal variables allowed |
| Constructors | Not allowed | Allowed |
| Multiple Inheritance | Supported | Not supported |
| Keyword | implements | extends |
| Object Creation | Not allowed | Not allowed |
| Abstraction | Complete | Partial |

---

# 6. Multiple Inheritance

## Interface Supports It

```java
interface A {
    void show();
}

interface B {
    void display();
}

class Test implements A, B {

    public void show() {
        System.out.println("Show");
    }

    public void display() {
        System.out.println("Display");
    }
}
```

---

## Abstract Class Does Not Support It

```java
class Test extends A, B // invalid
```

Reason:
- Diamond problem ambiguity

---

# 7. Key Difference

## Interface
> Defines only rules/behavior

Example:
```java
pay()
```

---

## Abstract Class
> Defines rules + common implementation

Example:
```java
start()
```

already implemented.

---

# 8. Real-World Analogy

| Interface | Abstract Class |
|---|---|
| Remote control buttons | Actual TV base model |
| Defines actions | Stores state + behavior |
| Rules only | Partial implementation |

---

# 9. Super Keyword in Java

## Definition
`super` refers to immediate parent class object.

---

## Uses of `super`

### Access Parent Variable

```java
super.x
```

---

### Access Parent Method

```java
super.display()
```

---

### Call Parent Constructor

```java
super()
```

---

## Example

```java
class Parent {

    int x = 10;

    void display() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {

    int x = 20;

    void show() {

        System.out.println(super.x);

        System.out.println(this.x);

        super.display();
    }
}
```

---

# 10. Concrete Class

## Definition
A concrete class is a normal class with complete implementation whose objects can be created directly.

---

## Example

```java
class Student {

    void study() {
        System.out.println("Studying");
    }
}
```

---

# 11. Important Interview Lines

## Abstract Class
> Used when classes share common code and behavior.

---

## Interface
> Used when unrelated classes need common rules/contracts.

---

# 12. Simple Memory Tricks

| Concept | Meaning |
|---|---|
| Interface | WHAT to do |
| Abstract Class | WHAT + HOW |
| Concrete Class | Complete implementation |
| super | Refers to parent class object |
| this | Refers to current class object |

---

# 13. Final Summary

## Use Interface When
- multiple inheritance needed
- designing APIs
- behavior contract required

Examples:
- Payment
- Runnable
- Comparable

---

## Use Abstract Class When
- common code exists
- common variables needed
- strong parent-child relationship exists

Examples:
- Vehicle
- Animal
- Employee

---

# Final One-Line Difference

> Interface provides rule-based complete abstraction, whereas abstract class provides partial abstraction with shared implementation and state.
# Abstraction vs Encapsulation in Java

---

# 1. Abstraction

## Definition
Abstraction is the process of hiding implementation details and showing only essential functionality to the user.

It focuses on:
> WHAT to do

---

## Purpose of Abstraction
- Reduces complexity
- Hides internal working
- Improves code maintainability
- Provides clean design

---

## Achieved Using
- Abstract Classes
- Interfaces

---

## Example

```java
interface Payment {

    void pay();
}

class PhonePe implements Payment {

    public void pay() {
        System.out.println("Payment Successful");
    }
}
```

### Explanation
User only knows:
```java
pay()
```

But internal implementation is hidden.

---

## Real-World Example
### ATM Machine
User:
- inserts card
- enters PIN
- withdraws money

But internal banking operations are hidden.

This is abstraction.

---

# 2. Encapsulation

## Definition
Encapsulation is the process of wrapping data and methods together into a single unit and restricting direct access to data.

It focuses on:
> HOW to protect data

---

## Purpose of Encapsulation
- Data hiding
- Security
- Controlled access
- Better maintainability

---

## Achieved Using
- private variables
- getter and setter methods

---

## Example

```java
class Student {

    private int age;

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }
}

public class Main {

    public static void main(String[] args) {

        Student s = new Student();

        s.setAge(21);

        System.out.println(s.getAge());
    }
}
```

---

## Explanation
- `age` cannot be accessed directly
- Access happens through methods

This protects data.

---

## Real-World Example
### Capsule Medicine
Medicine contents are hidden inside the capsule.

User only uses the capsule safely without knowing internal details.

This is encapsulation.

---

# 3. Main Differences

| Feature | Abstraction | Encapsulation |
|---|---|---|
| Meaning | Hiding implementation details | Hiding data |
| Focus | WHAT to do | HOW to protect data |
| Purpose | Reduce complexity | Provide security |
| Achieved Using | Abstract class & Interface | Private variables + getters/setters |
| Access | Shows essential features only | Restricts direct data access |

---

# 4. Simple Memory Trick

| Concept | Meaning |
|---|---|
| Abstraction | Hiding complexity |
| Encapsulation | Hiding data |

---

# 5. One-Line Interview Difference

> Abstraction hides implementation details, whereas encapsulation hides data and controls access to it.