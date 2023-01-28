/*
Write a program that displays all the numbers from 100 to 200, ten per line, that are divisible by 3 or 4, but not both. Numbers are separated by exactly one space.
*/

public class FindNumbersDivisibleBy3And4ButNotBoth {

  public static void main(String[] args) {
    int count = 1;

    for (int i = 100; i <= 200; i++) {
      if ((i % 3 == 0 || i % 4 == 0) && !(i % 3 == 0 && i % 4 == 0)) {
        if (count % 10 == 0) {
          System.out.println(i);
        } else {
          System.out.print(i + " ");
        }
        count++;
      }
    }
  }
}
