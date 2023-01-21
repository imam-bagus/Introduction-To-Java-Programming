/*

Write a program that prompts the user to enter the year and the first three letters of a month name (with the first letter in uppercase) and displays the number of days in the month. If the input for month is incorrect, display a incorrect message
 */

import java.util.Scanner;

public class DaysOfMonth {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String month;
    int year;
    int days;

    System.out.print("Enter a year :");
    year = input.nextInt();
    input.nextLine();
    System.out.print("Enter a month :");
    month = input.nextLine();

    if (month.equals("Jan")) {
      days = 31;
      System.out.print(month + " " + year + " has " + days + " days");
    } else if (month.equals("Feb")) {
      days = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
      System.out.print(month + " " + year + " has " + days + " days");
    } else if (month.equals("Mar")) {
      days = 31;
      System.out.print(month + " " + year + " has " + days + " days");
    } else if (month.equals("Apr")) {
      days = 30;
      System.out.print(month + " " + year + " has " + days + " days");
    } else if (month.equals("May")) {
      days = 31;
      System.out.print(month + " " + year + " has " + days + " days");
    } else if (month.equals("Jun")) {
      days = 30;
      System.out.print(month + " " + year + " has " + days + " days");
    } else if (month.equals("Jul")) {
      days = 31;
      System.out.print(month + " " + year + " has " + days + " days");
    } else if (month.equals("Aug")) {
      days = 31;
      System.out.print(month + " " + year + " has " + days + " days");
    } else if (month.equals("Sep")) {
      days = 30;
      System.out.print(month + " " + year + " has " + days + " days");
    } else if (month.equals("Oct")) {
      days = 31;
      System.out.print(month + " " + year + " has " + days + " days");
    } else if (month.equals("Nov")) {
      days = 30;
      System.out.print(month + " " + year + " has " + days + " days");
    } else if (month.equals("Des")) {
      days = 31;
      System.out.print(month + " " + year + " has " + days + " days");
    } else {
      System.out.print(month + " is not correct month name");
    }
  }
}
