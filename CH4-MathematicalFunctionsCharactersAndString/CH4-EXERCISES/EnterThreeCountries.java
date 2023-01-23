/*
write a program that prompts the user to enter three countries and displays them in descending order
 */

import java.util.Scanner;

public class EnterThreeCountries {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String country1, country2, country3, temp;

    System.out.print("Enter the first country:");
    country1 = input.nextLine();
    System.out.print("Enter the second country:");
    country2 = input.nextLine();
    System.out.print("Enter the third country:");
    country3 = input.nextLine();

    if (country1.compareToIgnoreCase(country2) < 0) {
      temp = country1;
      country1 = country2;
      country2 = temp;
    }

    if (country1.compareToIgnoreCase(country3) < 0) {
      temp = country1;
      country1 = country3;
      country3 = temp;
    }

    if (country2.compareToIgnoreCase(country3) < 0) {
      temp = country2;
      country2 = country3;
      country3 = temp;
    }

    System.out.print(
        "Three countries in descending order are " +
            country1 +
            " " +
            country2 +
            " " +
            country3);
  }
}
