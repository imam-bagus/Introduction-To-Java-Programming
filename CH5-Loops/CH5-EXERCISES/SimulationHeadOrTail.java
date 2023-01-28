/*
Write a program that simulates flipping a coin two millions times and displays the number of heads and tails.
 */

public class SimulationHeadOrTail {

  public static void main(String[] args) {
    int head = 0, tail = 0, coin;

    for (int i = 0; i <= 2000000; i++) {
      coin = (int) (Math.random() * 2);
      if (coin == 1) {
        head++;
      } else {
        tail++;
      }
    }

    System.out.println("Heads " + head + " and Tails " + tail);
  }
}
