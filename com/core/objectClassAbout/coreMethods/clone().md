# Java `clone()` Method

## Definition

The `clone()` method is defined in the `java.lang.Object` class and is used to create a copy of an existing object.

### Key Points

- Creates a **new object** in memory.
- Returns a **new reference**.
- Copies the **same field values** from the original object.
- By default performs a **shallow copy**.
- The class must implement the `Cloneable` interface, otherwise `CloneNotSupportedException` is thrown.

---

## Method Signature

```java
protected Object clone() throws CloneNotSupportedException
```

Defined in:

```java
java.lang.Object
```

---

## How to Use `clone()`

### Step 1: Implement `Cloneable`

```java
class Student implements Cloneable {
    int id;
    String name;
}
```

### Step 2: Override `clone()`

```java
class Student implements Cloneable {

    int id;
    String name;

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
```

### Step 3: Clone the Object

```java
public class Main {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Priya";

        Student s2 = s1.clone();

        System.out.println(s1 == s2); // false
    }
}
```

---

## Memory Representation

### Before Cloning

```text
s1 -----> [101, "Priya"]
```

### After Cloning

```text
s1 -----> [101, "Priya"]

s2 -----> [101, "Priya"]
```

### Observation

```java
System.out.println(s1 == s2);
```

Output:

```text
false
```

### Why?

- Different objects
- Different references
- Same data

---

## Shallow Copy (Default Behavior)

When an object contains reference variables, `clone()` copies only the references, not the actual nested objects.

### Example

```java
class Address {
    String city;
}

class Student implements Cloneable {

    int id;
    Address address;

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
```

### Memory Representation

```text
Address a = new Address();

s1 -----> [id=101, address -----> a]

s2 -----> [id=101, address -----> a]
```

### Problem

```java
s2.address.city = "Bangalore";
```

Now:

```java
System.out.println(s1.address.city);
```

Output:

```text
Bangalore
```

### Reason

Both objects share the same `Address` object.

---

## Deep Copy

In Deep Copy:

- New object is created.
- All nested objects are also copied.
- No shared references.

### Memory Representation

```text
s1 -----> [id=101, address -----> A]

s2 -----> [id=101, address -----> B]
```

Now modifications in one object do not affect the other.

---

## Cloneable Interface

`Cloneable` is a Marker Interface.

### What is a Marker Interface?

A marker interface is an interface that contains no methods.

```java
public interface Cloneable {
}
```

### Purpose

It tells the JVM that objects of this class are allowed to be cloned.

Without implementing `Cloneable`:

```java
Student s2 = s1.clone();
```

Runtime Exception:

```java
java.lang.CloneNotSupportedException
```

---

## Internal Working of `clone()`

```java
Student s2 = (Student) s1.clone();
```

### Behind the Scenes

1. JVM checks whether the class implements `Cloneable`.
2. If not, throws `CloneNotSupportedException`.
3. Allocates memory for a new object.
4. Copies all field values from the original object.
5. Returns the copied object reference.

---

## Interview Questions

### Q1: Where is `clone()` defined?

**Answer:**

```java
java.lang.Object
```

---

### Q2: What is the return type of `clone()`?

**Answer:**

```java
Object
```

---

### Q3: Is `clone()` inherited by every class?

**Answer:**

Yes, because every class ultimately extends `Object`.

---

### Q4: What type of copy does `clone()` perform by default?

**Answer:**

Shallow Copy.

---

### Q5: Why implement `Cloneable`?

**Answer:**

To indicate that objects of the class are allowed to be cloned.

---

### Q6: Does `clone()` create a new object?

**Answer:**

Yes.

---

### Q7: Does `clone()` create a new reference?

**Answer:**

Yes.

---

### Q8: Are primitive values copied?

**Answer:**

Yes.

---

### Q9: Are referenced objects copied by default?

**Answer:**

No.

Only their references are copied.

---

### Q10: What exception may `clone()` throw?

**Answer:**

```java
CloneNotSupportedException
```

---

## Shallow Copy vs Deep Copy

| Feature | Shallow Copy | Deep Copy |
|----------|-------------|------------|
| New Object Created | ✅ | ✅ |
| Primitive Fields Copied | ✅ | ✅ |
| Reference Fields Copied | Reference Only | New Objects Created |
| Shared References | ✅ Yes | ❌ No |
| Independent Objects | ❌ No | ✅ Yes |

---

## Quick Revision Notes

### `clone()` Checklist

- ✅ Defined in `Object` class
- ✅ Protected method
- ✅ Return type is `Object`
- ✅ Creates a new object
- ✅ Creates a new reference
- ✅ Copies same field values
- ✅ Default behavior is Shallow Copy
- ✅ Requires `Cloneable`
- ✅ May throw `CloneNotSupportedException`
- ✅ Can be overridden for custom cloning

---

## One-Line Interview Definition

> The `clone()` method of the `Object` class creates a new object with the same state as the original object. By default, it performs a shallow copy, meaning primitive values are copied while referenced objects are shared.