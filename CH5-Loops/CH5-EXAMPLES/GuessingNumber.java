
/*
The problem is to guess what number a computer has in mind. You will write a program that randomly generates an integer between 0 and 100, inclusive. The program prompts the user to enter a number continuously until the number matches the randomly generated number. For each user input, the program tells the user whether the input is too low or too high, so the user can make the next guess intelligently
 */
import java.util.Scanner;

public class GuessingNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, guess = -1;

        number = (int) (Math.random() * 101);

        System.out.println("Guess magic number between 0 and 100");

        while (guess != number) {
            System.out.print("Enter your guess:");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Yes,The number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is to high");
            } else {
                System.out.println("Your guess is to low");
            }
        }

    }

}
