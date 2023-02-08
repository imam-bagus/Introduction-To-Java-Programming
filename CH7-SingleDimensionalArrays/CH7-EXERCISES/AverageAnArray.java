/*
Write two overloaded methods that return the average of an array with the following headers:

public static int average(int[] array)
public static double average(double[] array)

Write a test program that prompts the user to enter 10 double values, invokes this method, then displays the average value.
 */

import java.util.Scanner;

public class AverageAnArray {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] numbers = new double[10];

    System.out.print("Enter 10 double values: ");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextInt();
    }

    System.out.print("Average :" + average(numbers));
  }

  public static int average(int[] average) {
    int result = 0;

    for (int i = 0; i < average.length; i++) {
      result += average[i];
    }

    result = result / average.length;

    return result;
  }

  public static double average(double[] average) {
    double result = 0;

    for (int i = 0; i < average.length; i++) {
      result += average[i];
    }

    result = result / average.length;

    return result;
  }
}
