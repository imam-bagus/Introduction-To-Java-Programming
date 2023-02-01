public class FindingTheSmallestIndexOfTheLargestElement {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 2, 3, 4 };
        int max = arr[0];
        int indexOfMax = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexOfMax = i;
            }
        }

        System.out.println("Largest value in index :" + indexOfMax);
    }
}
