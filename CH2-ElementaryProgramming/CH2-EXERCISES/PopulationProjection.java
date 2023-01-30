/*
Rewrite Exercise CH1 to prompt the user to enter the number of years and display the population after the number of years.
 */

import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int currentPopulation = 312032486;
        int secondOneYear = 31536000;
        int projection;
        int birth;
        int death;
        int newImmigrant;
        int year;

        System.out.print("Enter the number of years:");
        year = input.nextInt();

        birth = secondOneYear / 7;
        death = secondOneYear / 13;
        newImmigrant = secondOneYear / 45;

        projection = birth - death + newImmigrant;

        System.out.println("The population in 5 years is " + (currentPopulation + projection * year));

    }
}