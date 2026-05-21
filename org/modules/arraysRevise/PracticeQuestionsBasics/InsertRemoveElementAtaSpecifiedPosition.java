package org.modules.arraysRevise.PracticeQuestionsBasics;

import java.util.Arrays;

public class InsertRemoveElementAtaSpecifiedPosition {
    public static void main(String[] args) {
        int[] arr = new int[]{12,34,56,67,8,855};
        System.out.println("Before Insertion");
        System.out.println(Arrays.toString(arr));
        int rIndex = 2;
        int valueInsert = 444;

        insertValueAtIndex(arr, rIndex, valueInsert);
        System.out.println("After Insertion . ");
        System.out.println(Arrays.toString(arr));


        int rmvIndex = 2;
        System.out.println("after removing the index value we will get : ");
      int size =   removeElementGiveSize(arr,rmvIndex);
      for(int i =0;i<size;i++)
      {
          System.out.print(arr[i] + " ");
      }
        System.out.println();


    }

    public static void insertValueAtIndex(int[] arr, int idx, int value)
    {
        // as the array in java having the fixed size it can be shrink for bigger size as to insert a new element
        // so it's basically override the existing value
        for(int i = arr.length-1;i>idx;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[idx] = value;
    }

    // similarly in case of removing an element from an array need to shift from, left to right
    public static void removeElementAtIndex(int[] arr, int idx)
    {
        for(int i = idx;i<arr.length-1;i++)
        {
            arr[i] = arr[i+1];
        }
    }
    // here the issue is that last element is still there as array can't shirint it's size

    //we can do one thing
    public static int removeElementGiveSize(int[] arr, int idx)
    {
        int size = arr.length;
        for(int i = idx;i<size-1;i++)
        {
            arr[i] = arr[i+1];
        }
        return size-1;
    }


}
