package nyc.c4q.ahhhlvin.helloworld;

/**
 * Created by alvin2 on 3/1/15.
 */
public class Numbers {

    public static void main(String[] args) {

        System.out.println(42);       //integers are numbers without decimals
        System.out.println("42");
        System.out.println(42.0);     //float = DECIMALS !!
        System.out.println(42.000000);
        System.out.println("42.000000");
        System.out.println(41.99999999999999999999);
        System.out.println("41.99999999999");


        System.out.println(17 + 242);
        System.out.println("17" + "25");
        System.out.println(17 + "25");       //Java attempts to convert the "non-string" or integer to a string and concatanates it
        System.out.println("17" + 25);


        System.out.println(
               "temperature: " + (-4.0 * 9 / 5 + 32)  +  "\u00b0" + "F");  // ORDER OF OPERATIONS = PEMDAS


    }
}

