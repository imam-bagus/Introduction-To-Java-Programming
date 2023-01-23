public class ComparingStrings {

  public static void main(String[] args) {
    String name = "Imam";
    String name2 = "Bagus";
    String name3 = "Imam";
    String name4 = "IMAM";
    String name5 = "Imam Bagus Nugroho";

    System.out.println(name.equals(name2));
    System.out.println(name.equals(name3));
    System.out.println(name.equalsIgnoreCase(name4));
    System.out.println(name.compareTo(name4));
    System.out.println(name.compareToIgnoreCase(name4));
    System.out.println(name.startsWith("I"));
    System.out.println(name.endsWith("am"));
    System.out.println(name5.contains(name));
  }
}
