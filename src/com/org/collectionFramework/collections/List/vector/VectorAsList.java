package com.org.collectionFramework.collections.List.vector;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorAsList {
    public static void main(String[] args) {


        Vector<Integer> vector = new Vector<>();
        // by default, initial capacity given as 10 but for element increase it grows double but we can control it

        Vector<Integer> vector2 = new Vector<>(11);
        Vector<Integer> vector3 = new Vector<>(10,3);
        // if it increases to 11 no of elements, then the capacity will be 13

//        Vector<Integer> vector11 = new Vector<>(3); case1
        Vector <Integer> vector11 = new Vector<>(3,2);
        vector11.add(12);
        vector11.add(13);
        vector11.add(14);
        System.out.println(vector11.capacity()); // to check the capacity unlike arraylist
        vector11.add(15);
//        System.out.println(vector11.capacity()); // increase by double
        System.out.println(vector11.capacity());// increase by 2


        // we can pass any collection to the constructor of the vector
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1,23,5,45,2));
        Vector<Integer> lnkListAsVector = new Vector<>(linkedList);
        System.out.println(lnkListAsVector);


        // Vector methods
        





    }

    /*
    A Vector in Java is a part of the java.util package and is one of the legacy classes in Java that implements the List interface.
      It was introduced in JDK 1.0 before collection framework and is synchronized, making it thread-safe.
       Now it is a part of the collection framework.  However, due to its synchronization overhead,
       it's generally recommended to use other modern alternatives like ArrayList in single-threaded scenarios.
        Despite this, Vector is still useful in certain situations, particularly in multithreaded environments where thread safety is a concern.


        Key Features of Vector:--

         1) Dynamic Array:
         Like ArrayList, Vector is a dynamic array that grows automatically when more elements are added than its current capacity.
         2) Synchronized:
         All the methods in Vector are synchronized, which makes it thread-safe. This means multiple threads can work on a Vector without the risk of corrupting the data. However, this can introduce performance overhead in single-threaded environments.
         Legacy Class:
         3) Vector was part of Java's original release and is considered a legacy class. It's generally recommended to use ArrayList in single-threaded environments due to performance considerations.
         4) Resizing Mechanism: When the current capacity of the vector is exceeded, it doubles its size by default (or increases by a specific capacity increment if provided).
         5) Random Access: Similar to arrays and ArrayList, Vector allows random access to elements, making it efficient for accessing elements using an index.


         Constructors of Vector
         1) Vector():Creates a vector with an initial capacity of 10.
         2) Vector(int initialCapacity): Creates a vector with a specified initial capacity.
         3) Vector(int initialCapacity, int capacityIncrement): Creates a vector with an initial capacity and capacity increment (how much the vector should grow when its capacity is exceeded).
         4)  Vector(Collection <? extends E> c): Creates a vector containing the elements of the specified collection.
     */
}
