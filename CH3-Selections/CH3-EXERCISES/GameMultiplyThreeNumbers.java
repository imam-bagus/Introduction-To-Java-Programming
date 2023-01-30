/*
The program in Example CH-3, AdditionQuiz.java, generates two integers and prompts the user to enter the product of these two integers. Revise the program to generate three single-digit integers and prompt the user to enter the multiplication of these three integers
 */

import java.util.Scanner;

public class GameMultiplyThreeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);

        System.out.print(
                "What is " + number1 + " x " + number2 + " x " + number3 + "? "
        );
        int answer = input.nextInt();

        System.out.print(
                number1 +
                        " x " +
                        number2 +
                        " x " +
                        number3 +
                        " = " +
                        answer +
                        " is " +
                        (answer == (number1 * number2 * number3))
        );
    }
}
