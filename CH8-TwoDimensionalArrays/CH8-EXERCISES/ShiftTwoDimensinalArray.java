// Still contains Error : shifting loop

public class ShiftTwoDimensionalArray {

  public static void main(String[] args) {
    int[][] listNumber = new int[10][10];

    int count = 0;

    for (int i = 0; i < listNumber.length; i++) {
      for (int j = 0; j < listNumber[i].length; j++) {
        listNumber[i][j] = count++;
      }
    }

    System.out.println("Before Shift :");
    for (int i = 0; i < listNumber.length; i++) {
      for (int j = 0; j < listNumber[i].length; j++) {
        System.out.print(listNumber[i][j] + " ");
      }
      System.out.println();
    }

    int temp = listNumber[0][0];
    int maxNumber1 = listNumber.length - 1;
    int maxNumber2 = listNumber[maxNumber1].length - 1;

    for (int i = 0; i < listNumber.length; i++) {
      for (int j = 1; j < listNumber[i].length; j++) {
        if (j == listNumber[i].length - 2 && i < listNumber.length - 1) {
          listNumber[i][j] = listNumber[i + 1][0];
        } else {
          listNumber[i][j - 1] = listNumber[i][j];
        }
      }
    }
    listNumber[maxNumber1][maxNumber2] = temp;

    System.out.println("After Shift :");
    for (int i = 0; i < listNumber.length; i++) {
      for (int j = 0; j < listNumber[i].length; j++) {
        System.out.print(listNumber[i][j] + " ");
      }
      System.out.println();
    }
  }
}
