/*
Suppose you save $100 each month in a savings account with annual interest rate 3.75%.
Thus, the monthly interest rate is 0.0375/12 = 0.003125. 
After the first month, the value in the account becomes 100 * (1 + 0.003125) = 100.3125 
After the second month, the value in the account becomes (100 + 100.3125) * (1 + 0.003125) = 200.938
After the third month, the value in the account becomes (100 + 200.938) * (1 + 0.003125) = 301.878 and so on.
Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month.
 */

import java.util.Scanner;

public class FinancialApplicationCompoundValue{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double accountValue;

        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = input.nextDouble();
        
        accountValue = monthlySavingAmount * (1 + 0.003125);
        System.out.println("After the first month, the account value is " + accountValue);
        
        accountValue = (accountValue + monthlySavingAmount) * (1 + 0.003125);
        System.out.println("After the Second month, the account value is " + accountValue);
        
        accountValue = (accountValue + monthlySavingAmount) * (1 + 0.003125);
        System.out.println("After the third month, the account value is " + accountValue);
        
        accountValue = (accountValue + monthlySavingAmount) * (1 + 0.003125);
        System.out.println("After the Four month, the account value is " + accountValue);
        
        accountValue = (accountValue + monthlySavingAmount) * (1 + 0.003125);
        System.out.println("After the Five month, the account value is " + accountValue);
        
        accountValue = (accountValue + monthlySavingAmount) * (1 + 0.003125);
        System.out.println("After the sixth month, the account value is " + accountValue);

    }
}