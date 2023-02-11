/*
 Write a method that returns the sum of all the elements in a specified row in a matrix using the following header:

public static double sumRow(double[][] m, int rowIndex)

Write a test program that reads a 3-by-4 matrix and displays the sum of each row
 */

import java.util.Scanner;

public class SumElementsRowByRow {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[][] list = new double[3][4];

    System.out.println("Enter a 3-by-4 matrix row by row:");
    for (int i = 0; i < list.length; i++) {
      for (int j = 0; j < list[i].length; j++) {
        list[i][j] = input.nextDouble();
      }
    }

    for (int rowIndex = 0; rowIndex < list.length; rowIndex++) {
      System.out.println(
        "Sum of the elements at row " +
        rowIndex +
        " is " +
        sumRow(list, rowIndex)
      );
    }
  }

  public static double sumRow(double[][] m, int rowIndex) {
    double result = 0;

    for (int i = 0; i < m[rowIndex].length; i++) {
      result += m[rowIndex][i];
    }

    return result;
  }
}
