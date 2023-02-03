/*
The problem is to read 100 numbers, get the average of these numbers, and find the number of the items greater than the average. To be flexible for handling any number of inputs, we will let the user enter the number of inputs, rather than fixing it to 100
 */

import java.util.Scanner;

public class AnalyzeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfInputs = 0, sum = 0, count = 0;
        double average;

        System.out.print("Enter number of inputs :");
        numberOfInputs = input.nextInt();

        int[] number = new int[numberOfInputs];

        for (int i = 0; i < numberOfInputs; i++) {
            System.out.print("Enter number " + (i + 1) + " :");
            number[i] = input.nextInt();
            sum += number[i];
        }

        average = sum / numberOfInputs;

        for (int i = 0; i < numberOfInputs; i++) {
            if (number[i] > average) {
                count++;
            }
        }

        System.out.println("Average :" + average);
        System.out.println("Number of the items higher than average :" + count);
    }
}