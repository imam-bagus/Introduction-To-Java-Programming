/**
 * Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 * Write a program that displays the average speed in miles per hour.
 * (Note that 1 mile is 1.6 kilometers.)
 */

public class AverageSpeedInMiles {
    public static void main(String[] args) {

        double kilometers = 14.0;
        double miles = kilometers / 1.6;

        double rate = (45.5 * 60.0 + 30.0) / (60.0 * 60.0);
        double milesPerHour = miles / rate;

        System.out.println(milesPerHour);
    }
}