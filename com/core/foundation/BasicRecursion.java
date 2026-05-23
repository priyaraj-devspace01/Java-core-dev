package com.core.foundation;

public class BasicRecursion {
    public static void main(String[] args) {
//      print(5);


      int findFib = findNtthFib(6);
        System.out.println(findFib);
    }

    public static void print(int n)
    {
      if(n  == 0 )
      {
          return ;
      }
        System.out.println(n);
        print(n-1);

    }


    public static int findNtthFib(int n )
    {
        if( n <= 1)
        {
            return n;
        }
        return findNtthFib(n-1) + findNtthFib(n-2);
    }
}
