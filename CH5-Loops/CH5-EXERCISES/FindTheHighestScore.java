
/*
Write a program that prompts the user to enter the number of students and each student’s name and score, and finally displays the name of the student with the highest score. Use the next() method in the Scanner class to read a name, rather than using the nextLine() method
 */
import java.util.Scanner;

public class FindTheHighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberStudent, score, highestScore, i;
        String name, highestScoreName;

        System.out.print("Enter the number of student:");
        numberStudent = input.nextInt();

        System.out.print("Enter name:");
        name = input.next();
        System.out.print("Enter a score:");
        score = input.nextInt();

        highestScoreName = name;
        highestScore = score;

        i = 2;
        while (i <= numberStudent) {

            System.out.print("Enter name:");
            name = input.next();
            System.out.print("Enter a score:");
            score = input.nextInt();

            if (score > highestScore) {
                highestScoreName = name;
                highestScore = score;
            }

            i++;
        }

        System.out.print("Student with highest score:" + highestScoreName);

    }
}
