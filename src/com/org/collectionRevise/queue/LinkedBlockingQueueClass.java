package com.org.collectionRevise.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class LinkedBlockingQueueClass {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> lbQueue = new LinkedBlockingQueue<>();
        // optionally bounded backed by linkedList
        // Higher concurrency between producers and consumers
        BlockingQueue<Integer> bq = new PriorityBlockingQueue<>();
        // unbounded
        // initial capacity = 11, but maintain the priority queue as blockingqueue
        // can grow dynamically, provided comparator
        // put won't block
        // head is based on priority





    }
}
