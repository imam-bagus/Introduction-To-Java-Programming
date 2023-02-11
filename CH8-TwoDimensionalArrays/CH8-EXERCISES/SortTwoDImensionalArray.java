/*

Write a method to sort a two-dimensional array using the following header:
public static void sort(int m[][])

The method performs a primary sort on rows, and a secondary sort on columns.
For example, the following array:
    {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
will be sorted to
    {{4, 5},{4, 2},{4, 1},{1, 7},{1, 2},{1, 1}}.
 */

public class SortTwoDimensionalArray {

  public static void main(String[] args) {
    int[][] list = {
      { 4, 2 },
      { 1, 7 },
      { 4, 5 },
      { 1, 2 },
      { 1, 1 },
      { 4, 1 },
    };

    System.out.print("{");
    for (int i = 0; i < list.length; i++) {
      System.out.print("{");
      for (int j = 0; j < list[i].length; j++) {
        System.out.print(list[i][j]);
        if (j < (list[i].length - 1)) {
          System.out.print(",");
        }
      }
      System.out.print("}");
      if (i < (list.length - 1)) {
        System.out.print(",");
      }
    }
    System.out.print("}");
    System.out.println();
    System.out.println("After Sort:");

    sort(list);
  }

  public static void sort(int m[][]) {
    // sort row
    int temp1 = 0;
    int temp2 = 0;
    for (int i = 0; i < m.length; i++) {
      for (int j = i + 1; j < m.length; j++) {
        if (m[i][0] < m[j][0]) {
          temp1 = m[i][0];
          temp2 = m[i][1];
          m[i][0] = m[j][0];
          m[i][1] = m[j][1];
          m[j][0] = temp1;
          m[j][1] = temp2;
        }
      }
    }

    // sort column

    temp1 = 0;
    temp2 = 0;
    for (int i = 0; i < m.length; i++) {
      for (int j = i + 1; j < m.length; j++) {
        if (m[i][1] < m[j][1] && m[i][0] == m[j][0]) {
          temp1 = m[i][0];
          temp2 = m[i][1];
          m[i][0] = m[j][0];
          m[i][1] = m[j][1];
          m[j][0] = temp1;
          m[j][1] = temp2;
        }
      }
    }

    System.out.print("{");
    for (int i = 0; i < m.length; i++) {
      System.out.print("{");
      for (int j = 0; j < m[i].length; j++) {
        System.out.print(m[i][j]);
        if (j < (m[i].length - 1)) {
          System.out.print(",");
        }
      }
      System.out.print("}");
      if (i < (m.length - 1)) {
        System.out.print(",");
      }
    }
    System.out.print("}");
  }
}
