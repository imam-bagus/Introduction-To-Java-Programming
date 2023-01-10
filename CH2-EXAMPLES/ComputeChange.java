import java.util.Scanner;

public class ComputeChange{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount : $");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numbersOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " Consist of");
        System.out.println(numberOfOneDollars + " dollars");
        System.out.println(numbersOfQuarters + " quarters");
        System.out.println(numberOfDimes + " dimes");
        System.out.println(numberOfNickels + " nickels");
        System.out.println(numberOfPennies + " pennies");

        input.close();
    }
}