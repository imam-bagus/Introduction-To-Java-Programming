public class TestVoidMethod {

  public static void main(String[] args) {
    System.out.print("The grade is ");
    printGrade(70);
  }

  public static void printGrade(int grade) {
    if (grade >= 90) {
      System.out.println("A");
    } else if (grade >= 80) {
      System.out.println("B");
    } else if (grade >= 70) {
      System.out.println("C");
    } else if (grade >= 60) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }
  }
}
