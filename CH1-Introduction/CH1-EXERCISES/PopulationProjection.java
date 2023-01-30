/*
 The U.S. Census Bureau projects population based on the following assumptions:

- One birth every 7 seconds
- One death every 13 seconds
- One new immigrant every 45 seconds

Write a program to display the population for each of the next five years. 
Assume that the current population is 312,032,486, and one year has 365 days. Hint: In Java, if two integers perform division, the result is an integer. The fractional part is truncated.
For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with the fractional part, one of the values involved in the division must be a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
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

        birth = secondOneYear / 7;
        death = secondOneYear / 13;
        newImmigrant = secondOneYear / 45;

        projection = birth - death + newImmigrant;

        System.out.println("The population in 1 years is " + (currentPopulation + projection * 1));
        System.out.println("The population in 2 years is " + (currentPopulation + projection * 2));
        System.out.println("The population in 3 years is " + (currentPopulation + projection * 3));
        System.out.println("The population in 4 years is " + (currentPopulation + projection * 4));
        System.out.println("The population in 5 years is " + (currentPopulation + projection * 5));

    }
}