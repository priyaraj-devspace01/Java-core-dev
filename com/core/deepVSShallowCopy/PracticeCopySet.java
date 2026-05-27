package com.core.deepVSShallowCopy;



class EngStudent
{
    int id;
    String name;


    EngStudent(int id, String name)
    {
        this.id = id;
        this.name = name;
    }


    EngStudent(EngStudent e)
    {
        this.id = e.id;
        this.name = e.name;
    }

    @Override
    public String toString() {
        return "EngStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class PracticeCopySet {
    public static void main(String[] args) {

        EngStudent e1  = new EngStudent(101, "raju");
        EngStudent e2  = new EngStudent(e1);
        // Although it's creating one new object in heap, but as we are passing the e1 as reference variable
        // it then for its own object initialize the value what e1 reference.id and name stored before already
//        so although they have the same value initially but, any modification to one object won't affect the other one
        System.out.println("======================================================DEEP COPY ========================================");
        System.out.println("initially ");
        System.out.println(e1);
        System.out.println(e2);


        System.out.println("suppose below e2 changing it's value");
        e2.id = 1111;
        e2.name = "priyaraj";

        System.out.println("After changes done, e2 becomes");
        System.out.println("e2 :  " + e2);
        System.out.println("even e2 changes it's fields value but the e1 values remains unchanged . ");
        System.out.println("e1 : " + e1);

        // this is called deep copy in java


        System.out.println();
        System.out.println();
        System.out.println("==========================================SHALLOW COPY===============================================");

        EngStudent e3 = e2;
        // now it directly points to the same object where e2 pointing
        // so any modification on e2 will definitely reflect to e3 as well


        System.out.println("Before change ");
        System.out.println("e2 : "+ e2);
        System.out.println("e3 : "+ e3);

        e2.id = 11111;
        e2.name = "ruturaj";

        System.out.println("After change ");
        System.out.println("e2 : "+ e2);
        System.out.println("e3 : "+ e3);
        System.out.println("Now both references of e2 and e3 pointing to the same object with same values inside them with reflection ");

    }
}
