package com.org.collectionRevise.list;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        // it extends the Vector class so it is thread safe
        // it follows the Last in First out principle


        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.search(1)); // searches from top with 1 based index

    }
}
