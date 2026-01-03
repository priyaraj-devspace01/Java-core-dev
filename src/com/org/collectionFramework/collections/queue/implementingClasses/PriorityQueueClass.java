package com.org.collectionFramework.collections.queue.implementingClasses;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        // Part of the Queue Interface
        // Orders the elements based on their natural ordering (for primitives lowest first )
        // custom comparator for customized ordering
        // doesn't allow null elements

        PriorityQueue pq = new PriorityQueue<>();
        pq.add(100);
        pq.add(22);
        pq.add(3333);
        pq.add(4);

        System.out.println(pq.peek());


        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }


    }
}
