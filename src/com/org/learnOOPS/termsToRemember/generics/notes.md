🔹 What are Wrapper Classes?

Wrapper classes convert primitive data types into objects.

Primitive	Wrapper
int     	Integer
double  	Double
char    	Character
boolean  	Boolean
byte     	Byte
shor   t	Short
long    	Long
float   	Float


🔹 Why Wrapper Classes are Needed
1️⃣ Collections work only with objects
// ❌ Not allowed
ArrayList<int> list;
```
// ✅ Allowed
ArrayList<Integer> list = new ArrayList<>();
```

2️⃣ Generics need objects (IMPORTANT)
class Box<T> { }
```
Box<int> b;      // ❌ invalid
Box<Integer> b;  // ✅ valid
```

3️⃣ Utility methods
```
int x = Integer.parseInt("123");
```

4️⃣ Null handling
```
Integer a = null; // possible
int b = null;     // ❌ not possible
```

🔹 Autoboxing & Unboxing
Autoboxing (primitive → object)
```
int a = 10;
Integer b = a; // autoboxing
```

Unboxing (object → primitive)
```
Integer x = 20;
int y = x; // unboxing
```


📌 Introduced in Java 5

🔹 Important interview note

Wrapper classes are immutable.
```
Integer a = 10;
a++; // creates new Integer object
```

🧠 One-line wrapper summary

Wrapper classes allow primitives to behave like objects, enabling collections, generics, and utility operations.




🧬 PART 2: Java Generics (Now it will CLICK)
🔹 What are Generics?

Generics allow type-safety by parameterizing types.

Instead of:

Object obj;


We write:

<T>

🔹 Problem without Generics
ArrayList list = new ArrayList();
list.add(10);
list.add("Hello");

int x = (int) list.get(1); // ❌ runtime error

🔹 Solution with Generics
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
// list.add("Hello"); // ❌ compile-time error

int x = list.get(0); // no casting


📌 Errors caught at compile time

🔹 Simple Generic Class Example
class Box<T> {
T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}


Usage:

Box<Integer> b = new Box<>();
b.set(10);
System.out.println(b.get());

🔹 Why Generics need Wrapper Classes
Box<int> b;      // ❌ primitives not allowed
Box<Integer> b; // ✅ wrapper used


📌 This is the direct connection between wrappers & generics

🔹 Generic Methods
class Test {
static <T> void show(T data) {
System.out.println(data);
}
}


Usage:

Test.show(10);
Test.show("Hello");

🔹 Bounded Generics
class NumberBox<T extends Number> {
T num;
}


Allowed:

new NumberBox<Integer>();
new NumberBox<Double>();


Not allowed:

new NumberBox<String>(); // ❌

🧠 FINAL CONNECTION (VERY IMPORTANT)

Primitives → Wrapper Classes → Generics → Collections

Without wrapper classes:

❌ No generics

❌ No collections

❌ No type of safety

🎯 Exam-ready 3-line answer

Wrapper classes convert primitives into objects.
Generics provide compile-time type safety using parameterized types.
Wrapper classes are required because generics work only with objects.