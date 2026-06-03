package com.core.day06.generics.day07.wildcards;

import java.util.ArrayList;
import java.util.List;

public class TypeErasors {
    public static void main(String[] args) {
        // does JVM know generics - no

//        conversion
         /*
             class Pair<T,V> {
                T key;               ------------->  compiler converts  || class Pair{
                V value;                                                    Object key;
                            }                                               Object value;
                                                                                  }



               Rules:
               1) If no bound  -> replace Object.
               2) If bounded replace with the bound
                  example : class Box<T extends Number> {    |||| --------->    class Box
                               T value;                                      {
                           }                                                     Number value;
                                                                              }
                  }

                 3) insert type automatically(for case - 1)
          */




        /// Limits of generics like
        //1) instanceOf(X)
           List<Integer> list2 = new ArrayList<>();
        System.out.println(list2 instanceof  List<Integer>);

        // because behind the scene compile change it to  -
         List list3 = new ArrayList();
         // here we can't ensure what the type to be.


//        2) Method Overloading
//        public print(List<String> l );
//        public print(List<Integer> l ); // still the params count are same


//        3) Compiler generate bridge method
//        class Parent<T> {
//            T get()
//            {
//                return null;
//            }
//        }

//        class child extends Parent<String>
//        {
//            @Override
//            String get()
//            {
//                return "hello";
//            }
//        }


        /// but at the compilation time
        // it becomes
//        class Parent
//        {
//            Object get()
//            {
//                return null;
//
//            }
//        }

//        class Child extends Parent{
//            @Override
//            public Object get()
//            {
//                return "hello";
//            }
//            Object get()         ---------> it is called the bridge method
//            {
//                get();
//            }
//        }



        //Q1)  WHY type erasers is exists ?
//           ANS:   "Type erasure converts generic code to ordinary Java code at compile time, so older JVMs and legacy code continue to work without modification."

        // Q2)  Why java generic doesn't support primitive types? --- as int is not a class whose parent is not object - erasures not work
//          ➡️ "Generics do not support primitive types because type erasure replaces type parameters with Object (or a bound), and primitive types like int are not objects."
    }
}
