/* 
Write the methods with the following headers:

    public static int reverse(int number)
    public static boolean isPalindrome(int number)

Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
 */

import java.util.Scanner;

public class PalindromeInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter3 digit integer :");
        int num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
    }

    public static int reverse(int number) {
        String reversedNumber = "";

        do {
            reversedNumber += number % 10;
            number = number / 10;
        } while (number != 0);

        return Integer.parseInt(reversedNumber);
    }

    public static boolean isPalindrome(int number) {
        return (number == reverse(number)) ? true : false;
    }
}
