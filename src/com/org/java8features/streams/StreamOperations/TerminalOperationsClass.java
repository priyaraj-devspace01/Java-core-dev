package com.org.java8features.streams.StreamOperations;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperationsClass {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,33,455,667,22);

        // collect or toList
//        list.stream().skip(1).collect(Collectors.toList());
        // for newer version we can directly used toList
        List<Integer> list1 = list.stream().limit(2).toList();
        System.out.println(list1);


        // forEach
        list.stream().forEach(System.out::println);

        // reduce - combines the elements to produce a single result, it takes binary operator
        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        //                                              (x,y)-> x+y
        System.out.println(reduce.get());

        // count

        // anyMatch, allMatch, noneMatch -> these all accepts predicate
        // circuit operation - when find the expected one immediately after found
        List<String> gender = new ArrayList<>(List.of("male", "female", "third gender", "neutral"));
        boolean  isFoundOne =gender.stream().anyMatch(s-> s.equalsIgnoreCase("male"));
        System.out.println(isFoundOne);


        List<String> allFemales = new ArrayList<>(Arrays.asList("female", "female", "female"));
        boolean isAllfemale = allFemales.stream().allMatch(s -> s.equalsIgnoreCase("female"));
        System.out.println(isAllfemale);

        boolean isMale = allFemales.stream().noneMatch(s -> s.equalsIgnoreCase("male"));
        System.out.println(isMale);

        // findFirst, findAny
        System.out.println(gender.stream().findFirst().get());
        System.out.println(gender.stream().findAny().get());

        // circuit operations
        // task-1 -- find the list of string having length greater than 3
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        List<String> list2 = names.stream().filter(name -> name.length() > 3).toList();
        System.out.println(list2);

        // Task-2 - first we need to find the square of each and then sort them
        List<Integer> numbers = List.of(5,2,1,7,89,9);
        List<Integer> list3 = numbers.stream().map(num -> num * num).sorted((a,b)->b-a).toList();
        System.out.println(list3);

        // Task - 3 -sum of all the elements
        List<Integer> number2 = Arrays.asList(1,2,3,4,5);
        Optional<Integer> sumOfNums = number2.stream().reduce(Integer::sum);
        System.out.println(sumOfNums.get());

        // find no of occurance - l
         String  sentence = "Hello world";
        char[] charArray = sentence.toCharArray();
//         Stream<char[]> nn = Arrays.stream(charArray);
        // use chars which ultimately creates a stream also
        IntStream chars = sentence.chars();

        // approach -1
        long count = new String(charArray)
                .chars()
                .filter(c -> c == 'l')
                .count();
        System.out.println(count);



    }
}
