package com.colllectionsWithBetter.addsOnToCollections.lambdaInternals;


interface Calculate
{
    int performCalculation(int a, int b);
}

// manual approach
//class MyCalculation implements Calculate
//{
//    @Override
//    public int performCalculation(int a, int b)
//    {
//        return a+b;
//    }
//}



/// but it is verbose and only stick to one implementation, for other operations like , multi, sub, we need to create as many classes
public class UseCase01 {
    public static void main(String[] args) {
        // instead we can use the lambda expression
        Calculate calculate = (a,b)-> a-b;
        actualOperation(12,3,calculate);
//        actualOperation(12,3, (a,b)-> a*b);


    }

    public static void actualOperation(int a, int b, Calculate c)
    {
        System.out.println(c.performCalculation(a, b));
    }
}
