public class AccessAndAssignValue {

  public static void main(String[] args) {
    int[][] matrix = new int[10][10];
    int[][] matrix2 = { { 10, 20, 30 }, { 40, 50, 60 } };

    matrix[0][0] = 10;
    matrix[0][1] = 20;
    matrix[0][2] = 30;

    System.out.print(matrix2[0][0] + " " + matrix2[0][1] + " " + matrix2[0][2]);
  }
}
