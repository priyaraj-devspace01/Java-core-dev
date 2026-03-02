package com.org.collectionRevise.queue;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        // for normal uses we use Queue, but when we need to give the priority we need use Priority class Queue.
        // PriorityQueue - Orders the elements based on their natural ordering (for primitives lowest first)
        // custom comparator for customized ordering

        PriorityQueue<Integer> pQueue = new PriorityQueue<>((a,b)->b-a);// here also we can give the custom order to give priority
        pQueue.add(10);
        pQueue.add(2);
        pQueue.add(30);
        pQueue.add(4);
//        System.out.println(pQueue);// not sorted

        System.out.println(pQueue.poll());
//        System.out.println(pQueue);// not sorted

        while(!pQueue.isEmpty())
        {
            System.out.println(pQueue.poll());
        }

        // Internal Working
//            implemented by using MinHeap (for natural Ordering)
                           // where each node value should be same or less than it's children for a binary tree.


    }
}
