package org.modules.stringReviseAllAbout.stringProblems;

import java.util.Scanner;

public class Prblm01 {
    public static void main(String[] args) {
        //Write a program to reverse a string without using built-in reverse methods.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse it :");
        String str = sc.nextLine();

        String emp = "";
        for(int i = str.length() - 1; i >= 0; i--){
            emp+= str.charAt(i);
        }

        System.out.printf("final reverse string value is:-  %s ", emp);
    }
}
