/**
 * Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and remaining days for the minutes. For simplicity, assume that a year has 365 days.
 */

import java.util.Scanner;

public class FindTheNumbersOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long totalMinutesOneYear;
        long totalMinutesOneDay;
        long minutes;
        long years;
        long days;

        System.out.print("Enter the number of minutes:");
        minutes = input.nextLong();
        totalMinutesOneDay = 60 * 24;
        totalMinutesOneYear = totalMinutesOneDay * 365;

        years = minutes / totalMinutesOneYear;
        days = (minutes % totalMinutesOneYear) / totalMinutesOneDay;

        System.out.print(minutes + " minutes is approximately " + years + " Years and " + days + " Days");

    }
}