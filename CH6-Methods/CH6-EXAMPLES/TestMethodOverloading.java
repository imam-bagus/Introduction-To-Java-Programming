public class TestMethodOverloading {

    public static void main(String[] args) {
        System.out.println(
                "Maximum of " + 50.0 + " and " + 60.0 + " is " + max(50.0, 60.0)
        );
        System.out.println("Maximum of " + 3 + " and " + 4 + " is " + max(3, 4));
        System.out.println(
                "Maximum of " +
                        70.0 +
                        ", " +
                        80.0 +
                        " and " +
                        90.0 +
                        " is " +
                        max(70.0, 80.0, 90.0)
        );
        System.out.println(
                "Maximum of " + 3.0 + " and " + 4 + " is " + max(3.0, 4)
        );
    }

    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double max(double num1, double num2, double num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
