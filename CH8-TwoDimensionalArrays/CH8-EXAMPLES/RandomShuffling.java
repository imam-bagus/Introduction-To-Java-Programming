public class RandomShuffling {

  public static void main(String[] args) {
    int[][] table = new int[10][10];

    for (int row = 0; row < table.length; row++) {
      for (int column = 0; column < table[row].length; column++) {
        table[row][column] = column;
      }
    }

    System.out.println("Before Shuffling :");
    for (int row = 0; row < table.length; row++) {
      for (int column = 0; column < table[row].length; column++) {
        System.out.print(table[row][column] + " ");
      }
      System.out.println();
    }

    int rowRand = 0;
    int colRand = 0;
    int temp = 0;
    for (int row = 0; row < table.length; row++) {
      for (int column = 0; column < table[row].length; column++) {
        rowRand = (int) (Math.random() * column[row].length);
        colRand = (int) (Math.random() * column[row].length);

        temp = table[row][column];
        table[row][column] = table[rowRand][colRand];
        table[rowRand][colRand] = temp;
      }
    }

    System.out.println();
    System.out.println("After Shuffling :");
    for (int row = 0; row < table.length; row++) {
      for (int column = 0; column < table[row].length; column++) {
        System.out.print(table[row][column] + " ");
      }
      System.out.println();
    }
  }
}
