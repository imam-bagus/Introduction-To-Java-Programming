/*
Write a program that prompts the user to enter a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2, 1, or 0. For other input, display invalid grade.
*/

import java.util.Scanner;

public class ConvertLetterGradeToNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String l;
        char grade;

        System.out.print("Enter a letter grade :");
        l = input.nextLine();
        grade = l.charAt(0);

        switch (grade) {
            case 'A':
                System.out.print("The numeric value for grade " + grade + " is " + 4);
                break;
            case 'B':
                System.out.print("The numeric value for grade " + grade + " is " + 3);
                break;
            case 'C':
                System.out.print("The numeric value for grade " + grade + " is " + 2);
                break;
            case 'D':
                System.out.print("The numeric value for grade " + grade + " is " + 1);
                break;
            case 'F':
                System.out.print("The numeric value for grade " + grade + " is " + 0);
                break;
            default:
                System.out.print(grade + " is an invalid grade");
        }
    }
}
