package com.core.iooperations;

import java.util.Scanner;

public class ScannerClassPractice {
    public static void main(String[] args) {
        // it doesn't belong to the java.io package
        // it belongs to java.util. package
        //it doesn't fall under the hierarchy of inputStream and outputStream



        Scanner input = new Scanner(System.in);
         // it also required the inputStream reference -> inputStreamReader -> BufferedReader( works above of these )
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Hello, " + name);


    }
}
