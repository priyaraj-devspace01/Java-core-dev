package com.core.enumeration;

// Basically, we use enums when we want to store limited named constants, such as status code, logs(error, info), days, month and so on.
enum WEEKDAYS
{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;


    @Override
    public String toString() {
        return (this.name() + " ." );

}
}
public class EnumExistingMethods {
    public static void main(String[] args) {
        // compiler method
         //1) values -> returns array of enum constants of same type
        WEEKDAYS[] weekdays = WEEKDAYS.values();
        for(WEEKDAYS weekday : weekdays){
            System.out.println(weekday);
        }

        //2) valueOf - returns the string representation of enum constants
        WEEKDAYS monday = WEEKDAYS.valueOf("MONDAY");// but it is case-sensitive
        System.out.println("Strtting of the week is from " + monday);


        // Enum class methods
        //1)  name - Returns the exact name of the enum constant as a `String`.

        WEEKDAYS tuesday = WEEKDAYS.TUESDAY;
        System.out.println(tuesday.name());
            // VS -> toString( ) ,

        // The only difference is that toString can be over-ride but name() can't be as name is declared as final inside Enum class
        System.out.println(tuesday.toString());


        //2) ordinal - returns the enum constant index from top to bottom
        System.out.println(WEEKDAYS.MONDAY.ordinal());//0  // 0-based indexing
        System.out.println(tuesday.ordinal());// 1



    }
}
