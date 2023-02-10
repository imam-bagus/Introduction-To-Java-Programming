import java.util.Scanner;

public class InitializingArrayWithInputValues {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] list = new int[10][10];

    System.out.print("Enter 100 integer numbers : ");
    for (int row = 0; row < list.length; row++) {
      for (int column = 0; column < list[row].length; column++) {
        list[row][column] = input.nextInt();
      }
    }
  }
}
