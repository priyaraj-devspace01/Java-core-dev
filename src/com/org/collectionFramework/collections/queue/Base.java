package com.org.collectionFramework.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Base {
    public static void main(String[] args) {
        // Follow FIFO principle.
//        Elements are added at the end and removed from the front end

        // now learning about queue interface in java for collections
         // Points to remember:
          // As same like, how linkedList acts like a stack
         // in the same way linked list can be act as a queue as well





        // LINKED LIST AS QUEUE
        LinkedList<Integer> queueMde1 = new LinkedList<>();
        queueMde1.addLast(1); // enqueue
         queueMde1.addLast(2);
        queueMde1.addLast(3);
        queueMde1.addLast(4); // Here all are like add to the queue at the rear end
        System.out.println(queueMde1);
        queueMde1.removeFirst(); // dequeue
        System.out.println(queueMde1); // now they are removed from the front, something like how a queue should work
        System.out.println(queueMde1.getFirst()); // it's like peek()



        // now we can also implement the queue as normal using Queue interface
        Queue<Integer> queueMde2 = new LinkedList<>();
        queueMde2.add(33);
        queueMde2.add(44);
        queueMde2.add(55); // Enqueue operation
        System.out.println(queueMde2);
        queueMde2.remove(); // Dequeue Operation
        System.out.println(queueMde2);
        System.out.println(queueMde2.peek());


        Queue<Integer> queueMde3 = new LinkedList<>();
        queueMde3.add(66);
//        System.out.println(queueMde3.remove()); // no thread safe
        System.out.println(queueMde3.poll()); // thread safe

//        System.out.println(queueMde3.element()); // no thread safe throw exception if empty
        System.out.println(queueMde3.peek()); // thread safe

        Queue<Integer> queueMde4 = new ArrayBlockingQueue<>(1);
        queueMde4.add(77);
//        queueMde4.add(88); // not thread safe use offer() instead
        queueMde4.offer(33);
        System.out.println(queueMde4);





        // Queue implementing classes ->LinkedList, Priority Queue,
    }

}
