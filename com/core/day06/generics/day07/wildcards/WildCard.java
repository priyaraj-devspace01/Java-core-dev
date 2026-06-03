package com.core.day06.generics.day07.wildcards;

import java.util.ArrayList;
import java.util.List;
class Animal2
{
    public void eat()
    {
        System.out.println("eating . ");
    }
    public void walk()
    {
        System.out.println("walking");
    }
}

class Dog2 extends Animal2
{
    public void bark()
    {
        System.out.println("barking");
    }
}
public class WildCard {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();
        // list of specific type, but we don't know right now

        /// Issues:
           /*
            void fun( List<?> list)
            {
                list.add("hello");  // compile time error as don't know the value to be expected here might be any class object, or might be any pre-defined class object also be
                list.get(0); // it's also have the same issue as during store type we don't know,
                // but we can use
                only one type as returning
                Object obj  = list.get(0);
             }
            */


        // example

//        List<Dog2> dogs = new ArrayList<>();   // non-accept
        List<Animal2> animals = new ArrayList<>();
//        animals.add(new Animal2());
//        animals.add(new Animal2());
        // we can also pass the dog object as well
        animals.add(new Dog2());
        animals.add(new Dog2());
        fun2(animals);

    }

//    static void fun(List<Animal2> animals)
//    {
//        for (Animal2 animal : animals)
//        {
//            animal.eat();
//        }
//    }

    /// instead
    public static void fun2(List<?> animals) {
//        for (Object animal : animals) {
//            System.out.println(animal.getClass().getName());

//        animals.add(22);  // wrong
        Object o = animals.get(0);
        System.out.println(o.getClass().getName());
        }
    }


    // Again it has restrictions for which we need to use the wildcard with bounds
