import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount : ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;

        System.out.print("Sales Tax : $" + (int) tax);

        input.close();
    }
}