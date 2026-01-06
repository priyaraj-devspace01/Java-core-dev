package com.org.collectionFramework.collections.queue.implementingClasses;


import java.util.Comparator;
import java.util.concurrent.*;

class Producer extends Thread {
    BlockingQueue<Integer> queue;

    Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Produced: " + i);
                queue.put(i); // waits if queue is full
                Thread.sleep(1000);
            }
        } catch (Exception e) {}
    }
}



class Consumer extends Thread {
    BlockingQueue<Integer> queue;

    Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                int value = queue.take(); // waits if queue is empty
                System.out.println("Consumed: " + value);
                Thread.sleep(1500);
            }
        } catch (Exception e) {}
    }
}

public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3); // class implementing the BlockingQueue interface
        // A bounded, blocking queue backed by circular array.
        // low memory
        // uses a single lock for both enqueue and dequeue operations
        // more threads -> problem.

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
//
//        producer.start();
//        consumer.start();

        BlockingQueue<Integer> bLinkedQueue = new LinkedBlockingQueue<>();
        // Optionally, bounded backed by linkedList.
        // Uses two separate locks for enqueue and dequeue operations.
        // Higher concurrency between producers and consumers

        BlockingQueue<Integer> bArrayBlockingQueue = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());
        // unbounded- > put () can't block
        // binary Heap as array and can grow dynamically
        // Head is  ordered based on their natual ordering or a provided comparator like priority queue
        bArrayBlockingQueue.add(22);
        bArrayBlockingQueue.add(33);
        bArrayBlockingQueue.add(44);
        bArrayBlockingQueue.add(55);
        bArrayBlockingQueue.add(66);
        System.out.println(bArrayBlockingQueue);


        BlockingQueue<Integer> queue1 = new SynchronousQueue<>();
        // Each inserrt operation must wait for a corresponding remove operation by  another thread and vice versa.
         // it can't store elements, capacity of at most one element



    }
}

