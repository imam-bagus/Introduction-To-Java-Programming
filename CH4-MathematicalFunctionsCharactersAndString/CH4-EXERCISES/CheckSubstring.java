/*
Write a program that prompts the user to enter two strings, and reports whether the second string is a substring of the first string.
*/

import java.util.Scanner;

public class CheckSubstring {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstString, secondString;

        System.out.print("Enter a first string:");
        firstString = input.nextLine();
        System.out.print("Enter a second string:");
        secondString = input.nextLine();

        if (firstString.contains(secondString)) {
            System.out.print(secondString + " is a substring of " + firstString);
        } else {
            System.out.print(secondString + " is not a substring of " + firstString);
        }
    }
}
