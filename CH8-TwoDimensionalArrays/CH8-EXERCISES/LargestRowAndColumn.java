/*
Write a program that randomly fills in 0s and 1s into a 5-by-5 matrix, prints the matrix, and finds the first row and column with the most 1s
 */

public class LargestRowAndColumn {

  public static void main(String[] args) {
    int[][] matrix = new int[5][5];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (int) (Math.random() * 2);
      }
    }

    int largestRowIndex = 0;
    int largest = 0;
    int count = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 1) {
          count++;
        }
      }

      if (count > largest) {
        largest = count;
        largestRowIndex = i;
      }
      count = 0;
    }

    int largestColumnIndex = 0;
    largest = 0;
    count = 0;

    int row = 0;
    for (int i = 0; i < matrix[row].length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[j][i] == 1) {
          count++;
        }
      }

      if (count > largest) {
        largest = count;
        largestColumnIndex = i;
      }

      count = 0;
      row = i;
    }

    System.out.println("Largest row index: " + largestRowIndex);
    System.out.println("Largest column index: " + largestColumnIndex);

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }

      System.out.println();
    }
  }
}
