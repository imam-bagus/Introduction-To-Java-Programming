/*
The international standard letter/number mapping found on the telephone

image: old phone keypads

Write a program that prompts the user to enter a lowercase or uppercase letter and displays its corresponding number. For a nonletter input, display invalid input.
 */

import java.util.Scanner;

public class PhoneKeyPads {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String l;
    char letter;
    char letterUpperCase;

    System.out.print("Enter a letter:");
    l = input.nextLine();
    letter = Character.toUpperCase(l.charAt(0));

    if (letter == 'A' || letter == 'B' || letter == 'C') {
      System.out.print("The coressponding number is " + 2);
    } else if (letter == 'D' || letter == 'E' || letter == 'F') {
      System.out.print("The coressponding number is " + 3);
    } else if (letter == 'G' || letter == 'H' || letter == 'I') {
      System.out.print("The coressponding number is " + 4);
    } else if (letter == 'J' || letter == 'K' || letter == 'L') {
      System.out.print("The coressponding number is " + 5);
    } else if (letter == 'M' || letter == 'N' || letter == 'O') {
      System.out.print("The coressponding number is " + 6);
    } else if (
      letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S'
    ) {
      System.out.print("The coressponding number is " + 7);
    } else if (letter == 'T' || letter == 'U' || letter == 'V') {
      System.out.print("The coressponding number is " + 8);
    } else if (
      letter == 'w' || letter == 'X' || letter == 'Y' || letter == 'Z'
    ) {
      System.out.print("The coressponding number is " + 9);
    } else {
      System.out.print(l + " is an invalid input");
    }
  }
}
