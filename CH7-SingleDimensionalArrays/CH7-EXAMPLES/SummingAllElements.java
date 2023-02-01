public class SummingAllElements {
    public static void main(String[] args) {
        int total = 0;
        int[] arr = { 3, 4, 1, 2, 3, 4 };

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println("Total :" + total);
    }
}