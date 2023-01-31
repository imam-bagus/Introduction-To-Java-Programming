/*
Write a method that returns the number of days in a year using the following header:

 public static int numberOfDaysInAYear(int year)

 Write a test program that displays the number of days in the years between 2014 and 2034
 */

import java.util.Scanner;

public class NumberOfDaysInAYears {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int totalDays = 0, minYear, maxYear;

    System.out.print("Enter min year :");
    minYear = input.nextInt();

    System.out.print("Enter max year :");
    maxYear = input.nextInt();

    for (int i = minYear; i <= maxYear; i++) {
      totalDays += numberOfDaysInAYear(i);
    }

    System.out.println("Total Days between " + minYear + " and " + maxYear + " is " + totalDays);

  }

  public static int numberOfDaysInAYear(int year) {
    int totalMonth = 0, days = 0;

    for (int i = 1; i <= 12; i++) {
      switch (i) {
        case 1:
          days = 31;
          break;
        case 2:
          days = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
          break;
        case 3:
          days = 31;
          break;
        case 4:
          days = 30;
          break;
        case 5:
          days = 31;
          break;
        case 6:
          days = 30;
          break;
        case 7:
          days = 31;
          break;
        case 8:
          days = 31;
          break;
        case 9:
          days = 30;
          break;
        case 10:
          days = 31;
          break;
        case 11:
          days = 30;
          break;
        case 12:
          days = 31;
          break;
      }

      totalMonth += days;
    }

    return totalMonth;
  }
}