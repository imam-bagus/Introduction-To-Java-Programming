/*
Write a program that lets the user guess whether the flip of a coin results in heads or tails. The program randomly generates an integer 0 or 1, which represents head or tail. The program prompts the user to enter a guess, and reports whether the guess is correct or incorrect.
*/

import java.util.Scanner;

public class GameHeadsOrTails {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coin = (int) (Math.random() * 2);

        System.out.print("Enter a guess (0 for head or 1 for tail):");
        int guess = input.nextInt();

        boolean match = (coin == guess) ? true : false;

        System.out.print("Flip coin result ");
        if (coin == 0) {
            System.out.print("head");
        } else {
            System.out.print("tail");
        }

        System.out.print(", Your guess is ");

        if (match) {
            System.out.print("Correct");
        } else {
            System.out.print("Incorrect");
        }
    }
}
