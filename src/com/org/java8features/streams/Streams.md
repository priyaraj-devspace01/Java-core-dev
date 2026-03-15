## Java Stream API — Complete Master Guide
1. What Exactly is Stream API?
   Definition

Java Stream API is a declarative functional programming abstraction introduced in Java 8 to process collections of data in a pipeline of operations.

A Stream represents a sequence of elements supporting functional-style operations like filtering, mapping, reducing, and collecting.

Official Definition (Interview Safe)

A Stream in Java is a sequence of elements from a data source that supports aggregate operations, processed in a pipeline using functional-style operations.

## 2. Why Stream API Was Introduced
### Before java 8 we used:
``` 
for (String name : names) {
    if(name.startsWith("A")){
        System.out.println(name);
    }
}
```
Problems:

Imperative coding

More boilerplate

Hard to parallelize

Less readable

Stream API solves this:
``` 
names.stream()
     .filter(n -> n.startsWith("A"))
     .forEach(System.out::println);
```

### Advantages:

Functional programming

Parallel processing

Less code

Lazy evaluation

Pipeline processing

## Data Source → Stream → Intermediate Operations → Terminal Operation → Result
``` demo.java
List<String> names = List.of("Amit","Rahul","Ankit");

names.stream()              // source
     .filter(n -> n.startsWith("A"))  // intermediate
     .map(String::toUpperCase)        // intermediate
     .forEach(System.out::println);   // terminal
```
```
Collection
   │
   ▼
Stream Source
   │                                               
   ▼
Intermediate Operations
   │
   ▼
Terminal Operation
   │
   ▼
Result


Example : below 
List
 ↓
stream()
 ↓
filter()
 ↓
map()
 ↓
sorted()
 ↓
collect()
```

## Key Characteristics of Streams
### 1️⃣ Not a Data Structure

Stream does not store data

It processes data from a source

Sources:

Collections

Arrays

Files

IO Channels

Generators

### 2️⃣ Functional Style

Uses lambda expressions
```
.filter(x -> x > 5)

```

### 3️⃣ Lazy Evaluation

Intermediate operations execute only when terminal operation is called

Example:
``` 
Stream<String> s = names.stream().filter(x -> x.startsWith("A"));
```
Nothing happens yet.

Only executes when:
``` 
s.forEach(System.out::println);
```

### 4️⃣ Single Use

A stream cannot be reused

Wrong:
``` 
Stream<String> s = list.stream();
s.forEach(System.out::println);
s.forEach(System.out::println); // Exception
```

### 5️⃣ Parallel Processing

Streams support parallel execution
```
list.parallelStream()
```


## 6. Types of Stream Operations

Two types:

1 Intermediate Operations
2 Terminal Operations


These transform the stream and return another stream.

They are lazy.
```
Common Intermediate Operations
Operation	Purpose
filter()	Filter elements
map()	Transform element
flatMap()	Flatten nested structure
distinct()	Remove duplicates
sorted()	Sort elements
peek()	Debugging
limit()	Limit elements
skip()	Skip elements
```

``` 
1️⃣ filter()

Filters elements based on condition.

list.stream()
    .filter(x -> x > 10)

Example

List<Integer> nums = List.of(10,20,30);

nums.stream()
    .filter(n -> n > 15)
    .forEach(System.out::println);

Output

20
30
2️⃣ map()

Transforms each element.

Input → Transformation → Output

Example

list.stream()
    .map(String::toUpperCase)

Example

List<String> names = List.of("java","python");

names.stream()
     .map(String::toUpperCase)
     .forEach(System.out::println);

Output

JAVA
PYTHON
3️⃣ flatMap()

Used for nested collections

Example

List<List<String>>

Example

List<List<String>> list = List.of(
    List.of("A","B"),
    List.of("C","D")
);

list.stream()
    .flatMap(Collection::stream)
    .forEach(System.out::println);

Output

A
B
C
D
4️⃣ sorted()

Sorts elements

list.stream().sorted()

Custom sorting

sorted((a,b) -> b-a)
5️⃣ distinct()

Removes duplicates

list.stream().distinct()
6️⃣ limit()

Limits elements

stream.limit(5)
7️⃣ skip()

Skip elements

stream.skip(2)
8️⃣ peek()

Used mainly for debugging

stream.peek(System.out::println)


```