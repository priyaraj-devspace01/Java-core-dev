package com.core.day06.generics;
class Box2<T>
{
    private T value;
    public Box2(T value) {
        this.value = value;
    }
   public  T getValue()
    {
        return value;

    }
      void setValue(T value)
    {
        this.value = value;
    }
}
public class SolutionWthGenerics {
    public static void main(String[] args) {
//        Box2 box = new Box2(111); it still treat as Object as we didn't specify the type


        Box2<Integer> box3 = new Box2<>(1111);
        System.out.println(box3.getValue()+ 77);

        Box2<String> box4 = new Box2("helllo");
        System.out.println(box4.getValue()  + " hiii ");


        // now incorrect data type can't be possible, or will be checked at the compile time
//        String ss = (String) box3.getValue();  // in-convertible types /// compile time check as box3.is only can work with integer only


        // Now the type information is not loosing


    }
}
