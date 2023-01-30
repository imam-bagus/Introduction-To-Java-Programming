/*
CH3 - EXAMPLES, SubtractionQuiz.java, randomly generates a subtraction question. Revise the program to randomly generate a multiplication
question with two integers less than 1000.
 */

import java.util.Scanner;

public class GameMultiplicationQuiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int temp;
        int answer;

        number1 = (int) (Math.random() * 1000);
        number2 = (int) (Math.random() * 1000);

        if (number1 < number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("What is " + number1 + " x " + number2 + "? ");
        answer = input.nextInt();

        if (number1 * number2 == answer) {
            System.out.print("You are correct");
        } else {
            System.out.print("your answer is wrong");
        }
    }
}
