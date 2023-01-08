package org.NBI.IntoductionToJavaProgramming;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number 1:");
        double number1 = input.nextDouble();
        System.out.print("Enter a number 2:");
        double number2 = input.nextDouble();
        System.out.print("Enter a number 3:");
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;
        System.out.println("Average : " + average);
    }
}