/*
Assume that a vehicle plate number consists of three uppercase letters followed by four digits. Write a program to generate a plate
number.
 */

public class GenerateVehiclePlateNumbers {

    public static void main(String[] args) {
        char letter1, letter2, letter3, digit1, digit2, digit3, digit4;

        letter1 = (char) (65 + ((int) (Math.random() * 26)));
        letter2 = (char) (65 + ((int) (Math.random() * 26)));
        letter3 = (char) (65 + ((int) (Math.random() * 26)));
        digit1 = (char) (48 + ((int) (Math.random() * 10)));
        digit1 = (char) (48 + ((int) (Math.random() * 10)));
        digit2 = (char) (48 + ((int) (Math.random() * 10)));
        digit3 = (char) (48 + ((int) (Math.random() * 10)));
        digit4 = (char) (48 + ((int) (Math.random() * 10)));

        System.out.print(
                "Plate Number : " +
                        letter1 +
                        letter2 +
                        letter3 +
                        "-" +
                        digit1 +
                        digit2 +
                        digit3 +
                        digit4);
    }
}
