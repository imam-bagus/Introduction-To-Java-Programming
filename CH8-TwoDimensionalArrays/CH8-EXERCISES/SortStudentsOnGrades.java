/*
Rewrite CaseStudyGrade.java, to display students in decreasing order of the number of correct answers. 
 */

public class SortStudentOnGrades {

  public static void main(String[] args) {
    int correctCount;
    char[][] answers = {
      { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
      { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
      { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
      { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
      { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
      { 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
      { 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
      { 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
    };

    int[][] students = new int[answers.length][2];

    char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

    for (int student = 0; student < answers.length; student++) {
      correctCount = 0;
      for (int answer = 0; answer < answers[student].length; answer++) {
        if (answers[student][answer] == keys[answer]) {
          correctCount++;
        }
      }
      students[student][0] = student;
      students[student][1] = correctCount;
    }

    int temp1 = 0;
    int temp2 = 0;

    for (int i = 0; i < students.length; i++) {
      for (int j = i + 1; j < students.length; j++) {
        if (students[i][1] < students[j][1]) {
          temp1 = students[i][0];
          temp2 = students[i][1];
          students[i][0] = students[j][0];
          students[i][1] = students[j][1];
          students[j][0] = temp1;
          students[j][1] = temp2;
        }
      }
    }

    for (int i = 0; i < students.length; i++) {
      System.out.println(
        "Student " + students[i][0] + "'s correct count is " + students[i][1]
      );
    }
  }
}
