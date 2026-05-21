package com.core.foundation.Day01;

class Car
{
    String name;
    int cost;
    Car(String name, int cost)
    {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
}

public class PassByrReference {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 82000);
        System.out.println("Before modification the car1 value is : "+ car1.toString());
        // here car1  is a reference variable of car1 which let suppose holds the heap address of 1000 ,
//        with specified value passed inside the constructor

//        now create one another car reference
        Car car2;
        car2 = car1;


        // now if we change the values by using reference of car2 it will same affect the value for car 1 as well as both pointing to the same memory address
       car2.name = "mercedes";
       car2.cost = 75000;
       System.out.println("After modification the car2 value is : "+ car2.toString());
        System.out.println("The value of car 1 is also now updated to  : "+ car1.toString());


    }
}
