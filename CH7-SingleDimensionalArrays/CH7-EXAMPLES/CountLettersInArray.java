/*
1. Generates 100 lowercase letters randomly and assigns them to an array of characters.

2. Count the occurrences of each letter in the array. To do so, create an array, say counts, of 26 int values, each of which counts the occurrences of a letter,. That is, counts[0] counts the number of a’s, counts[1] counts the number of b’s, and so on.
 */

public class CountLettersInArray {

  public static void main(String[] args) {
    char[] randLetter = getLetters();

    System.out.println("The Lowercase letters are :");
    displayGeneratedRandomLetter(randLetter);

    int[] countLetter = countEachLetter(randLetter);

    System.out.println(" \n The occurrences of each letter are:");
    displayCountEachCharacter(countLetter);
  }

  public static char[] getLetters() {
    char[] result = new char[100];

    for (int i = 0; i < result.length; i++) {
      result[i] = (char) (97 + (int) (Math.random() * 26));
    }

    return result;
  }

  public static void displayGeneratedRandomLetter(char[] randLetter) {
    for (int i = 0; i < randLetter.length; i++) {
      if ((i + 1) % 20 == 0) {
        System.out.println(randLetter[i]);
      } else {
        System.out.print(randLetter[i] + " ");
      }
    }
  }

  public static int[] countEachLetter(char[] randLetter) {
    int[] count = new int[26];

    for (int i = 0; i < randLetter.length; i++) {
      count[randLetter[i] - 'a']++;
    }

    return count;
  }

  public static void displayCountEachCharacter(int[] countLetter) {
    for (int i = 0; i < countLetter.length; i++) {
      if ((i + 1) % 10 == 0) {
        System.out.println(countLetter[i] + " " + ((char) (i + 'a')));
      } else {
        System.out.print(countLetter[i] + " " + ((char) (i + 'a')) + " ");
      }
    }
  }
}
