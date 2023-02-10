public class RaggedArray {

  public static void main(String[] args) {
    int[][] list = new int[5][];
    list[0] = new int[5];
    list[1] = new int[2];
    list[2] = new int[6];
    list[3] = new int[1];
    list[4] = new int[3];

    list[0][4] = 20;
  }
}
