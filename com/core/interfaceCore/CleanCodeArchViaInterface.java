package com.core.interfaceCore;

interface MathConstant
{
    double PI_VALUE = 3.1415;
    int value = 33;

    void fun();
}

class Random implements MathConstant
{
    @Override
    public void fun()
    {
        System.out.println(PI_VALUE);
    }
}
interface Payment
{
    void pay();
}

class DebitCard implements Payment
{
    @Override
    public void pay() {
        System.out.println("making payment using debit card . ");
    }
}

class CreditCard implements Payment
{
    @Override
    public void pay() {
        System.out.println("making payment using credit card . ");
    }
}
public class CleanCodeArchViaInterface
{
    public static void main(String[] args) {
        Payment p1 = new DebitCard();
        p1.pay();

        Payment p2 = new CreditCard();
        p2.pay();


        MathConstant m1  = new Random();
        m1.fun();

    }

}

