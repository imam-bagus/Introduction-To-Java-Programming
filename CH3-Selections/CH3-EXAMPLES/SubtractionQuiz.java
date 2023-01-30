import java.util.Scanner;

public class SubtractionQuiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int temp;
        int answer;

        number1 = (int) (Math.random() * 10);
        number2 = (int) (Math.random() * 10);

        if (number1 < number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("What is " + number1 + " - " + number2 + "? ");
        answer = input.nextInt();

        if (number1 - number2 == answer) {
            System.out.print("You are correct");
        } else {
            System.out.print("your answer is wrong");
        }
    }
}
