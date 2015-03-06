/**
 * Access Code 2.1
 * Alvin Kuang
 * DumbCalculator.java
 */

import java.util.Scanner;

public class DumbCalculator {

    public static void main(String[] args) {

        Scanner putin = new Scanner(System.in);
        double firstNum;
        double secondNum;
        double thirdNum;
        double answer;


        System.out.println("What is your first number?");
        firstNum = putin.nextDouble();    /*** REMEMBER TO CAPITALIZE THE "D" IN DOUBLE ***/

        System.out.println("What is your second number?");
        secondNum = putin.nextDouble();

        System.out.println("What is your third number?");
        thirdNum = putin.nextDouble();

        answer = (firstNum + secondNum + thirdNum);    /*** TO SIMPLIFY CODE FOR MATH EXPRESSION BELOW ***/

        System.out.println("( " + firstNum + " + " + secondNum + " + " + thirdNum + " ) / 2 is... " + (answer/2));



    }
}
