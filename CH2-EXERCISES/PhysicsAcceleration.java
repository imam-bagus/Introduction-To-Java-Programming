/*
Average acceleration is defined as the change of velocity divided by the time taken to make the change, as given by the following formula:
a = v1 - v0 / t

Write a program that prompts the user to enter the starting velocity v0 in meters/second, the ending velocity v1 in meters/second, and the time span t in seconds, then displays the average acceleration
*/

import java.util.Scanner;

public class PhysicsAcceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double v0, v1, t, a;

        System.out.print("Enter v0, v1, and t:");
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();

        a = (v1 - v0) / t;

        System.out.print("The average acceleration is " + a);
    }
}