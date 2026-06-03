package com.core.day06.generics.day07.wildcards;


import java.util.ArrayList;
import java.util.List;

class Animal
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

class Dog extends Animal
{
    public void bark()
    {
        System.out.println("barking");
    }
    @Override
    public void eat()
    {
        System.out.println("dog eating . ");
    }
}

public class InvarianceIssue {
    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
//        List<Animal> animals = dogs;  // compile time error


        // But this things will be allowed using array but failed at run-time
        Dog[] dogArr = new Dog[3];
        Animal[] animalArr = dogArr;


//        animalArr[0] = new Animal();
        animalArr[1] = new Dog();
        for(Animal animal : animalArr){
            if(animal == null){
                continue;
            }
             animal.eat();
          }
    }
}
