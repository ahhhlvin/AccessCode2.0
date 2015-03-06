/**
 * Access Code 2.1
 * Alvin Kuang
 * IfThen.java
 */

import java.util.Scanner;

public class IfThen {
    public static void main(String[] args ) {

        String word = "word";
        String word2 = "word";
        if (7 > 3) {
            System.out.println("Math is real!");
        }


        Scanner in = new Scanner(System.in);
        System.out.println("What's your password?");

        int password = in.nextInt();

        if (password == 1234) {

            System.out.println("Logged in.");
        }

        /*** OR ***/

        System.out.println("What's your password?");

        String password2 = in.nextLine();

        if (password2 == "thispassword") {
            System.out.println("Logged in.");
        }





    }
}
