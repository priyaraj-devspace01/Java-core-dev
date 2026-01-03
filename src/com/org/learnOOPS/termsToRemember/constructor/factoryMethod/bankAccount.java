package com.org.learnOOPS.termsToRemember.constructor.factoryMethod;
 class Account {

    private int balance;

    // 🔒 protected constructor
    protected Account(int balance) {
        this.balance = balance;
        System.out.println("Account created with balance " + balance);
    }

    // 🏭 Factory method
    public static Account openAccount(int balance) {

        if (balance < 1000) {
            throw new IllegalArgumentException("Minimum balance is 1000");
        }

        return new Account(balance); // allowed (same class)
    }

    public int getBalance() {
        return balance;
    }
}

public class bankAccount{

    public static void main(String[] args) {

        // ❌ Not allowed
        // Account a = new Account(500);

        // ✅ Allowed via factory
        Account a = Account.openAccount(2000);
        System.out.println(a.getBalance());
    }
}

/*
“Validation can be done in constructors, but factory methods are used when object creation
itself needs to be controlled, named, reused, or abstracted.”

1️⃣ Factory can decide whether to create or reuse an object
Integer a = Integer.valueOf(10); // may reuse cached object


➡ Constructor always creates:

new Integer(10); // always new object

2️⃣ Factory methods can have meaningful names
User adult = User.createAdult(25);


➡ Constructor is unclear:

new User(25);

3️⃣ Factory can return subclass or implementation
Shape s = ShapeFactory.getShape("circle"); // returns Circle


➡ Constructor cannot do this:

new Shape(); // impossible

4️⃣ Factory hides complex creation logic
Connection c = ConnectionFactory.getConnection();


➡ Constructor exposes internals:

new DatabaseConnection("url", "user", "pwd");

5️⃣ Factory works with protected / private constructors
Account a = Account.openAccount(2000);


➡ Constructor blocked:

new Account(2000); // not accessible
 */


