public class RowTheLargestSum {

  public static void main(String[] args) {
    int[][] table = new int[10][10];
    int rowLargest = 0;
    int total = 0;
    int index = 0;

    for (int row = 0; row < table.length; row++) {
      for (int column = 0; column < table[row].length; column++) {
        table[row][column] = (int) (Math.random() * 100);
      }
    }

    for (int i = 0; i < table[0].length; i++) {
      rowLargest += table[0][i];
    }

    for (int row = 1; row < table.length; row++) {
      total = 0;
      for (int column = 0; column < table[row].length; column++) {
        total += table[row][column];
      }

      if (total > rowLargest) {
        rowLargest = total;
        index = row;
      }
    }

    System.out.println(
      "Row " + index + " has the maximum sum of " + rowLargest
    );
  }
}
