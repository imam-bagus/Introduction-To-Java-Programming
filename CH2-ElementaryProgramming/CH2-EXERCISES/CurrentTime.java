
/*
ShowCurrentTime.java, gives a program that displays the current time in GMT. 
Revise the program so it prompts the user to enter the time zone offset to GMT and displays the time in the specified time zone.
 */

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT:");
        int timeZone = input.nextInt();

        long totalMiliseconds = System.currentTimeMillis();
        long totalSeconds = totalMiliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        currentHour = currentHour + timeZone;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

    }
}