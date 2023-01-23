
/*
Rewrite Exercise CH3 by entering the ISBN number as a string.
 */
import java.util.Scanner;

public class BusinessCheckISBN10 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String ISBNInput;
    int digit1, digit2, digit3, digit4, digit5, digit6, digit7, digit8, digit9, remainingDigit, ISBN;
    long digit10;

    System.out.print("Enter the first 9 digits of an ISBN as string:");
    ISBNInput = input.nextLine();

    ISBN = Integer.parseInt(ISBNInput);

    digit1 = 0;

    digit2 = ISBN / 10000000;
    remainingDigit = ISBN % 10000000;

    digit3 = remainingDigit / 1000000;
    remainingDigit = remainingDigit % 1000000;

    digit4 = remainingDigit / 100000;
    remainingDigit = remainingDigit % 100000;

    digit5 = remainingDigit / 10000;
    remainingDigit = remainingDigit % 10000;

    digit6 = remainingDigit / 1000;
    remainingDigit = remainingDigit % 1000;

    digit7 = remainingDigit / 100;
    remainingDigit = remainingDigit % 100;

    digit8 = remainingDigit / 10;
    remainingDigit = remainingDigit % 10;

    digit9 = remainingDigit;

    digit10 = ((digit1 * 1) +
        (digit2 * 2) +
        (digit3 * 3) +
        (digit4 * 4) +
        (digit5 * 5) +
        (digit6 * 6) +
        (digit7 * 7) +
        (digit8 * 8) +
        (digit9 * 9)) %
        11;

    System.out.print("The ISBN-10 number is " + digit1 + ISBN);
    if (digit10 == 10) {
      System.out.print("X");
    } else {
      System.out.print(digit10);
    }
  }
}
