### In Java Stream API, the terms stateless and stateful apply mainly to intermediate operations, not terminal operations. Understanding this is important for performance and parallel streams.
```
1️⃣ Stateless Operations

A stateless operation processes each element independently, without remembering previous elements.

👉 It does not store any state between elements.

Examples

filter()

map()

flatMap()

peek()

Example
List<Integer> list = List.of(1,2,3,4,5);

list.stream()
.filter(x -> x % 2 == 0)
.map(x -> x * 10)
.forEach(System.out::println);
How it works
1 → filter → discard
2 → filter → map → output
3 → filter → discard
4 → filter → map → output
5 → filter → discard

Each element is processed independently.

✔ No memory of previous elements
✔ Works efficiently in parallel streams

2️⃣ Stateful Operations

A stateful operation needs to remember previous elements to process the current element.

👉 It maintains internal state.

Examples

sorted()

distinct()

limit()

skip()

Example
List<Integer> list = List.of(4,2,1,3);

list.stream()
.sorted()
.forEach(System.out::println);
How it works

Before producing output:

collect all elements
↓
sort them
↓
then output

So it needs all elements first.

3️⃣ Visual Difference
Stateless
Element → operation → output immediately

Pipeline style:

1 → filter → map → print
2 → filter → map → print
3 → filter → map → print
Stateful
Collect elements → maintain state → produce output

Example sorted():

4
2
1
3
↓
store elements
↓
sort
↓
1 2 3 4
4️⃣ Important Interview Rule
Operation Type	Needs Previous Elements?	Example
Stateless	❌ No	map, filter
Stateful	✅ Yes	sorted, distinct
5️⃣ Terminal Operations

Terminal operations are not classified as stateless/stateful.

They simply consume the stream and produce a result.

Examples:

forEach()

collect()

reduce()

count()

findFirst()

anyMatch()

Example:

long count = list.stream()
.filter(x -> x > 2)
.count();

Here:

filter → stateless intermediate
count → terminal
6️⃣ Why This Matters (Parallel Streams)

Stateless operations are perfect for parallel execution.

Example:

list.parallelStream()
.filter(x -> x > 5)
.map(x -> x * 2)

Each thread can process elements independently.

But stateful operations may require synchronization or buffering, reducing parallel efficiency.

7️⃣ Summary
Feature	Stateless	Stateful
Memory of previous elements	❌ No	✅ Yes
Processing style	Element by element	Needs element history
Performance in parallel streams	Excellent	Slower
Examples	map, filter, flatMap	sorted, distinct, limit, skip

✅ One-liner for interviews

Stateless operations process elements independently, while stateful operations require maintaining information about previously processed elements.
```