/*
 Use nested loops that display the following patterns in four separate programs:
 
 */

public class DisplayFourPattern {

    public static void main(String[] args) {
        // pattern 1
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // pattern 2
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
