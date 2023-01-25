/* 
Write a program that prompts a student to enter a Java score. If the score is greater or equal to 60, display “you pass the exam”; otherwise, display “you don’t pass the exam”. Your program ends with input -1.
 */

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.print("Enter score(or -1 for stop): ");
        score = input.nextInt();

        while (score >= 0) {

            if (score >= 60) {
                System.out.println("You pass the exam");
            } else {
                System.out.println("You don't pass the exam");
            }

            System.out.print("Enter score(or -1 for stop): ");
            score = input.nextInt();
        }

    }
}
