import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    int[] list = { 8, 9, 5, 2, 1, 6, 4, 3, 7, 10 };

    for (int i = 0; i < list.length - 1; i++) {
      int lowVal = list[i];
      int indexLow = i;

      for (int j = i + 1; j < list.length; j++) {
        if (list[j] < lowVal) {
          lowVal = list[j];
          indexLow = j;
        }
      }

      list[indexLow] = list[i];
      list[i] = lowVal;
    }

    System.out.print(Arrays.toString(list));
  }
}
