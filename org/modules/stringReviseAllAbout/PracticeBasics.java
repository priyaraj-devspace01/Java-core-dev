package org.modules.stringReviseAllAbout;

public class PracticeBasics {
    public static void main(String[] args) {

        String str = "raj";
        String str2 = "raj";
        String name3 = str2;
        System.out.println(name3 ==  str2);
        System.out.println(str == str2); // it basically checks for value with the object address as well



//        but when we create the string using "new"
        String name = "rani";
        String name2 = new String("rani");

        System.out.println(name == name2);   // validates the value as well as the address they are pointing to
        System.out.println(name.equals(name2)); // only validate the value of the object





    }
}
