/*
If you know the balance and the annual percentage interest rate, you can compute the interest on the next monthly payment using the following formula:

interest = balance * (annualInterestRate/1200)

Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next month.
*/

import java.util.Scanner;

public class FinancialApplicationCalculateInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float balance;
        float annualInterestRate;
        float interest;

        System.out.print("Enter balance and interest rate (e.g., 3 for 3% :");
        balance = input.nextFloat();
        annualInterestRate = input.nextFloat();

        interest = balance * (annualInterestRate / 1200);

        System.out.print("The interest is " + interest);
    }
}