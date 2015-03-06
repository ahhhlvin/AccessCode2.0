/**
 * Access Code 2.1
 * Alvin Kuang
 * BMICalculator.java
 */
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args ) {

        Scanner keyboard = new Scanner(System.in);

        double heightm;
        double weightkg;
        double bmi;
        double bmi2;
        double heightin;
        double weightlb;



        System.out.println("Your height in m: ");
        heightm = keyboard.nextDouble();

        System.out.println("Your weight in kg: ");
        weightkg = keyboard.nextDouble();


        bmi = (weightkg/(heightm*heightm));


        System.out.println("Your BMI is " + bmi);




        heightin = (heightm*38.3701);
        weightlb = (weightkg*2.20462);

        System.out.println("Your height in inches is: "+ heightin);


        System.out.println("Your weight in lb is: " + weightlb);


        bmi2 = (weightlb/(heightin*heightin));

        System.out.println("Your BMI is " + bmi2);
    }
}
