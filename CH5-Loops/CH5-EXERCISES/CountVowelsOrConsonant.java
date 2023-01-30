/*
Assume that the letters A, E, I, O, and U are vowels. Write a program that prompts the user to enter a string, and displays the number of vowels and consonants in the string
 */

import java.util.Scanner;

public class CountVowelsOrConsonant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str;
        int length = 0, vowelsCount = 0, consonantCount = 0;

        System.out.print("Enter String:");
        str = input.nextLine();

        length = str.length();

        str = str.toUpperCase();

        for (int i = 0; i < length; i++) {
            switch (str.charAt(i)) {
                case 'A':
                case 'I':
                case 'U':
                case 'E':
                case 'O':
                    vowelsCount++;
                    break;
                case ' ':
                    break;
                default:
                    consonantCount++;
            }
        }

        System.out.println("The number of vowels is " + vowelsCount);
        System.out.println("The number of consonants is " + consonantCount);
    }
}
