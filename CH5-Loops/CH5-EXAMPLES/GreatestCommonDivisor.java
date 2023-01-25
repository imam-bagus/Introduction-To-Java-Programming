import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, gcd, k;

        System.out.print("Enter first integer:");
        n1 = input.nextInt();

        System.out.print("Enter second integer:");
        n2 = input.nextInt();

        gcd = 1;
        k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);

    }
}
