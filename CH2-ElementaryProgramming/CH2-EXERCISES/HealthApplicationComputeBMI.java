/*
Body Mass Index (BMI) is a measure of health on weight. 
It can be calculated by taking your weight in kilograms and dividing, by the square of your height in meters. 
Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
Note one pound is 0.45359237 kilograms and one inch is 0.0254 meters
*/

import java.util.Scanner;

public class HealthApplicationComputeBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heightInches;
        double weightPounds;
        double BMI;

        System.out.print("Enter weight in pounds: ");
        weightPounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        heightInches = input.nextDouble();

        BMI = weightPounds * 0.45359237 / (heightInches * 0.0254 * heightInches * 0.0254);

        System.out.print("BMI is " + BMI);
    }
}