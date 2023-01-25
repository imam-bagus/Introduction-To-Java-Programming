/*
program that generates five questions and, after a student answers all five, reports the number of correct answers. The program also displays the time spent on the test and lists all the questions.
 */

import java.util.Scanner;

public class SubstractionQuizLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX_QUESTION = 5;
        int correctCount = 0;
        int count = 0;
        long startTime, endTime, testTime;
        int number1, number2, answer, temp;

        startTime = System.currentTimeMillis();

        while (count < MAX_QUESTION) {
            number1 = 1 + (int) (Math.random() * 11);
            number2 = 1 + (int) (Math.random() * 11);

            if (number1 < number2) {
                temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.print("What is " + number1 + " - " + number2 + "?");
            answer = input.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("Your answer is correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong!");
            }

            count++;
        }

        endTime = System.currentTimeMillis();
        testTime = (endTime - startTime) / 1000;

        System.out.print("Your correct answer is " + correctCount + " and tes time is " + testTime + " seconds");

    }
}
