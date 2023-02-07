/*
Write a program that reads the integers between 1 and 50 and counts the occurrences of each. Assume the input ends with 0
 */

import java.util.Scanner;

public class CountOccurenceOfNumbers {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] count = new int[49];
    int number;

    System.out.print("Enter the integers between 1 and 50:");
    for (int i = 0; i < count.length; i++) {
      number = input.nextInt();

      if (number == 0) {
        break;
      }

      count[number]++;
    }

    for (int i = 0; i < count.length; i++) {
      if (count[i] != 0) {
        if (count[i] > 1) {
          System.out.println(i + " occurs " + count[i] + " times");
        } else {
          System.out.println(i + " occurs " + count[i] + " time");
        }
      }
    }
  }
}
