package com.org.collectionFramework.collections.queue;

import com.org.collectionFramework.collections.queue.implementingClasses.BlockingQueueDemo;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        // Thread-safe unbounded blocking queue
        // Elements can only be taken from the queue when there delay has expired.
        // Useful for scheduling tasks to be executed after some delay
        // internally uses a priority queue


        BlockingQueue<DelayTask> queue = new DelayQueue<>();
        queue.put(new DelayTask("Task1", 5, TimeUnit.SECONDS));
        queue.put(new DelayTask("Task2", 3, TimeUnit.SECONDS));
        queue.put(new DelayTask("Task3", 10, TimeUnit.SECONDS));

        while(!queue.isEmpty()) {
            DelayTask task = queue.take(); // Blocks until a task's delay has expired
            System.out.println("Executed: "+ task.getTaskName()+ " at: "+ System.currentTimeMillis());
        }
    }
}


class DelayTask implements Delayed
{

    private final String taskName;
    private final long startTime;

    public DelayTask(String taskName,long delay,TimeUnit unit) {
        this.taskName = taskName;
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining = startTime - System.currentTimeMillis();
        return unit.convert(remaining, TimeUnit.MILLISECONDS) ;
    }

    @Override
    public int compareTo(Delayed o) {
        if(this.startTime < ((DelayTask)o).startTime)
        {
            return -1;
        }if(this.startTime > ((DelayTask)o).startTime)
        {
            return 1;
        }return 0;
    }

    public String getTaskName() {
        return taskName;
    }
}

