/**
 * Created by alvin2 on 3/3/15.
 */
public class Vars {
    public static void main (String[] args) {
        int favNum = 9;
        System.out.println("I like the number " + favNum);

        System.out.println(favNum + " is a prime number.");

        //
        //


        int numVeggies = 7, numFruits = 8;
        System.out.println("I like eating " + numVeggies);

        //
        //

        double favNum2 = 10; /* "double" is a DATA TYPE that can hold more digits */
        System.out.println("I like the number " + favNum2);

        //
        //

        char letter ='K';    // use SINGLE QUOTES
        String name = "Alvin ";  //"String" specifies the declaration of variable 'name' is a string of "Alvin"
        name = name + letter;
        System.out.println("I like " + name);

        //
        //

        boolean more = 2 < 1; /* evaluating before assigning value of "false" */
        System.out.println(more);

        //
        //


        /* this section declares the DATA "TYPE" of each variable, and also lists out the variables that will be used */
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        /* this section declares ASSIGNMENTS of the value for each variable */
        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;


        System.out.println("I love driving " + cars + " types of cars");
        System.out.println("Last semester I got a " + space_in_a_car);
        System.out.println("I have " + drivers + " siblings");
        System.out.println("100 - 30 is " + cars_not_driven);
        System.out.println("Asians " + cars_driven + " years and over are known to be scary");
        System.out.println("I ate " + carpool_capacity + " eggs");
        System.out.println("I eat " + average_passengers_per_car + " meals a day");


    }
}
