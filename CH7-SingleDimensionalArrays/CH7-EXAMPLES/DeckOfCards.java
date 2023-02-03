/*
 * Say you want to write a program that will pick four cards at random from a
 * deck of 52 cards. All the cards can be represented using an array named deck,
 * filled with initial values 0–51 Card numbers 0–12, 13–25, 26–38, and 39–51
 * represent 13 Spades, 13 Hearts, 13 Diamonds, and 13 Clubs card. Number / 13
 * determines the suit of the card, and cardNumber % 13 determines the rank of
 * the card After shuffling the array deck, pick the first four cards from deck.
 * The program displays the cards from these four card numbers.
 */

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[51];
        String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        int temp, j;
        String suit, rank;

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for (int i = 0; i < deck.length; i++) {
            j = (int) (Math.random() * 52);
            temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        for (int i = 0; i < 4; i++) {
            suit = suits[deck[i] / 13];
            rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }

    }
}