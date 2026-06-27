package com.exceptionHandlingLEARN.Basics;

public class throwVSthrows {
    public static void main(String[] args){ // throws IllegalArgumentException { /// but it is not recommended to throw the exception by main method because above that no parent class to handle it, only jvm is there so it's recommended to handle it at last at the main method
        // suppose we have a scenarios where we are taking the user age for checking for voting eligibility.
         // but for that may the user can give the input as negative as well which is invalid and in that scenario we need to inform the user that it's exception not just by
        // preventing it by if else condition


        try {
            checkEligibilty(-2);
        }catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static void checkEligibilty(int age) throws IllegalArgumentException{
//        if(age < 0)
//        {
//            System.out.println("age can't be negative ");
//        }
        /// instead we can throw our own exception - because it is good to give the responsibility the exception created by us
        if(age < 0)
        {
            throw new IllegalArgumentException("Age must be greater than zero . ");
            /// now to handle it we can handle it by our own or pass to the parent as well to handle it by using the "throws" keyword
        }
        System.out.println("you are eligible for vote");
    }
}
