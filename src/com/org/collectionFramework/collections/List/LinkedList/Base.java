package com.org.collectionFramework.collections.List.LinkedList;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Node
{
    public int data;
    public Node next;

}


// LINKED LIST AS LIST
public class Base {
    public static void main(String[] args) {

        // manually we need to perform,
        Node node1 = new Node();
        node1.data = 2;
        node1.next = node1;

        Node node2   = new Node();
        node2.data = 1;
        node2.next = null;

        // finally - 2/address to node2, 1/reference to null


        // but java already has linkedList class
        LinkedList<Integer> lList = new LinkedList<>();
        lList.add(2);
        lList.add(3);
        lList.add(4);
        lList.add(5);
        lList.add(6);
        lList.add(7);
        System.out.println(lList.get(2)); // o(n) but in arraylist o(1)
        // addFirst as it stores the value as node of a doubly linked list
        lList.addFirst(1);
        System.out.println(lList);
        lList.addLast(100);
        System.out.println(lList);
        System.out.println(lList.getFirst());
        System.out.println(lList.getLast());

        LinkedList<String> lList2 = new LinkedList<>(Arrays.asList("apple", "mango", "banana", "orange"));
        LinkedList<String> lList3 = new LinkedList<>(Arrays.asList("apple", "mango", "orange"));
        lList2.removeAll(lList3);
        System.out.println(lList2);

        // we can also remove the element using predictive
        lList.removeIf((x)->x%2 ==0); // same for arraylist as well

        System.out.println(lList);

        lList.remove(2);// by index
        lList.remove(Integer.valueOf(100)); // by value









    }



    /*
    Notes:
    The LinkedList class in Java is a part of the Collection framework and implements
     the List interface. Unlike an ArrayList,
                  which uses a dynamic array to store the elements, a LinkedList stores its elements as nodes
                   in a doubly linked list.
                    This provides different performance characteristics and usage scenarios compared to ArrayList.


                    Performance Considerations
                      LinkedList has different performance characteristics compared to ArrayList:

                       1)Insertions and Deletions:
                       LinkedList is better for frequent insertions and deletions
                        in the middle of the list because it does not require shifting elements, as in
                         ArrayList.
                       2) Random Access:
                          LinkedList has slower random access (get(int index)) compared to ArrayList because it has to traverse the list from the beginning to reach the desired index.
                       3) Memory Overhead:
                          LinkedList requires more memory than ArrayList because each node in a linked list requires extra memory to store references to the nexte and previous nodes.




     */
}
