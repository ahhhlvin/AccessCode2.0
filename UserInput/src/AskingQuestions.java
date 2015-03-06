/**
 * Access Code 2.1
 * Alvin Kuang
 * Paired with Luke Lee
 * AskingQuestions.java
 * This class prompts questions and links all the provided info together into a combined string that presents the data entered
 */


import java.util.Scanner;

public class AskingQuestions {
    public static void main ( String[] args ) {

        Scanner keyboard = new Scanner(System.in);

        /**** define variables first ****/
        int age, feet, inches;
        double weight;


        /**** declare variables ****/
        System.out.print ("How old are you? ");
        age = keyboard.nextInt();

        System.out.print( "How tall are you in FEET? ");
        feet = keyboard.nextInt();

        System.out.print( "How tall are you in INCHES? ");
        inches = keyboard.nextInt();

        System.out.print( "How much do you weigh? ");
        weight = keyboard.nextDouble();


        /**** format everything ****/
        System.out.println( "So you're " + age + " years old, " + feet + "'" + inches + "\" tall and " + weight + " heavy.");
    }
}
