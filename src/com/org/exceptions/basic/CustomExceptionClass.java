package com.org.exceptions.basic;



class InsufficientFundsException extends Exception
{
    public InsufficientFundsException(String s)
    {
        super("Insufficient Funds");
    }
}
class BankAccount {
    public BankAccount(double amount) {
        this.balance = balance;
    }

    private double balance;


    public double getAmount(double amount) throws Exception {
        if(amount > balance)
        {
            throw new InsufficientFundsException("you are wanting the amount more than balance");
        }
        return balance + amount;
    }

}
public class CustomExceptionClass {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        try
        {
            account.getAmount(1000);

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
