package org.modules.arraysRevise.PracticeQuestionsBasics;

import java.util.Arrays;

public class SwapTwoIndexValue {
    public static void main(String[] args) {

        int[] arr = {1, 22, 4, 5, 6, 744, 44};

        swap(arr, 1, 3);


        System.out.println(Arrays.toString(arr));
    }


    public static void swap(int[] arr, int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
