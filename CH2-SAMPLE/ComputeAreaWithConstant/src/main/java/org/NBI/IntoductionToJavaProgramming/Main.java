package org.NBI.IntoductionToJavaProgramming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;
        double area;
        double radius;

        System.out.print("Enter a radius :");
        radius = input.nextDouble();

        area = (radius * radius) * PI;

        System.out.println("Area : " + area);
        input.close();
    }
}