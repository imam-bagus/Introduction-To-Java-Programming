/*
write a program that prompts the user to enter the number of students and each student’s name and score, and finally displays the names of the students with the lowest and second-lowest scores
*/

import java.util.Scanner;

public class FindTwoLowestScore {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String studentName, lowestName, lowestNameSecond, tempName;
    int i =
      3, studentNumber, studentScore, lowestScore, lowestScoreSecond, tempScore;

    System.out.print("Enter the number of student:");
    studentNumber = input.nextInt();

    System.out.print("Enter Student name:");
    studentName = input.next();
    System.out.print("Enter Student score:");
    studentScore = input.nextInt();

    lowestName = studentName;
    lowestScore = studentScore;

    System.out.print("Enter Student name:");
    studentName = input.next();
    System.out.print("Enter Student score:");
    studentScore = input.nextInt();

    lowestNameSecond = studentName;
    lowestScoreSecond = studentScore;

    if (lowestScore > lowestScoreSecond) {
      tempName = lowestName;
      lowestName = lowestNameSecond;
      lowestNameSecond = tempName;

      tempScore = lowestScore;
      lowestScore = lowestScoreSecond;
      lowestScoreSecond = tempScore;
    }

    while (i <= studentNumber) {
      System.out.print("Enter Student name:");
      studentName = input.next();
      System.out.print("Enter Student score:");
      studentScore = input.nextInt();

      if (studentScore < lowestScore) {
        lowestName = studentName;
        lowestScore = studentScore;
      } else if (studentScore < lowestScoreSecond) {
        lowestNameSecond = studentName;
        lowestScoreSecond = studentScore;
      }
      i++;
    }
    System.out.println("Lowest name:" + lowestName);
    System.out.println("Lowest second name:" + lowestNameSecond);
  }
}
