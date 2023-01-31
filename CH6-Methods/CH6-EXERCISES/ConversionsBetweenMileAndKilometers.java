/*
Write a class that contains the following two methods:

public static double mileToKilometer(double mile)
public static double kilometerToMile(double kilometer)

The formula for the conversion is:

1 mile = 1.6 kilometers

Write a test program that invokes these methods to display the following tables:

Miles    Kilometers  |   Kilometers      Miles

1           1.609    |       20          12.430
2           3.218    |       25          15.538
...
9           14.481   |       60          37.290
10          16.090   |       65          40.398

 */

import java.util.Scanner;

public class ConversionBetweenMileAndKilometers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double resultMile, resultKilometer;

        System.out.println("Miles   Kilometers  |   Kilometers     Miles");
        System.out.println("------------------------------------------------");

        for (double mile = 1, kilometer = 20; mile <= 10; mile++, kilometer = kilometer + 5) {
            resultKilometer = (double) mileToKilometer(mile);
            resultMile = (double) kilometerToMile(kilometer);

            System.out.printf("%.0f      %.3f   |   %.0f     %.3f \n", mile, resultKilometer, kilometer, resultMile);
        }
    }

    public static double mileToKilometer(double mile) {
        return (1.609 * mile);
    }

    public static double kilometerToMile(double kilometer) {
        return (kilometer / 1.609);
    }
}
