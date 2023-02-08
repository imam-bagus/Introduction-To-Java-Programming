/*
Write a method that returns the index of the largest element in an array of integers. If there is more than one element, return the largest index. Use the following header:

public static int indexOfLargestElement(double[] array)

Write a test program that prompts the user to enter 10 numbers, invokes this method to return the index of the largest element, and displays the index and the element itself.

 */

import java.util.Scanner;

public class FindIndexOfLargestElement {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] list = new int[10];

    System.out.print("Enter 10 int values :");
    for (int i = 0; i < list.length; i++) {
      list[i] = input.nextInt();
    }

    System.out.print(
      "Index of largest element: " + indexOfLargestElement(list)
    );
  }

  public static int indexOfLargestElement(int[] array) {
    int index = array[0];

    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        index = i;
      }
    }

    return index;
  }
}
