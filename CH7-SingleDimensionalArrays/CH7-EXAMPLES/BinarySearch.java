public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
    int min, mid, max, key;

    min = 0;
    max = arr.length - 1;
    key = 90;

    while (max >= min) {
      mid = (min + max) / 2;

      if (arr[mid] == key) {
        System.out.print("Array found");
        break;
      } else if (arr[mid] > key) {
        max = mid - 1;
      } else {
        min = mid + 1;
      }
    }
  }
}
