/*
 Write a sort method that uses the bubble-sort algorithm. The bubble-sort algorithm makes several passes through the array. On each pass, successive neighboring pairs are compared. If a pair is not in order, its values are swapped; otherwise, the values remain unchanged. The technique is called a bubble sort or sinking sort because the smaller values gradually “bubble” their way to the top, and the larger values “sink” to the bottom. Write a test program that reads in 10 int numbers, invokes the method, and displays the sorted numbers
 */

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
