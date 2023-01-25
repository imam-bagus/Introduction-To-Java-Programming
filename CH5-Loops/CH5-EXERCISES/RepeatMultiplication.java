/*
CH5-EXAMPLES, SubtractionQuizLoop.java, generates five random subtraction questions. Revise the program to generate ten random multiplication questions for two integers between 1 and 12. Display the correct count and test time
*/

import java.util.Scanner;

public class RepeatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, answer, correctCount = 0, count = 0;
        long start, end, total;

        start = System.currentTimeMillis();

        while (count < 10) {

            number1 = 1 + (int) (Math.random() * 12);
            number2 = 1 + (int) (Math.random() * 12);

            System.out.print("What is " + number1 + " x " + number2 + ":");
            answer = input.nextInt();

            if (number1 * number2 == answer) {
                System.out.println("Your answer is correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong!");
            }
            count++;
        }

        end = System.currentTimeMillis();

        total = (end - start) / 1000;

        System.out.print("Total correct is " + correctCount + " and completed in " + total + " seconds");

    }
}
