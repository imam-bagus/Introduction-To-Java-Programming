public class LengthTwoDimensionArray {

  public static void main(String[] args) {
    int[][] table = { { 10, 20, 30 }, { 40, 50 }, { 70 }, { 100, 200, 300 } };

    System.out.println("Column in row " + 0 + " :" + table[0].length);
    System.out.println("Column in row " + 1 + " :" + table[1].length);
    System.out.println("Column in row " + 2 + " :" + table[2].length);
    System.out.println("Column in row " + 3 + " :" + table[3].length);
    System.out.println("Total rows :" + table.length);
  }
}
