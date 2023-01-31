/*
Write a class that contains the following two methods:

public static double poundToKilogram(double pound)

public static double kilogramToPound(double kilogram)

The formula for the conversion is:
pound = 0.453 * kilogram
kilogram = 2.204 * pound

Write a test program that invokes these methods to display the following tables:

Kilograms   Pounds  |   Pounds   Kilograms
1           2.2     |     20       9.09
3           6.6     |     25       11.36
...
197         433.4   |     510      231.82
199         437.8   |     515      234.09

 */

public class ConversionsBetweenPoundsAndKilograms {

    public static void main(String[] args) {
        System.out.println("Kilograms   Pounds  |   Pounds   Kilograms");

        for (
                double kilograms = 1, pounds = 20;
                kilograms <= 199;
                kilograms += 2, pounds += 5
        ) {
            System.out.printf(
                    "%.0f            %.1f    |      %.0f      %.2f \n",
                    kilograms,
                    kilogramToPound(kilograms),
                    pounds,
                    poundToKilogram(pounds)
            );
        }
    }

    public static double poundToKilogram(double pound) {
        return 2.204 * pound;
    }

    public static double kilogramToPound(double kilogram) {
        return 0.453 * kilogram;
    }
}
