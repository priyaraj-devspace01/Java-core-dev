package com.core.iooperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {

    public static void main(String[] args) throws IOException {

        /*
         * Problem with normal InputStream:
         * When we give input from the keyboard, data is first stored
         * in the OS buffer. Reading character by character directly
         * from the stream can be slower because multiple system calls happen.
         *
         * BufferedReader improves performance by creating an additional
         * buffer in Java memory and reading data in chunks.
         *
         * Flow:
         * Keyboard -> OS Buffer -> Java Buffer (BufferedReader) -> Program
         *
         * also the BufferedReader(stream of char) and InputStream(stream of bytes) are not compatible initially,
         * therefore, we need a class namely InputStreamReader to convert the byte of stream to stream of characters
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader       <- InputStreamReader( )      // obj of inputStream

        System.out.print("Enter your name: ");

        String name = br.readLine();

        System.out.println("Hello, " + name);
    }
    /// how ?
        /// 1. Aditya
     ///   2. os Buffer(65,100,195, 116, 121,97)
     ///3. System.in(InputStream) receives bytes
     /// 4. InputStreamReader() -> stream of bytes into stream of characters
//        ('A', 'd, 'i', 't', 'a')
    ///5 . BufferedReader --> readLine() -> Aditya -> name
    ///6. Aditya


    /// Limitations of BufferedReader class
      /*
      1) String s = br.readLine() - it only reads the string, other but not directly need to convert
         like, int i = Integer.parseInt(s); ->  println(i)



         // then in java 1.5 introduced the Scanner class
             advantages:
             1) simplicity(input)
             2) int, boolean, any type
       */


}