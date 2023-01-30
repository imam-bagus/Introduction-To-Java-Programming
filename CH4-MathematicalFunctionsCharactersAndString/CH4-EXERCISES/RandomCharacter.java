/*
Write a program that displays a random lowercase letter using the Math.random() method.
*/

public class RandomCharacter {

    public static void main(String[] args) {
        int code = 97 + (int) (Math.random() * 26);

        char lowerCaseLetter = (char) code;

        System.out.print(
                "Letter is " + lowerCaseLetter + " and code value is " + code);
    }
}
