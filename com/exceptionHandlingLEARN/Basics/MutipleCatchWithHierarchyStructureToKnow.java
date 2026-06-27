package com.exceptionHandlingLEARN.Basics;

public class MutipleCatchWithHierarchyStructureToKnow {
    public static void main(String[] args) {
        try
        {
            int  a = 22;
            int b = 0 ;
            /// exception-1
//            System.out.println(a/b);



            // exception 2
            String s = null;
            s.length();


            // exception -3 - class cast exception
//            Object s1 = "hii";
//            Integer i = (Integer) s1;




        }

        /// even if we are not sure about the actual exception type to handle we can maintain the order from top to bottom, from bottom to top priority on the exception hierarchy (Arithmetic Exception -> Runtime exception -> Exception)
        /// as for jvm task it checks for each catch block from top to bottom whether it's handling the exception or else need to move to the next

        /// always best to follow the same order ( low to higher)

        // if we gave the order from higher to lower than next catch block are to be unreachable as handled by the parent class
        //// ------------------XXXXXXXXXX-----------------------------
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//        catch (RuntimeException e)
//        {
//            System.out.println(e.getMessage());
//        }
        ///----------------------------------------------------
        // always be from low to high
//        catch(ArithmeticException e)
//        {
//            System.out.println(e.getMessage());
//
//        }
//        catch (NullPointerException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }


        //// we can add catch with handling multiple child exception using | we can do that
        catch (ArithmeticException  | NullPointerException | ClassCastException e)
        {
            System.out.println(e);
        }

        /// but we can't chain the parent with child
//        catch (ArithmeticException | Exception e)  ///- > parent and child must be disjoint
//        {
//            System.out.println(e.getMessage());
//        }
    }
}
