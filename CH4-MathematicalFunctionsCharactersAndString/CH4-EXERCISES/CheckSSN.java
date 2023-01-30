/*
Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD, where D is a digit. Your program should check whether the input is valid
*/

import java.util.Scanner;

public class CheckSSN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String SSN;
        char d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11;

        System.out.print("Enter a SSN:");
        SSN = input.nextLine();

        if (SSN.length() == 11) {
            d1 = SSN.charAt(0);
            d2 = SSN.charAt(1);
            d3 = SSN.charAt(2);
            d4 = SSN.charAt(3);
            d5 = SSN.charAt(4);
            d6 = SSN.charAt(5);
            d7 = SSN.charAt(6);
            d8 = SSN.charAt(7);
            d9 = SSN.charAt(8);
            d10 = SSN.charAt(9);
            d11 = SSN.charAt(10);

            if (Character.isDigit(d1) &&
                    Character.isDigit(d2) &&
                    Character.isDigit(d3) &&
                    d4 == '-' &&
                    Character.isDigit(d5) &&
                    Character.isDigit(d6) &&
                    d7 == '-' &&
                    Character.isDigit(d8) &&
                    Character.isDigit(d9) &&
                    Character.isDigit(d10) &&
                    Character.isDigit(d11)) {
                System.out.print(SSN + " is a valid social security number");
            } else {
                System.out.print(SSN + " is an invalid social security number");
            }
        } else {
            System.out.print(SSN + " is an invalid social security number");
        }
    }
}
