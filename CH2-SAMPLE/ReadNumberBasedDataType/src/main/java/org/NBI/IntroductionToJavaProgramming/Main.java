package org.NBI.IntroductionToJavaProgramming;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a byte value :");
        byte byteValue = input.nextByte();

        System.out.println("Enter a short value :");
        short shortValue = input.nextShort();

        System.out.println("Enter a Integer value :");
        int integerValue = input.nextInt();

        System.out.println("Enter a long value :");
        long longValue = input.nextLong();

        System.out.println("Enter a float value :");
        float floatValue = input.nextFloat();

        System.out.println("Enter a double value :");
        double doubleValue = input.nextDouble();

        System.out.println("byte value :" + byteValue);
        System.out.println("short value :" + shortValue);
        System.out.println("Integer value :" + integerValue);
        System.out.println("float value :" + floatValue);
        System.out.println("double value :" + doubleValue);
    }
}