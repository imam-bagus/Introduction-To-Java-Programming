/*
(Business application: checking ISBN) Use loops to simplify CH3-Exercise
 */
import java.util.Scanner;

public class BusinessApplicationCheckISBN {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int digit10, ISBN;

    System.out.print("Enter the first 9 digits of an ISBN:");
    ISBN = input.nextLine();

    for (int i = 0; i < 9; i++) {
      digit10 += Integer.parseInt(ISBN.charAt(i)) * (i + 1);
    }

    digit10 %= 11;

    System.out.print("The ISBN-10 number is " + ISBN);
    if (digit10 == 10) {
      System.out.print("X");
    } else {
      System.out.print(digit10);
    }
  }
}
