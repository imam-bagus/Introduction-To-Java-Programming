public class CopyingArray {

  public static void main(String[] args) {
    int[] sourceArr = { 10, 20, 30, 40, 50 };
    int[] targetArr = new int[5];

    for (int i = 0; i < sourceArr.length; i++) {
      targetArr[i] = sourceArr[i];
    }

    for (int i = 0; i < targetArr.length; i++) {
      System.out.print(targetArr[i]);
    }
  }
}
