import java.util.Scanner;

public class CheckingPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String checkString;
        int front, back;
        boolean flag = true;

        System.out.print("Enter string want to check: ");
        checkString = input.nextLine();

        front = 0;
        back = checkString.length() - 1;

        while (front < back) {

            if (checkString.charAt(front) != checkString.charAt(back)) {
                flag = false;
                break;
            }

            front++;
            back--;
        }

        if (flag) {
            System.out.println(checkString + " is palindrome");
        } else {
            System.out.println(checkString + " is not palindrome");
        }

    }
}
