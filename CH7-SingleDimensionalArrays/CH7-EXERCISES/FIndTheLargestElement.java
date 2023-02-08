/*
Write a method that finds the largest element in an array of double values using the following header: 

public static double max(double[] array)

Write a test program that prompts the user to enter ten numbers, invokes this method to return the maximum value,
 */

import java.util.Scanner;

public class FindTHeLargestElement {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] list = new double[10];

    System.out.print("Enter 10 double values :");
    for (int i = 0; i < list.length; i++) {
      list[i] = input.nextDouble();
    }

    System.out.print("Largest element: " + max(list));
  }

  public static double max(double[] array) {
    double max = array[0];

    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }

    return max;
  }
}
