/**
 * Created by alvin2 on 3/5/15.
 */

import java.util.Scanner;   // imports code that another developer has made before that we want to use

public class Echo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);   // creating our new Scanner and giving it a NAME
        System.out.println("Please say something.");   // This is how the program will first run, by printing this line of text
        String something = keyboard.next();   // will give you the next string that the user inputs
        System.out.println(something);
    }





}
