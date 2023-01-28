/*
CH3 - Exercise gives a program that plays the scissor-rock-paper game. Revise the program to let the user continuously play until either the user or the computer wins three times more than their opponent.
*/

import java.util.Scanner;

public class GameScissorRockPapper {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int computerPoint = 0, userPoint = 0;

    do {
      int randNum = (int) (Math.random() * 3);

      System.out.print("scissor (0), rock (1), paper (2):");
      int userNum = input.nextInt();

      if (userNum == randNum) {
        System.out.print("The computer is ");

        switch (userNum) {
          case 0:
            System.out.print("scissor");
            break;
          case 1:
            System.out.print("rock");
            break;
          case 2:
            System.out.print("paper");
        }

        System.out.print(". You are ");

        switch (randNum) {
          case 0:
            System.out.print("scissor");
            break;
          case 1:
            System.out.print("rock");
            break;
          case 2:
            System.out.print("paper");
        }

        System.out.println(". Draw");
      } else if (userNum == 0 && randNum == 1) {
        System.out.println("The computer is rock. You are scissor. You loses");
        computerPoint += 1;
      } else if (userNum == 0 && randNum == 2) {
        System.out.println("The computer is paper. You are scissor. You won");
        userPoint += 1;
      } else if (userNum == 1 && randNum == 0) {
        System.out.println("The computer is scissor. You are rock. You won");
        userPoint += 1;
      } else if (userNum == 1 && randNum == 2) {
        System.out.println("The computer is paper. You are rock. You loses");
        computerPoint += 1;
      } else if (userNum == 2 && randNum == 0) {
        System.out.println("The computer is scissor. You are paper. You loses");
        computerPoint += 1;
      } else if (userNum == 2 && randNum == 1) {
        System.out.println("The computer is rock. You are paper. You won");
        userPoint += 1;
      }
    } while (computerPoint <= 2 && userPoint <= 2);

    if (computerPoint > userPoint) {
      System.out.print("Computer win !!!");
    } else {
      System.out.print("You win !!!");
    }
  }
}
