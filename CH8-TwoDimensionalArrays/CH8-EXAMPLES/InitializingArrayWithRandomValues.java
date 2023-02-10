public class InitializingArrayWithRandomValues {

  public static void main(String[] args) {
    int[][] list = new int[10][10];

    for (int row = 0; row < list.length; row++) {
      for (int column = 0; column < list[row].length; column++) {
        list[row][column] = (int) (Math.random() * 100);
      }
    }
  }
}
