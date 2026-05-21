package com.core.foundation.Day01;

public class CommandLineArgs {
    public static void main(String[] args) {
        for(int i =0;i<args.length;i++){
            System.out.println(args[i]);
        }

/*

// the byte code generation and run usind terminal should be like this

priyarajmohanty@Priyaraj-Mohanty-MacBook-Pro-M2 java % javac com/core/foundation/Day01/CommandLineArgs.java
priyarajmohanty@Priyaraj-Mohanty-MacBook-Pro-M2 java % java com.core.foundation.Day01.CommandLineArgs hello
 */
    }
}
