/*
Write a program that displays the following table (note that 1 inch is 2.54 centimeters)
 */

import java.util.Scanner;

public class ConversionFromInchToCentimeters {

  public static void main(String[] args) {
    int inch = 1;
    double centimeters;

    System.out.println("Inches \t Centimeters");

    while (inch <= 10) {
      centimeters = 2.54 * inch;
      System.out.printf(inch + " \t %.2f \n", centimeters);
      inch++;
    }
  }
}
