/*
Revise CH3-Example, Lottery.java, to generate a lottery of a three-digit number. The program prompts the user to enter a three-digit number and determines whether the user wins according to the following rules :
- If the user input matches the lottery number in the exact order, the award is $12,000.
- If all digits in the user input match all digits in the lottery number, the award is $5,000.
- If one digit in the user input matches a digit in the lottery number, the award is $2,000.
*/

import java.util.Scanner;

public class GameLottery {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lotteryNumber;
        int userNumber;
        int userDigit1;
        int userDigit2;
        int userDigit3;
        int lotteryDigit1;
        int lotteryDigit2;
        int lotteryDigit3;
        int currentDigit;

        lotteryNumber = (int) Math.random() * 1000;
        System.out.print("Enter a three-digit number:");
        userNumber = input.nextInt();

        userDigit1 = userNumber / 100;
        currentDigit = userNumber % 100;
        userDigit2 = currentDigit / 10;
        currentDigit = currentDigit % 10;
        userDigit3 = currentDigit;

        lotteryDigit1 = lotteryNumber / 100;
        currentDigit = lotteryNumber % 100;
        lotteryDigit2 = currentDigit / 10;
        currentDigit = currentDigit % 10;
        lotteryDigit3 = currentDigit;

        if (userNumber == lotteryNumber) {
            System.out.println("Exact match: you win $10,000");
        } else if (
                userDigit1 == lotteryDigit1 &&
                        userDigit3 == lotteryDigit2 &&
                        userDigit2 == lotteryDigit3 ||
                        userDigit2 == lotteryDigit1 &&
                                userDigit1 == lotteryDigit2 &&
                                userDigit3 == lotteryDigit3 ||
                        userDigit2 == lotteryDigit1 &&
                                userDigit3 == lotteryDigit2 &&
                                userDigit1 == lotteryDigit3 ||
                        userDigit3 == lotteryDigit1 &&
                                userDigit1 == lotteryDigit2 &&
                                userDigit2 == lotteryDigit3 ||
                        userDigit3 == lotteryDigit1 &&
                                userDigit2 == lotteryDigit2 &&
                                userDigit1 == lotteryDigit3
        ) {
            System.out.println("Match all digits: you win $3,000");
        } else if (
                userDigit1 == lotteryDigit1 ||
                        userDigit1 == lotteryDigit2 ||
                        userDigit1 == lotteryDigit3 ||
                        userDigit2 == lotteryDigit1 ||
                        userDigit2 == lotteryDigit2 ||
                        userDigit2 == lotteryDigit3 ||
                        userDigit3 == lotteryDigit1 ||
                        userDigit3 == lotteryDigit2 ||
                        userDigit3 == lotteryDigit3
        ) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.print("sorry , you are not lucky!!");
        }
    }
}
