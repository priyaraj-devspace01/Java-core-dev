1️⃣ What is a Factory Method?

A Factory Method is a method that creates and returns objects instead of using constructors directly.

📌 Object creation logic is moved out of client code and centralized.

ClassName obj = ClassName.create(...); // factory


instead of

ClassName obj = new ClassName(...);     // constructor

2️⃣ Why Factory Method Exists (THE CORE REASON)
🔴 Problem with constructors

Constructors:

Always create a new object

Cannot have meaningful names

Cannot return subclasses

Cannot control object reuse

Are tied to access modifiers (public, protected, private)

✅ Factory method solves ALL of these
3️⃣ Most Important Line (remember forever)

Constructors initialize objects.
Factories decide which object to create and how.

4️⃣ Basic Factory Method Example
❌ Without Factory
Phase1 p = new Phase1(22); // fails if constructor is protected

✅ With Factory
public class Phase1 {

    protected Phase1(int priority) {
        System.out.println("priority " + priority);
    }

    public static Phase1 create(int priority) {
        return new Phase1(priority);
    }
}


Usage:

Phase1 p = Phase1.create(22);


📌 Factory is inside the class, so it can access protected/private constructor.

5️⃣ Why Factory Method is NECESSARY (Real Reasons)
🔹 1. When constructor is protected or private

Used to control object creation

✔ Singleton
✔ Framework base classes
✔ Inheritance-only creation

🔹 2. To give meaningful names
LocalDate.of(2025, 1, 1);


vs

new LocalDate(2025, 1, 1); // unclear


📌 Names explain intent

🔹 3. To return subclass objects (BIG INTERVIEW POINT)
interface Shape {}

class Circle implements Shape {}
class Square implements Shape {}

class ShapeFactory {
static Shape getShape(String type) {
if (type.equals("circle")) return new Circle();
if (type.equals("square")) return new Square();
return null;
}
}


Usage:

Shape s = ShapeFactory.getShape("circle");


📌 Constructor cannot do this

🔹 4. To hide implementation details

Client code:

Payment p = PaymentFactory.create();


Client does NOT know:

which class

which logic

which version

🔹 5. To control object reuse (caching)
class Color {
private static final Map<String, Color> cache = new HashMap<>();

    private Color(String name) {}

    public static Color valueOf(String name) {
        return cache.computeIfAbsent(name, Color::new);
    }
}


📌 Constructors always create new objects
📌 Factories may reuse objects

6️⃣ Factory Method vs Constructor (EXAM TABLE)
Feature	Constructor	Factory Method
Name	Fixed (class name)	Meaningful
Access control	Limited	Flexible
Return type	Same class	Subclass / interface
Object reuse	❌ No	✅ Yes
Polymorphism	❌ No	✅ Yes
Encapsulation	❌ Weak	✅ Strong
7️⃣ Factory Method vs Factory Pattern

⚠️ Common confusion

🔹 Factory Method

Simple static method

Returns objects

🔹 Factory Pattern

Design pattern

Uses inheritance + abstraction

Used in frameworks

👉 For exams/interviews, static factory method is enough

8️⃣ JDK Real-World Examples (VERY IMPORTANT)
Class	Factory Method
Integer	Integer.valueOf()
Boolean	Boolean.valueOf()
LocalDate	LocalDate.of()
Optional	Optional.of()
List	List.of()

📌 JDK prefers factories over constructors

9️⃣ When NOT to Use Factory Method

Simple POJOs

DTOs

No creation logic

No access restriction

🔟 Factory + Inheritance (your earlier confusion resolved)
class Phase2 extends Phase1 {

    Phase2() {
        super(33); // mandatory
    }
}


Factory method:

Phase1 p = Phase1.create(22);


📌 Factory does NOT replace super()
📌 They solve different problems

🧠 FINAL MEMORY BLOCK (SAVE THIS)

Factory Method is used to control object creation, hide constructors, return subclasses, reuse objects, and provide meaningful names.
Constructors initialize objects; factories decide which object to create.
Factory methods are heavily used in Java APIs and frameworks.

🎯 ONE-LINE INTERVIEW ANSWER

“A factory method is used to create objects without exposing constructor logic, allowing better control, polymorphism, and flexibility compared to constructors.”