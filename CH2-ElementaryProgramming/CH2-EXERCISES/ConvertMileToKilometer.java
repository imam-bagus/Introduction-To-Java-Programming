/*
 * Write a program that reads a mile in a double value from the console, converts it to kilometers, and displays the result.
 * The formula for the conversion is as follows:
 * 1 mile = 1.6 kilometers
 */

import java.util.Scanner;

public class ConvertMileToKilometer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter mile :");
        double mile = input.nextDouble();

        double kilometer = mile * 1.6;

        System.out.println((int) mile + " is " + (int) (kilometer * 100) / 100.0 + " Kilometer");

        input.close();
    }
}