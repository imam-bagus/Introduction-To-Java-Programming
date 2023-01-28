/*
Write a program that displays the following two tables side by side (note that 1 ping = 3.305 square meters)

Ping Square meter | Square meter Ping
10   33.050       | 30           9.077
15   49.575       | 35           10.590
...
75   247.875      | 95           28.744
80   264.400      | 100          30.257
 */

public class ConversionFromSquareToPing {
    public static void main(String[] args) {
        int ping1, squareMeters1;
        double squareMeters2, ping2;

        System.out.println("Ping \t Square Meter | Square meter \t Ping");

        ping1 = 10;
        squareMeters1 = 30;

        while (ping1 <= 80) {

            squareMeters2 = 3.305 * ping1;
            ping2 = squareMeters1 / 3.305;
            System.out.printf("%d \t %.3f \t| %d \t %.3f \n", ping1, squareMeters2, squareMeters1, ping2);
            squareMeters1 = squareMeters1 + 5;
            ping1 = ping1 + 5;
        }

    }
}
