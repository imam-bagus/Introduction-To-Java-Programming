/**
 * Write a program that reads in the length of sides of an equilateral triangle and computes the area and volume using the following formulas:
 * area = √3 / 4 * length of sides ^ 2
 * volume = area * length
 */

import java.util.Scanner;

public class ComputeTheVolumeOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the sides and height of the equilateral triangle:");
        double lengthSide = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * Math.pow(lengthSide, 2);
        double volume = area * lengthSide;

        System.out.println("The area is " + (int) (area * 100) / 100.0);
        System.out.println("The volume of the triangle prism is " + (int) (volume * 100) / 100.0);

        input.close();
    }
}