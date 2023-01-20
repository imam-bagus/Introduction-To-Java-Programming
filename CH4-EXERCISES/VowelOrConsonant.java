/*
Write a program that prompts the user to enter a letter and check whether the letter is a vowel or consonant. For a nonletter input, display invalid input
*/

import java.util.Scanner;

public class VowelOrConsonant {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String l;
    char letter;

    System.out.print("Enter a Letter :");
    l = input.nextLine();
    letter = l.charAt(0);

    if (Character.isLetter(letter)) {
      switch (letter) {
        case 'A':
          System.out.print(letter + " is a vowel");
          break;
        case 'I':
          System.out.print(letter + " is a vowel");
          break;
        case 'U':
          System.out.print(letter + " is a vowel");
          break;
        case 'E':
          System.out.print(letter + " is a vowel");
          break;
        case 'O':
          System.out.print(letter + " is a vowel");
          break;
        case 'a':
          System.out.print(letter + " is a vowel");
          break;
        case 'i':
          System.out.print(letter + " is a vowel");
          break;
        case 'u':
          System.out.print(letter + " is a vowel");
          break;
        case 'e':
          System.out.print(letter + " is a vowel");
          break;
        case 'o':
          System.out.print(letter + " is a vowel");
          break;
        default:
          System.out.print(letter + " is a consonant");
      }
    } else {
      System.out.print(letter + " is an invalid input");
    }
  }
}
