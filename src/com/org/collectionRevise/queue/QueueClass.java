package com.org.collectionRevise.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueClass {
    public static void main(String[] args) {
        // it follows the FIFO principle (first-in-first-out) principle where the elements are added at the rear end and
        // removed from the front end.
        // LinkedList as queue (queue)
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(2);
        queue.addLast(3);
        queue.addLast(4);
        queue.addLast(5);
        queue.addLast(6);
        System.out.println(queue);
        queue.removeFirst(); // dequeue
        System.out.println(queue);
        System.out.println(queue.getFirst()); // peek

        // to reduce this complexity, java introduces the queue interface
        // it has other implementing class as well like priority queue.
         // Basic Operations :
        /*
          1) adding - add or throws exception in case of absence | offer() - can't throw exception
          2) remove - remove |  or poll()
          3) peek()- peek or | element
         */
        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(2);
        queue2.add(3);
        queue2.add(4);
        queue2.add(5);
        queue2.add(6);
        System.out.println(queue2);
        queue2.remove();
        System.out.println(queue2);
        System.out.println(queue2.peek());

        // ArrayBlockingQueue
        Queue<Integer> queue3 = new ArrayBlockingQueue<>(2); // need to provide the fix size
        queue3.add(2);
        queue3.add(3);
//        queue3.add(4);// throws exception
        // but if we use // null
        queue3.offer(22); // false
        System.out.println(queue3);

    }
}
