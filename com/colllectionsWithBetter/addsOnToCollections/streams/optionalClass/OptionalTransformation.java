package com.colllectionsWithBetter.addsOnToCollections.streams.optionalClass;

import java.util.Optional;

public class OptionalTransformation {
    public static void main(String[] args) {
//         User usr = getUser();
//         if(usr != null) {
//             Address ad = new Address();
//             if(ad != null)
//             {
//                 String city = ad.city;
//                 if(city!=null)
//                 {                                                   // verbose
//                     System.out.println(city);
//                 }
//             }
//
//         }

//// stream - multiple values(user1, user2, user3)
//// optional - //[User]


        /// using optional
//        Optional<User> user = Optional.of(getUser());
//        user.map(x->x.address)
//                .map(x-> x.city)
//                .ifPresent(System.out::println);

        ///map() -> if value present apply the map and returns optional, else remains empty
        /// filter()-> check a condition, if true keeps the value else do nothing

        ///flatMap()->
//        Optional<User> usr2 = getUser();
////        Optional<Optional<Address>> address = usr2.map(x->x.address);
//        usr2.flatMap(x->x.address)
//                .map(x->x.city)
//                .ifPresent(System.out::println);




        Optional<String> name4 = Optional.of("Aditya");
        Optional<String> name5 = name4.filter(x-> x.length() > 2);
        System.out.println(name5.orElse("empty"));


        // filter and map at the same time
        name4.map(String::length)
                .filter(x->x>10)
                .ifPresent(System.out::println);



        /// conclusion:
        // optional - mini stream ( either value or no value)
        /// scenario for stream with optional
        /*
             let's suppose we have a class where the user.email is optional as it may be present or may be not
             // so get them: -
             /-------------------------------------------------
             users.stream()
                  .map(u-> u.getEmail)
                  .filter(x->x.isPresent) // as it's an optional field
                  .map(x-> x.get())
                  .toList();
             /---------------------------------------------------
         */

    }

//    private static User getUser()
//    {
//        Address a = new Address();
//        a.city = "delhi";
//        User u = new User();
//        u.address = a;
//        return u;
//    }


    /// Optional Address
    private static Optional<User> getUser()
    {
        Address a = new Address();
        a.city = "delhi";
        User u = new User();
        u.address = Optional.of(a);
        return Optional.of(u);
    }
}


class User
{
    public Optional<Address> address;

}

class Address {
    public String city;
}
