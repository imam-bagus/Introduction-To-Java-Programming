import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, guessAnswer;

        number1 = (int) (Math.random() * 100);
        number2 = (int) (Math.random() * 100);

        System.out.print("What is " + number1 + " + " + number2 + "?");
        guessAnswer = input.nextInt();

        while (number1 + number2 != guessAnswer) {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "?");
            guessAnswer = input.nextInt();
        }

        System.out.print("You got it!");
    }
}
