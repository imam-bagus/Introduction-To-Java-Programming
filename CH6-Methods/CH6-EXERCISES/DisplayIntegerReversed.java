/*
Write a method with the following header to display an integer in reverse order:
public static void reverse(int number)

For example, reverse(3456) displays 6543. Write a test program that prompts the user to enter an integer then displays its reversal.
 */

import java.util.Scanner;

public class DisplayIntegerReversed {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Integer:");
    int number = input.nextInt();

    System.out.println("Before:" + number);
    System.out.println("After:" + reverse(number));
  }

  public static int reverse(int num) {
    String result = "";

    do {
      result += num % 10;
      num /= 10;
    } while (num != 0);

    return Integer.parseInt(result);
  }
}
