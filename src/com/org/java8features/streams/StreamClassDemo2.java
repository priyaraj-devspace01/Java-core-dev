package com.org.java8features.streams;

import java.io.StringBufferInputStream;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamClassDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(12,44,66,789,9);


        // Manually,
        int count = 0;
        for(int i =0;i<list.size();i++)
        {
            if(list.get(i) %2 == 0)
            {
                count++;
            }
        }
        System.out.println(count);


//        - source -list of integers ,
//        intermediate operation - filter , terminal - forEach

        // using stream
      long count2 =   list.stream().filter(x -> x%2 ==0).count();
        System.out.println(count2);

        // exmaple-2
        // source  = array
        Integer []arr = {12,334,567,8};

        Stream<Integer> arrStream = Arrays.stream(arr);

        int []arr2 = {12,4,56,67,87};
        Arrays.stream(arr2).filter(x->x>33).forEach(System.out::println);
        // but here the return type is IntStream
        IntStream stream3 = Arrays.stream(arr2);
        // similarly, LongStream, DoubleStream


        String[] str = {"liku", "raja", "lima"};
        Stream<String> strStrm  = Arrays.stream(str);
        strStrm.filter(s->s.startsWith("l")).forEach(System.out::println);

        // 3. using stream.of()
        Stream<String> a = Stream.of("a", "b", "c");


        // to generate an infinite stream
        //4. Infinite Stream
        Stream.generate(()-> 1).limit(100);

        // 5. Iterate
        Stream<Integer> iterate = Stream.iterate(0, x -> x + 10);
        iterate.limit(10).forEach(System.out::println);


    }
}
