package org.NBI.IntroductionToJavaProgramming;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer for seconds :");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + minutes + " Minutes and " + remainingSeconds + " seconds");
    }
}