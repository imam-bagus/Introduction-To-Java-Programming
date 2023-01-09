import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double annualInterestRate;
        double monthlyInterestRate;
        int numberYears;
        double loanAmount;
        double monthlyPayment;
        double totalPayment;

        System.out.print("Enter annual interest rate :");
        annualInterestRate = input.nextDouble();
        System.out.print("Enter number of year :");
        numberYears = input.nextInt();
        System.out.print("Enter loan amount :");
        loanAmount = input.nextDouble();

        monthlyInterestRate = annualInterestRate / 1200;
        monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberYears * 12));
        totalPayment = monthlyPayment * numberYears * 12;

        System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);

        input.close();

    }
}
