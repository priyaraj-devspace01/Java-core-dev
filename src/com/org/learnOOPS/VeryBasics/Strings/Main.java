package com.org.learnOOPS.VeryBasics.Strings;

public class Main {
    public static void main(String[] args) {
        // String are the sequence of characters enclosed inside double quote.
        String s1 =  new String("liku");
        String s2 = "lima";

        // String are immutable and uses the heap memory area called string constant pool to store the values
        // if already a string is present inside that then the same address will be assigned the other variable using that same strig


        String str1 = "Hello";
        str1 = str1+"ram"; // it will create one separate memory address for this new created string i,e. "hello ram"
        String str2 = "Hello";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));



        // string method
        String strtoCheck = "  Hello my name is priyaraj";
        System.out.println(strtoCheck);
        System.out.println(strtoCheck.charAt(3));
        System.out.println(strtoCheck.trim());
        System.out.println(strtoCheck.toLowerCase());
        System.out.println(strtoCheck.toUpperCase());
        System.out.println(strtoCheck.equalsIgnoreCase("  HELLO - MY NAME IS PRIYARAJ"));
        System.out.println(strtoCheck.indexOf("H"));
        System.out.println(strtoCheck.substring(0,8));

        System.out.println(strtoCheck.replace("Hello","helllllllooo"));
        System.out.println(strtoCheck.replaceAll("name","nam"));


        /*
        What is split() in Java?

                 split() is used to break a string into parts based on a delimiter (separator) and returns a String array.
         */

        String s = "Java,Python,C++";

        String[] parts = s.split(",");

        for (String p : parts) {
            System.out.println(p);
        }

    }
}
