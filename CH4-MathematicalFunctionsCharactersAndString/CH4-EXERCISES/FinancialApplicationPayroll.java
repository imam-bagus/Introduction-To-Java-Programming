/*
Write a program that reads the following information and prints a payroll statement
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)
 */

import java.util.Scanner;

public class FinancialApplicationPayroll {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        double hoursWorkedAWeek, hourlyPayRate, federalTax, stateTax, grossPay, federalWithholding, stateWithholding,
                totalDeduction, netPay;

        System.out.print("Enter employee's name: ");
        name = input.nextLine();
        System.out.print("Enter numbers of hours worked in a week : ");
        hoursWorkedAWeek = input.nextDouble();
        System.out.print("Enter hourly pay rate : ");
        hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate : ");
        federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate : ");
        stateTax = input.nextDouble();

        grossPay = hourlyPayRate * hoursWorkedAWeek;
        federalWithholding = grossPay * federalTax;
        stateWithholding = grossPay * stateTax;
        totalDeduction = federalWithholding + stateWithholding;
        netPay = grossPay - federalWithholding - stateWithholding;

        System.out.println("Employee name: " + name);
        System.out.println("Hours worked:" + hoursWorkedAWeek);
        System.out.printf("Pay rate: $%.2f\n", hourlyPayRate);
        System.out.printf("Gross pay: $%.2f\n", grossPay);
        System.out.println("Deductions: ");
        System.out.printf(
                "\t Federal Withholding (%.1f%%) : $%.2f \n",
                (federalTax * 100),
                federalWithholding);
        System.out.printf(
                "\t State Withholding (%.1f%%) : $%.2f \n",
                (stateTax * 100),
                stateWithholding);
        System.out.printf("\t Total Deduction: $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f\n", netPay);
    }
}
