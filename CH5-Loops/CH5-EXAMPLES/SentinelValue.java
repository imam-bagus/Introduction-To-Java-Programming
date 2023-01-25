import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data, sum = 0;

        System.out.print("Enter an integer (or 0 for stop) :");
        data = input.nextInt();

        while (data != 0) {
            sum += data;

            System.out.print("Enter an integer (or 0 for stop) :");
            data = input.nextInt();
        }

        System.out.println("the sum is " + sum);

    }
}
