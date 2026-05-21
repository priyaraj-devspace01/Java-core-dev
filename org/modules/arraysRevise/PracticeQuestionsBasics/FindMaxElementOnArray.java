package org.modules.arraysRevise.PracticeQuestionsBasics;

public class FindMaxElementOnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{12,22,4456,67,77};
        int ans = findSecondMax(arr);
        System.out.println("Max element inside this array is : "+ ans);

    }

    public static int findMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i =0 ;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];

            }
        }
        return max;
    }

    public static int findSecondMax(int[] arr)
    {
        int max = findMax(arr);
        int smax = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] != max && arr[i] > smax)
            {
                smax = arr[i];
            }
        }
        return smax;
    }
}
