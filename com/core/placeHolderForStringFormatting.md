# Java printf() Complete Notes for DSA & Competitive Programming

## Why Learn printf()?

While solving DSA problems, HackerRank challenges, competitive programming questions, and coding assessments, you often need to produce output in an exact format.

`printf()` allows you to:

* Format strings
* Format numbers
* Control spacing
* Add leading zeros
* Align output
* Control decimal precision
* Produce table-like output

---

# Syntax

```java
System.out.printf("format_string", values);
```

Example:

```java
String name = "Rahul";
int age = 22;

System.out.printf("Name: %s Age: %d%n", name, age);
```

Output:

```text
Name: Rahul Age: 22
```

---

# Common Format Specifiers

| Specifier | Meaning               |
| --------- | --------------------- |
| `%s`      | String                |
| `%d`      | Integer               |
| `%f`      | Floating Point Number |
| `%c`      | Character             |
| `%b`      | Boolean               |
| `%n`      | New Line              |
| `%%`      | Percent Symbol        |

Example:

```java
System.out.printf("%s %d %.2f %c %b%n",
                  "Java",
                  10,
                  15.678,
                  'A',
                  true);
```

Output:

```text
Java 10 15.68 A true
```

---

# Width Formatting

Reserve a fixed amount of space.

Syntax:

```java
%widthSpecifier
```

Example:

```java
System.out.printf("|%10s|", "Java");
```

Output:

```text
|      Java|
```

Visualization:

```text
|______Java|
```

Total width = 10 characters.

---

# Left Alignment

By default, printf uses right alignment.

Example:

```java
System.out.printf("|%10s|", "Java");
```

Output:

```text
|      Java|
```

Use `-` for left alignment.

```java
System.out.printf("|%-10s|", "Java");
```

Output:

```text
|Java      |
```

---

# Leading Zeros

Default behavior:

```java
System.out.printf("%3d", 7);
```

Output:

```text
  7
```

To pad with zeros:

```java
System.out.printf("%03d", 7);
```

Output:

```text
007
```

Examples:

```java
System.out.printf("%03d%n", 1);
System.out.printf("%03d%n", 25);
System.out.printf("%03d%n", 999);
```

Output:

```text
001
025
999
```

---

# Floating Point Precision

Control digits after decimal.

Syntax:

```java
%.nf
```

Example:

```java
System.out.printf("%.2f", 12.34567);
```

Output:

```text
12.35
```

Examples:

```java
%.1f -> 12.3
%.2f -> 12.35
%.3f -> 12.346
```

---

# Width + Precision

```java
System.out.printf("%10.2f", 12.345);
```

Output:

```text
     12.35
```

Meaning:

* Width = 10
* Precision = 2

---

# Printing Percentage Sign

Incorrect:

```java
System.out.printf("100%");
```

Correct:

```java
System.out.printf("100%%");
```

Output:

```text
100%
```

---

# HackerRank Java Output Formatting Problem

Requirement:

* String left-aligned within 15 spaces
* Integer must contain 3 digits
* Add leading zeros if needed

Solution:

```java
System.out.printf("%-15s%03d%n", str, num);
```

Example:

```java
System.out.printf("%-15s%03d%n", "java", 7);
```

Output:

```text
java           007
```

Breakdown:

```java
%-15s
```

Meaning:

* String
* Width = 15
* Left aligned

```java
%03d
```

Meaning:

* Integer
* Width = 3
* Pad with zeros

---

# General Structure of printf

```text
%[flags][width][.precision]type
```

Examples:

```java
%-15s
```

* Flag = -
* Width = 15
* Type = s

---

```java
%03d
```

* Flag = 0
* Width = 3
* Type = d

---

```java
%10.2f
```

* Width = 10
* Precision = 2
* Type = f

---

# DSA Pattern Recognition

When solving problems:

### Fixed Width Output

```java
%10s
%20d
```

---

### Left Alignment

```java
%-15s
```

---

### Leading Zeros

```java
%02d
%03d
%05d
```

Examples:

```text
1   -> 01
7   -> 007
23  -> 00023
```

---

### Decimal Precision

```java
%.2f
%.3f
```

Useful for:

* Probability
* Geometry
* Mathematics
* Competitive Programming

---

# Mental Model

Read format specifiers from left to right:

```java
%-15s
```

Think:

```text
%
String
Width = 15
Left Aligned
```

---

```java
%03d
```

Think:

```text
%
Integer
Width = 3
Fill Empty Spaces With 0
```

---

# Interview Tip

Most commonly used patterns:

```java
%s
%d
%f
%n
%-15s
%03d
%.2f
%% 
```

Master these and you can solve almost every formatting question asked in coding assessments, HackerRank, and Java interviews.
