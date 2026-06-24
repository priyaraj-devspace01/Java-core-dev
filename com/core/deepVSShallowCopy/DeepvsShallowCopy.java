package com.core.deepVSShallowCopy;

class Address
{
    String city;
    Address(String city)
    {
        this.city = city;
    }

}

class User {
    String name;
    Address address;
    User(String name, Address address)
    {
        this.name = name;
        this.address = address;
    }
}

public class DeepvsShallowCopy {
    public static void main(String[] args) {
        Address add = new Address("Berlin");
        User user = new User("Berlin", add);

//        // shallow copy
        User user2 = new User("raju", user.address);

        user2.address.city = "Banglore";
        System.out.println(user.address.city); // will change the user1 address as both pointing to the same Address object in heap
        // proof
        System.out.println(user.address == user2.address); //true


        // deep copy
        User user3 = new User("rituparna", new Address(user.address.city));
        System.out.println(user3.address.city);

        user3.address.city = "USA";
        System.out.println(user2.address.city); // won't affect the user 1 address as both pointing to different address object

        // proof
        System.out.println(user.address == user3.address); //false


        User user4 = user2; // this is not shallow copy or deep copy it's only passing the reference to points to the same object inside the heap


    }

}
