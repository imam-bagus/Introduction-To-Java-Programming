public class VariableLength {

  public static void main(String[] args) {
    testVariableLength(3, 4, 5);
    testVariableLength(new double[] { 1, 2, 3, 4, 5 });
  }

  public static void testVariableLength(double... number) {
    for (int i = 0; i < number.length; i++) {
      System.out.print(number[i] + " ");
    }
  }
}
