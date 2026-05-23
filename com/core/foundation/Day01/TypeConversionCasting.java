package com.core.foundation.Day01;

public class TypeConversionCasting {
    public static void main(String[] args) {
//1)  implicit conversion
        byte b = 22;
        int  a = b;
        System.out.println(a);
        // as here we are converting a less wide data to a more wider data, it will automatically cast the type
        // that's why it' called winning or implicit conversion


//2)  truncating
        // Similarly, truncating means when try to cast the floating point number to integral type- it basically omitt the after decimal number
        float  f = 22.44f;
        int c = (int) f;
        System.out.println(c);


        // char to int
        char ch = 'c';  //-- 99 in UNICODE value
        int charTint = (int) ch;
        System.out.println(charTint); // 99
        // to print in char format of i need to type cast explicitly
        System.out.println((char)charTint);



//        3)
        // Explicit Conversion
         int d1  = 300;
         byte b2 = (byte) d1; //narrowing
        System.out.println(b2); //44 --> shortcut -> 300 % 256


        //4) Boolean can't be cast to any other types
//        boolean b5 = 22 ;    (X)
//        boolean d = (boolean)222; (X)





        // Automatic Type Promotion
        // Example
        byte b6 = 50;
        byte b7 = 40;
        byte b8 = 100;

        int i = (b6*b7)/b8;
        System.out.println(i);
        // at the run time, it converts the entire expressions to integer and calculated value is also a integer
        // but if we take byte it will throw an error
//        byte ans2 = (b6*b7)/b8;  // (X)
        byte ans2 = (byte) i;
        System.out.println(ans2);




        // when one wider operand is there all result will converted to long
        long x1 = 21;
        int x2 = 44;
        short x3 = 1;

//        int ans = (x1 * x2 +2 )/ x3;  // required output type is long -- we can't take int, short as less wider than long type

        long ans3 = (x1 * x2 +2 )/ x3;
        System.out.println(ans3);




    }
}
