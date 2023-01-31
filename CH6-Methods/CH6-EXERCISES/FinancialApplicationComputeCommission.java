/*
 Write a method that computes the commission, using the scheme in CH5-EXERCISES. The header of the method is as follows:

 public static double computeCommission(double salesAmount)

 write a test program that displays the following table:

 Sales Amount   Commission
 --------------------------
    10000         900.0
    15000         1500.0
    ...
    95000         11100.0
    100000        11700.0

 */

public class FinancialApplicationComputeCommission {

    public static void main(String[] args) {

        System.out.println("Sales Amount     Commissions");
        System.out.println("----------------------------");
        for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            System.out.printf("%.0f               %.1f \n", salesAmount, computeCommission(salesAmount));
        }
    }

    public static double computeCommission(double salesAmount) {

        double balance, commission;
        balance = commission = 0.0;

        if (salesAmount >= 10000.01) {
            commission += (balance = salesAmount - 10000) * 0.12;
        }

        if (salesAmount >= 5000.01) {
            commission += (balance -= balance - 5000) * 0.10;
        }
        if (salesAmount >= 0.01) {
            commission += balance * 0.08;
        }
        return commission;
    }
}
