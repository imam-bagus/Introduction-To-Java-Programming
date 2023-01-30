import java.util.Scanner;

public class LotteryUsingString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lottery;
        char lotteryDigit1;
        char lotteryDigit2;
        String guess;
        char guessDigit1;
        char guessDigit2;

        lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);
        lotteryDigit1 = lottery.charAt(0);
        lotteryDigit2 = lottery.charAt(1);

        System.out.print("Enter your lottery pick (two digits): ");
        guess = input.nextLine();

        guessDigit1 = guess.charAt(0);
        guessDigit2 = guess.charAt(1);

        System.out.println("The lottery number is " + lottery);

        if (lottery.equals(guess)) {
            System.out.println("Exact match: you win $10,000");
        } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
            System.out.println("Match all digits: you win $3,000");
        } else if (
                guessDigit1 == lotteryDigit1 ||
                        guessDigit1 == lotteryDigit2 ||
                        guessDigit2 == lotteryDigit1 ||
                        guessDigit2 == lotteryDigit2
        ) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
