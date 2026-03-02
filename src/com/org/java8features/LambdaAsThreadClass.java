package com.org.java8features;
//class MyRunnable implements Runnable {
//
//    public void run() {
//         for(int i =0;i<10;i++)
//         {
//             System.out.println(Thread.currentThread().getName());
//         }
//    }
//}
public class LambdaAsThreadClass {
    public static void main(String[] args) {
//           MyRunnable mr = new MyRunnable();
        // we Don't even need to create a separate class to implement the run method of runnable
        // instead we can use the lambda expression
        Runnable run2 = ()->
        {
            for(int i = 0;i<10;i++)
            {
                System.out.println("Hii thread" + (i+1));
            }
        };
           Thread t1 = new Thread(run2);
           t1.start();
    }
}
