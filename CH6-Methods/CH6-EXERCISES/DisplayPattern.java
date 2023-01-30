/*
Write a method to display a pattern as follows:
1
1 2
1 2 3
...
n n−1 ... 3 2 1

The method header is

public static void displayPattern(int n)
 */

import java.util.Scanner;

public class DisplayPattern {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;

    System.out.print("Enter n :");
    n = input.nextInt();

    displayPattern(n);
  }

  public static void displayPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    for (int i = 1; i <= n; i++) {
      for (int j = n; j >= i; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
