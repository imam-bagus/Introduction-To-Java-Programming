public class BubbleSortAsc {

  public static void main(String[] args) {
    int[] list = { 50, 40, 70, 10, 20, 60, 30, 80, 100, 90 };
    int temp;

    System.out.print("Before sort :");
    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i] + " ");
    }

    // Sorting asc
    for (int i = 0; i < list.length; i++) {
      for (int j = i + 1; j < list.length; j++) {
        if (list[i] > list[j]) {
          temp = list[i];
          list[i] = list[j];
          list[j] = temp;
        }
      }
    }

    System.out.print(" \n After sort :");
    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i] + " ");
    }
  }
}
