package com.org.learnOOPS.termsToRemember.generics;

// generic class
class Primal<T>
{
   T data;
   public Primal(T data)
   {
       this.data = data;
   }
   public T getData()  // generic method
   {
       return data;
   }
}

class PrimalChild<T extends Number> extends Primal{

    public PrimalChild(T data)
    {
        super(data);
    }

}

class Main2
{
    public static void main(String[] args) {
        Primal<String> obj = new Primal<>("hello");
        System.out.println(obj.getData());

        PrimalChild<Integer> child = new PrimalChild<>(33);
        System.out.println(child.getData());

    }
}



public class HandsOnWrapperClassGenerics {

    public static void main(String[] args) {
        // to make something, we first need the type to be parameterized so that we can achieve the type safety for
        // multiple types and that can't be possible using primitive types that's why we need Wrapper class -
        // That converts the primitive types to their corresponding objects.

        int  a = 22; // primitive type
        Integer b = Integer.valueOf(22);
        Integer c = 22;  // Wrapper class of int
        System.out.println(b);


        // Autoboxing
        Float f = 33.2f;

        // Unboxing
        float f2 = f;





    }



}
