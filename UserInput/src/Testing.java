/**
 * Created by alvin2 on 3/6/15.
 */

import java.util.Scanner;

public class Testing {
    public static void main(String[] args ) {

        Scanner input = new Scanner(System.in);

        String name;


        System.out.println("Hello there, what is your name?");
        name = input.nextLine();

        System.out.println("Hi " + name + ", please provide your password:");
        String password = input.next();

        if ( password == password) {
            System.out.println("You are now logged in, thank you.");
        }
    }
}
