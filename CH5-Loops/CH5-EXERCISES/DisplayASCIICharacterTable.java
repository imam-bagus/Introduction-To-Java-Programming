/*
Write a program that prints the characters in the ASCII character table from ! to ~. Display 10 characters per line. Characters are separated by exactly one space.

 */

public class DisplayASCIICharacterTable {

    public static void main(String[] args) {
        int count = 1;
        char ASCII;
        System.out.println("    ASCII Table");
        System.out.println("- - - - - - - - - -");
        for (int i = 33; i <= 126; i++) {
            ASCII = (char) i;
            if (count % 10 == 0) {
                System.out.println(ASCII);
            } else {
                System.out.print(ASCII + " ");
            }
            count++;
        }
    }
}
