public class Increment {

    public static void main(String[] args) {
        int a = 1;
        System.out.println("Before call method :" + a);
        incrementMethod(a);
        System.out.println("After call method :" + a);
    }

    public static void incrementMethod(int i) {
        i++;
        System.out.println("Inside method: " + i);
    }
}
