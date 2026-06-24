package com.colllectionsWithBetter.addsOnToCollections.streams.optionalClass;

import java.util.NoSuchElementException;
import java.util.Optional;

public class HandsOnPartII {
    public static void main(String[] args) {
          Optional<String> name = getName();
//        System.out.println(name.get());  // no value present exception


        // minor handling
//        if(name.isPresent())
//        {
//            System.out.println(name.get());
//        }
        /// still verbose

//        name.ifPresent(System.out::println);

        // orElse
        System.out.println(name.orElse("unknown"));
        /// different from orElseGet is that irrespective of value present or not it will always evaluate the "unknown"

        // orElseGet
        System.out.println(name.orElseGet(() -> "unknown"));

        // orElseThrow
        System.out.println(name.orElseThrow(NoSuchElementException::new));;

        // ifPresentOrElse
        name.ifPresentOrElse(System.out::println, ()-> System.out.println("UNKNOWN"));




        /// optional transformation
        //1) map,
        //2) flatMap
        //3) filter



    }

    public static Optional<String> getName()
    {
//        return Optional.empty();
//        return Optional.of("hello");
        return Optional.ofNullable(null);
//        return Optional.ofNullable("Hello");



    }
}
