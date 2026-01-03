package com.org.learnOOPS.termsToRemember.cloning;

class A implements Cloneable {

    int x = 10;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception {

        A a1 = new A();
        A a2 = (A) a1.clone();

        System.out.println(a1 == a2); // false
        // clone() creates a new object at a different heap address, so a1 == a2 is false.
    }
}

