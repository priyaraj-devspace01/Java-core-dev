package com.org.learnOOPS.termsToRemember.enumToKnow;


// it is used to list the named constant typed values.
 enum Day
{
     SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
     // these are by default public static final as well

}
public class EnumsPr {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;
        System.out.println(day.name());
        System.out.println(day.ordinal());
        System.out.println(day.values());
        System.out.println(day.valueOf("SUNDAY"));


        for(int i = 0;i<day.values().length;i++)
        {
            if(day.values()[i] == day)
            {
                System.out.println("hii"+day.name());
            }
        }


        switch(day)
        {
            case SUNDAY:
                System.out.println("Sunday");
                break;
                case MONDAY:
                    System.out.println("Monday");
                    break;
                    case TUESDAY:
                        System.out.println("Tuesday");
                        break;
                        case WEDNESDAY:
                            System.out.println("Wednesday");
                            break;
                            case THURSDAY:
                                System.out.println("Thursday");
                                break;
                                case FRIDAY:
                                    System.out.println("Friday");
                                    break;
                                    case SATURDAY:
                                        System.out.println("Saturday");
                                        break;
                                        default:
                                            System.out.println("Invalid day");
                                            break;

        }
    }
}
