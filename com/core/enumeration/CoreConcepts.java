package com.core.enumeration;


// why we need ?
 /*
 suppose we have three status for payment processing which we need to use
    1) success - 1
    2) failed - -1
    3) pending - 0
  */


// So, Basically create a class containing these many constant and we can make them final to mark them as constant not be affected by it's instances
class PaymentStautus
{
    public static final int SUCCESS = 1;
    public static final int FAILURE = -1;
    public static final int PENDING = 0;
}


/// ISSUES FOR THIS APPROACH :
/// 1) Type safety
public class CoreConcepts {
    public static void main(String[] args) {
       int status =  PaymentStautus.SUCCESS;
       int status2 = 100;  //p1


        /*

              1) Type safety
              2) Poor readability
              if(status == 2) what is 2 here need to check byu going to the class ?
              3) no grouping of related entities
              if(status == Role.ADMIN)
              4) case mismatch
              if(status == "success") // when the original is "SUCCESS"
                // also the string comparison take times

              5) also duplicate value might be there, where we need unique named constants

         */
    }
}
