// want 2 digits after decimal point

public class FormatConsoleInput {

  public static void main(String[] args) {
    double amount = 12618.98;
    double interestRate = 0.0013;

    double interest = amount * interestRate;
    // System.out.print("$" + interest); // 16.404674
    // System.out.print( "$" + (int) (interest * 100) / 100.0); // 16.4
    System.out.printf("$%4.2f", interest); // 16.40
  }
}
