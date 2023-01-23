/*
Write a program that prompts the user to enter three integers and display the integers in non-decreasing order.
 */

import java.util.Scanner;

public class SortThreeInteger {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int temp;

    System.out.print("Enter 3 integer:");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();

    if (number3 < number2) {
      temp = number3;
      number3 = number2;
      number2 = temp;
    }

    if (number3 < number1) {
      temp = number3;
      number3 = number1;
      number1 = temp;
    }

    if (number2 < number1) {
      temp = number2;
      number2 = number1;
      number1 = temp;
    }

    System.out.print(
      "Sorted integer: " + number1 + "," + number2 + "," + number3
    );
  }
}
