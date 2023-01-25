import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data;
        int sum = 0;

        do {
            System.out.print("Enter an integer (or 0 for stop) :");
            data = input.nextInt();

            sum += data;

        } while (data != 0);

        System.out.println("Sum is :" + sum);

    }
}
