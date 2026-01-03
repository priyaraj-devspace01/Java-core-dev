package com.org.collectionFramework.map.weakHashSet.garbageCollection;


import java.lang.ref.WeakReference;

class Phone
{
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
public class GarbageCollectionClass {
    public static void main(String[] args) {

        Phone phon1 = new Phone("iphone", "16 pro max");
        // whenever we are creating the object like this it's called as strong reference

//        unless we change the reference from the heap memory object which had created it can't be freed by jvm automatically,
//        but if we do it manually
        phon1 = null;
        // now the reference is pointing to null and the object which was created before inside the heap becomes unused,
        // so the jvm will automatically reclaim the memory from heap and make it free for better memory utilization
        System.out.println(phon1);



        // But what if we use weka reference:
        WeakReference<Phone> phonn = new WeakReference<Phone>(new Phone("moto", "g36"));
        System.out.println(phonn.get());
        // as we are accessing now, it can easily access,
        // but by default the weak reference doesn't act like strong reference jvm can reclaim the memory when it suited for it

        // like
        System.gc();  // here we are saying to it because we want the result as we expected
        try
        {
            Thread.sleep(10000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(phonn.get());


    }
}
