/*
Write a program that displays the following table (note that farenheit = celsius * 9/5 + 32):
*/

import java.util.Scanner;

public class ConvensionFromCelciusToFarenheit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int celcius = 0;
        float farenheit;

        System.out.printf("Celcius \t Farenheit \n");
        while (celcius <= 100) {
            farenheit = celcius * 9 / 5 + 32;
            System.out.printf(celcius + "\t \t %.1f\n", farenheit);
            celcius = celcius + 2;
        }
    }
}
