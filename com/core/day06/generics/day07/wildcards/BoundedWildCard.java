package com.core.day06.generics.day07.wildcards;

import java.util.ArrayList;
import java.util.List;

public class BoundedWildCard {
    public static void main(String[] args) {
        List<Animal>  animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        fun(animals);

        List<Animal>  dogs = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Dog());

        fun(dogs);

    }

    public static void fun(List<? extends  Animal> values)//  -- we get co-variant
            // now it is ensuring that either it's always as Animal or it's subtype
    {
//       Animal a =  values.get(0);

       for(Animal a2  : values)
       {
           a2.eat();
       }
        {

       // but for inserting it can't be possible because, the passing type may be mismatched the required param
//        public static void fun(List<? extends  Dog> values)
//        {
//            values.add(new Animal() );
//            values.add(new Cat())  /// will create issues.

//        }



            /// but we can resolve using super



        }
    }
}
