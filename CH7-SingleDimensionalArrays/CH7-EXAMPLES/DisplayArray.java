public class DisplayArray {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 2, 3, 4 };
        char[] arrChar = { 'I', 'M', 'A', 'M' };

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value array index " + i + " :" + arr[i]);
        }

        // char can print in one statement
        System.out.println(arrChar);

    }
}
