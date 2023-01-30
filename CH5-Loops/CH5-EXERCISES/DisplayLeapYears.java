/*
Write a program that displays all the leap years, ten per line, from 2014 to 2114, separated by exactly one space. Also display the number of leap years in this period.
 */

public class DisplayLeapYears {

    public static void main(String[] args) {
        int year = 2014, count = 1;
        while (year <= 2114) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                if (count % 10 == 0) {
                    System.out.println(year);
                } else {
                    System.out.print(year + " ");
                }
                count++;
            }
            year++;
        }
    }
}
