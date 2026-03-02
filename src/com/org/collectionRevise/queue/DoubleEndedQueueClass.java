package com.org.collectionRevise.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndedQueueClass {
    public static void main(String[] args) {
        // Insertion and Deletion can be possible on both rear end and front end
        // circular array
        /*
        Insertions Methods:
        1) addFirst.
        2) addLast.
        offerFirst()
        offerLast().

        // Remove methods
        1) removeFirst
        2) removeLast.
        popFirst
        popLast

        // similarly for searching
        getFirst
        getLast
        peekFirst
        PeekLast


         */

        Deque<Integer> dequeue = new ArrayDeque<Integer>(); // Faster as continues memory allocation as compared to linkedList, low memory consumption, no null allowed
        // circular array - no need to shift only pointer location changes

        dequeue.addFirst(22);
        dequeue.addFirst(33);
        dequeue.addLast(44);
        dequeue.offerFirst(55);
        dequeue.offerLast(66);
        dequeue.offerLast(77);
        dequeue.removeFirst();
        dequeue.removeLast();
        dequeue.pollFirst();
        dequeue.pollLast();
        while(!dequeue.isEmpty())
        {
            System.out.println(dequeue.poll());
        }




    }
}
