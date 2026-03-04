package com.org.java8features.function_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


class Student
{
    private int id;
    private String name;

    Student(int id, String name)
    {
        this.id = id;
        this.name  = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class FunctionAsInterface {
    public static void main(String[] args) {
           Function<String, Integer> findStringString =   s -> s.length();
        System.out.println(findStringString.apply("liku"));


        // find the first three letter of a string using Function
        Function<String, String> findFirsThreeLetter = s -> {
           return s.substring(0,3);
        };
        String findFirstThree = findFirsThreeLetter.apply("Vipul");
        System.out.println(findFirstThree);


        Function<List<Student>, List<Student>> findEligibleNames = s->
        {


            List<Student> result = new ArrayList<>();
            for(Student std : s)
            {
                if(findFirsThreeLetter.apply(std.getName()).equalsIgnoreCase("vip"))
                {
                    result.add(std);

                }
            }
            return result;
        }   ;

        List<Student> filterStds = findEligibleNames.apply(List.of(new Student(11, "Raju"), new Student(12, "Vikul"), new Student(13, "Vipul")));
        for(Student s : filterStds)
        {
            System.out.println(s.getId() + " : " + s.getName());
        }


        // Just like predicate, we also have some common default and static method inside the function
        Function<Integer, Integer > findSquare = num -> num * num;
        Function<Integer, Integer> findSumOfDigits = num -> {
            int sum = 0;
             while(num != 0 )
             {
                 int digit = num%10;
                 sum += digit;
                 num/=10;

             }
             return sum;
        };
//        int ans1 = findSquare.apply(22);
//        System.out.println(ans1);



        // first default method, andThen -> it basically perform the function operation from left to right and each calculated value will be passed to the next function operation value
        Function<Integer, Integer> sqrAndSumDigit = findSquare.andThen(findSumOfDigits);
        int ans = sqrAndSumDigit.apply(21);
        System.out.println("ans " + " : " + ans);

        // also we can use the reverse of it just by interchanging the function order
//        Function<Integer, Integer> sumOfDigitThenSqr  = findSumOfDigits.andThen(findSquare);
        Function<Integer, Integer> sumOfDigitThenSqrCopy  = findSumOfDigits.compose(findSquare);


        // the same work is done by compose default method, where it first performs the second function work then the first function with updated result
        //or
        int ansCopy = sumOfDigitThenSqrCopy.apply(22);
        //or
//        int ans2 = sumOfDigitThenSqrCopy.apply(22);


        System.out.println("ans2:  " + ansCopy);

        // finally, the last method which is a static method we have that is
//        identity()
        Function<Integer, Integer > returnWhatIGave = Function.identity();
//        Returns a function that always returns its input argument.

        System.out.println(returnWhatIGave.apply(22));






    }
}
