import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        boolean leapYear;

        System.out.print("Enter year:");
        year = input.nextInt();

        leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + " is a leap year? " + leapYear);
    }
}
