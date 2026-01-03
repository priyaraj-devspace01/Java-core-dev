package com.learnBasicsToStartOOPS.accessModifiers.memberLevelAccess;




class A
{

    public void hii()
    {
        System.out.println("hii");
    }

}
class B extends A
{
    public static void main(String[] args) {
        // ALWAYS REMEMBER DURING PROTECTED MODIFIER OVERRIDING WITH IT .

        A a = new A();
        a.hii();

        A b1 = new B();
        b1.hii();

        B b2  = new B();  //it is  only allowed for protected modifier overriding
        b2.hii();

//        B b3 = new A(); // it can't be possible because a child class reference can't able to hold a parent class object
//        b3.hii();

    }
}