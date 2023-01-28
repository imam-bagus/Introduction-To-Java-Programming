/*
Suppose that the tuition for a university is $10,000 this year and increases 6% every year. In one year, the tuitionwill be $10,600. Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.
 */

public class FinancialApplicationComputeFututreTuition {
    public static void main(String[] args) {
        final double INCREASES = 0.06;
        double tuition = 10.000, yearTen = 10.000, fourYearsTuition = 0, totalIncreases = 0;
        int year, max_year = 14;

        for (year = 1; year <= max_year; year++) {
            totalIncreases = (tuition * (INCREASES * year));

            if (year == 10) {
                yearTen = tuition + totalIncreases;
            }

            if (year > 10) {
                fourYearsTuition = fourYearsTuition + tuition + totalIncreases;
            }

        }
        System.out.printf("Tuition in ten years : $%.3f \n", yearTen);
        System.out.printf("total cost four years after tenth year : $%.3f", fourYearsTuition);

    }
}
