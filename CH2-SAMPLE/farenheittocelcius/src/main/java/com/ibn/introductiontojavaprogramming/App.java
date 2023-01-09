package com.ibn.introductiontojavaprogramming;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a farenheit :");
        double farenheit = input.nextDouble();

        double celcius = (5.0 / 9) * (farenheit - 32);

        System.out.println("Farenheit " + farenheit + " is " + celcius + " Celcius");

        input.close();
    }
}
