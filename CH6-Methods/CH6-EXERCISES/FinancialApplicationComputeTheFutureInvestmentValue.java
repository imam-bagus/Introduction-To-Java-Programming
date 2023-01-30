/*
Write a method that computes future investment value at a given interest rate for a specified number of years
The future investment is determined using the formula:
futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate) numberOfYears*12

Use the following method header:

public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,int years)

For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.

Write a test program that prompts the user to enter the investment amount (e.g., 1,000) and the interest rate (e.g., 9%) and prints a table that displays future value for the years from 1 to 30
*/

import java.util.Scanner;

public class FinancialApplicationComputeTheFutureInvestmentValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount;
        double interestRate;
        double futureValue;

        System.out.print("Enter the amount invested :");
        amount = input.nextDouble();

        System.out.print("Annual interest rate :");
        interestRate = input.nextDouble();

        interestRate = interestRate / 100;

        System.out.println("Years \t Future value");
        for (int year = 1; year <= 30; year++) {
            futureValue = futureInvestmentValue(amount, interestRate / 12, year);
            System.out.printf("%d \t %.2f \n", year, futureValue);
        }
    }

    public static double futureInvestmentValue(
            double investmentAmount,
            double monthlyInterestRate,
            int years
    ) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
