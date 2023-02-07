public class PassingArrayToMethod {

  public static void main(String[] args) {
    int[] array = { 3, 4, 5, 6, 7 };
    testPassingArray(array);
    testPassingArray(new int[] { 10, 20, 30, 40, 50 });
  }

  public static void testPassingArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
