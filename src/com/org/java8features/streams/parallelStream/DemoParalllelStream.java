package com.org.java8features.streams.parallelStream;

import java.util.List;
import java.util.stream.Stream;

public class DemoParalllelStream {
    public static void main(String[] args) {
             /*
              it's a type of stream which allows multiple threads to work on multiple parts of the stream simultaneously
              this can significantly improve the performance for large data sets
              the workload is distributed among multiple threads

              */
        long startTime = System.currentTimeMillis();
       List<Integer> nums =  Stream.iterate(1, x ->x+1).limit(14000).toList();

       List<Long> ans = nums.stream().map(DemoParalllelStream::findFactorial).toList();
       long endTime = System.currentTimeMillis();
        System.out.println("Time taken for sequential stream use : " + (endTime - startTime) + "ms.");

         startTime = System.currentTimeMillis();
          nums =  Stream.iterate(1, x ->x+1).limit(14000).toList();

       ans = nums.parallelStream().map(DemoParalllelStream::findFactorial).toList();
         endTime = System.currentTimeMillis();
        System.out.println("Time taken for parallel stream use : " + (endTime - startTime) + "ms.");
    }

    // so basically it's mostly preferable when we have CPU-intensive task, large datasets where tasks are independent
    // but for less size data sets don't use parallel due to overhead issue also

    public static long findFactorial(int n )
    {
        long  result = 1;
        for(int i =2;i<=n;i++)
        {
            result*=i;
        }
        return result;
    }
}
