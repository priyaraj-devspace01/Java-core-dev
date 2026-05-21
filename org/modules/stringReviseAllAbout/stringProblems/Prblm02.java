package org.modules.stringReviseAllAbout.stringProblems;

import java.util.Scanner;

public class Prblm02 {
    public static void main(String[] args) {
       //Check Palindrome
        //
        //Check whether a string reads the same forward and backward.
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the String you want to validate : ");
        String str1  = sc.nextLine();


        String rev = "";
        for(int i = str1.length() - 1; i >= 0; i--){
            rev+= str1.charAt(i);
        }
        if(rev.equals(str1)){
            System.out.println("The string is a valid palindrome . ");
        }
    }

}
