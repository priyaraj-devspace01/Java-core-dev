package com.exceptionHandlingLEARN.Basics;

public class CustomExceptionForOwn05 {
    public static void main(String[] args) {
        /*
                        Definition:
                A Custom Exception is a user-defined exception created to represent a business-specific error that predefined Java exceptions cannot describe clearly.

                Why not use predefined exceptions?

                Predefined exceptions (like NullPointerException, IllegalArgumentException, IOException) represent general programming or system errors.
                They cannot clearly express business rules.

                Why use Custom Exceptions?

                ✅ Represents business-specific validation failures.
                ✅ Makes code more readable and meaningful.
                ✅ Allows different business errors to be handled differently.
                ✅ Improves debugging by giving clear error messages.

                Examples:

                InsufficientBalanceException
                InvalidAgeException
                EmployeeNotFoundException
                OrderAlreadyShippedException
                SeatNotAvailableException
         */

         try
         {
             withDraw(20000);
         }catch (InSufficientFundException e)
         {
             System.out.println(e);
             System.out.println("the reason for operation failed because you are trying amount : "  +e.amount +" which is > 1000(main available balance . )");
         }

    }
    public static void withDraw(int amount) throws InSufficientFundException {
        if(amount > 1000)
        {
          throw new InSufficientFundException("you can't withdraw amount more than your avl balance", amount);
        }else {
            System.out.println("Withdraw Successful ....");
        }
    }




}
class InSufficientFundException extends Exception {
    int amount;
    public InSufficientFundException(String message, int amount) {
        super(message);
        this.amount = amount;
    }
}
