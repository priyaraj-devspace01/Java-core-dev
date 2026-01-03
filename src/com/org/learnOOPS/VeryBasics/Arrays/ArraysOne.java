package com.org.learnOOPS.VeryBasics.Arrays;

public class ArraysOne {
    public static void main(String[] args) {


        // Declaration types
         int  []arr =  new int[3];

        int arr2[] = {122,33,44,22};
        int []arr3 = new int[4];
        arr3[0] = 22;
        arr3[1] = 33;
        arr3[2] = 44;

        // access the array element only through their index
        System.out.println(arr[2]);

//        iterating
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();



        // 2-D array
        int mat1[][] = new int[2][2];
        mat1[0][0] = 1;
        mat1[0][1] = 2;
        mat1[1][0] = 3;
        mat1[1][1] = 4;

        for(int i = 0;i<mat1.length;i++)
        {
            for(int j = 0;j<mat1[i].length;j++)
            {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }


        // Jagged Array
          // where row is fixed but the column was not fixed
        int jagged[][] = new int[4][];
        jagged[0] = new int[1];
        jagged[1] = new int[2];
        jagged[2] = new int[2];
        jagged[3] = new int[4];


        System.out.println("JAGGED ARRAY IS BELOW : ");
        for(int i = 0;i<jagged.length;i++)
        {
            for(int j = 0;j<jagged[i].length;j++)
            {
                jagged[i][j] = (int)(Math.random()*10);
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }


        // ENHANCED FOR LOOP
        // single dimensional
        System.out.println("Enhanced Array looping");
        for(int i : arr2)
        {
            System.out.print(i+ " ");
        }
        System.out.println();

        for(int arr1[] : mat1)
        {
            for(int ele : arr1)
            {
                System.out.print(ele + " ");
            }
            System.out.println();
        }




/*
Advantages:
Stores multiple values of same data type

Fast access using index (O(1))

Uses contiguous memory, better performance

Easy to use with loops

Reduces code repetition

Fixed size gives predictable memory usage

Direct JVM support (simple & efficient)




Disadvantages:

Fixed size (cannot grow or shrink)

Stores only same data type

No built-in methods for add/remove/search

Insertion & deletion are costly

Memory wastage if size is overestimated

No dynamic resizing

Not suitable for complex data manipulation
 */





    }
}
