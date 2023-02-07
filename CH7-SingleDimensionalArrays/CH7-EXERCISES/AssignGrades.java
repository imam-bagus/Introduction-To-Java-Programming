/*
Write a program that reads student scores, gets the best score, and
then assigns grades based on the following scheme:
Grade is A if score is >=  best -5
Grade is B if score is >= best -10;
Grade is C if score is >= best -15;
Grade is D if score is >= best -20;
Grade is F otherwise.
The program prompts the user to enter the total number of students, and then
prompts the user to enter all of the scores, and concludes by displaying the grades.
 */

import java.util.Scanner;

public class AssignGrades {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numberStudent;
    System.out.print("Enter the number of student:");
    numberStudent = input.nextInt();

    int[] scores = new int[numberStudent];
    System.out.print("Enter " + numberStudent + " scores:");
    for (int i = 0; i < scores.length; i++) {
      scores[i] = input.nextInt();
    }

    int highScore = scores[0];
    for (int i = 1; i < scores.length; i++) {
      if (scores[i] > highScore) {
        highScore = scores[i];
      }
    }

    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= (highScore - 5)) {
        System.out.println(
          "Student " + (i + 1) + " score is " + scores[i] + " and grade is A"
        );
      } else if (scores[i] >= (highScore - 10)) {
        System.out.println(
          "Student " + (i + 1) + " score is " + scores[i] + " and grade is B"
        );
      } else if (scores[i] >= (highScore - 15)) {
        System.out.println(
          "Student " + (i + 1) + " score is " + scores[i] + " and grade is C"
        );
      } else if (scores[i] >= (highScore - 20)) {
        System.out.println(
          "Student " + (i + 1) + " score is " + scores[i] + " and grade is D"
        );
      } else {
        System.out.println(
          "Student " + (i + 1) + " score is " + scores[i] + " and grade is F"
        );
      }
    }
  }
}
