/*
Read the input as a string such as "11.56". Your program should extract the dollar amount before the decimal point, and the cents after the decimal amount using the indexOf and substring methods.
 */

import java.util.Scanner;

public class FinancialApplicationMonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String money, dollar, cents;
        int decimalPoint;

        System.out.print("Enter money: $");
        money = input.nextLine();

        decimalPoint = money.indexOf(".");
        dollar = money.substring(0, decimalPoint);
        cents = money.substring(decimalPoint + 1);

        System.out.print("Money consist of " + dollar + " dollar and " + cents + " cents");

    }

}
