/*
Write a method with the following header to display three numbers in decreasing order:

public static void displaySortedNumbers(double num1, double num2, double num3)

Write a test program that prompts the user to enter three numbers and invokes the method to display them in decreasing order.
 */

import java.util.Scanner;

public class SortThreeNumbers {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double num1, num2, num3;

    System.out.print("Enter number 1:");
    num1 = input.nextDouble();

    System.out.print("Enter number 2:");
    num2 = input.nextDouble();

    System.out.print("Enter number 3:");
    num3 = input.nextDouble();

    displaySortedNumbers(num1, num2, num3);
  }

  public static void displaySortedNumbers(
    double num1,
    double num2,
    double num3
  ) {
    double temp = 0;
    if (num1 < num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num1 < num3) {
      temp = num1;
      num1 = num3;
      num3 = temp;
    }
    if (num2 < num3) {
      temp = num2;
      num2 = num3;
      num3 = temp;
    }

    System.out.println("Decreasing sort :");
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
  }
}
