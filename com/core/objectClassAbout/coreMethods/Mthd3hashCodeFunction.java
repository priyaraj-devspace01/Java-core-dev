package com.core.objectClassAbout.coreMethods;


import java.util.Objects;

class Truck
{
    int noOfWheels;
    String brand;


    Truck(int noOfWheels, String brand)
    {
        this.noOfWheels = noOfWheels;
        this.brand = brand;
    }


    @Override
    public String toString()
    {
        return ("brand : " + brand + "noOfWheels : " +noOfWheels  );
    }

    // if we override the equals methods instead of default which only compares the memory object reference.

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }

        if(o == null || getClass() != o.getClass())
        {
            return false;
        }
        Truck truck = (Truck) o;
        return this.noOfWheels == truck.noOfWheels && this.brand.equals(truck.brand);
    }
    // as we override the equals method we also need to override the hashCode method as well
    @Override
    public int hashCode()
    {
//        int result  = 17;
//        result = result *31 + noOfWheels;
//        // but when the user pass null for name, it will throw run time nullPointer exception
//        result = result * 31 + (brand == null ? 0 : brand.hashCode());
//        return result;


        // java internally does all these things for us
        return Objects.hash(noOfWheels, brand);
    }
}
public class Mthd3hashCodeFunction {
    public static void main(String[] args) {

           Truck t1 = new Truck(20, "ashok leyland");
           Truck t2 = new Truck(20, "TATA");
        System.out.println("when default it's always going to failed . ");
        System.out.println(t1.equals(t2));
        System.out.println(t1.hashCode() == t2.hashCode());
        // for the default equals it always going to be false, so there is no point to check for hashCode of both of them
        // So for now ,
         // if we want default behavior where the hashCode will be same as both the references when points to the same object
        // then, their respective hashCode will also going to be same


        System.out.println("Now it's always going to be true , as both pointing to the same object");
        Truck t3  = t2;
        System.out.println(t3.equals(t2));
        System.out.println(t3.hashCode() == t3.hashCode());



        /// now when override the equals and hashCode based on our custom logic how the reference to be same
         Truck t4  = new Truck(20, "BharatBenz");
        Truck t5  = new Truck(20, "BharatBenz");
//          IF NULL - NEED TO HANDLE
        // now one truck brand is null, we also handle that one well
        System.out.println(t4.equals(t5));
        System.out.println(t4.hashCode() == t5.hashCode());




    }
}



/// NOTE:
/*
//        returns an integer of an object -> hexadecimal format


Rule:
if 2 objects are equal then
there hashcode must be equal.


example:
Student s1 = new Student("raj", 111);
Student s2 = new Student("raj", 111);

if (s1.equals(s2)   -> s1.hasCode == s2.hashCode

// but the reverse might not be true.


 */