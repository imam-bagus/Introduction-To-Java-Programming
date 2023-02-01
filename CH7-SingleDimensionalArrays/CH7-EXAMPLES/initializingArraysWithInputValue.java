public class initializingArraysWithInputValue {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("input integer value to array index " + i + " :");
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value array index " + i + " :" + arr[i]);
        }

    }
}
