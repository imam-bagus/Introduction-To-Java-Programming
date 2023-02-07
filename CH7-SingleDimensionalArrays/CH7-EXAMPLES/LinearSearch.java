public class LinearSearch {

  public static void main(String[] args) {
    boolean number = search(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });

    if (number) {
      System.out.print("Found");
    } else {
      System.out.print("Not Found");
    }
  }

  public static boolean search(int... arr) {
    int numSearch = 5;
    for (int i = 0; i < arr.length; i++) {
      if (i == numSearch) {
        return true;
      }
    }

    return false;
  }
}
