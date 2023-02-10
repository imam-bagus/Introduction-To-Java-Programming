/*
Modify the bubble sort method, and sort the elements in the array in descending order instead of ascending order. Write a test program that reads 10 double numbers, invokes the method, and displays the sorted numbers in descending order.
 */

import java.util.Scanner;

public class BubbleSortDesc {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] list = { 50, 40, 70, 10, 20, 60, 30, 80, 100, 90 };
    int temp;

    System.out.print("Before sort :");
    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i] + " ");
    }

    // Sorting asc
    for (int i = 0; i < list.length; i++) {
      for (int j = i + 1; j < list.length; j++) {
        if (list[i] < list[j]) {
          temp = list[i];
          list[i] = list[j];
          list[j] = temp;
        }
      }
    }

    System.out.print(" \n After sort :");
    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i] + " ");
    }
  }
}
