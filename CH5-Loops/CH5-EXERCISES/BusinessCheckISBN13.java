/*
 ISBN-13 is a new standard for identifying books. It uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum, which is calculated from the other digits using the following formula:

10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12) % 10

If the checksum is 10, replace it with 0. Your program should read the input as a string
 */

import java.util.Scanner;

public class BusinessCheckISBN13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ISBN;
        int length, checksum = 0;

        System.out.print("Enter first 12 digit of an ISBN-13 :");
        ISBN = input.nextLine();

        length = ISBN.length();

        if (ISBN.length() != 12) {
            System.out.println(ISBN + " is an invalid input");
        } else {
            for (int i = 0; i < length; i++) {
                if ((i + 1) % 2 == 0) {
                    checksum += (ISBN.charAt(i) - '0') * 3;
                } else {
                    checksum += (ISBN.charAt(i) - '0') * 1;
                }
            }
            checksum %= 10;
            checksum = 10 - checksum;

            if (checksum == 10) {
                System.out.println("The ISBN-13 number is " + ISBN + "0");
            } else {
                System.out.println("The ISBN-13 number is " + ISBN + checksum);
            }
        }
    }
}
