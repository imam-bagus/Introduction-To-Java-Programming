/*
Write a program that prompts the user to enter the number of students, the students’ names, and their scores and prints student names in decreasing order of their scores. Assume the name is a string without spaces, use the Scan­ ner’s next() method to read a name.
 */

import java.util.Scanner;

public class SortStudent {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of students:");
    int num = input.nextInt();

    String[] name = new String[num];

    System.out.print("Enter students name:");
    for (int i = 0; i < num; i++) {
      name[i] = input.next();
    }

    int[] scores = new int[num];
    System.out.print("Enter student score:");
    for (int i = 0; i < num; i++) {
      scores[i] = input.nextInt();
    }

    int tempScore = 0;
    String tempName = "";

    for (int i = 0; i < num; i++) {
      for (int j = i + 1; j < num; j++) {
        if (scores[j] > scores[i]) {
          tempScore = scores[j];
          scores[j] = scores[i];
          scores[i] = tempScore;

          tempName = name[j];
          name[j] = name[i];
          name[i] = tempName;
        }
      }
    }

    System.out.println("Sort student decreasing order:");
    for (int i = 0; i < num; i++) {
      System.out.println(
        (i + 1) + ". Name " + name[i] + " with score " + scores[i]
      );
    }
  }
}
