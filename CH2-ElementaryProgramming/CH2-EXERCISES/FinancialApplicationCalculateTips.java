/*
* Write a program that reads the subtotal and the gratuity rate and then computes the gratuity and total.
* For example, if the user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2 as gratuity and $11.2 as total.
*/
import java.util.Scanner;

public class FinancialApplicationCalculateTips{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate:");
        double subtotal = input.nextDouble();
        int percentage = input.nextInt();
        double gratuity = percentage / 100.0;
        double dollarGratuity = subtotal * gratuity;
        double total = subtotal + dollarGratuity;

        System.out.println("The gratuity is $" + dollarGratuity + " and total is $" + total);
        input.close();
    }
}