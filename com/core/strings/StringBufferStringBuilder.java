package com.core.strings;

public class StringBufferStringBuilder {
    public static void main(String[] args) {
//        StringBuilder - thread safe - X

//        AbstractStringBuilder - both of them extends


        // How the String Builder works inside?
        /*
         When we create a string using string builder
         StringBuilder sb = new StringBuilder("hello");

         byte[]values, count, capacity three members already there inside that class


         initially, the byte[] values stores every element,"hello" as it's index,with some extra buffer to store the next changes to the same string
         count - stores the actual element present currently (4)
         capacity - is the actual size of that array(16)


         // when capacity reaches,it doubled the size add 2
         like if before = 16, next capacity when capacity reaches - 32+2 = 34


         // Constructor type
         StringBuilderWith no param constructor 1)
         new StringBuilder(initial capacity)  //instead of default  = 16
         new StringBuilder("java");


         // Methods

         */

        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        sb.append("pRIYARAJ " );
        System.out.println(sb);

      // insert
        sb.insert(sb.length()-1, " mohanty");
        System.out.println(sb);

        // delete
        sb.delete(0,2);
        System.out.println(sb);


        sb.deleteCharAt(1);
        System.out.println(sb);

        // replace
        sb.replace(0, 3, "io");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);


        System.out.println(    sb.charAt(0));
        sb.setCharAt(0, 'h');


        System.out.println(sb.length());

        System.out.println(sb.capacity());

        sb.ensureCapacity(100);

        // mentioning later that the minimum capacity
        System.out.println(sb.capacity());

        sb.trimToSize();
        System.out.println(sb.capacity());


        // string builder to default string conversion
        String from  = sb.toString();
        System.out.println(from);

        /// Note - stringBuilder and stringBuffer can't override the equals method
        // so
        StringBuilder sb2 = new StringBuilder("raja");
        StringBuilder sb3 = new StringBuilder("raja");

        System.out.println(sb2.equals(sb3)); // even the value are same still, they are at different places
         //false



    }
}
