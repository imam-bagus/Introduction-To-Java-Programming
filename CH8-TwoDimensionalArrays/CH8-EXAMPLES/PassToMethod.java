public class PassToMethod {

  public static void main(String[] args) {
    int[][] resultTable = initialize();
    print(resultTable);
  }

  public static int[][] initialize() {
    int[][] table = new int[10][10];

    for (int row = 0; row < table.length; row++) {
      for (int column = 0; column < table[row].length; column++) {
        table[row][column] = (int) (Math.random() * 100);
      }
    }

    return table;
  }

  public static void print(int[][] resultTable) {
    for (int row = 0; row < resultTable.length; row++) {
      System.out.print("|" + row + "| ");
      for (int column = 0; column < resultTable[row].length; column++) {
        System.out.print(resultTable[row][column] + " ");
      }
      System.out.println();
    }
  }
}
