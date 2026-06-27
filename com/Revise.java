package com;

class Address
{
    String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
final class Student
{
    private   String name;
    private  int id;
    private Address address;

    Student(int id, String name, Address address)
    {
        this.id=id;
        this.name=name;
        this.address= new Address(address.city);
    }

    public int getId()
    {
            return  id;
    }
    public String getName()
    {
        return  name;
    }

    public Address getCity(){
        return new Address(address.city);
    }


}

// defensive copy to make the class completely immutable
public class Revise {
    public static void main(String[] args) {

        Address add = new Address("rajstan");

        Student s1 = new Student(11,"raj", add);
        System.out.println(s1.getId() + " : "+ s1.getName()+ " : "+ s1.getCity().city);


        s1.getCity().city = "ahmadabad";
        System.out.println(s1.getCity().city);




    }
}
