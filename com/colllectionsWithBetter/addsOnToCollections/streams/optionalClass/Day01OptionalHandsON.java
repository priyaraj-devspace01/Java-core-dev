package com.colllectionsWithBetter.addsOnToCollections.streams.optionalClass;

import java.util.Optional;

public class Day01OptionalHandsON
{
    public static void main(String[] args) {

         String name = null; /// bad design
//        System.out.println(name.length());   // null pointer exception
        Optional<String> name2 = Optional.empty(); /// for storing a value
        name2.ifPresent(x-> System.out.println(x.length()));
        Optional<String> name3 = Optional.of("raju"); /// for storing a value
        name3.ifPresent(x-> System.out.println("length : " + x.length()));

        /// when we are not whether we can give one value or null
        // we use
        Optional<String> name4 = Optional.ofNullable(null); // or else any value
//        System.out.println(name4.get());
        System.out.println(name3.get());


        /*
            Internal Overview :
            class Optional<T>
            {
                  private final T value;

                  if(value == null) empty;
                  (value != null) present
             }

             /// methods of Optional
             1) get()
             2) isPresent() ... or we can use both of them for extra safety
             3) ifPresent() -> needs a lambda -> consumer


             /// apart from these there are some other methods as well
             4) orElse() -> name.orElse('unknown");
             5) orElseGet()
             6) orElseThrow()
             7) ifPresentorElse()
         */





    }
}