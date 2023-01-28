/*
Write a program that prompts the user to enter a string and displays the characters at even positions
 */

import java.util.Scanner;

public class ProcessString {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str, newStr = "";

    System.out.print("Enter string:");
    str = input.nextLine();

    for (int i = 0; i < str.length(); i++) {
      if ((i + 1) % 2 == 0) {
        newStr += str.charAt(i);
      }
    }

    System.out.print(newStr);
  }
}
