public class EscapeCharacter {

  public static void main(String[] args) {
    int a = 100;
    int b = 50;
    float c = 10.5f;
    float d = 50.8f;

    System.out.println(Math.max(a, b));
    System.out.println(Math.min(a, b));
    System.out.println(Math.ceil(c));
    System.out.println(Math.floor(d));
    System.out.println((int) (Math.random() * 100)); // 0 to 99
    System.out.println(30 + (int) (Math.random() * 100)); // 30 to 99
  }
}
