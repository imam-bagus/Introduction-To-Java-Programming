/*
Write a program that generates 200 random integers between 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */

public class CountSingleDigits {

  public static void main(String[] args) {
    int[] randNum = new int[200];
    int[] counts = new int[10];

    for (int i = 0; i < randNum.length; i++) {
      randNum[i] = (int) (Math.random() * 10);
      counts[randNum[i]]++;
    }

    for (int i = 0; i < counts.length; i++) {
      System.out.println("Occurence of number " + i + " is : " + counts[i]);
    }
  }
}
