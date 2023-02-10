/*
Write the following method that returns true if the list is already sorted in decreasing order.

public static boolean isSorted(int[] list)

Write a test program that prompts the user to enter a list and displays whether the list is sorted or not. Note that the first number in the input indicates the number of the elements in the list. This number is not part of the list.
 */

import java.util.Scanner;

public class IsSortedDesc {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter list :");
    int[] list = new int[input.nextInt()];

    for (int i = 0; i < list.length; i++) {
      list[i] = input.nextInt();
    }

    if (isSorted(list)) {
      System.out.print("The list is already sorted");
    } else {
      System.out.print("The list is not sorted");
    }
  }

  public static boolean isSorted(int[] list) {
    boolean result = true;

    for (int i = 0; i < list.length; i++) {
      for (int j = i + 1; j < list.length; j++) {
        if (list[i] < list[j]) {
          result = false;
        }
      }
    }

    return result;
  }
}
