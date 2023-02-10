public class MultidimensionalArray {

  public static void main(String[] args) {
    //  Array initializer
    int[][][] data2 = {
      {
        { 1, 2, 3, 4, 5 },
        { 6, 7, 8, 9, 10 },
        { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 },
      },
      {
        { 1, 2, 3, 4, 5 },
        { 6, 7, 8, 9, 10 },
        { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 },
      },
      {
        { 1, 2, 3, 4, 5 },
        { 6, 7, 8, 9, 10 },
        { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 },
      },
      {
        { 1, 2, 3, 4, 5 },
        { 6, 7, 8, 9, 10 },
        { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 },
      },
      {
        { 1, 2, 3, 4, 5 },
        { 6, 7, 8, 9, 10 },
        { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 },
      },
    };

    // Declare and create
    int[][][] data = new int[10][10][10];

    // get length and fill with random value
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        for (int k = 0; k < data[i][j].length; k++) {
          data[i][j][k] = (int) (Math.random() * 10);
        }
      }
    }

    // print
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        for (int k = 0; k < data[i][j].length; k++) {
          System.out.print(data[i][j][k] + " ");
        }
        System.out.println();
      }
    }

    System.out.println();
    int[][][] data3 = new int[10][10][10];
    int count = 0;

    // get length and fill with number
    for (int i = 0; i < data3.length; i++) {
      for (int j = 0; j < data3[i].length; j++) {
        for (int k = 0; k < data3[i][j].length; k++) {
          data3[i][j][k] = count++;
        }
      }
    }

    // print
    for (int i = 0; i < data3.length; i++) {
      for (int j = 0; j < data3[i].length; j++) {
        for (int k = 0; k < data3[i][j].length; k++) {
          System.out.print(data3[i][j][k] + " ");
        }
        System.out.println();
      }
    }
  }
}
