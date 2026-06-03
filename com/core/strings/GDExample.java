package com.core.strings;

public class GDExample {
    public static void main(String[] args) {
        String s1 =  "ja" + "va"; // bcz added to become "java" in compile time
        String s2 = "java";
        System.out.println(s1 == s2);   // Always going to be stored inside the constant pool


        // Runtime:
        String s3 = "ja";
        String s4  = s3 + "va"; // it's only going to be found at the run time ->  always going to be store inside the heap
        System.out.println(s3 == s4);


        String s = "hello";
        s = "world";
        // here now s points to the world instead of hello, after sometime "hello" will be cleaned by gc
        System.out.println(s);



        String heapStoreHeap = new String("hello");
        // the same copy will be created inside the string pool as well, because to create the string inside the heap, we use the "hello" inside the constructor
        // but not pointed to any reference
        // but if we do
        String takePool = "hello"; // it will point to the same string to the "hello" inside the pool before during heap "hello" creation
        System.out.println(heapStoreHeap == takePool); // as both stores in different memories





    }
}
