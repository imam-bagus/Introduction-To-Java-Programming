/*
Write the following method that returns the location of the smallest element in a two-dimensional array.

public static int[] locateSmallest(double[][] a)

The return value is a one-dimensional array that contains two elements. These two elements indicate the row and column indices of the smallest element in the two-dimensional array. Write a test program that prompts the user to enter a two dimensional array and displays the location of the smallest element in the array.
 */

import java.util.Scanner;

public class LocateTheSmallestElement {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[][] number = new double[5][5];

    System.out.print("Enter two dimensional array :");
    for (int i = 0; i < number.length; i++) {
      for (int j = 0; j < number[i].length; j++) {
        number[i][j] = input.nextDouble();
      }
    }

    int[] location = locateSmallest(number);

    System.out.println(
      "The location of the smallest element is at (" +
      location[0] +
      "," +
      location[1] +
      ")"
    );
  }

  public static int[] locateSmallest(double[][] a) {
    double largestVal = a[0][0];
    int[] result = { 0, 0 };
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] > largestVal) {
          largestVal = a[i][j];
          result[0] = i;
          result[1] = j;
        }
      }
    }

    return result;
  }
}
