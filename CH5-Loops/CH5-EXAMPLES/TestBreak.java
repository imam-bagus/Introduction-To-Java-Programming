public class TestBreak {
    public static void main(String[] args) {
        int a = 0, maxLoop = 10;
        while (a < maxLoop) {

            if (a == 5) {
                break;
            }

            System.out.println(a);

            a++;
        }

    }
}
