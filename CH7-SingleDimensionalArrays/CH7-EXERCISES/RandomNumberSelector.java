/*
Write a method that returns a random number from a list of numbers passed in the argument. The method header is specified as follows:

public static int getRandom(int... numbers)
 */

public class RandomNumberSelector {

  public static void main(String[] args) {
    System.out.print(getRandom(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
  }

  public static int getRandom(int... numbers) {
    int index = (int) (Math.random() * 10);

    return numbers[index];
  }
}
