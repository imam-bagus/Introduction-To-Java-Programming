/*
Write a program that creates an array of numbers from 1 to 100,000,000 in ascending order. Display the execution time of invoking the linearSearch method and the binarySearch method . Display the execution time of invoking both searches for the following numbers: 1; 25,000,000; 50,000,000; 75,000,000; 100,000,000. You can use the following code template to obtain the execution time:

long startTime = System.nanoTime();
perform the task;
long endTime = System.nanoTime();
long executionTime = endTime − startTime;
 */

public class ExecutinTime {

  public static void main(String[] args) {
    System.out.println(
      "Searching value " +
      1 +
      " using linear search and execution time: " +
      linearSearch(1)
    );
    System.out.println(
      "Searching value " +
      50000 +
      " using linear search and execution time: " +
      linearSearch(50000)
    );
    System.out.println(
      "Searching value " +
      75000 +
      " using linear search and execution time: " +
      linearSearch(75000)
    );
    System.out.println(
      "Searching value " +
      100000 +
      " using linear search and execution time: " +
      linearSearch(100000)
    );
    System.out.println();
    System.out.println(
      "Searching value " +
      1 +
      " using Binary search and execution time: " +
      binarySearch(1)
    );
    System.out.println(
      "Searching value " +
      50000 +
      " using Binary search and execution time: " +
      binarySearch(50000)
    );
    System.out.println(
      "Searching value " +
      75000 +
      " using Binary search and execution time: " +
      binarySearch(75000)
    );
    System.out.println(
      "Searching value " +
      100000 +
      " using Binary search and execution time: " +
      binarySearch(100000)
    );
  }

  public static long linearSearch(int searchNum) {
    int[] numbers = new int[1000000];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 1;
    }

    long startTime = System.nanoTime();

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == searchNum) {
        break;
      }
    }

    long endTime = System.nanoTime();

    long executionTime = endTime - startTime;

    return executionTime;
  }

  public static long binarySearch(int searchNum) {
    int[] numbers = new int[1000000];
    int min, max, mid;

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 1;
    }

    long startTime = System.nanoTime();

    min = 0;
    max = numbers.length - 1;

    while (max >= min) {
      mid = (min + max) / 2;

      if (numbers[mid] < searchNum) {
        min = mid + 1;
      } else if (numbers[mid] == searchNum) {
        break;
      } else {
        max = mid - 1;
      }
    }

    long endTime = System.nanoTime();

    long executionTime = endTime - startTime;

    return executionTime;
  }
}
