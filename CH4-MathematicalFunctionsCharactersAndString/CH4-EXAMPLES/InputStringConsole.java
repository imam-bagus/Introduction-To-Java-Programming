import java.util.Scanner;

public class InputStringConsole {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;

        System.out.print("Enter a name:");
        // name = input.next();
        name = input.nextLine();

        System.out.println(name);
    }
}
