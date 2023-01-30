public class TestMax {

    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k;

        k = max(i, j);

        System.out.println("Between " + i + " and " + j + ", max number is " + k);
    }

    public static int max(int number1, int number2) {
        int result;

        if (number1 > number2) {
            result = number1;
        } else {
            result = number2;
        }

        return result;
    }
}
