/*
Write a program that prompts the user to enter a three-digit integer and determines whether it is a palindrome integer. An integer is palindrome if it reads the same from right to left and from left to right. A negative integer is treated the same as a positive integer
 */

import java.util.Scanner;

public class PalindromeProblem {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number;
    int remainingDigit;
    int digit1;
    int digit2;
    int digit3;

    System.out.print("Enter a three-digit integer:");
    number = input.nextInt();

    digit1 = number / 100;
    remainingDigit = number % 100;

    digit2 = remainingDigit / 10;
    remainingDigit = remainingDigit % 10;

    digit3 = remainingDigit / 1;

    if (digit1 == digit3) {
      System.out.print(number + " is a palindrome");
    } else {
      System.out.print(number + " is not a palindrome");
    }
  }
}
