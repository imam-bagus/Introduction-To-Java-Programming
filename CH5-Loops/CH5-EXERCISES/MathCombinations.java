/* 
Write a program that displays all possible combinations for picking two numbers from integers 1 to 7. Also display the total number of all combinations.
*/

public class MathCombinations {

  public static void main(String[] args) {
    int count = 0;

    for (int i = 1; i <= 7; i++) {
      for (int j = i + 1; j <= 7; j++) {
        System.out.println(i + " " + j);

        count++;
      }
    }

    System.out.println("The total number of all combinations is " + count);
  }
}
