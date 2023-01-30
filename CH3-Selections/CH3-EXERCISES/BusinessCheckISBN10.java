/*

An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, which is calculated from the other 9 digits using the following formula:

(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11

If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros). Your program should read the input as an integer
 */

import java.util.Scanner;

public class BusinessCheckISBN10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit1, digit2, digit3, digit4, digit5, digit6, digit7, digit8, digit9, remainingDigit, ISBN;
        long digit10;

        System.out.print("Enter the first 9 digits of an ISBN as integer:");
        ISBN = input.nextInt();

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

        digit10 =
                (
                        (digit1 * 1) +
                                (digit2 * 2) +
                                (digit3 * 3) +
                                (digit4 * 4) +
                                (digit5 * 5) +
                                (digit6 * 6) +
                                (digit7 * 7) +
                                (digit8 * 8) +
                                (digit9 * 9)
                ) %
                        11;

        System.out.print("The ISBN-10 number is " + digit1 + ISBN);
        if (digit10 == 10) {
            System.out.print("X");
        } else {
            System.out.print(digit10);
        }
    }
}
