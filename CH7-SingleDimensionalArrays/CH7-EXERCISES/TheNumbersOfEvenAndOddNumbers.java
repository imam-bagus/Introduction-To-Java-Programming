/*
Write a program that reads ten integers, and then display the number of even numbers and odd numbers. Assume that the input ends with 0
 */

import java.util.Scanner;

public class TheNumbersOfEvenAndOddNumbers {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num, odd = 0, even = 0;
    int[] numbers = new int[10];

    System.out.print("Enter numbers: ");
    for (int i = 0; i < numbers.length; i++) {
      num = input.nextInt();

      if (num <= 0) {
        break;
      }
      numbers[i] = num;
    }

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }

    System.out.println("The numbers of odd numbers: " + odd);
    System.out.println("The numbers of even numbers: " + even);
  }
}
