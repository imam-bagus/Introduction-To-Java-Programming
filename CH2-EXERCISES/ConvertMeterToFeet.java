/**
Write a program that reads a number in meters, converts it to feet, and displays the result. One meter is 3.2786 feet.
*/

import java.util.Scanner;

public class ConvertMeterToFeet{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter meter :");
        double meter = input.nextDouble();
        
        double feet = meter * 3.2786;
        
        System.out.println(meter + " Meters is " + feet + " feet");
        input.close();
    }
}