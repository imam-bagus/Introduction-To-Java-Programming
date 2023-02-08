/*
reverses an array by copying it to a new array. Rewrite the method that reverses the array passed in the argument and returns this array. Write a test program that prompts the user to enter 10 numbers, invokes the method to reverse the numbers, and displays the numbers.
 */
import java.util.Scanner;

public class ReverseArray {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] list = new int[10];

    System.out.print("Enter 10 integers numbers: ");
    for (int i = 0; i < list.length; i++) {
      list[i] = input.nextInt();
    }

    list = reverse(list);

    System.out.print(java.util.Arrays.toString(list));
  }

  public static int[] reverse(int[] num) {
    int temp, max = num.length - 1, min = 0;

    while (min < max) {
      temp = num[min];
      num[min] = num[max];
      num[max] = temp;

      min++;
      max--;
    }

    return num;
  }
}
