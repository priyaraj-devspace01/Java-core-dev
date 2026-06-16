package com.colllectionsWithBetter.addsOnToCollections.comparatorUseCaseNeed;

public class FunctionalInterFaceWithLambdaImplementation
{
    public static void main(String[] args) {
        // it's a type of interface having only one abstract method, but one or more than static or default method
          //// example - comparator, comparable interface

        // there the lambda comes to only give the way to perform the action, not complete implementation for each use case
        /*
        syntax :
        (parameters) -> expression
                    -> -- called as gives to/ map to




          --- WAYS TO DEFINE THE LAMBDA
          1) MULTIPLE ARGUMENT - (a,b)-> a+b
          2) SINGLE ARGUMENT  -> a -> a *a ;
          3) NO ARGUMENT -> () -> System.out.println("hii");
          4) MULTI-LINE -> () {
                                  sout("hii");
                                  return (a+b);  // return statement to be mandatory
                              }


              sort(Student list, (s1,s2)-> s1.marks - s2.marks)

                // here java knows the type of comparator based on list type - called target typing
         */
    }
}
