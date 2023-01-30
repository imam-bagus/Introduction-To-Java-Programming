/*
Write a program that displays the following two tables side by side
Celsius Fahrenheit | Fahrenheit Celsius
  0      32.000    |   20       −6.667
  2      35.600    |   25       −3.889
  ...
  98    208.400    |  265       129.444
  100   212.000    |  270       132.222

*/

public class ConversionFromCelciusToFarenheitAndFarenheitToCelcius {

    public static void main(String[] args) {
        int celcius1 = 0, farenheit1 = 20;
        double farenheit2, celcius2;

        System.out.println("Celcius Farenheit | Farenheit Celcius");

        while (celcius1 <= 100) {

            farenheit2 = celcius1 * 9 / 5 + 32;
            celcius2 = (farenheit1 - 32) / 1.8000;
            System.out.printf("%d \t %.3f   | %d \t      %.3f \n", celcius1, farenheit2, farenheit1, celcius2);
            celcius1 = celcius1 + 2;
            farenheit1 = farenheit1 + 5;
        }

    }
}
