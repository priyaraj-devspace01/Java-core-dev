package com.org.exceptions.basic;

public class ThrowsKeyClass {
    public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
//      try
//      {
//          level1();
//      }catch (Exception e)
//      {
//        StackTraceElement[] stackTrace =   e.getStackTrace();
//        for(int i = 0;i<stackTrace.length;i++)
//        {
//            System.out.println(stackTrace[i]);
//        }
//
//      }

        // or we can add to the method signature
        level1();

    }

    public static void  level3() throws ArrayIndexOutOfBoundsException
    {
        int []arr = new int[2];
        arr[3] = 333;
    }

    public static void  level2() throws ArrayIndexOutOfBoundsException
    {
     level3();
    }

    public static void  level1()throws ArrayIndexOutOfBoundsException
    {
      level2();
    }
}
