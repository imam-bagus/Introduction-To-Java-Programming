public class TestPassArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2 };

    swapPrimitive(arr[0], arr[1]);
    System.out.println(arr[0] + " " + arr[1]);
    swapArr(arr);
    System.out.println(arr[0] + " " + arr[1]);
  }

  public static void swapPrimitive(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }

  public static void swapArr(int[] arr) {
    int temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
  }
}
