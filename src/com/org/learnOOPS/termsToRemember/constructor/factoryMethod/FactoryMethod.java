package com.org.learnOOPS.termsToRemember.constructor.factoryMethod;
// Class whose object creation we want to control
class FactoryMethod {

    private int value;

    // 🔒 Constructor is PRIVATE
    private FactoryMethod(int value) {
        this.value = value;
        System.out.println("Object created with value = " + value);
    }

    // 🏭 Factory Method
    public static FactoryMethod create(int value) {

        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }

        // Constructor is called INSIDE the class
        return new FactoryMethod(value);
    }

    public void show() {
        System.out.println("Value is: " + value);
    }

    // Client
    public static void main(String[] args) {

        // ❌ Not allowed (constructor is private)
        // FactoryMethod fm = new FactoryMethod(10);

        // ✅ Allowed via factory
        FactoryMethod fm1 = FactoryMethod.create(10);
        fm1.show();

        FactoryMethod fm2 = FactoryMethod.create(20);
        fm2.show();
    }
}



/*

 ❓ Then why did I say “❌ Not allowed”?

That comment was intentional from a design point of view, not a Java access-rule point of view.

Let’s separate the two 👇

✅ Java rule (access control — 100% clear)

private members are accessible only within the same class

main() is inside the same class

static vs non-static does NOT matter for access

✔ So this is allowed by Java:

class FactoryMethod {

    private FactoryMethod(int value) {}

    public static void main(String[] args) {
        FactoryMethod fm = new FactoryMethod(10); // ✅ LEGAL
    }
}

❌ Why we avoid doing this (DESIGN reason)

When we write:

private FactoryMethod(int value)


and also provide:

public static FactoryMethod create(int value)


we are saying:

“All object creation MUST go through the factory method.”

So inside main(), we intentionally avoid calling the constructor directly to:

Enforce one creation path

Ensure validation / rules are applied

Demonstrate real-world usage

That’s why the line was commented, not because Java forbids it, but because design forbids it.

🧠 Key distinction (VERY IMPORTANT)
Aspect	Answer
Is it allowed by Java?	✅ YES
Should we do it in factory design?	❌ NO
Reason	Breaks encapsulation & control
🧠 Remember-forever line

Private controls access; factory controls discipline.

Or even simpler:

“Allowed by compiler, avoided by design.”

🎯 Interview one-liner

“A private constructor can be accessed inside the same class, including from main(). However, in factory-based designs, direct constructor calls are intentionally avoided to enforce controlled object creation.”
 */