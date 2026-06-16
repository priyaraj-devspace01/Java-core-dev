package com.colllectionsWithBetter.coreCollectionFrameWork.day04;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();  // uses min heap
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        pq.offer(5);
        pq.offer(6);

        // as min heap - during poll smallest element going to be fetched
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());


        System.out.println("max heap implementation ");
        // Max heap implementation
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b)-> b-a);
        pq2.offer(1);
        pq2.offer(2);
        pq2.offer(3);
        pq2.offer(4);
        pq2.offer(5);
        pq2.offer(6);

        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());


    }
}
