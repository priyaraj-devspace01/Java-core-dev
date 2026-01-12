package com.org.exceptions.basic;

import com.org.collectionFramework.collections.List.comparatorandcomparable.comparator.Student;

import java.io.IOException;
import java.sql.Array;
import java.sql.SQLException;

public class BaseInfoClass {
    public static void main(String[] args) {
        int a = 22;
        int b = 22;

        // TYPES OF ERRORS ( Always made by the user )

//        1) Syntax Error
//        int c = a/b // error/             [ failed suing compile time ]
        // semicolon must be there


        //2) Logical Error
//        public void divide(int a , int b)
//        {
//            return a*b;                     [ unexpected result]
//        }


        //3) Runtime error   ----------------   (can't divide by zero exception)
        int[] numerators = {10, 200, 30, 40};
        int[] denumerators = {1, 2, 0, 4};
        for (int i = 0; i < numerators.length; i++) {
            System.out.println(divide(numerators[i], denumerators[i]));
        }

        System.out.println("Rest also working ...........");

        // this program will run completely fine except some cases, so we need to handle those exceptions.


        // EXCEPTION:
        // it is an event that disrupts the normal flow o the program. it is an object which is thrown at runtime.
        // EXCEPTION HANDLING
        /*
         is a way to handle the run time errors so that the normal flow of the application can be maintained.
         */
    }





    public static int divide(int a, int b) {
        // Try to remember one thing when we need multiple catch to handle more than
        // one exception during run time we need to follow the hierarchy (child->parent[top->bottom]
        // otherwise it will be always pass by the parent one and return the same exception for all

        try {


            // Array index out of bound
            int []arr = {122,22,43,5,5};
            for(int i=0;i<20;i++)
            {
                try
                {
                    System.out.println(arr[i]);
                }catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.println(e);
                }
            }

            Student std = null;
            std.setName("22"); // can't be possible ( bcz pointing to a null object ]
            // need to be handled -1

            return a / b;
            // needs to be handled two


//        } catch (Exception e) {  ( X ) Wrong way
            // try instead - what are the exception we guess that will be occurred
            // List them all first then parent at the end (Exception)
//        }catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//            return -1;
//            // we can also pass multi-catch exceptions to be handled at one time but not parent child
        }catch (ArithmeticException | NullPointerException e) {
//            catch(ArithmeticException | RuntimeException e) ❌❌
            System.out.println(e.getMessage());
            return -1;
        }

        catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
            return -1;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }

    }

}

