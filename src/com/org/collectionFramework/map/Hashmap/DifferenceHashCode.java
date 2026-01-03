package com.org.collectionFramework.map.Hashmap;


import com.org.collectionFramework.collections.List.comparatorandcomparable.comparator.Student;

import javax.management.PersistentMBean;
import java.util.HashMap;
import java.util.Map;

class Person
{
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class DifferenceHashCode {

    public static void main(String[] args) {

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("raj", 100);
        map1.put("jan", 200);
        map1.put("michael", 300);
        map1.put("raj", 350);

        // as here, the same hash function will create the hash code for raj for the second time therefore it will
         // point to the same index at the bucket for updating the raj marks

        System.out.println(map1.size()); //3
        System.out.println(map1.get("raj")); // 350



        // But in case of objection creation, it's quite different
        Map<Person,String> employees = new HashMap<>();
        Person emp1 = new Person("raj", 1);
        Person emp2 = new Person("jan", 2);
        Person emp3 = new Person("michael", 3);
        Person emp4 = new Person("raj", 4);

        employees.put(emp1, "HR");
        employees.put(emp2, "tech");
        employees.put(emp3, "finance");
        employees.put(emp4, "HR2");
        // we can expect that it is override, but it's not happen in case of objects

        System.out.println(employees.size()); // expected-3 but will find 4
        System.out.println(employees.get(emp4)); // EXPECTED- HR2 WILL FIND ALSO HR2
        System.out.println(employees.get(emp1)); // expected - HR2 BUT WILL FIND HR

        // TO MAKE THEM EQUAL WE HAVE TO USE THE HELP OF HASHCODE() AND HAVE TO DEFINE THE EQUALS METHOD WITH LOGIC FOR SAME INDEX ALLOCATION INSIDE THE BUCKET



    }
}
