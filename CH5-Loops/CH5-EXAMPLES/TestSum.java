public class TestSum {
    public static void main(String[] args) {
        double sum = 0.00d;

        for (double i = 0.01d; i <= 1.0; i = i + 0.01d) {
            sum += i;
        }

        System.out.print("Sum : " + sum);
    }
}
