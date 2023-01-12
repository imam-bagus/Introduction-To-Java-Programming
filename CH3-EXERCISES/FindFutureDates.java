/*
Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also prompt the user to enter the number of days after today for a future day and display the future day of the week
 */

import java.util.Scanner;

public class FindFutureDates {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int todayDay;
    int dayElapsed;
    String today = "";
    String elapsed = "";

    System.out.print("Enter today's day:");
    todayDay = input.nextInt();
    System.out.print("Enter the number of days elapsed since today:");
    dayElapsed = input.nextInt();

    dayElapsed = (todayDay + dayElapsed) % 2 + 1;

    switch (todayDay) {
      case 0:
        today = "Sunday";
        break;
      case 1:
        today = "Monday";
        break;
      case 2:
        today = "Tuesday";
        break;
      case 3:
        today = "Wednesday";
        break;
      case 4:
        today = "Thursday";
        break;
      case 5:
        today = "Friday";
        break;
      case 6:
        today = "Saturday";
    }

    switch (dayElapsed) {
      case 0:
        elapsed = "Sunday";
        break;
      case 1:
        elapsed = "Monday";
        break;
      case 2:
        elapsed = "Tuesday";
        break;
      case 3:
        elapsed = "Wednesday";
        break;
      case 4:
        elapsed = "Thursday";
        break;
      case 5:
        elapsed = "Friday";
        break;
      case 6:
        elapsed = "Saturday";
    }

    System.out.print("Today is " + today + " and the future day is " + elapsed);
  }
}
