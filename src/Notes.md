# Java file structure 
#### -A  java program file can contain as many numbers of classes there at most one public class
#### -The program file name should be anything if there is no public class, but if there is a public class then
#### -The file name should be the same as the class name.
#### -In a single program file we don't have more than one public class. (else will get compile time error ).


# Note:
#### -Always Remember that we can create a class as the same name inside the same package.
#### -We can't use a pre-defined java class name for package naming.


## Static keyword notes - 1

You cannot declare a static variable inside a static method in Java.

Why? (very simple)

static variables belong to the class, not to a method.

Methods (static or non-static) do not own static members.

```❌ Invalid code
static void show() {
static int x = 10; // ❌ compile-time error

}
```

## 2
static → class → no object → cannot touch instance data
non-static → object → has this → can touch everything
Interview one-liner ⭐
A static method cannot access non-static members because it does not have an object reference, whereas a non-static method does.


✅ What IS allowed
1️⃣ Static variable at class level
class Test {
static int x = 10; // ✅ allowed

    static void show() {
        System.out.println(x);
    }
}

2️⃣ Local variable inside static method (non-static)
static void show() {
int y = 20; // ✅ allowed
}

3️⃣ Constant inside method (using final)
static void show() {
final int Z = 30; // ✅ allowed
}

One-line rule ⭐

Static variables are declared at class level only, never inside methods.
## 3) Can we declare a static variable inside the non-static method
Simple reason (one line)

static variables belong to the class, not to methods.

So it doesn’t matter whether the method is static or non-static — methods cannot contain static variables.

❌ Invalid code
void display() {
static int x = 10; // ❌ compile-time error
}


Error (typical):

Illegal modifier for parameter x; only final is permitted

✅ What IS allowed
1️⃣ Static variable at class level
class Test {
static int x = 10; // ✅

    void display() {
        System.out.println(x);
    }
}

2️⃣ Local variable inside non-static method
void display() {
int y = 20; // ✅
}

3️⃣ Constant inside method
void display() {
final int Z = 30; // ✅
}



## note:
Top-level classes cannot be private or protected because access modifiers work relative
to an enclosing class. Since a top-level class has no enclosing class, private and protected
have no meaning. Hence, Java allows only public or default access for top-level classes.


## 2)
✅ What Java uses to decide method overloading
🔑 Only ONE thing truly matters:
Method Signature

In Java, a method’s signature consists of:

Method name

Parameter list

Number of parameters

Order of parameters

Data types of parameters

👉 Return type, access modifier, throws clause, etc. are NOT part of the signature.


# OOPS

## Main Thing
Encapsulation and abstraction are majorly focused on security and simplicity, but at the same time
inheritance and polymorphism focused on modularity and flexibility.

#### Example:
## Encapsulation:
In banking systems, our credentials, pins and passwords, account password got hidden to other just like private.
 but at the same time, accessing the data and making any changes to it required some public approach just like to send the money or transfer the data
we need some methods so that we are able to credit and deduct the amount from our account, and this is how the things are working.

Another example is that google whose offers account details like valid email and password to create an account.
these data including saved user specifc data such as(payments, password) are private but to access and modify them by us or 
someone else need some public method but with some control logic such as during accessing the account from another system it requires some code or verification.

## Abstraction
 Abstraction focuses majorly on simplicity by making the interface as simple for developers and users to access and modify to it.
Example: A luxury_car can be a interface, having several methods but not implemented, but any of the brands who are making luxury car model will going to give their own implementation for their cars(like
  speed, brake, gears, interior, cost) which is going to be easy for the designer and at the same time for the user as well , who will purchase them.
## Inheritance
  By using it, we are able to inherit the property from one class to another class so that repetition can be reduced.
Example:  Suppose I have a office design having all parameters for a perfect office, and i want the same office dimensions and all required parameter to build it again
so, instead of building it from scratch, we can extend it from the previous one and remake that with our other changes as well.
## Polymorphism:
When the same interface can be available in many forms and can generate multiple output by using that.
like, for payment we have main form is that PAYMENT, but we also have payment option such as payment through credit card, upi, debit card or etc. as also the forms available 
by using which we can perform the same operations.


## Remember - PACKAGE
“In Java, a package is a namespace that groups related classes, interfaces, enums, annotations, and sub-packages. Interfaces are package members and follow the same access control rules as classes.”









