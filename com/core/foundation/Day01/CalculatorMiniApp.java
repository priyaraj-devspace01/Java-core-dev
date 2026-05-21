package com.core.foundation.Day01;

import java.util.Scanner;

public class CalculatorMiniApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        performCalculation();
        sc.close();


    }

    public static void performCalculation() throws InterruptedException {
       while(true) {
           char choice = takeInputForType();
           double operand1 = takeOperand("Enter the first Operand:  ");
           double operand2 = takeOperand("Enter the second Operand:  ");
           printFinalResult(choice, operand1, operand2);

           if (!shouldContinue()) {
               System.out.println("Closing the Calculator : ");
               for(int i = 0;i<5;i++)
               {
                   Thread.sleep(1000);
                   System.out.print(". ");
               }
               System.out.println();
               System.out.println("---------Calculator Closed------------");
               break;


           }
       }

    }


    public static char takeInputForType() {
        System.out.println("Enter the type of operation you want to perform :{+,-,*,/,%} : ");
        return sc.next().charAt(0);
    }

    public static double takeOperand(String operand) {
        System.out.println(operand);
        return sc.nextDouble();
    }

    public  static double calculateOperation(char choice, double operand1, double operand2) {


        switch (choice) {
            case '+':
               return operand1 + operand2;
            case '-':
                return operand1 - operand2;

            case '*':
                  return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Cannot divide by zero");
                    return 0.0d;
                }
                return operand1 / operand2;
            case '%':
                  return operand1 % operand2;
            default:
                System.out.println("Invalid choice");
                return 0.0d;
        }



    }


    public static void printFinalResult(char choice, double operand1, double operand2) {
        System.out.printf("The last calculated result is  : %.2f%n", calculateOperation(choice, operand1, operand2));
        System.out.println();
    }

    public static boolean shouldContinue(){

        System.out.println("Do You Want To Continue? (Y/N)");

        char choice = Character.toUpperCase(sc.next().charAt(0));

        return choice == 'Y';

    }
}
