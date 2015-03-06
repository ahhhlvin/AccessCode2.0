/**
 * Access Code 2.1
 * Alvin Kuang
 * ForgetfulMachine.java
 * This class prompts you to provide your favorite words and numbers
 */
import java.util.Scanner;

public class ForgetfulMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give me a word!");
        input.nextLine();

        System.out.println("Give me another word!");
        input.nextLine();

        System.out.println("Great, now your favorite number?");
        input.nextLine();

        System.out.println("And your second favorite number?");
        input.nextLine();

        System.out.println("Whew! Wasn't that fun?");


    }
}
