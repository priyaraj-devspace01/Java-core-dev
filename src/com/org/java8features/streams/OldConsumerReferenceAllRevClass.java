package com.org.java8features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;


class Student
{
    int mark = 100;
    public Student ()
    {
        System.out.println("Hiiiii");
    }
}
public class OldConsumerReferenceAllRevClass {
    public static void main(String[] args) {

        //  Intermediate operations transforms a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked.


        Predicate<Integer>  checkEven = x ->x %2 ==0 ;
        Function<Integer, Integer> findSQR = num -> num *num;
        Consumer<Integer> consumeValue = x-> System.out.println(x);
        Supplier<Integer> supplyValue =  ()-> (int) Math.sqrt(4);

        if(checkEven.test(supplyValue.get()))
        {
            consumeValue.accept(findSQR.apply(supplyValue.get()));
        }

        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        System.out.println(listSupplier.get());

        Consumer<List<Integer>> consumerSet = list -> {
            for(int i =0;i<list.size();i++)
            {
                list.set(i, 2*list.get(i));
                System.out.println(list.get(i));
            }
        };
        consumerSet.accept(Arrays.asList(22,45,6,7));




        List<String> names = List.of("Amit", "Abhaya", "Raskhit");
       Stream<String> ss =  names.stream().filter(s -> s.startsWith("A"));
        // no filtering done at this point, to perform the filter we need to add the terminal operation at the end
//        ss.forEach(s -> System.out.println(s));
        // or
        ss.forEach(System.out::println);





        String s = "Helo";
        Function<String, String> toUpper = String::toUpperCase;
        System.out.println( toUpper.apply(s));

        Function<Integer, Integer> findSum2 = OldConsumerReferenceAllRevClass::findSum;
        System.out.println(findSum2.apply(21));

        Consumer<String> printVal =System.out::println;
        printVal.accept("raja");




        List<Integer> list = Arrays.asList(22,23445,664);
        list.stream().forEach( System.out::println);





    }
    public static int findSum(int a)
    {
        return a+10;
    }
}
