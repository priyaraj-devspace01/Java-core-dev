### (Code-1 ) for jvm memory or data area on jvm

```class Calc {
int a = 445;

    public int add(int a, int b) {
        return a + b;
    }
}

class Main4 {
public static void main(String[] args) {
int ab = 33;

        Calc calc = new Calc();     // object on heap
        int res = calc.add(33, 33); // method call
        System.out.println(res);
    }
}


```
Memory creation (step-by-step)
1️⃣ Stack memory
Main thread stack is created first

Inside it:

main() stack frame

Local variables: ab, calc (reference), res

2️⃣ Heap memory
new Calc() creates Calc object on HEAP

calc (stack) → points to heap object

3️⃣ add() method stack
When calc.add(33,33) is called:

New stack frame for add() is created

Parameters a and b live here

Now the IMPORTANT part ❗
Which memory is cleared first?
✅ 1️⃣ add() method stack frame — CLEARED FIRST
As soon as add() returns

Stack frame is popped automatically

❌ Garbage Collector is NOT involved

👉 Stack memory is cleaned automatically (LIFO)

✅ 2️⃣ main() stack frame — CLEARED NEXT
When main() finishes execution

Entire main stack frame is removed

❌ Garbage Collector is NOT involved

✅ 3️⃣ Heap memory — CLEARED LAST (by Garbage Collector)
The Calc object lives on heap

It becomes eligible for GC only when:

No stack variable references it (calc goes out of scope)

👉 Garbage Collector works ONLY on heap memory

Final order (this is the answer you want)
scss
Copy code
1️⃣ add() method stack frame  → cleared first (automatic)
2️⃣ main() method stack frame → cleared next (automatic)
3️⃣ Heap object (Calc)        → cleared last (by GC)