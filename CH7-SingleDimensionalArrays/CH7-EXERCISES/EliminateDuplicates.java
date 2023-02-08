/*
Write a method that returns a new array by eliminating the duplicate values in the array using the following method header:

public static int[] eliminateDuplicates(int[] list)

Write a test program that reads in 10 integers, invokes the method, and displays the distinct numbers separated by exactly one space
 */

import java.util.Scanner;

public class EliminateDuplicates {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[10];

    System.out.print("Enter 10 numbers: ");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextInt();
    }

    int[] numWithoutDup = eliminateDuplicates(numbers);

    System.out.print("The distinct numbers are: ");
    for (int i = 0; i < numWithoutDup.length; i++) {
      if (numWithoutDup[i] != 0) {
        System.out.print(numWithoutDup[i] + " ");
      }
    }
  }

  public static int[] eliminateDuplicates(int[] list) {
    int[] result = new int[10];
    boolean flag;

    for (int i = 0; i < list.length; i++) {
      flag = false;
      for (int j = i + 1; j < list.length; j++) {
        if (list[i] == list[j]) {
          flag = true;
        }
      }

      if (flag == false) {
        result[i] = list[i];
      }
    }

    return result;
  }
}
