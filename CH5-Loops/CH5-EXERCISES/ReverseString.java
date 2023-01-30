/*
Write a program that prompts the user to enter a string and displays the string in reverse order.
 */

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str, revStr = "";

        System.out.print("Enter string:");
        str = input.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }

        System.out.print("Reverse String : " + revStr);
    }
}
