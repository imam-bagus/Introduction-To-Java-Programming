/*
Write a program that prompts the user to enter a hex digit and displays its corresponding binary number. For an incorrect input, display invalid input
 */

import java.util.Scanner;

public class HexToBinary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String h;
        char hex;
        String binary;

        System.out.print("Enter a hex digit:");
        h = input.nextLine();
        hex = h.charAt(0);
        switch (hex) {
            case '0':
                binary = "0000";
                System.out.print("The binary value is " + binary);
                break;
            case '1':
                binary = "0001";
                System.out.print("The binary value is " + binary);
                break;
            case '2':
                binary = "0010";
                System.out.print("The binary value is " + binary);
                break;
            case '3':
                binary = "0011";
                System.out.print("The binary value is " + binary);
                break;
            case '4':
                binary = "0100";
                System.out.print("The binary value is " + binary);
                break;
            case '5':
                binary = "0101";
                System.out.print("The binary value is " + binary);
                break;
            case '6':
                binary = "0110";
                System.out.print("The binary value is " + binary);
                break;
            case '7':
                binary = "0111";
                System.out.print("The binary value is " + binary);
                break;
            case '8':
                binary = "1000";
                System.out.print("The binary value is " + binary);
                break;
            case '9':
                binary = "1001";
                System.out.print("The binary value is " + binary);
                break;
            case 'A':
                binary = "1010";
                System.out.print("The binary value is " + binary);
                break;
            case 'B':
                binary = "1011";
                System.out.print("The binary value is " + binary);
                break;
            case 'C':
                binary = "1100";
                System.out.print("The binary value is " + binary);
                break;
            case 'D':
                binary = "1101";
                System.out.print("The binary value is " + binary);
                break;
            case 'E':
                binary = "1110";
                System.out.print("The binary value is " + binary);
                break;
            case 'F':
                binary = "1111";
                System.out.print("The binary value is " + binary);
                break;
            default:
                System.out.print(hex + " is an invalid input");
                break;
        }
    }
}
