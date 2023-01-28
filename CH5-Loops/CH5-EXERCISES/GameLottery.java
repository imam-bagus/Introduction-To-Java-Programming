/*
 Revise CH3 - Exercises, GameLottery.java, to generate a lottery of a two-digit number. The two digits in the number are distinct. (Hint: Generate the first digit. Use a loop to continuously generate the second digit until it is different from the first digit.)
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

    do {
      lotteryNumber = (int) (Math.random() * 1000);
      lotteryDigit1 = lotteryNumber / 100;
      currentDigit = lotteryNumber % 100;
      lotteryDigit2 = currentDigit / 10;
      currentDigit = currentDigit % 10;
      lotteryDigit3 = currentDigit;
    } while (
      lotteryDigit1 == lotteryDigit2 ||
      lotteryDigit1 == lotteryDigit3 ||
      lotteryDigit2 == lotteryDigit3
    );

    System.out.print("Enter a three-digit number:");
    userNumber = input.nextInt();

    userDigit1 = userNumber / 100;
    currentDigit = userNumber % 100;
    userDigit2 = currentDigit / 10;
    currentDigit = currentDigit % 10;
    userDigit3 = currentDigit;

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
