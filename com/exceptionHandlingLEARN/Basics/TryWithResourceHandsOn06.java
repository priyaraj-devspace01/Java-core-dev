package com.exceptionHandlingLEARN.Basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceHandsOn06 {

    public static void main(String[] args) {

        // Resource is automatically closed after the try block
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {

            String line = reader.readLine();
            System.out.println(line);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Program Completed");
    }

    /*
                    BufferedReader reader = null;

                try {
                    reader = new BufferedReader(new FileReader("sample.txt"));
                    System.out.println(reader.readLine());

                } catch (IOException e) {
                    e.printStackTrace();

                } finally {
                    if (reader != null) {
                        try {
                            reader.close();   // Must close manually
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
     */
}