package com.colllectionsWithBetter.coreCollectionFrameWork.day04;

import java.util.ArrayDeque;
import java.util.Queue;

public class queueInterface {
    public static void main(String[] args) {
        /// Queue implementation using Queue reference method
        Queue<Integer> queue = new ArrayDeque<>();
        // ENQUEUE OPERATION
        queue.add(1);  // throws exception in case of adding failure    // in case of size is full
        queue.offer(12); // returns false in case of failure
        queue.add(2);
        System.out.println(queue);

        /// Front Access
        System.out.println(queue.peek());   // only can see the front element not removing - returns false in case of failure
        System.out.println(queue.element()); // it throws exception in case of failure
         // issues like when queue is empty

        /// Dequeue - operations or removing from front
        System.out.println(queue.remove()); // throws exception
        System.out.println(queue.poll()); // returns false





        //// ------------DEQUEUE METHOD FOR IMPLEMENTING QUEUE
        /*
          for both end insertion and deletion
          1) addFirst and offerFirst()
          2) addLast and offerLast()
          3) peekFirst() and elementFirst()
          4) peekLast() and elementLast()
          5) pollFirst or removeFirst()
          6) pollLast or removeLast()

          These same methods also can be used by linked list as well, as it implements the methods of dequeue.

          /// similarly for the Stack implementation using Dequeue,
          1) we can use, offerFirst or
            -> addFirst and offerFirst(insertion)
            -> pollFirst or removeFirst(deletion)
            -> peekFirst or elementFirst(searching from top)

            // also it provides the push, pop, and peek for same operations.



            /// one thing to remember that as queue is also an interface of collection children, may be someone can use remove, add method
              // which may affect the behavioral contract of these classes like for queue(only remove from front and insert from end)
              // similarly for stack push and pop both at one end, so we as developer need to control it or only use the appropriate use cases

         */

    }
}
