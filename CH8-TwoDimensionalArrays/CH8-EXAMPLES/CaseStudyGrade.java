/*
Suppose you need to write a program that grades multiple-choice tests. Assume there are eight students and ten questions, and the answers are stored in a two-dimensional array. Each row records a student’s answers to the questions.  It compares each student’s answers with the key, counts the number of correct answers, and displays it 
 */

public class CaseStudyGrade {

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

    char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

    for (int student = 0; student < answers.length; student++) {
      correctCount = 0;
      for (int answer = 0; answer < answers[student].length; answer++) {
        if (answers[student][answer] == keys[answer]) {
          correctCount++;
        }
      }
      System.out.println(
        "Student " + student + "'s correct count is " + correctCount
      );
    }
  }
}
