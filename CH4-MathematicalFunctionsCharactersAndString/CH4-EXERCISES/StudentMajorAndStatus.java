/*
Write a program that prompts the user to enter two characters and displays the major and status represented in the characters. The first character indicates the major and the second is number character 1, 2, 3, 4, which indicates whether a student is a freshman, sophomore, junior, or senior. Suppose the following characters are used to denote the majors

I: Information Management
C: Computer Science
A: Accounting
*/

import java.util.Scanner;

public class StudentMajorAndStatus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String majorAndStatus, major, status;
        char digit1, digit2;

        System.out.print("Enter two character:");
        majorAndStatus = input.nextLine();
        digit1 = majorAndStatus.charAt(0);
        digit2 = majorAndStatus.charAt(1);

        switch (digit1) {
            case 'I':
                major = "Information Management";
                break;
            case 'C':
                major = "Computer Science";
                break;
            case 'A':
                major = "Accounting";
                break;
            default:
                major = "invalid";
        }

        switch (digit2) {
            case '1':
                status = "freshman";
                break;
            case '2':
                status = "sophomore";
                break;
            case '3':
                status = "junior";
                break;
            case '4':
                status = "senior";
                break;
            default:
                status = "invalid";
        }

        if (major.equals("invalid") || status.equals("invalid")) {
            System.out.print("Invalid input");
        } else {
            System.out.print(major + " " + status);
        }
    }
}
