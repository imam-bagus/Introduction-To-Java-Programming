/*
Write a program that receives a character and displays its ASCII code (an integer between 0 and 127).
*/

import java.util.Scanner;

public class FindCharacterOfAnASCIICode {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c;
        char userCharacter;
        int CodeASCII;

        System.out.print("Enter a character:");
        c = input.nextLine();
        userCharacter = c.charAt(0);

        CodeASCII = (int) userCharacter;

        System.out.println(
                "The ASCII code for character " + userCharacter + " is " + CodeASCII);
    }
}
