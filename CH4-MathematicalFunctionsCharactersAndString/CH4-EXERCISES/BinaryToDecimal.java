/*
Write a program that prompts the user to enter binary digits and displays its corresponding decimal value.
*/

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String binary;
        int decimal = 0;
        char digit1, digit2, digit3, digit4;

        System.out.print("Enter binary digits (0000 to 1111):");
        binary = input.nextLine();

        digit1 = binary.charAt(0);
        digit2 = binary.charAt(1);
        digit3 = binary.charAt(2);
        digit4 = binary.charAt(3);

        if (digit4 == '1') {
            decimal += 1;
        }

        if (digit3 == '1') {
            decimal += 2;
        }

        if (digit2 == '1') {
            decimal += 4;
        }

        if (digit1 == '1') {
            decimal += 8;
        }

        System.out.println("The decimal value is " + decimal);
    }
}
