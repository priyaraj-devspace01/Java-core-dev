# String Literal vs new String() in Java

When you write:

```java
String name = "raj";
```

Java internally treats `"raj"` as a String object automatically.

Conceptually JVM does something like:

```java
String name = StringPool.getOrCreate("raj");
```

> (Not actual code, just for understanding)

So object creation still happens — you just don’t explicitly write `new`.

---

# Important Idea

## new

Means:

> “Always create a fresh object.”

Example:

```java
String s = new String("raj");
```

Definitely creates a new heap object.

---

# String Literal

```java
String s = "raj";
```

Means:

> “Use existing pooled object if already present, otherwise create one.”

So JVM handles object creation automatically.

---

# Why Java Allows This?

Because Strings are used extremely frequently.

Without String Pool:

```java
String a = "raj";
String b = "raj";
String c = "raj";
```

would create 3 separate objects unnecessarily.

Instead JVM optimizes memory using String Pool.

---

# Actual Memory Behavior

## First Time

```java
String a = "raj";
```

JVM:
- checks String Pool
- `"raj"` not found
- creates object
- stores in pool

---

## Second Time

```java
String b = "raj";
```

JVM:
- checks pool
- `"raj"` already exists
- reuses same object

So:

```java
a == b
```

returns:

```java
true
```

because both references point to the same pooled object.


``` java

String a = "raj"
string b = "raj"
a = "liku"
will not affect the value for  b, because here we have the concept of immutability(security)


```

# Java String.format() Placeholders

# Basic Syntax

```java
String.format("format", values);
```

Example:

```java
String name = "Raj";

String msg = String.format("Hello %s", name);
```

---

# Most Important Placeholders

| Placeholder | Meaning | Example |
|---|---|---|
| `%s` | String | `"Raj"` |
| `%d` | Integer | `10` |
| `%f` | Floating number | `10.5` |
| `%c` | Character | `'A'` |
| `%b` | Boolean | `true` |
| `%x` | Hexadecimal | `ff` |
| `%o` | Octal | `17` |
| `%e` | Scientific notation | `1.2e+03` |
| `%%` | Percent symbol | `%` |
| `%n` | New line | line break |

---

# Examples

# String

```java
String.format("Name: %s", "Raj");
```

Output:

```text
Name: Raj
```

---

# Integer

```java
String.format("Age: %d", 25);
```

---

# Float

```java
String.format("Price: %f", 99.99);
```

---

# Decimal Precision

```java
String.format("%.2f", 99.999);
```

Output:

```text
100.00
```

---

# Character

```java
String.format("%c", 'A');
```

---

# Boolean

```java
String.format("%b", true);
```

---

# Hexadecimal

```java
String.format("%x", 255);
```

Output:

```text
ff
```

---

# Multiple Values

```java
String.format(
    "Name: %s Age: %d",
    "Raj",
    25
);
```

---

# Dynamic XPath Real-Time Usage

```java
String xpath = String.format(
    "//button[text()='%s']",
    buttonName
);
```

---

# Width Formatting

```java
String.format("%10s", "Raj");
```

Adds spacing.

---

# Left Alignment

```java
String.format("%-10s", "Raj");
```

---

# Zero Padding

```java
String.format("%05d", 25);
```

Output:

```text
00025
```

---

# Important Interview Points

- `%s` is most used in Selenium frameworks
- `String.format()` improves readability
- Commonly used for:
    - dynamic XPath
    - logs
    - reports
    - SQL queries
    - API payloads