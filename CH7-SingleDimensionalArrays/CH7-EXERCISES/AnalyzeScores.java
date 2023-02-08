/*
Write a program that reads an unspecified number of scores and determines how many scores are above or equal to the average, and how many scores are below the average. Enter a negative number to signify the end of the input. Assume the maximum number of scores is 100
 */

import java.util.Scanner;

public class AnalyzeScores {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int total = 0, average, count = 0, inputScore, above = 0, equals =
      0, below = 0;
    int[] scores = new int[100];

    System.out.print("Enter scores: ");
    for (int i = 0; i < scores.length; i++) {
      inputScore = input.nextInt();
      if (inputScore < 0) {
        break;
      }
      scores[i] = inputScore;
    }

    for (int i = 0; i < scores.length; i++) {
      if (scores[i] > 0) {
        total += scores[i];
        count++;
      }
    }

    average = total / count;

    for (int i = 0; i < scores.length; i++) {
      if (scores[i] == average) {
        equals++;
      } else if (scores[i] > average) {
        above++;
      } else if (scores[i] < average && scores[i] > 0) {
        below++;
      }
    }

    System.out.println("Average is :" + average);
    System.out.println("Number scores equal with average is : " + equals);
    System.out.println("Number scores below average is : " + below);
    System.out.println("Number scores above average is : " + above);
  }
}
