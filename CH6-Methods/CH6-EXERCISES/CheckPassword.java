/*
Some websites impose certain rules for passwords. Write a method that checks whether a string is a valid password. Suppose the password  rules are as follows:

- A password must have at least ten characters.
- A password consists of only letters and digits.
- A password must contain at least three digits.

Write a program that prompts the user to enter a password and displays Valid Password if the rules are followed or Invalid Password otherwise.

 */

import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String password;

        System.out.print("Enter password");
        password = input.nextLine();

        if (minPassword(password) && consistsPassword(password) && threeDigitPassword(password)) {
            System.out.println(password + " Valid Password");
        } else {
            System.out.println(password + " Invalid Password");
        }

    }

    public static boolean minPassword(String password) {
        if (password.length() >= 10) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean consistsPassword(String password) {
        boolean result = true;

        for (int i = 0; i < password.length(); i++) {

            if (Character.isLetterOrDigit(password.charAt(i)) == false) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static boolean threeDigitPassword(String password) {
        int count = 0;

        for (int i = 0; i < password.length(); i++) {

            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }

        if (count >= 3) {
            return true;
        } else {
            return false;
        }

    }
}
