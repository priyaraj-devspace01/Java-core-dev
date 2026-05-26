package com.core.backToBasicOOPS.part1.encapsulationConcepts;


class BankAccount{
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public double getBalance() {   // getter
        return balance;
    }
    public void setBalance(double balance) {   // setter
        this.balance += balance;
    }

    // here instead of giving the unrestricted access to the outsiders to access and modify the field directly,
    // we are encapsulating the members and their methods in a single unit as class
    /// but restricting the access by making the members are private and methods to access and modify as public with restricted access.
}

public class Encapusulation {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(500);
        System.out.println(bankAccount.getBalance());
        bankAccount.setBalance(500);
        System.out.println(bankAccount.getBalance());

    }
}
