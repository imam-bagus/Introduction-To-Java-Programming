/*
Suppose the weekly hours for all employees are stored in a two-dimensional array. Each row records an employee’s seven-day work hours with seven columns. For example, the following array stores the work hours for eight employees. Write a program that displays employees and their total hours in increasing order of the total hours

 */

public class ComputeWeeklyHoursEachEmployee {

  public static void main(String[] args) {
    int[][] hoursWorked = {
      { 2, 4, 5, 6, 7, 8, 8 },
      { 7, 3, 4, 3, 3, 4, 4 },
      { 3, 3, 4, 3, 3, 2, 2 },
      { 9, 3, 4, 7, 3, 4, 1 },
      { 3, 5, 4, 3, 6, 3, 8 },
      { 3, 4, 4, 6, 3, 4, 4 },
      { 3, 7, 4, 8, 3, 8, 4 },
      { 6, 3, 5, 9, 2, 7, 9 },
    };

    int[][] employees = new int[hoursWorked.length][2];
    int totalWorked;
    for (int i = 0; i < hoursWorked.length; i++) {
      totalWorked = 0;
      for (int j = 0; j < hoursWorked[i].length; j++) {
        totalWorked += hoursWorked[i][j];
      }
      employees[i][0] = i;
      employees[i][1] = totalWorked;
    }

    int temp1 = 0;
    int temp2 = 0;

    for (int i = 0; i < employees.length; i++) {
      for (int j = i + 1; j < employees.length; j++) {
        if (employees[i][1] > employees[j][1]) {
          temp1 = employees[i][0];
          temp2 = employees[i][1];
          employees[i][0] = employees[j][0];
          employees[i][1] = employees[j][1];
          employees[j][0] = temp1;
          employees[j][1] = temp2;
        }
      }
    }

    for (int i = 0; i < employees.length; i++) {
      System.out.println(
        "Employee " +
        employees[i][0] +
        " total hours worked: " +
        employees[i][1]
      );
    }
  }
}
