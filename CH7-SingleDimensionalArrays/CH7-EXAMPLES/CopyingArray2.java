public class CopyingArray2 {

  public static void main(String[] args) {
    int[] sourceArr = { 10, 20, 30, 40, 50 };
    int[] targetArr = new int[5];

    System.arraycopy(sourceArr, 0, targetArr, 0, sourceArr.length);

    for (int i = 0; i < targetArr.length; i++) {
      System.out.print(targetArr[i]);
    }
  }
}
