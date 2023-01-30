/*
write a program that plays the popular scissor–rock-paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws.
*/

import java.util.Scanner;

public class GameScissorRockPapper {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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

            System.out.print(". Draw");
        } else if (userNum == 0 && randNum == 1) {
            System.out.print("The computer is rock. You are scissor. You loses");
        } else if (userNum == 0 && randNum == 2) {
            System.out.print("The computer is paper. You are scissor. You won");
        } else if (userNum == 1 && randNum == 0) {
            System.out.print("The computer is scissor. You are rock. You won");
        } else if (userNum == 1 && randNum == 2) {
            System.out.print("The computer is paper. You are rock. You loses");
        } else if (userNum == 2 && randNum == 0) {
            System.out.print("The computer is scissor. You are paper. You loses");
        } else if (userNum == 2 && randNum == 1) {
            System.out.print("The computer is rock. You are paper. You won");
        }
    }
}
