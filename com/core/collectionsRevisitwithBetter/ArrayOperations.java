package com.core.collectionsRevisitwithBetter;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = {12,224,45,667};
        System.out.println("Before  Insertion ");
        System.out.println(Arrays.toString(array));
        insert(array, 1, 342);
        System.out.println("After Insertion ");
        System.out.println(Arrays.toString(array));


        System.out.println("Before Remove");
        System.out.println(Arrays.toString(array));
        remove(array, 2);
        System.out.println("after Remove");
        System.out.println(Arrays.toString(array));

    }

    public static void insert(int[] array, int index, int value)
    {
        for(int i = array.length - 1; i >1; i--)
        {
            array[i] =  array[i-1];
        }

        array[index] = value;
    }
    public static void remove(int[] arr, int index)
    {
        for(int i = index;i<arr.length-1;i++)
        {
            arr[i] = arr[i+1];

        }
        arr[arr.length-1] = 0;

    }
}
