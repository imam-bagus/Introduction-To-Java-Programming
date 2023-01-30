public class TestReturnGradeMethod {

    public static void main(String[] args) {
        String grade = printGrade(70);
        System.out.println("The grade is " + grade);
    }

    public static String printGrade(int grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "E";
        }
    }
}
