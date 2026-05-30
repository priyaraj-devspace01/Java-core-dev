package com.core.enumeration;
enum PaymentStautus2 {
    SUCCESS(200),
    FAIL(401),
    PENDING(403);


    // we can also add our own other class members as enum is basically works like a class
    private int getCode;

    PaymentStautus2(int getCode) {
        this.getCode = getCode;
    }

    public int getCode() {
        return this.getCode;
    }
}

    // it's basically internally going to convert it into a class with constant as private static final with some constructor with code values

/// LIKE, BELOW,
  ///class PaymentStautus2 extends Enum<PaymentStautus2> {
  ///     public  static final SUCCESS  = new PaymentStautus2(200);
  ///     public  static final FAIL  = new PaymentStautus2(401);
  ///     public  static final PENDING  = new PaymentStautus2(403);
  ///
  ///     private int getCode;
  ///     PaymentStautus2(int getCode)
  ///     {
  ///         this.getCode=getCode;
  ///     }
  ///
  ///     public int getCode()
  ///     {
  ///         return this.getCode;
  ///     }
  ///
  /// }




public class EnumerationHandON {
    public static void main(String[] args) {
        // Enums - it's a pre-defined set of named constants.
//        PaymentStautus2 dd = 22;  // type safety
//        PaymentStautus2 status2 = "success"; // incorrect data

//          PaymentStautus2 status = PaymentStautus2.FAIL;
//        System.out.println(PaymentStautus.SUCCESS);


        PaymentStautus2 p1 = PaymentStautus2.SUCCESS;
        System.out.println(p1.getCode());



    }
}
