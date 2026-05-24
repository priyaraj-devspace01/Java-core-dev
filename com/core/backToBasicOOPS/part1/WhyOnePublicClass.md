# Why Only One Public Class Is Allowed in a Java File

## Interview-Ready Answer

Java allows only one `public` class in a `.java` file because:

> The file name must exactly match the public class name.

This helps the compiler:
- identify the main class easily
- avoid ambiguity
- simplify compilation and class loading

---

# Example

```java
public class Test {

}
```

File name must be:

```text
Test.java
```

---

# Invalid Example

```java
public class A {

}

public class B {

}
```

Compiler gets confused:
- Should file name be `A.java`?
- Or `B.java`?

So Java does not allow multiple public classes in one file.

---

# Valid Example

```java
class A {

}

public class B {

}
```

File name:

```text
B.java
```

This works because only one class is public.

---

# Important Point

Non-public classes:
- have limited/package-level access
- do not need file name matching

So they can exist in the same file.

---

# Simple Memory Trick

> One public class = One matching file name

---

# One-Line Interview Answer

> Java allows only one public class per file so the compiler can easily match the file name with the public class name without confusion.