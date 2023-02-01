public class RandomShuffling {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 2, 3, 4 };
        int temp;
        int j;

        for (int i = 0; i < arr.length; i++) {
            j = (int) (Math.random() * arr.length);

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
