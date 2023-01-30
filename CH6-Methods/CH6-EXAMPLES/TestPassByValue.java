public class TestPassByValue {

  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 2;

    System.out.println("Before call method :" + num1 + " " + num2);
    swap(num1, num2);
    System.out.println("After call method :" + num1 + " " + num2);
  }

  public static void swap(int num1, int num2) {
    int temp;

    System.out.println("\t Inside Method");
    System.out.println("\t Before Swapping :" + num1 + " " + num2);
    temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("\t After Swapping :" + num1 + " " + num2);
  }
}
