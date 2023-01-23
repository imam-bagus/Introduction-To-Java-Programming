/*
Write a program that prompts the user to enter the month and year and displays the number of days in the month.
For example, if the user entered month 2 and year 2012, the program should display that February 2012 has 29 days.
If the user entered month 3 and year 2015, the program should display that March 2015 has 31 days.
 */

import java.util.Scanner;

public class FindTheNumberDaysInAMonth {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int month;
    int year;
    int days;

    System.out.print("Enter month and year :");
    month = input.nextInt();
    year = input.nextInt();

    switch (month) {
      case 1:
        days = 31;
        System.out.print("January " + year + " has " + days + " days");
        break;
      case 2:
        days =
          (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
        System.out.print("February " + year + " has " + days + " days");
        break;
      case 3:
        days = 31;
        System.out.print("March " + year + " has " + days + " days");
        break;
      case 4:
        days = 30;
        System.out.print("April " + year + " has " + days + " days");
        break;
      case 5:
        days = 31;
        System.out.print("May " + year + " has " + days + " days");
        break;
      case 6:
        days = 30;
        System.out.print("June " + year + " has " + days + " days");
        break;
      case 7:
        days = 31;
        System.out.print("July " + year + " has " + days + " days");
        break;
      case 8:
        days = 31;
        System.out.print("August " + year + " has " + days + " days");
        break;
      case 9:
        days = 30;
        System.out.print("September " + year + " has " + days + " days");
        break;
      case 10:
        days = 31;
        System.out.print("October " + year + " has " + days + " days");
        break;
      case 11:
        days = 30;
        System.out.print("November " + year + " has " + days + " days");
        break;
      case 12:
        days = 31;
        System.out.print("December " + year + " has " + days + " days");
    }
  }
}
