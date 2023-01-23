import java.util.Scanner;

public class DetermineWeekdayWeekend {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter day (range 1-7) :");
    int day = input.nextInt();

    switch (day) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.print("Week Day");
        break;
      case 6:
      case 7:
        System.out.print("Week End");
        break;
      default:
        System.out.print("Your input not valid!");
    }
  }
}
