``` 
### BinaryOperator in Java (Functional Interface)

`BinaryOperator<T>` is a **specialized functional interface** in Java that extends `BiFunction<T, T, T>`.

It represents an operation that **takes two inputs of the same type and returns a result of the same type**.

So it is similar to:

* **UnaryOperator<T>** → one input, output type same as input
* **BinaryOperator<T>** → two inputs, output type same as input

---

### Concept

```
UnaryOperator<T>
T apply(T t)

BinaryOperator<T>
T apply(T t1, T t2)
```

Both ensure the **input and output types remain the same**, but:

* **UnaryOperator** → works on **one value**
* **BinaryOperator** → works on **two values**

---

### Example

```java
BinaryOperator<Integer> add = (a, b) -> a + b;

System.out.println(add.apply(5, 3)); 
```

Output:

```
8
```

Here:

```
Input1 = 5
Input2 = 3
Output = 8
```

---

### Common Use Cases

BinaryOperator is commonly used for:

* Mathematical operations (sum, multiply, max, min)
* Stream reductions
* Combining two values into one result

Example with streams:

```java
BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;
```

---

### Quick Comparison

| Interface         | Input | Output    | Purpose                 |
| ----------------- | ----- | --------- | ----------------------- |
| UnaryOperator<T>  | 1     | same type | operate on single value |
| BinaryOperator<T> | 2     | same type | combine two values      |

---

### Key Idea

BinaryOperator is useful when:

```
Input1 type = Input2 type = Output type
```

Example:

```
Integer + Integer → Integer
String + String → String
```
```