package com.org.collectionRevise.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListClass {
    public static void main(String[] args) {
        // Unlike Arraylist, it stores the element in the form of node, where each node stores value and pointer(reference) to the next  node.
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);


        System.out.println(list);
        // here insertion and deletion takes constant time if performed at middle of the list, as no shifting required.
        list.remove(2);
        System.out.println(list);
        // remove by value
        list.remove(Integer.valueOf(3));
        System.out.println(list);

        /// we also have the method to add and remove at first and last
        list.addFirst(333);
        list.addLast(11111);
        System.out.println("added");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();

        // also, we can remove based on predicate
        list.removeIf((a)-> a%2 !=0 );
        System.out.println(list);

        // we can also create a linked list by using the reference of other list like arrayList
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(22,33,4,455556));
        System.out.println(list2);
        list2.removeAll(list);
        // remove all the element of list from list2

        // it is like linked list as list but that has various other implementation class as well like ArrayDeque, PriorityQueue
//        LinkedList as Stack

        LinkedList<Integer> list4 = new LinkedList<>();
        list4.addLast(33);
        list4.addLast(44);
        list4.addLast(55);
        // pop
        list4.removeLast();
        // peek
        System.out.println(list4.getLast());;
        System.out.println(list4);
    }





}
