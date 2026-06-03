package com.core.strings;

import com.sun.security.jgss.GSSUtil;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        // Constructor
        String s1 = new String();
        String s2 = new String("hello");
        // to create this string as we passed a string "hello" inside the constructor,
        // "hello" is also going to be stored inside the string pool as well

        String s3 = new String(s2);
        System.out.println(s3 == s2); // false - even though value is same



        // char array
        char[] array = {'r','a','h', 'u', 'l', ' ', 'd', 'a','s'};
        String s4 = new String(array);
        System.out.println(s4);
        array[0] = 'R';
        System.out.println("s4 : " + s4); // as string is immutable, the first index value will remain same

         // we can also use the part of a char array
        String s5 = new String(array, 0, 5);
        System.out.println(s5);

        // we can also use the byte array as well
        byte[] arr = {97, 98, 99};
        String s7 = new String(arr);
        String s6 = new String(arr ,0, 1);
        System.out.println(s7);



        // StringBuilder/StringBuffer
          StringBuilder bd = new StringBuilder("hii");
          String strB = new String(bd);
          // basically, the string constructor can also take the string-builder and string-buffer object as well


      // String Methods
        String strMtds = "Hello World";
        System.out.println(strMtds.length()); // length
        String ss= "      ";
        System.out.println(ss.isEmpty()); // false - only counts the chars
        System.out.println(ss.isBlank()); // false - counts the space as well


        String demo = "Hello";
        // Character access
        System.out.println(demo.charAt(0));
        char[] charArray = demo.toCharArray();
        for(char ch : charArray){
            System.out.print(ch + " ");
        }
        System.out.println();
        // comparison

        String str1 = new String("Dhhhhiihhhi");
        String str2 = new String("Din");

        System.out.println(str1 == str2); // as only compares the reference
        System.out.println(str1.equals(str2));

        System.out.println(str1.equalsIgnoreCase(str2));
        // Lexicography comparison
        System.out.println(str1.compareTo(str2));


        // Searching
        System.out.println(str1.contains("h"));

        System.out.println(str1.indexOf("Dh"));

        System.out.println(str1.lastIndexOf('i'));
        System.out.println(str1.startsWith("h"));
        System.out.println(str1.endsWith("i"));


        // extraction
        System.out.println(str1.substring(0, 3));
        // start  - inclusive but end index - exclusive
        System.out.println(str1.substring(0)); // starts from 0 to end

        System.out.println(str1.toUpperCase());

        System.out.println(str1.trim()); // removes the preceding and following spaces not in between the chars

        System.out.println(str1.strip()); // unicode

        System.out.println(str1.repeat(3));

        System.out.println(str1.replace('i', 'O'));
        System.out.println(str1.replace("hi", "hooo"));

        System.out.println(str1.replaceAll("ho", "hii"));



          String pr3 = "Aditya  Rohit Rohan Rima";
        String[] s = pr3.split(" ");// based on delimeter like " " , ","
         for(String m : s)
         {
             System.out.print(m+ " ");
         }
        System.out.println();

         // join based on delimeter
        String join = String.join("-", "a", "b", "c");
        System.out.println(join);


        // Conversion
        String sd = new String(String.valueOf(12233444));
        System.out.println(sd);



        String sss = new String("aditya");
        byte[] bytes = sss.getBytes();
        for(byte b : bytes){
            System.out.print(b+ " ");
        }
        System.out.println();
      /*
      intern() in Java (simple explanation):

            intern() returns the reference of the string from the String Constant Pool (SCP).
            If the string is not already in the pool, Java adds it to the pool and returns its reference.
            This helps save memory by reusing the same string object.
            Two interned strings with the same content will point to the same object.
            It is commonly used when many duplicate string values exist.
       */

        /// Example
        String pr2 = new String("Aman");
        String pr4  = pr2;

        System.out.println(pr2 == pr4); // true= as both pointing to the same
       pr4 =  pr2.intern();
        // now it moves from heap to the string constant pool, but it is already there during constructor calling for pr2
        // so only pr4 reference wil change
        System.out.println(pr2 == pr4); // false - as both pointing to different locations now



        /// format()
        String name = "priyaraj";
        double age = 22;
        int age2 = 22;
        System.out.println("hello" + name + "and your age is : "+ age);
        // instead we can do the same using
        System.out.println(String.format("Hello, %s!, Your current age is %d", name, age2));







    }
}



