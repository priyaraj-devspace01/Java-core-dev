package com.core.day06.generics;


// Example
class Box
{
    private Object value;
    public Box(Object value)
    {
        this.value = value;
    }
    public Object getValue()
    {
        return value;

    }
    public  void setValue(Object value)
    {
        this.value = value;
    }
}
public class IssueBeforeGenerics {
    public static void main(String[] args) {
        // Upcasting
        String s = "hello";
        Object obj = s;
        System.out.println(obj);


        // DownCasting
        Object obj2 = 10;
        Integer i  = (Integer) obj2;
        System.out.println(i);


        // but when compile time check fails
        Object obj3 = "Aditya";
//        Integer i2 = (Integer) obj3; // can't check at compile time || classCastException
//        System.out.println(i2);


        // issues of manual casting and runtime exception chances
        Box box  = new Box(222);
        Box box2 = new Box("hii");
        Box box3 = new Box(33.333f);


//        System.out.println(box.getValue()+3); // because it doesn't what the value was passed via object call


        /// so we need, for everyone
        /// down-casting
        Integer x = (Integer)box.getValue();
        String y = (String)box2.getValue();
        Float z = (Float)box3.getValue();


        System.out.println(x+ 6 );
        System.out.println(y + 55);
        System.out.println(z +10);


    }


    // suppose we have a requirement that, one class can accept all types
    // so the only is to do that is to make the fields and behaviors as Object type

    // but the limitations are :
    /*
     1) Type information will be loosed.
     2) Wrong object could be inserted.
     3) casting became necessary when reading.
     4) many errors shift to runtime
     */
}
