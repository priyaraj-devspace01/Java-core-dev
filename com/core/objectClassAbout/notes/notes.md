# Java Object Class (`java.lang.Object`) - Interview Notes

## Overview

* Root class of Java hierarchy.
* Every class directly or indirectly extends `Object`.
* Located in `java.lang` package.
* Common methods inherited by all objects.

---

# 1. `toString()`

## Signature

```java
public String toString()
```

## Default Behavior

Returns:

```text
ClassName@HexHashCode
```

Example:

```java
Student@15db9742
```

## Why Override?

Default output is not human-readable.

## Optimized Version

```java
@Override
public String toString() {
    return "Student{id=" + id +
           ", name='" + name + "'}";
}
```

## Benefit

* Better logging
* Easier debugging
* Readable object representation

---

# 2. `equals(Object obj)`

## Signature

```java
public boolean equals(Object obj)
```

## Default Behavior

Compares references (memory addresses).

```java
s1.equals(s2); // false
```

## Why Override?

Business objects should usually be compared by data, not memory location.

## Optimized Version

```java
@Override
public boolean equals(Object obj) {

    if (this == obj)
        return true;

    if (obj == null ||
        getClass() != obj.getClass())
        return false;

    Student other = (Student) obj;

    return id == other.id;
}
```

## Benefit

* Correct object comparison
* Required for collections

## Interview Rule

```text
==        -> Reference Comparison
equals()  -> Content Comparison
```

---

# 3. `hashCode()`

## Signature

```java
public native int hashCode()
```

## Default Behavior

Generates JVM-based hash value.

## Why Override?

When `equals()` is overridden.

## Optimized Version

```java
@Override
public int hashCode() {
    return Objects.hash(id, name);
}
```

## Benefit

* Faster HashMap lookup
* Correct HashSet behavior
* Prevents duplicate logical objects

## Golden Rule

```text
Override equals() and hashCode() together.
```

---

# 4. `getClass()`

## Signature

```java
public final Class<?> getClass()
```

## Default Behavior

Returns runtime class metadata.

```java
obj.getClass();
```

## Can We Override?

```text
No. It is final.
```

## Usage

```java
obj.getClass().getName();
obj.getClass().getMethods();
```

## Benefit

* Reflection
* Runtime type checking
* Framework development

---

# 5. `clone()`

## Signature

```java
protected Object clone()
```

## Default Behavior

Performs shallow copy.

## Why Override?

To customize copy behavior.

## Optimized Version

```java
@Override
protected Object clone()
        throws CloneNotSupportedException {
    return super.clone();
}
```

## Requirement

```java
implements Cloneable
```

Otherwise:

```text
CloneNotSupportedException
```

## Better Alternative

```java
public Student(Student other) {
    this.id = other.id;
    this.name = other.name;
}
```

## Benefit

* Controlled copying
* Avoids shared-reference issues

---

# 6. `finalize()` (Deprecated)

## Signature

```java
protected void finalize()
```

## Default Behavior

Does nothing.

## Why Not Override?

* Unpredictable execution
* Performance overhead
* Deprecated

## Better Alternative

```java
try-with-resources
AutoCloseable
```

## Benefit

Reliable resource cleanup.

---

# 7. `wait()`

## Signature

```java
public final void wait()
```

## Default Behavior

Current thread enters waiting state and releases monitor lock.

## Override?

```text
No. It is final.
```

## Usage

```java
synchronized(obj) {
    obj.wait();
}
```

## Benefit

Inter-thread communication.

---

# 8. `notify()`

## Signature

```java
public final void notify()
```

## Default Behavior

Wakes one waiting thread.

## Override?

```text
No. It is final.
```

## Usage

```java
synchronized(obj) {
    obj.notify();
}
```

## Benefit

Producer-Consumer pattern.

---

# 9. `notifyAll()`

## Signature

```java
public final void notifyAll()
```

## Default Behavior

Wakes all waiting threads.

## Override?

```text
No. It is final.
```

## Usage

```java
synchronized(obj) {
    obj.notifyAll();
}
```

## Benefit

Thread coordination.

---

# Final Methods

Cannot be overridden:

```java
getClass()
wait()
notify()
notifyAll()
```

---

# Native Methods

Implemented by JVM:

```java
hashCode()
clone()
wait()
notify()
notifyAll()
```

---

# Most Asked Interview Questions

## Why is Object class the root class?

Provides common behavior to all Java objects.

---

## Difference between `==` and `equals()`?

| `==`                 | `equals()`         |
| -------------------- | ------------------ |
| Reference comparison | Content comparison |
| Operator             | Method             |
| Cannot override      | Can override       |

---

## Why override `hashCode()` with `equals()`?

Hash-based collections use both methods. Violating the contract causes incorrect behavior.

---

## Which methods are related to multithreading?

```java
wait()
notify()
notifyAll()
```

---

## Which method returns runtime class information?

```java
getClass()
```

---

# 30-Second Revision

```text
toString()   -> Readable object representation
equals()     -> Content comparison
hashCode()   -> Hash-based collections
getClass()   -> Runtime class information
clone()      -> Object copying
finalize()   -> Deprecated
wait()       -> Suspend thread
notify()     -> Wake one thread
notifyAll()  -> Wake all threads

Root class of Java hierarchy.
Override equals() and hashCode() together.
Prefer copy constructors over clone().
Avoid finalize().
```
