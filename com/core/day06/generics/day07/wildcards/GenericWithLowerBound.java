package com.core.day06.generics.day07.wildcards;

import java.util.ArrayList;
import java.util.List;
class Labrador extends Dog{
    @Override
    public void eat()
    {
        System.out.println("labra eating . ");
    }
}
public class GenericWithLowerBound {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Dog());
        animals.add(new Labrador());

        fun(animals);
    }



    public static void fun(List<? super Animal> values)
    {
        values.add(new Animal());
        for(Object a2 : values)
        {
            Animal a = (Animal)a2;
            a.eat();
        }
    }
}


/// Summary :
/*
 List<?  extends T> --- reads (co-variant)
 List<? super T>  ---- write  (counter-variant)


 PECS RULE:-
  producer extends  - read
   consusmer Super  - write(input)
 */
