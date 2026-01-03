package com.org.collectionFramework.collections.List.stack;

import java.util.LinkedList;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        // as stack extending vector class, it is synchronized and thread safe as well.
        // it follows LIFO(last-in-first-out) principle.

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        System.out.println(stack);
        int pop = stack.pop();
        System.out.println(pop);
        System.out.println(stack.peek());
        System.out.println(stack.search(2)); // search from top to bottom
        System.out.println(stack.size());


        // stack can be also be implemented by using the LinkedList as well
        // As LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(22);
        list.addLast(33);
        list.addLast(44);
        list.addLast(55);

        System.out.println(list.getLast()); // peek
        System.out.println(list.removeLast()); //pop



    }
}
