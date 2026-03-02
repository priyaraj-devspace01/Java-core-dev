package com.org.java8features.predicate;

import java.util.function.Predicate;

public class predicateTwoClassPr {
    public static void main(String[] args) {
        Predicate<Double> isOdd = x -> x%2 == 0 ;
        if(isOdd.test(33.0))
        {
            System.out.println(33.0 + "is even ");
        }else {
            System.out.println("it's not even ");
        }


        Predicate<String> passValidate = password -> {

            if (password == null || password.length() < 8) {
                return false;
            }

            boolean hasUpperCase = false;
            boolean hasDigit = false;

            for (char ch : password.toCharArray()) {

                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                }

                if (Character.isDigit(ch)) {
                    hasDigit = true;
                }

                if (hasUpperCase && hasDigit) {
                    break;  // no need to check further
                }
            }

            return hasUpperCase && hasDigit;
        };


        String password = "Liku1234";
        if(passValidate.test(password))
        {
            System.out.println("It's a valid and also a strong password . ");
        }else
        {
            System.out.println("It's not good and also a weak password, try something other password with proper data  . ");
        }


        /// Predicate with and, or , negate and isEqual

        Predicate<String> startWithA = s -> s.toLowerCase().charAt(0) == 'a';
        Predicate<String> endsWithA = s -> s.toLowerCase().charAt(s.length()-1) == 'a';


        Predicate<String> finalNameCheck = startWithA.and(endsWithA);
        if(finalNameCheck.test("aradhaya"))
        {
            System.out.println("Its a palindromic string start and ends with A only ");
        }else
        {
            System.out.println("It's not a palindromic string with start and end with A");
        }


         Predicate<Integer> drivingAgeValidity = x -> x >= 18;
         Predicate<Integer>  hasSpecialPermission = x -> x == 16;

         Predicate<Integer> isEligible = drivingAgeValidity.or(hasSpecialPermission);
         if(isEligible.test(1))
         {
             System.out.println("even if you are 16 you are allowed to driver for some special  reason ");
         }else
         {
             System.out.println("you may allowed to driver");
         }


         String name = "Viresh";
         Predicate<String> removeUserWithNameV = x -> x.startsWith("V");
         Predicate<String> chooseIfValidUser = removeUserWithNameV.negate();
         if(chooseIfValidUser.test(name))
         {
             System.out.println("you are not allowed to our club");
         }else
         {
             System.out.println("You are allowed for our club ");
         }



         // isEqual
        Predicate<String> h = Predicate.isEqual("22");
         if(h.test("22"))
         {
             System.out.println("yes both are equal ");
         }else {
             System.out.println("They are not equal . ");
         }







    }
}
