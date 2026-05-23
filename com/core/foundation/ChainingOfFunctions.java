package com.core.foundation;

import java.util.Scanner;

public class ChainingOfFunctions {
    public static void main(String[] args) {
        // let's suppose we have to find the average of three number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num : ");
        int a = sc.nextInt();
        System.out.println("Enter your second num : ");
        int b = sc.nextInt();
        System.out.println("Enter your third num : ");
        int c = sc.nextInt();

        System.out.println("STARTING FROM MAIN METHOD . ");
        int findAvg = findAvg(a, b,c);
        System.out.printf("The final answer for finding the avg of these 3 number is %d", findAvg);




    }

    public static int findAvg(int a, int b, int c) {
        System.out.println("Now inside the find average method : ");
        return findAddition(a,b,c)/3;
    }

    public static int findAddition(int a, int b, int c) {
        System.out.println("Now inside the add method :  ");
        return a+b+c;
    }
}
