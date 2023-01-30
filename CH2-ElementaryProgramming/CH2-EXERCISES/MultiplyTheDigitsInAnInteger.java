/**
 * Write a program that reads an integer between 0 and 1000 and multiplies all the digits in the integer. For example, if an integer is 932, the multiplication of all its digits is 54. Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93
 */

import java.util.Scanner;

public class MultiplyTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000 :");
        int number = input.nextInt();
        int number2 = number;
        int t1 = 1 + (number - 100) / 100;
        int t2 = (1 + (number - 10) / 10) % 10;
        int t3 = number % 10;

        int result = t1 * t2 * t3;

        System.out.print("The multiplication of all digits in " + number2 + " is " + result);

        input.close();
    }
}