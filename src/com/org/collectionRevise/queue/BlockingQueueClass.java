package com.org.collectionRevise.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


class Producer implements Runnable
{
    BlockingQueue<Integer> queue;
    int value = 0 ;

    Producer(BlockingQueue<Integer> queue)
    {
        this.queue = queue;

    }

    @Override
    public void run() {
   while(true)
   {
       try
       {
           System.out.println("Producer produced "+ value);
           queue.put(value++);
           Thread.sleep(1000);

       }catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
   }

    }
}


class Consumer implements Runnable
{
    BlockingQueue<Integer> queue;


    Consumer(BlockingQueue<Integer> queue)
    {
        this.queue = queue;

    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer value = queue.take();
                System.out.println("Consumer consumed " + value);

                Thread.sleep(2000);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
public class BlockingQueueClass {
    public static void main(String[] args) {


        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        // Bounded , blocking queue backed by an array

        Thread thread1 = new Thread(new Producer(queue));
        Thread thread2 = new Thread(new Consumer(queue));

        thread1.start();
        thread2.start();















        // It's a Thread safe queue wait for queue to be non-empty or wait for space.
//        Producer -  consumer(solution)
//             like,
        /*
        normal queue - empty - remove (no waiting)
                       full - add (no waiting)

         Blocking Queue -
         put - Blocks if the queue is full until space becomes available.
         take - Blocks if the queue is empty until an element becomes available.
         offer - waits for space to become available, up to the specified timeout
         */

    }
}
